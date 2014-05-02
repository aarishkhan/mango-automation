<%--
    Copyright (C) 2013 Infinite Automation Systems. All rights reserved.
    @author Phillip Dunlap
--%><%@ include file="/WEB-INF/jsp/include/tech.jsp"%>

<script type="text/javascript">
	var templateList;

	function saveDataSourceImpl(basic){
		  DataFileDataSourceEditDwr.saveFileDataSource(basic, $get("updatePeriods"), $get("updatePeriodType"), $get("fileType"), $get("filePath"), 
				  $get("deleteAfterImport"), $get("createPoints"), $get("importedPrefix"), templateList.get("value"), saveDataSourceCB);
	}
	
	function selectOptions() {
		switch(${dataSource.fileType}) {
		case 0 :
			dojo.byId("xmlType").selected = "selected";
			break;
		case 1 :
			dojo.byId("csvType").selected = "selected";
			break;
		case 2 :
			dojo.byId("excelType").selected = "selected";
			break;
		}
	}
	
	var selectedId;
	var pointsArray = new Array();
	
	function initImpl() {
		selectOptions();
		DataFileDataSourceEditDwr.getTemplateList(function(resp){
			var options = [];
			resp.data.templates.forEach(function(template) {
				if(template == resp.data.selected) {
					options.push({"label":template, "value":template, "selected":true});
				}
				else
					options.push({"label":template, "value":template});
			});
			templateList.reset();
			templateList.set("options", options);
			templateList.startup();
		});
		if(${dataSource.deleteAfterImport}) {
			dojo.byId("deleteAfterImport").checked = "true";
			hidePrefix();
		}
		if(${dataSource.createPoints})
			dojo.byId("createPoints").checked = "true";
		
	  <c:forEach items="${userPoints}" var="dp">
        pointsArray[pointsArray.length] = {
            id : ${dp.id}, 
            name : '${sst:quotEncode(dp.extendedName)}',
            type : '<m2m2:translate message="${dp.dataTypeMessage}" escapeDQuotes="true"/>',
        };
      </c:forEach>
		
		new dijit.form.FilteringSelect({
	        store: new dojo.store.Memory({ data: pointsArray }),
	        labelType: "html",
	        labelAttr: "name",
	        searchAttr: "name",
	        autoComplete: false,
	        style: "width: 254px;",
	        queryExpr: "*\${0}*",
	        highlightMatch: "all",
	        required: false,
    	    onChange: function(point) {
            	if (this.item) 
            		selectedId = this.item.id;
	        }
	    }, "toId");
	}
	
// 	/**
// 	 * Check if the file to be read exists and is readable.
// 	 */
	  function checkFile() {
		  fileTestButton(true);
		  DataFileDataSourceEditDwr.checkDoesFileExist($get("filePath"), checkFileCB);
	  }
	  
	  function fileTestButton(testing) {
		  setDisabled($("fileTestButton"), testing);
	  }
	  
	  function checkFileCB(result) {
		  if(result)
	   		$set("fileTestMessage", "<fmt:message key="dsEdit.datafile.fileExists"/>");
		  else
			$set("fileTestMessage", "<fmt:message key="dsEdit.datafile.fileDoesNotExist"/>");
	      fileTestButton(false);
	  }
	  
	  function hidePrefix() {
		  if(dojo.byId("deleteAfterImport").checked)
			  $("importedPrefixRow").style.visibility = "collapse";
		  else 
			  $("importedPrefixRow").style.visibility = "visible";
	  }
	  
	  function hideMapping() {
		  if(!dojo.byId("mappingPoint").checked)
			  $("toIdRow").style.visibility = "collapse";
		  else 
			  $("toIdRow").style.visibility = "visible";
	  }

