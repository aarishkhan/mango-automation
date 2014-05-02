var deviceInfo;
var listenerRunning = false;
var pointList;
var bndwr = null;

var objectListRunning = false;
var objectListType;
var objListProgressBars = Array();
var addObjectsDialog;
var addObjectsProgress;
var whoIsDelay;
var whoIsTimerTask; 

var msg = {
        "mod.bacnet.sendingWhoIs": "",
        "mod.bacnet.getDetails": "",
        "mod.bacnet.listenerStopped": "",
        "mod.bacnet.tester.sendObjectList": "",
        "mod.bacnet.addPoint": "",
        "mod.bacnet.device": "",
        "mod.bacnet.objects" : "",
        "dsEdit.saveWarning" : ""
};

/**
 * Clean up the data source
 */
function unInitImpl(){
	if(listenerRunning){
		bndwr.cancelDiscovery();
		clearTimeout(whoIsTimerTask);
	}
}
function initImpl() {
    whoIsButtons(false);
    hide("deviceListDiv");
    hide("objList0MessageDiv");
    hide("objList0Div");
    hide("objList1Div");
    
    require(["dijit/ProgressBar"], function(ProgressBar) {
        objListProgressBars.push(new ProgressBar({ style: "width: 99%" }).placeAt("objList0Progress"));
        objListProgressBars.push(new ProgressBar({ style: "width: 99%" }).placeAt("objList1Progress"));
    });
    
    hide("objList1Progress");
};

function sendWhoIs() {
    $set("whoIsMessage", msg["mod.bacnet.sendingWhoIs"]);
    dwr.util.removeAllRows("iamsReceived");
    whoIsButtons(true);
    listenerRunning = true;
    whoIsDelay = 500;
    sendBACnetWhoIs();
};

function sendWhoIsCB() {
	whoIsTimerTask = setTimeout(sendWhoIsUpdate, whoIsDelay);
    whoIsDelay += 50;
};

function sendWhoIsUpdate() {
    bndwr.bacnetWhoIsUpdate(function(result) {
        if (result)
            $set("whoIsMessage", result.message);
        if (result && !result.finished) {
            show("deviceListDiv");
            dwr.util.addRows("iamsReceived", result.devices, [
                    function(device) { return device.instanceNumber; },
                    function(device) { return device.networkNumber; },
                    function(device) { return device.mac; },
                    function(device) { return device.link; },
                    function(device) {
                            var s = "getDeviceObjects(";
                            s += device.instanceNumber;
                            s += ","+ device.networkNumber;
                            s += ",'"+ device.mac +"'";
                            if (device.link)
                                s += ",'"+ device.link +"'";
                            else
                                s += ",null";
                            s += "); return false;"
                            return writeImage("deviceDetailsImg"+ device.key, null, "control_play_blue",
                                    msg["mod.bacnet.getDetails"], s);
                    }
                ],
                {
                    rowCreator: function(options) {
                        var tr = document.createElement("tr");
                        tr.id = "deviceIndex"+ options.rowData.key;
                        tr.className = "row"+ (options.rowIndex % 2 == 0 ? "" : "Alt");
                        return tr;
                    }
                }
              );
            
            sendWhoIsCB();
        }
        else {
            whoIsButtons(false);
            dwr.util.removeAllRows("iamsReceived");
        }
    });
};

function cancelWhoIs(callback) {
    bndwr.cancelDiscovery(function() {
        if (callback)
            callback();
        if (listenerRunning) {
            $set("whoIsMessage", msg["mod.bacnet.listenerStopped"]);
            listenerRunning = false;
        }
        hide("deviceListDiv");
        hide("objList0MessageDiv");
        hide("objList0Div");
        whoIsButtons(false);
        
        dwr.util.removeAllRows("iamsReceived");
        
        cancelObjectListRequest("")
    });
};

function toggleDataSourceImpl() {
    cancelWhoIs();
}

function getDeviceObjects(devId, netNo, mac, link) {
    if (objectListRunning) {
        alert(msg["mod.bacnet.objListRunning"]);
        return;
    }
    objectListRunning = true;
    
    hide("objList0Div");
    show("objList0MessageDiv");
    $set("objList0Message", msg["mod.bacnet.tester.sendObjectList"]);
    objectListType = 0;
    bndwr.sendDeviceObjectListRequest(devId, netNo, mac, link, objectListStartCB);
};

function objectListStartCB(result) {
    hide("objList"+ objectListType +"Progress");
    hide("objList"+ objectListType +"CancelBtn");
    if (result.data.error || result.hasMessages) {
        if (result.data.error)
            $set("objList"+ objectListType +"Message", result.data.error);
        else
            showDwrMessages(result.messages, "objList"+ objectListType +"Message");
        setDisabled("sendObjListBtn", false);
    }
    else {
        show("objList"+ objectListType +"Progress");
        show("objList"+ objectListType +"CancelBtn");
        setDisabled("objList"+ objectListType +"CancelBtn", false);
        objListProgressBars[objectListType].set("value", 0);
        objectListUpdate();
    }
}

