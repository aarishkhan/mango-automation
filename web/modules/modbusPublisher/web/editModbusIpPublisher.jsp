<%--
    Copyright (C) 2014 Infinite Automation. All rights reserved.
    @author Terry Packer
--%>
<%@page import="com.infiniteautomation.modbus.pub.vo.ModbusIpPublisherVO"%>
<%@page import="com.serotonin.modbus4j.code.RegisterRange"%>
<%@page import="com.serotonin.modbus4j.code.DataType"%>
<%@page import="com.serotonin.m2m2.DataTypes"%>

<%@ include file="/WEB-INF/jsp/include/tech.jsp" %>

<script type="text/javascript">
  dojo.require("dojo.store.Memory");
  dojo.require("dijit.form.FilteringSelect");
  dojo.require("dijit.form.ComboBox");
  
  var registerTypes = {data: [
           {name: '<fmt:message key="modbus.publisher.pointType.coil"/>', id: <c:out value="<%= RegisterRange.COIL_STATUS %>"/>},
           {name: '<fmt:message key="modbus.publisher.pointType.input"/>', id: <c:out value="<%= RegisterRange.INPUT_STATUS %>"/>},
           {name: '<fmt:message key="modbus.publisher.pointType.holdingRegister"/>', id: <c:out value="<%= RegisterRange.HOLDING_REGISTER %>"/>},
           {name: '<fmt:message key="modbus.publisher.pointType.inputRegister"/>', id: <c:out value="<%= RegisterRange.INPUT_REGISTER %>"/>},
           
       ]};
  var modbusDataTypes = { data :[
                                 {id: <c:out value="<%= DataType.BINARY %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.binary"/>'},
                                 {id: <c:out value="<%= DataType.TWO_BYTE_INT_UNSIGNED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.2bUnsigned"/>'},
                                 {id: <c:out value="<%= DataType.TWO_BYTE_INT_SIGNED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.2bSigned"/>'},
                                 {id: <c:out value="<%= DataType.TWO_BYTE_BCD %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.2bBcd"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_INT_UNSIGNED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bUnsigned"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_INT_SIGNED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bSigned"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bUnsignedSwapped"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_INT_SIGNED_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bSignedSwapped"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_FLOAT %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bFloat"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_FLOAT_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bFloatSwapped"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_BCD %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bBcd"/>'},
                                 {id: <c:out value="<%= DataType.FOUR_BYTE_BCD_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.4bBcdSwapped"/>'},
                                 {id: <c:out value="<%= DataType.EIGHT_BYTE_INT_UNSIGNED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.8bUnsigned"/>'},
                                 {id: <c:out value="<%= DataType.EIGHT_BYTE_INT_SIGNED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.8bSigned"/>'},
                                 {id: <c:out value="<%= DataType.EIGHT_BYTE_INT_UNSIGNED_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.8bUnsignedSwapped"/>'},
                                 {id: <c:out value="<%= DataType.EIGHT_BYTE_INT_SIGNED_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.8bSignedSwapped"/>'},
                                 {id: <c:out value="<%= DataType.EIGHT_BYTE_FLOAT %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.8bFloat"/>'},
                                 {id: <c:out value="<%= DataType.EIGHT_BYTE_FLOAT_SWAPPED %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.8bFloatSwapped"/>'},
                                 {id: <c:out value="<%= DataType.CHAR %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.char"/>'},
                                 {id: <c:out value="<%= DataType.VARCHAR %>"/>, name: '<fmt:message key="dsEdit.modbus.modbusDataType.varchar"/>'}

                                 ]};  

  var allPoints = [];  
  var selectedPoints = [];  
  var pointLookupText = ""; //For selection to remain in the filter

  dojo.ready(function() { 
      ModbusPublisherDwr.initSender(function(response) {
          dojo.forEach(response.data.allPoints, function(item) {
              allPoints.push({
                  id: item.id, 
                  name: item.extendedName, 
                  enabled: item.enabled, 
                  dataTypeString: item.dataTypeString,
                  fancyName: item.extendedName,
                  dataTypeId: item.pointLocator.dataTypeId
              });
          });
          
          dojo.forEach(response.data.publisher.points, function(item) {
              addToSelectedArray(item.dataPointId, item.registerType, item.offset, item.registerCount, item.readOnly);
          });
          refreshSelectedPoints();
          
          // Create the lookup
          new dijit.form.ComboBox({
              store: new dojo.store.Memory({ data: allPoints }),
              labelAttr: "fancyName",
              labelType: "html",
              searchAttr: "name",
              autoComplete: false,
              style: "width: 254px;",
              queryExpr: "*\${0}*",
              highlightMatch: "all",
              required: false,
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
      });
  });
  
  function selectPoint(pointId) {
      if (!containsPoint(pointId)) {
          addToSelectedArray(pointId,0,0,0,true);
          refreshSelectedPoints();
      }
  }
  
  function containsPoint(pointId) {
      return getElement(selectedPoints, pointId, "id") != null;
  }
  
  function addToSelectedArray(pointId, registerType, offset, registerCount, readOnly) {
      var data = getElement(allPoints, pointId);
      
      if (data) {
          if(!checkRegisterType(registerType,data.dataTypeId)){
        	    alert('<fmt:message key="modbus.publisher.incompatibleRegisterType"/>'); 
        	    return;
          }
    	  
          var modbusDataTypeId;
          switch(data.dataTypeId){
              case <c:out value="<%= DataTypes.NUMERIC %>"/>:
                  modbusDataTypeId = <c:out value="<%= DataType.EIGHT_BYTE_FLOAT %>"/>;
                  if(registerCount == 0)
                	  registerCount = 4;
              break;
              case <c:out value="<%= DataTypes.BINARY %>"/>:
            	  modbusDataTypeId = <c:out value="<%= DataType.BINARY %>"/>;
                  if(registerCount == 0)
                      registerCount = 1;
              break;
              case <c:out value="<%= DataTypes.MULTISTATE %>"/>:
                  modbusDataTypeId = <c:out value="<%= DataType.EIGHT_BYTE_INT_SIGNED %>"/>;
                  if(registerCount == 0)
                      registerCount = 4;
              break;
              case <c:out value="<%= DataTypes.ALPHANUMERIC %>"/>:
            	  modbusDataTypeId = <c:out value="<%= DataType.VARCHAR %>"/>;
                  if(registerCount == 0)
                      registerCount = 8;
              break;
              default:
            	  alert('Unsupported Data Type');
                  return;
          }
    	  
          data.fancyName = "<span class='disabled'>"+ data.name +"</span>";
          
          // Missing names imply that the point was deleted, so ignore.
          selectedPoints[selectedPoints.length] = {
              id : pointId,
              pointName : data.name,
              enabled : data.enabled,
              dataTypeString : data.dataTypeString,
              registerType : registerType,
              modbusDataType: modbusDataTypeId,
              offset : offset,
              registerCount: registerCount,
              readOnly: readOnly
          };
      }
  }
  
  /**
   * Check for valid register type for data type
   */
  function checkRegisterType(registerType,dataTypeId){
	  
	  if((registerType == <c:out value="<%= RegisterRange.COIL_STATUS %>"/>)||(registerType == <c:out value="<%= RegisterRange.INPUT_STATUS %>"/>)){
		  //DataType Can only Be Binary
		  if(dataTypeId != <c:out value="<%= DataTypes.BINARY %>"/>)
			  return false;
		  else
			  return true;
	  }else{
		  return true;
	  }
	  
	  
  }
  
  /**
   *  Is this register Type read only?
   */
  function isReadOnlyType(registerType){
	  if((registerType == <c:out value="<%= RegisterRange.INPUT_STATUS %>"/>)
			  || (registerType == <c:out value="<%= RegisterRange.INPUT_REGISTER %>"/>))
		  return true;
	  else
		  return false;
	  
  }
  
  function removeFromSelectedPoints(pointId) {
      removeElement(selectedPoints, pointId);
      refreshSelectedPoints();
      
      var data = getElement(allPoints, pointId);
      if (data)
          data.fancyName = data.name;
  }
  
  function refreshSelectedPoints() {
      dwr.util.removeAllRows("selectedPoints");
      if (selectedPoints.length == 0)
          show("selectedPointsEmpty");
      else {
          hide("selectedPointsEmpty");
          dwr.util.addRows("selectedPoints", selectedPoints,
              [
                  function(data) { return data.pointName; },
                  function(data) { return "<img src='images/"+ (data.enabled ? "brick_go" : "brick_stop") +".png'/>"; },
                  function(data) { return data.dataTypeString; },
                  function(data) { 
                	  return null;
                  },
                  function(data) { 
                	  return "<input type='number' value='" + data.offset + "' onchange='updateOffset(" + data.id +  ", this.value)' class='formShort'/>"; 
                  },
                  function(data) {
                	  if(data.modbusDataType == <c:out value="<%= DataType.VARCHAR %>"/>)
                		  return "<input id='registerCountInput" + data.id + "' type='number' value='" + data.registerCount + "' onchange='updateRegisterCount(" + data.id +  ", this.value)' class='formShort'/>";
                	  else
                		  return "<input id='registerCountInput" + data.id + "' type='number' value='" + data.registerCount + "' onchange='updateRegisterCount(" + data.id +  ", this.value)' class='formShort' disabled />";
                  },
                  function(data){
                	  var cantRead = isReadOnlyType(data.registerType);
                	  if(data.readOnly){
                		 if(cantRead)
                		   return "<input id='readOnlyChkbx" + data.id + "' type='checkbox' disabled checked onchange='updateReadOnly("+ data.id + ", this.checked)' class='formShort' />";
                		 else
                			 return "<input id='readOnlyChkbx" + data.id + "' type='checkbox' checked onchange='updateReadOnly("+ data.id + ", this.checked)' class='formShort' />";
                	  }else
                		  return "<input type='checkbox' onchange='updateReadOnly(" + data.id + ", this.checked)' class='formShort' />";
                  },
                  function(data){
                	  return null;
                  },
                  function(data) { 
                          return "<img src='images/bullet_delete.png' class='ptr' "+
                                  "onclick='removeFromSelectedPoints("+ data.id +")'/>";
                  }
              ],
              {
                  rowCreator: function(options) {
                      var tr = document.createElement("tr");
                      tr.className = "row"+ (options.rowIndex % 2 == 0 ? "" : "Alt");
                      return tr;
                  },
                  cellCreator: function(options) {
                      var td = document.createElement("td");
                      if (options.cellNum == 1 || options.cellNum == 3)
                          td.align = "center";
                      
                      //Create the drop down for the cell
                      if (options.cellNum == 3){
                    	  
                    	  var myDiv = document.createElement("div");
                    	  td.appendChild(myDiv);
                    	  
                    	  var fsId = "dropDown_" + options.rowData.id;
                    	  
                    	  var fs = dijit.byId(fsId);
                    	  if(!fs){
	                    	 // Create the lookup
	                    	 var regTypeStore = new dojo.store.Memory();
	                    	 var newRegisterRange;
	                    	 //Add Compatible Register Types
	                    	 switch(options.rowData.modbusDataType){
	                    	 
	                         case <c:out value="<%= DataType.BINARY %>"/>:
                                 //Add Statuses
                                 regTypeStore.put({id: <c:out value="<%= RegisterRange.COIL_STATUS %>"/>, name: '<fmt:message key="modbus.publisher.pointType.coil"/>'});
                                 regTypeStore.put({id:<c:out value="<%= RegisterRange.INPUT_STATUS %>"/>, name: '<fmt:message key="modbus.publisher.pointType.input"/>'});
                                 //Set Default Register Range
                                 if((options.rowData.registerType == <c:out value="<%= RegisterRange.COIL_STATUS %>"/>)||(options.rowData.registerType == <c:out value="<%= RegisterRange.INPUT_STATUS %>"/>)){
                                     newRegisterRange = options.rowData.registerType;    
                                 }else{
                                     newRegisterRange = <c:out value="<%= RegisterRange.COIL_STATUS %>"/>;
                                     updateRegisterRange(options.rowData.id,newRegisterRange);
                                 }
	                         break;
	
	                         case <c:out value="<%= DataType.EIGHT_BYTE_FLOAT %>"/>:
	                         case <c:out value="<%= DataType.EIGHT_BYTE_INT_SIGNED %>"/>:
	                         case <c:out value="<%= DataType.VARCHAR %>"/>:
	                              regTypeStore.put({id: <c:out value="<%= RegisterRange.HOLDING_REGISTER %>"/>, name: '<fmt:message key="modbus.publisher.pointType.holdingRegister"/>' });
	                              regTypeStore.put({id: <c:out value="<%= RegisterRange.INPUT_REGISTER %>"/>, name: '<fmt:message key="modbus.publisher.pointType.inputRegister"/>'});
	                              
	                              if((options.rowData.registerType == <c:out value="<%= RegisterRange.INPUT_REGISTER %>"/>)||(options.rowData.registerType == <c:out value="<%= RegisterRange.HOLDING_REGISTER %>"/>)){
	                                     newRegisterRange = options.rowData.registerType;  

	                              }else{
                                      newRegisterRange = <c:out value="<%= RegisterRange.HOLDING_REGISTER %>"/>;
                                      updateRegisterRange(options.rowData.id,newRegisterRange);
	                              }
	                         break;
	                    	 }
	                    	 
	                         fs = new dijit.form.FilteringSelect({
	                              store: regTypeStore,
	                              id: fsId,
	                              value: newRegisterRange,
	                              labelAttr: "name",
	                              labelType: "html",
	                              searchAttr: "name",
	                              autoComplete: false,
	                              //style: "width: 150px;",
	                              queryExpr: "*\${0}*",
	                              highlightMatch: "all",
	                              required: false,
	                              onChange: function(type) {
	                                  if (this.item) {
	                                      if(!updateRegisterRange("" + options.rowData.id,this.item.id))
	                                    	  this.set('value',this._lastValueReported);
	                                  }
	                              }
	                          });
                    	  }//Didn't have to create it
                    	  fs.placeAt(myDiv);
                    	  fs.startup();
                      }
                      
                    //Create the drop down for the cell
                      if (options.cellNum == 7){
                          
                          var myDiv = document.createElement("div");
                          td.appendChild(myDiv);
                          
                          var fsId = "modbusDataType_" + options.rowData.id;
                          var fs = dijit.byId(fsId);
                          if(!fs){
	                         // Create the lookup
	                            fs = new dijit.form.FilteringSelect({
	                              store: new dojo.store.Memory(modbusDataTypes),
	                              id: fsId,
	                              value: options.rowData.modbusDataType,
	                              labelAttr: "name",
	                              labelType: "html",
	                              searchAttr: "name",
	                              autoComplete: false,
	                              //style: "width: 150px;",
	                              queryExpr: "*\${0}*",
	                              highlightMatch: "all",
	                              disabled: true,
	                              required: false,
	                              onChange: function(type) {
	                                  if (this.item) {
	                                      updateModbusDataType("" + options.rowData.id,this.item.id);
	                                  }
	                              }
	                          });
                          }//Didn't have to create it
                          fs.placeAt(myDiv);
                          fs.startup();
                      }
                      
                      return td;
                  } 
              });
      }
  }
  
  function savePublisherImpl(name, xid, enabled, cacheWarningSize, cacheDiscardSize, changesOnly, sendSnapshot,
          snapshotSendPeriods, snapshotSendPeriodType) {
      // Clear messages.
      hide("portMsg");
      hide("slaveIdMsg");
      hide("encapsulatedMsg");
      hide("pointsMsg");
      
      var points = new Array();
      for (var i=0; i<selectedPoints.length; i++)
          points[points.length] = {
    		  dataPointId: selectedPoints[i].id,
    		  registerType: selectedPoints[i].registerType,
    		  offset: selectedPoints[i].offset,
    		  dataTypeString: selectedPoints[i].dataTypeString,
    		  modbusDataType: selectedPoints[i].modbusDataType,
    		  registerCount: selectedPoints[i].registerCount,
    		  readOnly: selectedPoints[i].readOnly
    	  };
      
      ModbusPublisherDwr.savePersistentSender(name, xid, enabled, points, $get("slaveId"), $get("port"), $get("encapsulated"), cacheWarningSize, cacheDiscardSize,
              changesOnly, sendSnapshot, snapshotSendPeriods, snapshotSendPeriodType, savePublisherCB);
  }
  
  function getRtStatus() {
      setDisabled("getStatusBtn", true);
      PersistentPublisherDwr.getPersistentSenderStatus(function(response) {
          dwr.util.removeAllOptions("statusResults");
          dwr.util.addOptions("statusResults", response.messages, "genericMessage");
          setDisabled("getStatusBtn", false);
      });
  }
  
  function startSync() {
      setDisabled("startSyncBtn", true);
      PersistentPublisherDwr.startPersistentSync(function(response) {
          dwr.util.removeAllOptions("statusResults");
          dwr.util.addOptions("statusResults", response.messages, "genericMessage");
          setDisabled("startSyncBtn", false);
      });
  }
  
  
  function updateOffset(pointId, offset) {
      updateElement(selectedPoints, pointId, "offset", offset);
  }

  function updateReadOnly(pointId, readOnly) {
      updateElement(selectedPoints, pointId, "readOnly", readOnly);
  }
  
  function updateRegisterCount(pointId, count){
      updateElement(selectedPoints, pointId, "registerCount", count);
  }
  
  /**
   * Update the Register Range only if its compatible and return true,
   * if not return false.
   */
  function updateRegisterRange(pointId, type) {
	  var pointData = getElement(allPoints, pointId);
	  
	  //If Updating the range we must also update the read only option 
	  var chkbx = dojo.byId("readOnlyChkbx" + pointId);
	  if(chkbx){
		  switch(type){
		    case <c:out value="<%= RegisterRange.INPUT_STATUS %>"/>:
		    case <c:out value="<%= RegisterRange.INPUT_REGISTER %>"/>:
		           chkbx.checked = true;
		           chkbx.disabled = 'disabled';
			break;
		    case <c:out value="<%= RegisterRange.COIL_STATUS %>"/>:
	        case <c:out value="<%= RegisterRange.HOLDING_REGISTER %>"/>:
	            chkbx.removeAttribute("disabled");
	        break;
		  }
	  }
	  
	  if(checkRegisterType(type, pointData.dataTypeId)){
		    updateElement(selectedPoints, pointId, "registerType", type);
		    return true;
	  }else{
		  return false;
	  }
  }
  
  function updateModbusDataType(pointId, type) {
      updateElement(selectedPoints, pointId, "modbusDataType", type);
  }
  
</script>
<table cellpadding="0" cellspacing="0" style="float:left;">
  <tr>
    <td valign="top">
      <div class="borderDiv marR marB">
        <table>
          <tr>
            <td colspan="2" class="smallTitle"><fmt:message key="modbus.publisher.properties"/> <tag:help id="modbusIpPublishing"/></td>
          </tr>
          <tr>
            <td class="formLabelRequired"><fmt:message key="dsEdit.modbusIp.port"/></td>
            <td class="formField">
              <input type="number" id="port" value="${publisher.port}" class="formShort"/>
              <div id="portMsg" class="formError" style="display:none;"></div>
            </td>
          </tr>          
          <tr>
            <td class="formLabelRequired"><fmt:message key="dsEdit.modbus.slaveId"/></td>
            <td class="formField">
              <input type="number" id="slaveId" value="${publisher.slaveId}" class="formShort"/>
              <div id="slaveIdMsg" class="formError" style="display:none;"></div>
            </td>
          </tr>
          <tr>
            <td class="formLabelRequired"><fmt:message key="dsEdit.modbusIp.encapsulated"/></td>
            <td class="formField">
              <c:choose>
                <c:when test="${publisher.encapsulated == true}">
                    <input type="checkbox" id="encapsulated" checked="${publisher.encapsulated}" class="formShort"/>
                </c:when>
                <c:otherwise>
                    <input type="checkbox" id="encapsulated" class="formShort"/>
                </c:otherwise>
              </c:choose>
              <div id="encapsulatedMsg" class="formError" style="display:none;"></div>
            </td>
          </tr>
        </table>
      </div>
    </td>
  </tr>
</table>

<table cellpadding="0" cellspacing="0"><tr><td>
  <div class="borderDiv">
    <table width="100%">
      <tr>
        <td class="smallTitle"><fmt:message key="publisherEdit.points"/></td>
        <td align="right"><div id="pointLookup"></div></td>
      </tr>
    </table>
    
    <table cellspacing="1" cellpadding="0">
      <tr class="rowHeader">
        <td><fmt:message key="publisherEdit.point.name"/></td>
        <td><fmt:message key="publisherEdit.point.status"/></td>
        <td><fmt:message key="publisherEdit.point.type"/></td>
        <td><fmt:message key="dsEdit.modbus.registerRange"/></td>
        <td><fmt:message key="dsEdit.modbus.offset"/></td>
        <td><fmt:message key="dsEdit.modbus.registerCount"/></td>
        <td><fmt:message key="publisherEdit.modbus.readOnly"/></td>
        <td><fmt:message key="dsEdit.modbus.modbusDataType"/></td>
        <td></td>
      </tr>
      <tbody id="selectedPointsEmpty" style="display:none;"><tr><td colspan="5"><fmt:message key="publisherEdit.noPoints"/></td></tr></tbody>
      <tbody id="selectedPoints"></tbody>
    </table>
    <div id="pointsMsg" class="formError" style="display:none;"></div>
  </div>
</td></tr></table>