// 	/**
// 	 * Add a Point
// 	 */
	  function addPointImpl() {
		  DataSourceEditDwr.getPoint(-1, function(point) {
			  editPointCB(point);
		  });
	  }
		
	  function editPointCBImpl(locator) {
		  $set("mappingPoint", locator.isMappingPoint);
		  $set("fromIdentifier",locator.fromIdentifier);
		  selectedId = locator.toId;
		  updateToId();
		  //$set("toId",locator.toId);
		  $set("dataTypeId",locator.dataTypeId);
		  
		  if(!locator.isMappingPoint)
			  $("toIdRow").style.visibility = "collapse";
		  else
			  $("toIdRow").style.visibility = "visible";
	  }
	  
	  function updateToId() {
		  for(item in pointsArray) {
			  if(pointsArray[item].id == selectedId) {
				  $set("toId",pointsArray[item].name);
				  return;
			  }
		  }
	  }
	  
	  /**
	   * Save a Point
	   */
	  function savePointImpl(locator) {
		  delete locator.isMappingPoint;
		  delete locator.fromIdentifier;
		  delete locator.toId;
		  delete locator.dataTypeId;
		  
		  locator.isMappingPoint = $get("mappingPoint");
		  locator.fromIdentifier = $get("fromIdentifier");
		  locator.toId = selectedId;
		  locator.dataTypeId = $get("dataTypeId");
		  
	      DataFileDataSourceEditDwr.savePointLocator(currentPoint.id, $get("xid"), $get("name"), locator, savePointCB);
	  }
	  
  require(["dijit/form/Select", "dojo/domReady!"], 
		  function(Select, ValidationTextBox, CheckBox){
			  
templateList = new Select({id:"templateSelect"}, "templateList");
			  
  });
</script>

<tag:dataSourceAttrs descriptionKey="dsEdit.datafile.desc" helpId="dataFileDS">
 <tr>
  <td class="formLabelRequired"><fmt:message key="dsEdit.updatePeriod"/></td>
  <td class="formField">
    <input type="text" id="updatePeriods" value="${dataSource.updatePeriods}" class="formShort"/>
    <tag:timePeriods id="updatePeriodType" value="${dataSource.updatePeriodType}" s="true" min="true" h="true"/>
  </td>
</tr>
<tr>
  <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.fileType"/></td>
  <td>
    <select id="fileType">
      <option id="xmlType" value=0>XML</option>
      <option id="csvType" value=1>CSV</option>
      <option id="excelType" value=2>Excel</option>
    </select>
</tr>
<tr>
  <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.createPoints"/></td>
  <td><input id="createPoints" type="checkbox"/></td>
</tr>
<tr>
 <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.template"/></td>
 <td><div id="templateList"></div></td>
<tr>
 <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.path"/></td>
 <td><input id="filePath" type="text" value="${dataSource.filePath}"></input></td>
</tr>
<tr>
 <td align="right"><input id="fileTestButton" type="button" value="<fmt:message key="dsEdit.datafile.check"/>" onclick="checkFile();"></input></td>
 <td class="formError" id="fileTestMessage"></td>
</tr>
<tr>
 <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.deleteAfterImport"/></td>
 <td><input id="deleteAfterImport" type="checkbox" onchange="hidePrefix();"></input></td>
</tr>
<tr id="importedPrefixRow">
 <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.importedPrefix"/></td>
 <td><input id="importedPrefix" type="text" value="${dataSource.addedPrefix}"></input></td>
</tr>
</tag:dataSourceAttrs>

<tag:pointList pointHelpId="dataFilePP">
 <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.pointDataType"/></td>
    <td class="formField"><tag:dataTypeOptions id="dataTypeId" excludeImage="true"/></td>
  </tr>
  <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.mappingPoint"/></td>
    <td><input id="mappingPoint" type="checkbox" onchange="hideMapping();"></input></td>
  </tr>
<tr id="toIdRow">
 <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.toPoint"/></td>
 <td><input id="toId" type="text" ></input></td>
</tr>
<tr>
 <td class="formLabelRequired"><fmt:message key="dsEdit.datafile.fromIdentifier"/></td>
 <td><input id="fromIdentifier" type="text" ></input></td>
</tr>

</tag:pointList>