function objectListUpdate() {
    bndwr.getObjectListUpdate(function(result) {
        if (result.data.error)
            $set("objList"+ objectListType +"Message", result.data.error);
        if (result.data.deviceObjects)
            drawObjects(result.data);
        if (result.data.beans)
            updateObjects(result.data.beans);
        
        objListProgressBars[objectListType].set("value", result.data.progress);
        
        if (!result.data.done)
            setTimeout(objectListUpdate, 3000);
        else {
            if (!result.data.error)
                hide("objList"+ objectListType +"Message");
            hide("objList"+ objectListType +"Progress");
            setDisabled("objList"+ objectListType +"CancelBtn", true);
            setDisabled("sendObjListBtn", false);
            objectListRunning = false;
        }
    });
}

function cancelObjectListRequest(btn) {
    bndwr.cancelObjectListRequest();
    if (btn)
        setDisabled(btn, true);
}

function drawObjects(result) {
    var listId = "objList"+ objectListType;
    deviceInfo = result;
    show(listId +"Div");
    
    var devName = "";
    if (result.deviceName)
        devName = "("+ result.deviceName +")";
    
    $set(listId +"Header", "<b>"+ result.deviceDescription +"</b> "+ devName +", "+ result.deviceObjects.length +" "+ 
            msg["mod.bacnet.objects"]);
    
    for (var i=result.deviceObjects.length-1; i>=0; i--) {
        if (!result.deviceObjects[i]) {
            if (console)
                console.log("Object at index "+ i + " is null");
            result.deviceObjects.splice(i, 1);
        }
    }
    
    dwr.util.removeAllRows(listId);
    dwr.util.addRows(listId, result.deviceObjects, [
                function(obj) { return obj.objectTypeDescription +" "+ obj.instanceNumber; },
                function(obj) { return obj.objectName; },
                function(obj) {
                	if(obj.description)
                		return obj.description; //For later if we want the option to select between ObjName and Description + " &nbsp; <input type='checkbox' id='useObjectDescription" + obj.objectTypeId + "/" + obj.instanceNumber + "' />"; 
                	else
                		return;
                },
                function(obj) { return obj.prettyPresentValue; },
                function(obj, options) {
                	if (!objectTypeIsValid(obj.objectTypeId))
                		return "";
                    return '<a href="#" onclick="addPoint('+ options.rowNum +
                            '); return false">'+ msg["mod.bacnet.addPoint"] +'</a>'; },
                function(obj, options) {
                 	if (!objectTypeIsValid(obj.objectTypeId))
                 		return "";
                    return '<input type="checkbox" name="addObject-'+ listId +'" value="'+ options.rowNum +'"/>';
                }
            ],
            {
                rowCreator: function(options) {
                    var tr = document.createElement("tr");
                    tr.id = "row-"+ options.rowData.objectTypeId +"/"+ options.rowData.instanceNumber;
                    tr.index = options.rowNum;
                    tr.className = "row"+ (options.rowNumIndex % 2 == 0 ? "" : "Alt");
                    return tr;
                },
                cellCreator: function(options) {
                    var td = document.createElement("td");
                    if (options.cellNum == 1) // Object name
                        td.id = "name-"+ options.rowData.objectTypeId +"/"+ options.rowData.instanceNumber;
                    if (options.cellNum == 3) // Present value
                        td.id = "pv-"+ options.rowData.objectTypeId +"/"+ options.rowData.instanceNumber;
                    return td;
                }
            }
    );
};

function updateObjects(beans) {
    var i, bean, id, index;
    for (i=0; i<beans.length; i++) {
        bean = beans[i];
        id = bean.objectTypeId +"/"+ bean.instanceNumber;
        // Update the object display
        $set("name-"+ id, bean.objectName);
        $set("pv-"+ id, bean.prettyPresentValue);
        
        // Update the list in memory.
        index = $("row-"+ id).index;
        deviceInfo.deviceObjects[index] = bean;
    }
}

function whoIsButtons(running) {
    setDisabled("sendWhoIsBtn", running);
    setDisabled("cancelWhoIsBtn", !running);
};

function sendObjListRequest() {
    if (objectListRunning) {
        alert(msg["mod.bacnet.objListRunning"]);
        return;
    }
    objectListRunning = true;
    
    cancelWhoIs(function() {
        setDisabled("sendObjListBtn", true);
        hide("objList1Div");
        show("objList1MessageDiv");
        show("objList1Message");
        $set("objList1Message", msg["mod.bacnet.tester.sendObjectList"]);
        objectListType = 1;
        sendObjectListRequest(objectListStartCB);
    });
};

