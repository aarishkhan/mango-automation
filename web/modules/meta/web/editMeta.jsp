<%--
    Copyright (C) 2014 Infinite Automation Systems Inc. All rights reserved.
    @author Matthew Lohbihler
--%>
<%@ include file="/WEB-INF/jsp/include/tech.jsp" %>
<%@page import="com.serotonin.m2m2.meta.MetaPointLocatorVO"%>
<%@page import="com.serotonin.m2m2.Common"%>

<script type="text/javascript">

	dojo.require("dojo.store.Memory");
	dojo.require("dijit.form.ComboBox");
	  
  var pointsArray = new Array();
  var contextArray = new Array();
  var pointLookupText = ""; //For selection to remain in the filter
  
  function initImpl() {
	  
	  
      <c:forEach items="${userPoints}" var="dp">
        pointsArray[pointsArray.length] = {
            id : ${dp.id}, 
            name : '${sst:quotEncode(dp.extendedName)}',
            fancyName: '${sst:quotEncode(dp.extendedName)}',
            type : '<m2m2:translate message="${dp.dataTypeMessage}" escapeDQuotes="true"/>',
        };
      </c:forEach>
      
      
   // Create the lookup
      new dijit.form.ComboBox({
          store: new dojo.store.Memory({ data: pointsArray }),
          labelType: "html",
          labelAttr: "fancyName",
          searchAttr: "name",
          autoComplete: false,
          style: "width: 254px;",
          queryExpr: "*\${0}*",
          highlightMatch: "all",
          required: false,
          dropDownPosition: ["above"],
          onChange: function(point) {
              if (this.item) {
                  selectPoint(this.item.id);
                  this.loadAndOpenDropDown();
                  this.set('displayedValue',pointLookupText);
                  if(typeof(this._startSearch) == 'function')
                      this._startSearch(pointLookupText); //Dangerous because could change, but works!
             }
          },
          onKeyUp: function(event){
              pointLookupText = this.get('displayedValue');
          }
      }, "pointLookup");
      
      
      
      createContextualMessageNode("contextContainer", "context");
  }
  
  function selectPoint(pointId){
      if(!alreadyAddedToContextArray(pointId)){
          addToContextArray(pointId, "p"+pointId);
          writeContextArray();
      }
  }
  
  function addToContextArray(pointId, scriptVarName) {
      var data = getElement(pointsArray, pointId);
      if (data) {
          
          //Were we already added
          
          // Missing names imply that the point was deleted, so ignore.
          contextArray[contextArray.length] = {
              pointId : pointId,
              pointName : data.name,
              pointType : data.type,
              scriptVarName : scriptVarName
          };
          //Disable in list
          data.fancyName = "<span class='disabled'>"+ data.name +"</span>";
      }
  }
  
  function removeFromContextArray(pointId) {
      for (var i=contextArray.length-1; i>=0; i--) {
          if (contextArray[i].pointId == pointId)
              contextArray.splice(i, 1);
      }
      writeContextArray();
      var data = getElement(pointsArray, pointId);
      if(data)
          data.fancyName = data.name;
  }

  
  /**
   * Does the context array already have this item
   */
  function alreadyAddedToContextArray(id){
	  
	  for(var i=0; i<contextArray.length; i++){
	   if(contextArray[i].pointId == id)
		   return true;
	  }
	  
	  return false;
  }
  
  function appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions) {
      pointListColumnHeaders.push("");
      pointListColumnFunctions.push(function(p) {
          var id = "generateImg"+ p.id;
          var onclick = "generateHistory("+ p.id +")";
          return writeImage(id, "${modulePath}/web/clock-history.png", null,
        		  "<m2m2:translate key="dsEdit.meta.generate" escapeDQuotes="true"/>", onclick);
      });
  }
  
  function generateHistory(pointId) {
      startImageFader("generateImg"+ pointId, true);
      MetaEditDwr.generateMetaPointHistory(pointId, function(result) {
          stopImageFader("generateImg"+ pointId);
          alert(result);
      });
  }
  
  function saveDataSourceImpl(basic) {
      MetaEditDwr.saveMetaDataSource(basic, saveDataSourceCB);
  }
  
  function editPointCBImpl(locator) {
      contextArray.length = 0;
      for (var i=0; i<locator.context.length; i++)
          addToContextArray(locator.context[i].key, locator.context[i].value);
      writeContextArray();
      
      $set("script", locator.script);
//       $set("scriptEngine", locator.scriptEngine);
      $set("dataTypeId", locator.dataTypeId);
      $set("settable", locator.settable);
      $set("updateEvent", locator.updateEvent);
      $set("updateCronPattern", locator.updateCronPattern);
      $set("executionDelaySeconds", locator.executionDelaySeconds);
      
      updateEventChanged();
  }
  
  function savePointImpl(locator) {
      delete locator.relinquishable;
      
      locator.context = createContextArray();
      locator.script = $get("script");
//       locator.scriptEngine = $get("scriptEngine");
	  locator.scriptEngine = 0;
      locator.dataTypeId = $get("dataTypeId");
      locator.settable = $get("settable");
      locator.updateEvent = $get("updateEvent");
      locator.updateCronPattern = $get("updateCronPattern");
      locator.executionDelaySeconds = $get("executionDelaySeconds");
      
      MetaEditDwr.saveMetaPointLocator(currentPoint.id, $get("xid"), $get("name"), locator, savePointCB);
  }
  
  
  function writeContextArray() {
      dwr.util.removeAllRows("contextTable");
      if (contextArray.length == 0) {
          show($("contextTableEmpty"));
          hide($("contextTableHeaders"));
      }
      else {
          hide($("contextTableEmpty"));
          show($("contextTableHeaders"));
          dwr.util.addRows("contextTable", contextArray,
              [
                  function(data) { return data.pointName; },
                  function(data) { return data.pointType; },
                  function(data) {
                          return "<input type='text' value='"+ data.scriptVarName +"' class='formShort' "+
                                  "onblur='updateScriptVarName("+ data.pointId +", this.value)'/>";
                  },
                  function(data) { 
                          return "<img src='images/bullet_delete.png' class='ptr' "+
                                  "onclick='removeFromContextArray("+ data.pointId +")'/>";
                  }
              ],
              {
                  rowCreator:function(options) {
                      var tr = document.createElement("tr");
                      tr.className = "smRow"+ (options.rowIndex % 2 == 0 ? "" : "Alt");
                      return tr;
                  }
              });
      }
      updatePointsList();
  }
  
  function updatePointsList() {
      dwr.util.removeAllOptions("allPointsList");
      var availPoints = new Array();
      for (var i=0; i<pointsArray.length; i++) {
          var found = false;
          for (var j=0; j<contextArray.length; j++) {
              if (contextArray[j].pointId == pointsArray[i].id) {
                  found = true;
                  break;
              }
          }
          
          if (!found)
              availPoints[availPoints.length] = pointsArray[i];
      }
      dwr.util.addOptions("allPointsList", availPoints, "id", "name");
  }
  
  function updateScriptVarName(pointId, scriptVarName) {
      for (var i=contextArray.length-1; i>=0; i--) {
          if (contextArray[i].pointId == pointId)
              contextArray[i].scriptVarName = scriptVarName;
      }
  }
  
  function validateScript() {
      hideContextualMessages("pointProperties"); <!-- Bug here, legacy placeholder of point details -->
      hideContextualMessages("pointDetails");
      MetaEditDwr.validateScript($get("script"), createContextArray(), $get("dataTypeId"), $get("scriptEngine"), validateScriptCB);
  }
  
  function createContextArray() {
      var context = new Array();
      for (var i=0; i<contextArray.length; i++) {
          context[context.length] = {
              key : contextArray[i].pointId,
              value : contextArray[i].scriptVarName
          };
      }
      return context;
  }
  
  function validateScriptCB(response) {
      showDwrMessages(response.messages);
  }
  
  function updateEventChanged() {
      display("updateCronPatternRow", $get("updateEvent") == <%= MetaPointLocatorVO.UPDATE_EVENT_CRON %>);
  }
