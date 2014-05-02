<#--===MANIFEST===
Unique Device Name:Global:Global
===END MANIFEST===-->

{
   "dataSources":[
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "name":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Virtual",
         "enabled":true,
         "type":"VIRTUAL",
         "purgeType":"YEARS",
         "updatePeriodType":"SECONDS",
         "updatePeriods":5,
         "purgeOverride":true,
         "purgePeriod":1
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-meta",
         "name":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Meta",
         "enabled":true,
         "type":"META",
         "alarmLevels":{
            "SCRIPT_ERROR":"URGENT",
            "CONTEXT_POINT_DISABLED":"URGENT",
            "RESULT_TYPE_ERROR":"URGENT"
         },
         "purgeType":"YEARS",
         "purgeOverride":true,
         "purgePeriod":1
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-script",
         "name":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Script",
         "enabled":true,
         "type":"SCRIPTING",
         "alarmLevels":{
            "SCRIPT_ERROR":"URGENT",
            "DATA_TYPE_ERROR":"URGENT",
            "LOG_ERROR":"URGENT"
         },
         "purgeType":"YEARS",
         "context":[
            {
               "dataPointXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Temp",
               "varName":"temp"
            },
            {
               "dataPointXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-setpoint",
               "varName":"set"
            },
            {
               "dataPointXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-fan",
               "varName":"fan"
            }
         ],
         "logLevel":"NONE",
         "cronPattern":"* * * * * ?",
         "executionDelaySeconds":0,
         "script":"if (temp.value < set.value - 1)\n{\nfan.set(true)\n}\nelse if (temp.value > set.value + 1)\n{\nfan.set(false)\n}",
         "purgeOverride":true,
         "purgePeriod":1
      }
   ],
   "dataPoints":[
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Temp",
         "name":"Temp",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"NUMERIC",
            "changeType":{
               "type":"RANDOM_ANALOG",
               "max":100.0,
               "min":0.0,
               "startValue":"1"
            },
            "settable":true
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"F",
         "chartColour":"",
         "chartRenderer":{
            "type":"IMAGE",
            "timePeriodType":"MINUTES",
            "numberOfPeriods":5
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "defaultCacheSize":1,
         "deviceName":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
         "discardExtremeValues":false,
         "discardHighLimit":1.7976931348623157E308,
         "discardLowLimit":-1.7976931348623157E308,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"ANALOG",
            "useUnitAsSuffix":true,
            "unit":"F",
            "renderedUnit":"F",
            "format":"0.0"
         },
         "tolerance":0.0
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-outsidetemp",
         "name":"Outside Temp",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"NUMERIC",
            "changeType":{
               "type":"RANDOM_ANALOG",
               "max":100.0,
               "min":0.0,
               "startValue":"1"
            },
            "settable":true
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"F",
         "chartColour":"",
         "chartRenderer":{
            "type":"IMAGE",
            "timePeriodType":"MINUTES",
            "numberOfPeriods":5
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "defaultCacheSize":1,
         "deviceName":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
         "discardExtremeValues":false,
         "discardHighLimit":1.7976931348623157E308,
         "discardLowLimit":-1.7976931348623157E308,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"PLAIN",
            "useUnitAsSuffix":true,
            "unit":"F",
            "renderedUnit":"F",
            "suffix":""
         },
         "tolerance":0.0
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-setpoint",
         "name":"Set Point",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"NUMERIC",
            "changeType":{
               "type":"NO_CHANGE",
               "startValue":"0"
            },
            "settable":true
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"F",
         "chartColour":"",
         "chartRenderer":{
            "type":"TABLE",
            "limit":10
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "defaultCacheSize":1,
         "deviceName":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
         "discardExtremeValues":false,
         "discardHighLimit":1.7976931348623157E308,
         "discardLowLimit":-1.7976931348623157E308,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"PLAIN",
            "useUnitAsSuffix":true,
            "unit":"F",
            "renderedUnit":"F",
            "suffix":""
         },
         "tolerance":0.0
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-fan",
         "name":"Fan",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"BINARY",
            "changeType":{
               "type":"NO_CHANGE",
               "startValue":"0"
            },
            "settable":true
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"",
         "chartColour":"",
         "chartRenderer":{
            "type":"STATS",
            "timePeriodType":"MINUTES",
            "includeSum":false,
            "numberOfPeriods":5
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "defaultCacheSize":1,
         "deviceName":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
         "discardExtremeValues":false,
         "discardHighLimit":1.7976931348623157E308,
         "discardLowLimit":-1.7976931348623157E308,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"BINARY",
            "oneColour":null,
            "oneLabel":"Running",
            "zeroColour":null,
            "zeroLabel":"Off"
         },
         "tolerance":0.0
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-amps",
         "name":"Amps",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"NUMERIC",
            "changeType":{
               "type":"BROWNIAN",
               "max":50.0,
               "maxChange":1.0,
               "min":0.0,
               "startValue":"1"
            },
            "settable":true
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"A",
         "chartColour":"",
         "chartRenderer":{
            "type":"IMAGE",
            "timePeriodType":"MINUTES",
            "numberOfPeriods":5
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "defaultCacheSize":1,
         "deviceName":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
         "discardExtremeValues":false,
         "discardHighLimit":1.7976931348623157E308,
         "discardLowLimit":-1.7976931348623157E308,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"ANALOG",
            "useUnitAsSuffix":true,
            "unit":"A",
            "renderedUnit":"A",
            "format":"0.00"
         },
         "tolerance":0.0
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-volts",
         "name":"Volts",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"NUMERIC",
            "changeType":{
               "type":"BROWNIAN",
               "max":122.0,
               "maxChange":0.01,
               "min":115.0,
               "startValue":"120"
            },
            "settable":true
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"V",
         "chartColour":"",
         "chartRenderer":{
            "type":"IMAGE",
            "timePeriodType":"MINUTES",
            "numberOfPeriods":5
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-DS",
         "defaultCacheSize":1,
         "deviceName":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
         "discardExtremeValues":false,
         "discardHighLimit":1.7976931348623157E308,
         "discardLowLimit":-1.7976931348623157E308,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"ANALOG",
            "useUnitAsSuffix":true,
            "unit":"V",
            "renderedUnit":"V",
            "format":"0.0"
         },
         "tolerance":0.0
      },
      {
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-watts",
         "name":"Watts",
         "enabled":true,
         "loggingType":"ON_CHANGE",
         "intervalLoggingPeriodType":"MINUTES",
         "intervalLoggingType":"INSTANT",
         "purgeType":"YEARS",
         "pointLocator":{
            "dataType":"NUMERIC",
            "updateEvent":"CONTEXT_UPDATE",
            "context":[
               {
                  "dataPointXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-amps",
                  "varName":"p1"
               },
               {
                  "dataPointXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-volts",
                  "varName":"p2"
               }
            ],
            "executionDelaySeconds":0,
            "script":"return p1.value * p2.value",
            "settable":false,
            "updateCronPattern":""
         },
         "eventDetectors":[
         ],
         "plotType":"STEP",
         "unit":"W",
         "chartColour":"",
         "chartRenderer":{
            "type":"IMAGE",
            "timePeriodType":"MINUTES",
            "numberOfPeriods":5
         },
         "dataSourceXid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-meta",
         "defaultCacheSize":1,
         "deviceName":"Meta",
         "discardExtremeValues":false,
         "discardHighLimit":0.0,
         "discardLowLimit":0.0,
         "intervalLoggingPeriod":15,
         "purgeOverride":true,
         "purgePeriod":1,
         "textRenderer":{
            "type":"ANALOG",
            "useUnitAsSuffix":true,
            "unit":"W",
            "renderedUnit":"W",
            "format":"0"
         },
         "tolerance":0.0
      }
   ],
   "pointHierarchy":[
      {
         "points":[
         ],
         "name":"Demo Data",
         "subfolders":[
            {
               "points":[
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-watts",
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-amps",
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-fan",
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-outsidetemp",
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-setpoint",
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Temp",
                  "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-volts"
               ],
               "name":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>",
               "subfolders":[
               ]
            }
         ]
      }
   ],
   "watchLists":[
      {
         "user":"admin",
         "dataPoints":[
            "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Temp",
            "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-setpoint",
            "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-fan"
         ],
         "sharingUsers":[
         ],
         "name":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-HVAC",
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-HVAC-WL"
      },
      {
         "user":"admin",
         "dataPoints":[
            "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-watts",
            "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-volts",
            "<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-amps"
         ],
         "sharingUsers":[
         ],
         "name":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-Power",
         "xid":"<#if Unique_Device_NameGlobalGlobal??>${Unique_Device_NameGlobalGlobal}<#else>${defaultUnique_Device_NameGlobalGlobal}</#if>-PW-WL"
      }
   ]
}