function addPointImpl(objIndex) {
    var obj = deviceInfo.deviceObjects[objIndex];
    delete obj.prettyPresentValue;
    if (deviceInfo.deviceNetwork == null)
        deviceInfo.deviceNetwork = 0;
    
    bndwr.addBacnetPoint(deviceInfo.deviceNetwork, deviceInfo.deviceMac, deviceInfo.deviceLink, deviceInfo.deviceId,
            obj, editPointCB);
};

function appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions) {
    pointListColumnHeaders[pointListColumnHeaders.length] = msg["mod.bacnet.device"];
    pointListColumnFunctions[pointListColumnFunctions.length] = function(p) {
        if (p.pointLocator.networkNumber > 0)
            return p.pointLocator.networkNumber +" @ "+ p.pointLocator.mac;
        return p.pointLocator.mac;
    };
};

function editPointCBImpl(locator) {
    $set("networkNumber", locator.networkNumber);
    $set("mac", locator.mac);
    $set("link", locator.link);
    $set("remoteDeviceInstanceNumber", locator.remoteDeviceInstanceNumber);
    $set("objectTypeId", locator.objectTypeId);
    $set("objectInstanceNumber", locator.objectInstanceNumber);
    $set("useCovSubscription", locator.useCovSubscription);
    $set("settable", locator.settable);
    $set("writePriority", locator.writePriority);
    $set("dataTypeId", locator.dataTypeId);
    objectTypeChanged();
};

function savePointImpl(locator) {
    delete locator.relinquishable;
    
    locator.networkNumber = $get("networkNumber");
    locator.mac = $get("mac");
    locator.link = $get("link");
    locator.remoteDeviceInstanceNumber = $get("remoteDeviceInstanceNumber");
    locator.objectTypeId = $get("objectTypeId");
    locator.objectInstanceNumber = $get("objectInstanceNumber");
    locator.useCovSubscription = $get("useCovSubscription");
    locator.settable = $get("settable");
    locator.writePriority = $get("writePriority");
    locator.dataTypeId = $get("dataTypeId");
    
    saveBACnetPointLocator(currentPoint.id, $get("xid"), $get("name"), locator, savePointCB);
};

function objectTypeChanged() {
    if (objectTypeIsSettable($get("objectTypeId")))
        setDisabled("settable", false);
    else {
        setDisabled("settable", true);
        $set("settable", false);
    }
    settableChanged();
};

function settableChanged() {
    setDisabled("writePriority", !$get("settable"));
};

function updateSelection(listId, checked) {
    var a = document.getElementsByName("addObject-"+ listId);
    for (var i=0; i<a.length; i++)
        a[i].checked = checked;
}

function addObjectsAsPoints(listId) {
    if (!isShowing("pointProperties")) {
        alert(msg["dsEdit.saveWarning"]);
        return;
    }
    
	var a = $get("addObject-"+ listId);
	if (a.length > 0) {
		var objs = [];
		for (var i=0; i<a.length; i++) {
		    var obj = deviceInfo.deviceObjects[a[i]];
		    delete obj.prettyPresentValue;
			objs.push(obj);
		}
		
	    if (deviceInfo.deviceNetwork == null)
	        deviceInfo.deviceNetwork = 0;
	    
	    require(["dijit/Dialog", "dijit/ProgressBar", "dojo/query"], function(Dialog, ProgressBar, query){
	        addObjectsDialog = new Dialog({
	            content: "<div id='addObjectsMsg'></div><div id='addObjectsProg'></div>",
	            style: "width: 300px"
	        });
	        addObjectsProgress = new ProgressBar({ style: "width: 100%" }).placeAt("addObjectsProg");
	        
	        addObjectsDialog.show();
	        var tbs = query(".dijitDialogTitleBar");
	        for (var i=0; i<tbs.length; i++)
	            hide(tbs[i]);
	        $set("addObjectsMsg", msg["mod.bacnet.adding"]);
	        
	        bndwr.createPointsFromObjects(deviceInfo.deviceNetwork, deviceInfo.deviceMac, deviceInfo.deviceLink, 
	                deviceInfo.deviceId, objs, addObjectsUpdate);
	    });
	}
};

function addObjectsUpdate() {
    bndwr.createPointsFromObjectsUpdate(function(result) {
        if (result.data.done) {
            writePointList(result.data.points);
            addObjectsDialog.destroy();
            if (result.data.message)
                alert(result.data.message);
        }
        else {
            addObjectsProgress.set("value", result.data.progress);
            setTimeout(addObjectsUpdate, 2500);
       }
    });
}