//@ sourceURL=editMeta_ajaxLoaded.js
</script>

<tag:dataSourceAttrs descriptionKey="dsEdit.meta.desc" helpId="metaDS">
</tag:dataSourceAttrs>

<tag:pointList pointHelpId="metaPP">
  <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.pointDataType"/></td>
    <td class="formField"><tag:dataTypeOptions id="dataTypeId" excludeImage="true"/></td>
  </tr>
  
  <%--<tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.meta.scriptEngine"/></td>
    <td class="formField"><select id="scriptEngine">
    	<option label="JavaScript" value=0>
    	<option label="MVEL" value=1>
    </select></td>
  </tr>--%>
  
  <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.settable"/></td>
    <td class="formField"><input type="checkbox" id="settable"/></td>
  </tr>
  
  <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.meta.scriptContext"/></td>
    <td class="formField">
      <div id="pointLookup"></div>
      
      <table cellspacing="1" id="contextContainer">
        <tbody id="contextTableEmpty" style="display:none;">
          <tr><th colspan="4"><fmt:message key="dsEdit.meta.noPoints"/></th></tr>
        </tbody>
        <tbody id="contextTableHeaders" style="display:none;">
          <tr class="smRowHeader">
            <td><fmt:message key="dsEdit.meta.pointName"/></td>
            <td><fmt:message key="dsEdit.pointDataType"/></td>
            <td><fmt:message key="dsEdit.meta.var"/></td>
            <td></td>
          </tr>
        </tbody>
        <tbody id="contextTable"></tbody>
      </table>
    </td>
  </tr>
  
  <tr>
    <td class="formLabelRequired">
      <fmt:message key="dsEdit.meta.script"/> <tag:img png="accept" onclick="validateScript();" title="common.validate"/>
    </td>
    <td class="formField"><textarea id="script" rows="10" cols="50"/></textarea></td>
  </tr>
  
  <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.meta.event"/></td>
    <td class="formField">
      <select id="updateEvent" onchange="updateEventChanged()">
        <option value="<c:out value="<%= MetaPointLocatorVO.UPDATE_EVENT_CONTEXT_UPDATE %>"/>"><fmt:message key="dsEdit.meta.event.context"/></option>
        <option value="<c:out value="<%= Common.TimePeriods.MINUTES %>"/>"><fmt:message key="dsEdit.meta.event.minute"/></option>
        <option value="<c:out value="<%= Common.TimePeriods.HOURS %>"/>"><fmt:message key="dsEdit.meta.event.hour"/></option>
        <option value="<c:out value="<%= Common.TimePeriods.DAYS %>"/>"><fmt:message key="dsEdit.meta.event.day"/></option>
        <option value="<c:out value="<%= Common.TimePeriods.WEEKS %>"/>"><fmt:message key="dsEdit.meta.event.week"/></option>
        <option value="<c:out value="<%= Common.TimePeriods.MONTHS %>"/>"><fmt:message key="dsEdit.meta.event.month"/></option>
        <option value="<c:out value="<%= Common.TimePeriods.YEARS %>"/>"><fmt:message key="dsEdit.meta.event.year"/></option>
        <option value="<c:out value="<%= MetaPointLocatorVO.UPDATE_EVENT_CRON %>"/>"><fmt:message key="dsEdit.meta.event.cron"/></option>
      </select>
    </td>
  </tr>
  
  <tr id="updateCronPatternRow">
    <td class="formLabelRequired"><fmt:message key="dsEdit.meta.event.cron"/></td>
    <td class="formField"><input id="updateCronPattern" type="text"/> <tag:help id="cronPatterns"/></td>
  </tr>
  
  <tr>
    <td class="formLabelRequired"><fmt:message key="dsEdit.meta.delay"/></td>
    <td class="formField"><input id="executionDelaySeconds" type="text" class="formShort"/></td>
  </tr>
</tag:pointList>