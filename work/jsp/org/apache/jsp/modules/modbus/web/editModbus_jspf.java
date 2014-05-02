package org.apache.jsp.modules.modbus.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.modbus.vo.ModbusPointLocatorVO;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.serial.SerialMaster;
import com.serotonin.m2m2.modbus.vo.ModbusSerialDataSourceVO;
import com.serotonin.m2m2.modbus.vo.ModbusIpDataSourceVO;

public final class editModbus_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(14);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/m2m2.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/modules/modbus/web/editModbusSerial.jspf");
    _jspx_dependants.add("/modules/modbus/web/editModbusIp.jspf");
    _jspx_dependants.add("/WEB-INF/tags/dataSourceAttrs.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/dsEvents.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/serialSettings.tag");
    _jspx_dependants.add("/WEB-INF/tags/pointList.tag");
    _jspx_dependants.add("/WEB-INF/tags/exportCodesOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_checkbox_selectedValue_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_checkbox_selectedValue_onclick_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.release();
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_id_nobody.release();
    _jspx_tagPool_fmt_message_key.release();
    _jspx_tagPool_fmt_param_value_nobody.release();
    _jspx_tagPool_sst_select_value_id.release();
    _jspx_tagPool_sst_option_value.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n\n\n");
      out.write("\n\n<script type=\"text/javascript\">\n\n//To track the task and kill it later\nvar modbusScanTask;\nvar modbusScanning = false;\n  /**\n   * Clean up the tasks on exit.\n   */\n  function unInitImpl(){\n\t  if(modbusScanning){\n\t\t  DataSourceEditDwr.cancelTestingUtility(); \n\t        clearTimeout(modbusScanTask);\n\t    }\n  }\n\n  function initImpl() {\n      scanButtons(false);\n      changeRange('test_');\n      logIOChanged();\n  }\n  \n  function scan() {\n      $set(\"scanMessage\", \"");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\");\n      dwr.util.removeAllOptions(\"scanNodes\");\n      scanButtons(true);\n      scanImpl();\n  }\n  \n  function scanCB(msg) {\n      if (msg)\n          alert(msg);\n      else\n          modbusScanTask = setTimeout(scanUpdate, 1000);\n  }\n\n  function scanUpdate() {\n\t  ModbusEditDwr.modbusScanUpdate(scanUpdateCB);\n  }\n  \n  function scanUpdateCB(result) {\n      if (result) {\n          $set(\"scanMessage\", result.message);\n          dwr.util.removeAllOptions(\"scanNodes\");\n          dwr.util.addOptions(\"scanNodes\", result.nodes);\n          if (!result.finished)\n              scanCB();\n          else\n              scanButtons(false);\n      }\n  }\n  \n  function scanCancel() {\n      DataSourceEditDwr.cancelTestingUtility(scanButtons);\n  }\n  \n  function scanButtons(scanning) {\n\t  modbusScanning = scanning; //track the state\n      setDisabled(\"scanBtn\", scanning);\n      setDisabled(\"scanCancelBtn\", !scanning);\n  }\n  \n  function locatorTest() {\n      setDisabled(\"locatorTestBtn\", true);\n      \n      var locator = {};\n      locator.slaveId = $get(\"test_slaveId\");\n");
      out.write("      locator.range = $get(\"test_range\");\n      locator.modbusDataType = $get(\"test_modbusDataType\");\n      locator.offset = $get(\"test_offset\");\n      locator.bit = $get(\"test_bit\");\n      locator.registerCount = $get(\"test_registerCount\");\n      locator.charset = $get(\"test_charset\");\n      \n      locatorTestImpl(locator);\n  }\n  \n  function locatorTestCB(response) {\n      hideContextualMessages(\"locatorTestDiv\");\n      hideGenericMessages(\"locatorTestGeneric\");\n      if (response.hasMessages) {\n          // Add the prefix to the contextual messages.\n          for (var i=0; i<response.messages.length; i++) {\n              if (response.messages[i].contextKey)\n                  response.messages[i].contextKey = \"test_\"+ response.messages[i].contextKey;\n          }\n          showDwrMessages(response.messages, \"locatorTestGeneric\");\n          $set(\"locatorTestResult\");\n      }\n      else\n          $set(\"locatorTestResult\", response.data.result);\n      setDisabled(\"locatorTestBtn\", false);\n  }\n  \n  function dataTest() {\n");
      out.write("      setDisabled(\"dataTestBtn\", true);\n      dataTestImpl($get(\"dataTest_slaveId\"), $get(\"dataTest_range\"), $get(\"dataTest_offset\"), $get(\"dataTest_length\"));\n      hideGenericMessages(\"dataTestGeneric\");\n  }\n  \n  function dataTestCB(response) {\n      if (response.data.length)\n          $set(\"dataTest_length\", response.data.length);\n      \n      if (response.hasMessages) {\n          showDwrMessages(response.messages, \"dataTestGeneric\");\n          hide(\"dataTestResults\");\n      }\n      else {\n          var results = \"\";\n          for (var i=0; i<response.data.results.length; i++)\n              results += response.data.results[i] +\"<br/>\";\n          $set(\"dataTestResults\", results);\n          show(\"dataTestResults\");\n      }\n\n      setDisabled(\"dataTestBtn\", false);\n  }\n  \n  function dataWrite() {\n      setDisabled(\"dataTestWriteBtn\", true);\n      dataWriteImpl($get(\"dataTest_write_slaveId\"), $get(\"dataTest_write_range\"), $get(\"dataTest_write_offset\"), $get(\"dataTest_write_modbusDataType\"), $get(\"dataTest_write_data\"));\n");
      out.write("      hideGenericMessages(\"dataTestWriteGeneric\");\n  }\n\n  function dataWriteCB(response) {\n      if (response.data.length)\n          $set(\"dataTest_write_length\", response.data.length);\n      \n      if (response.hasMessages) {\n          showDwrMessages(response.messages, \"dataTestWriteGeneric\");\n      }\n\n      setDisabled(\"dataTestWriteBtn\", false);\n  }\n  \n\n  \n  function addPointImpl() {\n\t  DataSourceEditDwr.getPoint(-1, function(point) {\n\t\t  editPointCB(point);\n\t      $set(\"slaveId\", $get(\"test_slaveId\"));\n\t      $set(\"range\", $get(\"test_range\"));\n\t      $set(\"modbusDataType\", $get(\"test_modbusDataType\"));\n\t      $set(\"offset\", $get(\"test_offset\"));\n\t      $set(\"bit\", $get(\"test_bit\"));\n\t      $set(\"registerCount\", $get(\"test_registerCount\"));\n\t      $set(\"charset\", $get(\"test_charset\"));\n          changeRange('');\n\t  });\n  }\n  \n  function appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions) {\n      pointListColumnHeaders[pointListColumnHeaders.length] = \"");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("\";\n      pointListColumnFunctions[pointListColumnFunctions.length] = function(p) { return p.pointLocator.slaveId; };\n      \n      pointListColumnHeaders[pointListColumnHeaders.length] = \"");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("\";\n      pointListColumnFunctions[pointListColumnFunctions.length] = function(p) {\n          if (p.pointLocator.slaveMonitor)\n              return \"");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\";\n          return p.pointLocator.rangeMessage;\n      };\n      \n      pointListColumnHeaders[pointListColumnHeaders.length] = \"");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("\";\n      pointListColumnFunctions[pointListColumnFunctions.length] = function(p) {\n    \t  if (p.pointLocator.slaveMonitor)\n    \t\t  return \"\";\n    \t  if (isBinary('', p.pointLocator.modbusDataType) && !isBinaryRange('', p.pointLocator.range))\n              return p.pointLocator.offset +'/'+ p.pointLocator.bit;\n    \t  return p.pointLocator.offset;\n  \t  };\n  }\n  \n  function editPointCBImpl(locator) {\n      $set(\"slaveId\", locator.slaveId);\n      $set(\"range\", locator.range);\n      $set(\"modbusDataType\", locator.modbusDataType);\n      $set(\"offset\", locator.offset);\n      $set(\"bit\", locator.bit);\n      $set(\"registerCount\", locator.registerCount);\n      $set(\"charset\", locator.charset);\n      $set(\"writeType\", locator.writeType);\n      $set(\"multiplier\", locator.multiplier);\n      $set(\"additive\", locator.additive);\n\n      if (locator.slaveMonitor) {\n          hide(\"nonSlaveMonitor\");\n          setDisabled(\"slaveId\", true);\n      }\n      else {\n          setDisabled(\"slaveId\", false);\n          show(\"nonSlaveMonitor\");\n");
      out.write("          changeRange('');\n      }\n  }\n  \n  function savePointImpl(locator) {\n      delete locator.settable;\n      delete locator.rangeMessage;\n      delete locator.dataTypeId;\n      delete locator.relinquishable;\n      delete locator.writeOnly;\n      \n      locator.slaveId = $get(\"slaveId\");\n      locator.range = $get(\"range\");\n      locator.modbusDataType = $get(\"modbusDataType\");\n      locator.offset = $get(\"offset\");\n      locator.bit = $get(\"bit\");\n      locator.registerCount = $get(\"registerCount\");\n      locator.charset = $get(\"charset\");\n      locator.writeType = $get(\"writeType\");\n      locator.multiplier = $get(\"multiplier\");\n      locator.additive = $get(\"additive\");\n      \n      ModbusEditDwr.saveModbusPointLocator(currentPoint.id, $get(\"xid\"), $get(\"name\"), locator, savePointCB);\n  }\n  \n  function changeRange(prefix) {\n      if (isBinaryRange(prefix)) {\n          $set(prefix +\"modbusDataType\", \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(null);
      _jspx_th_c_out_0.setValue( DataType.BINARY );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write("\");\n          setDisabled(prefix +\"modbusDataType\", true);\n      }\n      else\n          setDisabled(prefix +\"modbusDataType\", false);\n      changeDataType(prefix);\n      \n      var rangeId = $get(prefix +\"range\");\n      if (rangeId == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(null);
      _jspx_th_c_out_1.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write("\" || rangeId == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_2.setPageContext(_jspx_page_context);
      _jspx_th_c_out_2.setParent(null);
      _jspx_th_c_out_2.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
      if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      out.write("\")\n          maybeSetDisabled(prefix +\"writeType\", false);\n      else {\n    \t  maybeSetDisabled(prefix +\"writeType\", true);\n          $set(prefix +\"writeType\", ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_3.setPageContext(_jspx_page_context);
      _jspx_th_c_out_3.setParent(null);
      _jspx_th_c_out_3.setValue( ModbusPointLocatorVO.WRITE_TYPE_NOT_SETTABLE );
      int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
      if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      out.write(");\n      }\n  }\n  \n  function isBinary(prefix, dt) {\n\t  if (!dt)\n\t\t  dt = $get(prefix +\"modbusDataType\");\n      return dt == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_4.setPageContext(_jspx_page_context);
      _jspx_th_c_out_4.setParent(null);
      _jspx_th_c_out_4.setValue( DataType.BINARY );
      int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
      if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      out.write("\";\n  }\n  \n  function isBinaryRange(prefix, r) {\n\t  if (!r)\n\t      r = $get(prefix +\"range\");\n      return r == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_5.setPageContext(_jspx_page_context);
      _jspx_th_c_out_5.setParent(null);
      _jspx_th_c_out_5.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
      if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      out.write("\" || r == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_6.setPageContext(_jspx_page_context);
      _jspx_th_c_out_6.setParent(null);
      _jspx_th_c_out_6.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
      if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      out.write("\";\n  }\n  \n  function isString(prefix) {\n\t  var dt = $get(prefix +\"modbusDataType\");\n      return dt == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_7.setPageContext(_jspx_page_context);
      _jspx_th_c_out_7.setParent(null);
      _jspx_th_c_out_7.setValue( DataType.CHAR );
      int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
      if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      out.write("\" || dt == \"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_8.setPageContext(_jspx_page_context);
      _jspx_th_c_out_8.setParent(null);
      _jspx_th_c_out_8.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
      if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      out.write("\";\n  }\n  \n  function changeDataType(prefix) {\n\t  if (isBinary(prefix)) {\n          setDisabled(prefix +\"bit\", isBinaryRange(prefix));\n          setDisabled(prefix +\"registerCount\", true);\n          setDisabled(prefix +\"charset\", true);\n          maybeSetDisabled(prefix +\"multiplier\", true);\n          maybeSetDisabled(prefix +\"additive\", true);\n\t  }\n\t  else if (isString(prefix)) {\n          setDisabled(prefix +\"bit\", true);\n          setDisabled(prefix +\"registerCount\", false);\n          setDisabled(prefix +\"charset\", false);\n          maybeSetDisabled(prefix +\"multiplier\", true);\n          maybeSetDisabled(prefix +\"additive\", true);\n\t  }\n\t  else {\n          setDisabled(prefix +\"bit\", true);\n          setDisabled(prefix +\"registerCount\", true);\n          setDisabled(prefix +\"charset\", true);\n          maybeSetDisabled(prefix +\"multiplier\", false);\n          maybeSetDisabled(prefix +\"additive\", false);\n\t  }\n  }\n  \n  function maybeSetDisabled(nodeName, val) {\n\t  var node = $(nodeName);\n\t  if (node)\n\t\t  setDisabled(node, val);\n");
      out.write("  }\n  \n  function logIOChanged() {\n      if ($get(\"logIO\"))\n          show(\"ioLogPathMsg\");\n      else\n          hide(\"ioLogPathMsg\")\n  }\n</script>\n\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      //  tag:dataSourceAttrs
      org.apache.jsp.tag.web.dataSourceAttrs_tag _jspx_th_tag_dataSourceAttrs_0 = new org.apache.jsp.tag.web.dataSourceAttrs_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_dataSourceAttrs_0        );
      }
      _jspx_th_tag_dataSourceAttrs_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_dataSourceAttrs_0.setDescriptionKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dsKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_tag_dataSourceAttrs_0.setHelpId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dsHelpId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new editModbus_jspfHelper( 0, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null);
      _jspx_th_tag_dataSourceAttrs_0.setExtraPanels(_jspx_temp0);
      _jspx_th_tag_dataSourceAttrs_0.setJspBody(new editModbus_jspfHelper( 1, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null));
      _jspx_th_tag_dataSourceAttrs_0.doTag();
      out.write('\n');
      out.write('\n');
      //  tag:pointList
      org.apache.jsp.tag.web.pointList_tag _jspx_th_tag_pointList_0 = new org.apache.jsp.tag.web.pointList_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_pointList_0        );
      }
      _jspx_th_tag_pointList_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_pointList_0.setPointHelpId("modbus-pp");
      _jspx_th_tag_pointList_0.setJspBody(new editModbus_jspfHelper( 2, _jspx_page_context, _jspx_th_tag_pointList_0, null));
      _jspx_th_tag_pointList_0.doTag();
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("dsEdit.modbus.startScan");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("dsEdit.modbus.slave");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("dsEdit.modbus.range");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("dsEdit.modbus.slaveMonitor");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setKey("dsEdit.modbus.offset");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n  ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n  ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'MODBUS_SERIAL'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n    ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n  ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_0.setVar("dsKey");
    _jspx_th_c_set_0.setValue(new String("dsEdit.modbus.descSerial"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_1.setVar("dsHelpId");
    _jspx_th_c_set_1.setValue(new String("modbus-serial"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'MODBUS_IP'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n    ");
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n  ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_2.setVar("dsKey");
    _jspx_th_c_set_2.setValue(new String("dsEdit.modbus.descIp"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_3.setVar("dsHelpId");
    _jspx_th_c_set_3.setValue(new String("modbus-ip"));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_5.setKey("dsEdit.modbus.nodeScan");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_6.setKey("dsEdit.modbus.scanForNodes");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_7.setKey("common.cancel");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_8.setKey("dsEdit.modbus.nodesFound");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_9.setKey("dsEdit.modbus.dataTest");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_10.setKey("dsEdit.modbus.slaveId");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_11.setKey("dsEdit.modbus.registerRange");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_12.setKey("dsEdit.modbus.coilStatus");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_13.setKey("dsEdit.modbus.inputStatus");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_14.setKey("dsEdit.modbus.holdingRegister");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_15.setKey("dsEdit.modbus.inputRegister");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_16.setKey("dsEdit.modbus.offset");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_17.setKey("dsEdit.modbus.registerCount");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_18.setKey("dsEdit.modbus.dataTest.read");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_19.setKey("dsEdit.modbus.dataTest.write");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_tag_help_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setParent(_jspx_parent);
    _jspx_th_tag_help_0.setId("modbus-write");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_20.setKey("dsEdit.modbus.slaveId");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_21.setKey("dsEdit.modbus.registerRange");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_22.setKey("dsEdit.modbus.coilStatus");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_23.setKey("dsEdit.modbus.holdingRegister");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_24.setKey("dsEdit.modbus.modbusDataType");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_25.setKey("dsEdit.modbus.modbusDataType.binary");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_26.setKey("dsEdit.modbus.modbusDataType.2bUnsigned");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_27.setKey("dsEdit.modbus.modbusDataType.2bSigned");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_28.setKey("dsEdit.modbus.modbusDataType.2bBcd");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_29.setKey("dsEdit.modbus.modbusDataType.4bUnsigned");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_30.setKey("dsEdit.modbus.modbusDataType.4bSigned");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_31.setKey("dsEdit.modbus.modbusDataType.4bUnsignedSwapped");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_32.setKey("dsEdit.modbus.modbusDataType.4bSignedSwapped");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_33.setKey("dsEdit.modbus.modbusDataType.4bFloat");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_34.setKey("dsEdit.modbus.modbusDataType.4bFloatSwapped");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_35.setKey("dsEdit.modbus.modbusDataType.4bBcd");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }

  private boolean _jspx_meth_fmt_message_36(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_36.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_36.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_36.setKey("dsEdit.modbus.modbusDataType.4bBcdSwapped");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private boolean _jspx_meth_fmt_message_37(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_37.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_37.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_37.setKey("dsEdit.modbus.modbusDataType.8bUnsigned");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
    return false;
  }

  private boolean _jspx_meth_fmt_message_38(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_38.setKey("dsEdit.modbus.modbusDataType.8bSigned");
    int _jspx_eval_fmt_message_38 = _jspx_th_fmt_message_38.doStartTag();
    if (_jspx_th_fmt_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
    return false;
  }

  private boolean _jspx_meth_fmt_message_39(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_39.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_39.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_39.setKey("dsEdit.modbus.modbusDataType.8bUnsignedSwapped");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }

  private boolean _jspx_meth_fmt_message_40(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_40.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_40.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_40.setKey("dsEdit.modbus.modbusDataType.8bSignedSwapped");
    int _jspx_eval_fmt_message_40 = _jspx_th_fmt_message_40.doStartTag();
    if (_jspx_th_fmt_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
    return false;
  }

  private boolean _jspx_meth_fmt_message_41(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_41.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_41.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_41.setKey("dsEdit.modbus.modbusDataType.8bFloat");
    int _jspx_eval_fmt_message_41 = _jspx_th_fmt_message_41.doStartTag();
    if (_jspx_th_fmt_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
    return false;
  }

  private boolean _jspx_meth_fmt_message_42(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_42.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_42.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_42.setKey("dsEdit.modbus.modbusDataType.8bFloatSwapped");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }

  private boolean _jspx_meth_fmt_message_43(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_43.setKey("dsEdit.modbus.modbusDataType.char");
    int _jspx_eval_fmt_message_43 = _jspx_th_fmt_message_43.doStartTag();
    if (_jspx_th_fmt_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
    return false;
  }

  private boolean _jspx_meth_fmt_message_44(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_44.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_44.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_44.setKey("dsEdit.modbus.modbusDataType.varchar");
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
    return false;
  }

  private boolean _jspx_meth_fmt_message_45(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_45.setKey("dsEdit.modbus.offset");
    int _jspx_eval_fmt_message_45 = _jspx_th_fmt_message_45.doStartTag();
    if (_jspx_th_fmt_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
    return false;
  }

  private boolean _jspx_meth_fmt_message_46(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_46.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_46.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_46.setKey("dsEdit.modbus.bit");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
    return false;
  }

  private boolean _jspx_meth_fmt_message_47(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_47 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_47.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_47.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_47.setKey("dsEdit.modbus.registerCount");
    int _jspx_eval_fmt_message_47 = _jspx_th_fmt_message_47.doStartTag();
    if (_jspx_th_fmt_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
    return false;
  }

  private boolean _jspx_meth_fmt_message_48(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_48 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_48.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_48.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_48.setKey("dsEdit.modbus.charset");
    int _jspx_eval_fmt_message_48 = _jspx_th_fmt_message_48.doStartTag();
    if (_jspx_th_fmt_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
    return false;
  }

  private boolean _jspx_meth_fmt_message_49(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_49 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_49.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_49.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_49.setKey("dsEdit.modbus.data");
    int _jspx_eval_fmt_message_49 = _jspx_th_fmt_message_49.doStartTag();
    if (_jspx_th_fmt_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
    return false;
  }

  private boolean _jspx_meth_fmt_message_50(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_50.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_50.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_50.setKey("dsEdit.modbus.dataTest.write");
    int _jspx_eval_fmt_message_50 = _jspx_th_fmt_message_50.doStartTag();
    if (_jspx_th_fmt_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
    return false;
  }

  private boolean _jspx_meth_fmt_message_51(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_51 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_51.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_51.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_51.setKey("dsEdit.modbus.locatorTest");
    int _jspx_eval_fmt_message_51 = _jspx_th_fmt_message_51.doStartTag();
    if (_jspx_th_fmt_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
    return false;
  }

  private boolean _jspx_meth_fmt_message_52(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_52 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_52.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_52.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_52.setKey("dsEdit.modbus.slaveId");
    int _jspx_eval_fmt_message_52 = _jspx_th_fmt_message_52.doStartTag();
    if (_jspx_th_fmt_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
    return false;
  }

  private boolean _jspx_meth_fmt_message_53(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_53 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_53.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_53.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_53.setKey("dsEdit.modbus.registerRange");
    int _jspx_eval_fmt_message_53 = _jspx_th_fmt_message_53.doStartTag();
    if (_jspx_th_fmt_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
    return false;
  }

  private boolean _jspx_meth_fmt_message_54(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_54 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_54.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_54.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_54.setKey("dsEdit.modbus.coilStatus");
    int _jspx_eval_fmt_message_54 = _jspx_th_fmt_message_54.doStartTag();
    if (_jspx_th_fmt_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
    return false;
  }

  private boolean _jspx_meth_fmt_message_55(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_55 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_55.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_55.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_55.setKey("dsEdit.modbus.inputStatus");
    int _jspx_eval_fmt_message_55 = _jspx_th_fmt_message_55.doStartTag();
    if (_jspx_th_fmt_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
    return false;
  }

  private boolean _jspx_meth_fmt_message_56(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_56 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_56.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_56.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_56.setKey("dsEdit.modbus.holdingRegister");
    int _jspx_eval_fmt_message_56 = _jspx_th_fmt_message_56.doStartTag();
    if (_jspx_th_fmt_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
    return false;
  }

  private boolean _jspx_meth_fmt_message_57(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_57 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_57.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_57.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_57.setKey("dsEdit.modbus.inputRegister");
    int _jspx_eval_fmt_message_57 = _jspx_th_fmt_message_57.doStartTag();
    if (_jspx_th_fmt_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
    return false;
  }

  private boolean _jspx_meth_fmt_message_58(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_58 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_58.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_58.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_58.setKey("dsEdit.modbus.modbusDataType");
    int _jspx_eval_fmt_message_58 = _jspx_th_fmt_message_58.doStartTag();
    if (_jspx_th_fmt_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
    return false;
  }

  private boolean _jspx_meth_fmt_message_59(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_59 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_59.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_59.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_59.setKey("dsEdit.modbus.modbusDataType.binary");
    int _jspx_eval_fmt_message_59 = _jspx_th_fmt_message_59.doStartTag();
    if (_jspx_th_fmt_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
    return false;
  }

  private boolean _jspx_meth_fmt_message_60(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_60 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_60.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_60.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_60.setKey("dsEdit.modbus.modbusDataType.2bUnsigned");
    int _jspx_eval_fmt_message_60 = _jspx_th_fmt_message_60.doStartTag();
    if (_jspx_th_fmt_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
    return false;
  }

  private boolean _jspx_meth_fmt_message_61(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_61 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_61.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_61.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_61.setKey("dsEdit.modbus.modbusDataType.2bSigned");
    int _jspx_eval_fmt_message_61 = _jspx_th_fmt_message_61.doStartTag();
    if (_jspx_th_fmt_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
    return false;
  }

  private boolean _jspx_meth_fmt_message_62(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_62 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_62.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_62.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_62.setKey("dsEdit.modbus.modbusDataType.2bBcd");
    int _jspx_eval_fmt_message_62 = _jspx_th_fmt_message_62.doStartTag();
    if (_jspx_th_fmt_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
    return false;
  }

  private boolean _jspx_meth_fmt_message_63(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_63 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_63.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_63.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_63.setKey("dsEdit.modbus.modbusDataType.4bUnsigned");
    int _jspx_eval_fmt_message_63 = _jspx_th_fmt_message_63.doStartTag();
    if (_jspx_th_fmt_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
    return false;
  }

  private boolean _jspx_meth_fmt_message_64(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_64 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_64.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_64.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_64.setKey("dsEdit.modbus.modbusDataType.4bSigned");
    int _jspx_eval_fmt_message_64 = _jspx_th_fmt_message_64.doStartTag();
    if (_jspx_th_fmt_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
    return false;
  }

  private boolean _jspx_meth_fmt_message_65(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_65 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_65.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_65.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_65.setKey("dsEdit.modbus.modbusDataType.4bUnsignedSwapped");
    int _jspx_eval_fmt_message_65 = _jspx_th_fmt_message_65.doStartTag();
    if (_jspx_th_fmt_message_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
    return false;
  }

  private boolean _jspx_meth_fmt_message_66(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_66 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_66.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_66.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_66.setKey("dsEdit.modbus.modbusDataType.4bSignedSwapped");
    int _jspx_eval_fmt_message_66 = _jspx_th_fmt_message_66.doStartTag();
    if (_jspx_th_fmt_message_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
    return false;
  }

  private boolean _jspx_meth_fmt_message_67(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_67 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_67.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_67.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_67.setKey("dsEdit.modbus.modbusDataType.4bFloat");
    int _jspx_eval_fmt_message_67 = _jspx_th_fmt_message_67.doStartTag();
    if (_jspx_th_fmt_message_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
    return false;
  }

  private boolean _jspx_meth_fmt_message_68(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_68 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_68.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_68.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_68.setKey("dsEdit.modbus.modbusDataType.4bFloatSwapped");
    int _jspx_eval_fmt_message_68 = _jspx_th_fmt_message_68.doStartTag();
    if (_jspx_th_fmt_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
    return false;
  }

  private boolean _jspx_meth_fmt_message_69(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_69 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_69.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_69.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_69.setKey("dsEdit.modbus.modbusDataType.4bBcd");
    int _jspx_eval_fmt_message_69 = _jspx_th_fmt_message_69.doStartTag();
    if (_jspx_th_fmt_message_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
    return false;
  }

  private boolean _jspx_meth_fmt_message_70(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_70 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_70.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_70.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_70.setKey("dsEdit.modbus.modbusDataType.4bBcdSwapped");
    int _jspx_eval_fmt_message_70 = _jspx_th_fmt_message_70.doStartTag();
    if (_jspx_th_fmt_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
    return false;
  }

  private boolean _jspx_meth_fmt_message_71(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_71 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_71.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_71.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_71.setKey("dsEdit.modbus.modbusDataType.8bUnsigned");
    int _jspx_eval_fmt_message_71 = _jspx_th_fmt_message_71.doStartTag();
    if (_jspx_th_fmt_message_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
    return false;
  }

  private boolean _jspx_meth_fmt_message_72(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_72 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_72.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_72.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_72.setKey("dsEdit.modbus.modbusDataType.8bSigned");
    int _jspx_eval_fmt_message_72 = _jspx_th_fmt_message_72.doStartTag();
    if (_jspx_th_fmt_message_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
    return false;
  }

  private boolean _jspx_meth_fmt_message_73(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_73 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_73.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_73.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_73.setKey("dsEdit.modbus.modbusDataType.8bUnsignedSwapped");
    int _jspx_eval_fmt_message_73 = _jspx_th_fmt_message_73.doStartTag();
    if (_jspx_th_fmt_message_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
    return false;
  }

  private boolean _jspx_meth_fmt_message_74(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_74 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_74.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_74.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_74.setKey("dsEdit.modbus.modbusDataType.8bSignedSwapped");
    int _jspx_eval_fmt_message_74 = _jspx_th_fmt_message_74.doStartTag();
    if (_jspx_th_fmt_message_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
    return false;
  }

  private boolean _jspx_meth_fmt_message_75(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_75 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_75.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_75.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_75.setKey("dsEdit.modbus.modbusDataType.8bFloat");
    int _jspx_eval_fmt_message_75 = _jspx_th_fmt_message_75.doStartTag();
    if (_jspx_th_fmt_message_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
    return false;
  }

  private boolean _jspx_meth_fmt_message_76(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_76 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_76.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_76.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_76.setKey("dsEdit.modbus.modbusDataType.8bFloatSwapped");
    int _jspx_eval_fmt_message_76 = _jspx_th_fmt_message_76.doStartTag();
    if (_jspx_th_fmt_message_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
    return false;
  }

  private boolean _jspx_meth_fmt_message_77(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_77 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_77.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_77.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_77.setKey("dsEdit.modbus.modbusDataType.char");
    int _jspx_eval_fmt_message_77 = _jspx_th_fmt_message_77.doStartTag();
    if (_jspx_th_fmt_message_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
    return false;
  }

  private boolean _jspx_meth_fmt_message_78(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_78 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_78.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_78.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_78.setKey("dsEdit.modbus.modbusDataType.varchar");
    int _jspx_eval_fmt_message_78 = _jspx_th_fmt_message_78.doStartTag();
    if (_jspx_th_fmt_message_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
    return false;
  }

  private boolean _jspx_meth_fmt_message_79(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_79 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_79.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_79.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_79.setKey("dsEdit.modbus.offset");
    int _jspx_eval_fmt_message_79 = _jspx_th_fmt_message_79.doStartTag();
    if (_jspx_th_fmt_message_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
    return false;
  }

  private boolean _jspx_meth_fmt_message_80(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_80 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_80.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_80.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_80.setKey("dsEdit.modbus.bit");
    int _jspx_eval_fmt_message_80 = _jspx_th_fmt_message_80.doStartTag();
    if (_jspx_th_fmt_message_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
    return false;
  }

  private boolean _jspx_meth_fmt_message_81(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_81 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_81.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_81.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_81.setKey("dsEdit.modbus.registerCount");
    int _jspx_eval_fmt_message_81 = _jspx_th_fmt_message_81.doStartTag();
    if (_jspx_th_fmt_message_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
    return false;
  }

  private boolean _jspx_meth_fmt_message_82(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_82 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_82.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_82.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_82.setKey("dsEdit.modbus.charset");
    int _jspx_eval_fmt_message_82 = _jspx_th_fmt_message_82.doStartTag();
    if (_jspx_th_fmt_message_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
    return false;
  }

  private boolean _jspx_meth_fmt_message_83(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_83 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_83.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_83.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_83.setKey("dsEdit.modbus.locatorTest.test");
    int _jspx_eval_fmt_message_83 = _jspx_th_fmt_message_83.doStartTag();
    if (_jspx_th_fmt_message_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
    return false;
  }

  private boolean _jspx_meth_fmt_message_84(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_84 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_84.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_84.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_84.setKey("dsEdit.modbus.addPoint");
    int _jspx_eval_fmt_message_84 = _jspx_th_fmt_message_84.doStartTag();
    if (_jspx_th_fmt_message_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
    return false;
  }

  private boolean _jspx_meth_fmt_message_85(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_85 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_85.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_85.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_85.setKey("dsEdit.updatePeriod");
    int _jspx_eval_fmt_message_85 = _jspx_th_fmt_message_85.doStartTag();
    if (_jspx_th_fmt_message_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_0 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_0      );
    }
    _jspx_th_tag_timePeriods_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_0.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_0.setId("updatePeriodType");
    _jspx_th_tag_timePeriods_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.updatePeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_0.setMs(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_86(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_86 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_86.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_86.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_86.setKey("dsEdit.quantize");
    int _jspx_eval_fmt_message_86 = _jspx_th_fmt_message_86.doStartTag();
    if (_jspx_th_fmt_message_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_0 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_checkbox_0.setId("quantize");
    _jspx_th_sst_checkbox_0.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.quantize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_checkbox_0 = _jspx_th_sst_checkbox_0.doStartTag();
    if (_jspx_th_sst_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_87(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_87 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_87.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_87.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_87.setKey("dsEdit.modbus.timeout");
    int _jspx_eval_fmt_message_87 = _jspx_th_fmt_message_87.doStartTag();
    if (_jspx_th_fmt_message_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
    return false;
  }

  private boolean _jspx_meth_fmt_message_88(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_88 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_88.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_88.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_88.setKey("dsEdit.modbus.retries");
    int _jspx_eval_fmt_message_88 = _jspx_th_fmt_message_88.doStartTag();
    if (_jspx_th_fmt_message_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
    return false;
  }

  private boolean _jspx_meth_fmt_message_89(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_89 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_89.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_89.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_89.setKey("dsEdit.modbus.multipleWritesOnly");
    int _jspx_eval_fmt_message_89 = _jspx_th_fmt_message_89.doStartTag();
    if (_jspx_th_fmt_message_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_1 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_checkbox_1.setId("multipleWritesOnly");
    _jspx_th_sst_checkbox_1.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.multipleWritesOnly}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_checkbox_1 = _jspx_th_sst_checkbox_1.doStartTag();
    if (_jspx_th_sst_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_90(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_90 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_90.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_90.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_90.setKey("dsEdit.modbus.contiguousBatches");
    int _jspx_eval_fmt_message_90 = _jspx_th_fmt_message_90.doStartTag();
    if (_jspx_th_fmt_message_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_2 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_2.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_checkbox_2.setId("contiguousBatches");
    _jspx_th_sst_checkbox_2.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.contiguousBatches}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_checkbox_2 = _jspx_th_sst_checkbox_2.doStartTag();
    if (_jspx_th_sst_checkbox_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_91(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_91 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_91.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_91.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_91.setKey("dsEdit.modbus.createSlaveMonitorPoints");
    int _jspx_eval_fmt_message_91 = _jspx_th_fmt_message_91.doStartTag();
    if (_jspx_th_fmt_message_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_3 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_3.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_checkbox_3.setId("createSlaveMonitorPoints");
    _jspx_th_sst_checkbox_3.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.createSlaveMonitorPoints}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_checkbox_3 = _jspx_th_sst_checkbox_3.doStartTag();
    if (_jspx_th_sst_checkbox_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_92(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_92 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_92.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_92.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_92.setKey("dsEdit.modbus.maxReadBitCount");
    int _jspx_eval_fmt_message_92 = _jspx_th_fmt_message_92.doStartTag();
    if (_jspx_th_fmt_message_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
    return false;
  }

  private boolean _jspx_meth_fmt_message_93(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_93 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_93.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_93.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_93.setKey("dsEdit.modbus.maxReadRegisterCount");
    int _jspx_eval_fmt_message_93 = _jspx_th_fmt_message_93.doStartTag();
    if (_jspx_th_fmt_message_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
    return false;
  }

  private boolean _jspx_meth_fmt_message_94(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_94 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_94.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_94.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_94.setKey("dsEdit.modbus.maxWriteRegisterCount");
    int _jspx_eval_fmt_message_94 = _jspx_th_fmt_message_94.doStartTag();
    if (_jspx_th_fmt_message_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
    return false;
  }

  private boolean _jspx_meth_fmt_message_95(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_95 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_95.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_95.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_95.setKey("dsEdit.modbus.logIO");
    int _jspx_eval_fmt_message_95 = _jspx_th_fmt_message_95.doStartTag();
    if (_jspx_th_fmt_message_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_4 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_onclick_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_4.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_checkbox_4.setId("logIO");
    _jspx_th_sst_checkbox_4.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.logIO}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sst_checkbox_4.setOnclick("logIOChanged()");
    int _jspx_eval_sst_checkbox_4 = _jspx_th_sst_checkbox_4.doStartTag();
    if (_jspx_th_sst_checkbox_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_onclick_id_nobody.reuse(_jspx_th_sst_checkbox_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_id_nobody.reuse(_jspx_th_sst_checkbox_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_96(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_96 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_96.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_96.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_96.setKey("dsEdit.modbus.log");
    int _jspx_eval_fmt_message_96 = _jspx_th_fmt_message_96.doStartTag();
    if (_jspx_eval_fmt_message_96 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_message_96 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_message_96.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_message_96.doInitBody();
      }
      do {
        out.write("\n            ");
        if (_jspx_meth_fmt_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_message_96, _jspx_page_context))
          return true;
        out.write("\n          ");
        int evalDoAfterBody = _jspx_th_fmt_message_96.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_message_96 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_message_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_96);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_96);
    return false;
  }

  private boolean _jspx_meth_fmt_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_message_96, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_param_0 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _jspx_tagPool_fmt_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_param_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_message_96);
    _jspx_th_fmt_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.ioLogPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_param_0 = _jspx_th_fmt_param_0.doStartTag();
    if (_jspx_th_fmt_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_param_value_nobody.reuse(_jspx_th_fmt_param_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_param_value_nobody.reuse(_jspx_th_fmt_param_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_97(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_97 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_97.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_97.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_97.setKey("dsEdit.modbus.discardDataDelay");
    int _jspx_eval_fmt_message_97 = _jspx_th_fmt_message_97.doStartTag();
    if (_jspx_th_fmt_message_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
    return false;
  }

  private boolean _jspx_meth_tag_serialSettings_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:serialSettings
    org.apache.jsp.tag.web.serialSettings_tag _jspx_th_tag_serialSettings_0 = new org.apache.jsp.tag.web.serialSettings_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_serialSettings_0      );
    }
    _jspx_th_tag_serialSettings_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_serialSettings_0.setParent(_jspx_th_c_when_2);
    _jspx_th_tag_serialSettings_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_98(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_98 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_98.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_fmt_message_98.setKey("dsEdit.modbusSerial.encoding");
    int _jspx_eval_fmt_message_98 = _jspx_th_fmt_message_98.doStartTag();
    if (_jspx_th_fmt_message_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
    return false;
  }

  private boolean _jspx_meth_fmt_message_99(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_99 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_99.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_99.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_99.setKey("dsEdit.modbusSerial.encoding.rtu");
    int _jspx_eval_fmt_message_99 = _jspx_th_fmt_message_99.doStartTag();
    if (_jspx_th_fmt_message_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
    return false;
  }

  private boolean _jspx_meth_fmt_message_100(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_100 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_100.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
    _jspx_th_fmt_message_100.setKey("dsEdit.modbusSerial.encoding.ascii");
    int _jspx_eval_fmt_message_100 = _jspx_th_fmt_message_100.doStartTag();
    if (_jspx_th_fmt_message_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
    return false;
  }

  private boolean _jspx_meth_fmt_message_101(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_101 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_101.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_fmt_message_101.setKey("dsEdit.modbusSerial.echo");
    int _jspx_eval_fmt_message_101 = _jspx_th_fmt_message_101.doStartTag();
    if (_jspx_th_fmt_message_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
    return false;
  }

  private boolean _jspx_meth_sst_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_1 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_sst_select_1.setId("echo");
    _jspx_th_sst_select_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.echo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_1 = _jspx_th_sst_select_1.doStartTag();
    if (_jspx_eval_sst_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n      ");
        if (_jspx_meth_sst_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n      ");
        if (_jspx_meth_sst_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n    ");
        int evalDoAfterBody = _jspx_th_sst_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_1);
    return false;
  }

  private boolean _jspx_meth_sst_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    _jspx_th_sst_option_2.setValue("false");
    int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
    if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_2.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_102((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_102(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_102 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_102.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
    _jspx_th_fmt_message_102.setKey("dsEdit.modbusSerial.echo.off");
    int _jspx_eval_fmt_message_102 = _jspx_th_fmt_message_102.doStartTag();
    if (_jspx_th_fmt_message_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
    return false;
  }

  private boolean _jspx_meth_sst_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    _jspx_th_sst_option_3.setValue("true");
    int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
    if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_3.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_103((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_103(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_103 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_103.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_3);
    _jspx_th_fmt_message_103.setKey("dsEdit.modbusSerial.echo.on");
    int _jspx_eval_fmt_message_103 = _jspx_th_fmt_message_103.doStartTag();
    if (_jspx_th_fmt_message_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
    return false;
  }

  private boolean _jspx_meth_fmt_message_104(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_104 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_104.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_message_104.setKey("dsEdit.modbusIp.transportType");
    int _jspx_eval_fmt_message_104 = _jspx_th_fmt_message_104.doStartTag();
    if (_jspx_th_fmt_message_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
    return false;
  }

  private boolean _jspx_meth_fmt_message_105(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_105 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_105.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_4);
    _jspx_th_fmt_message_105.setKey("dsEdit.modbusIp.transportType.tcp");
    int _jspx_eval_fmt_message_105 = _jspx_th_fmt_message_105.doStartTag();
    if (_jspx_th_fmt_message_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
    return false;
  }

  private boolean _jspx_meth_fmt_message_106(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_106 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_106.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_106.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_5);
    _jspx_th_fmt_message_106.setKey("dsEdit.modbusIp.transportType.tcpKA");
    int _jspx_eval_fmt_message_106 = _jspx_th_fmt_message_106.doStartTag();
    if (_jspx_th_fmt_message_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
    return false;
  }

  private boolean _jspx_meth_fmt_message_107(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_107 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_107.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_6);
    _jspx_th_fmt_message_107.setKey("dsEdit.modbusIp.transportType.udp");
    int _jspx_eval_fmt_message_107 = _jspx_th_fmt_message_107.doStartTag();
    if (_jspx_th_fmt_message_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
    return false;
  }

  private boolean _jspx_meth_fmt_message_108(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_108 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_108.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_message_108.setKey("dsEdit.modbusIp.host");
    int _jspx_eval_fmt_message_108 = _jspx_th_fmt_message_108.doStartTag();
    if (_jspx_th_fmt_message_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
    return false;
  }

  private boolean _jspx_meth_fmt_message_109(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_109 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_109.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_message_109.setKey("dsEdit.modbusIp.port");
    int _jspx_eval_fmt_message_109 = _jspx_th_fmt_message_109.doStartTag();
    if (_jspx_th_fmt_message_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
    return false;
  }

  private boolean _jspx_meth_fmt_message_110(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_110 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_110.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_message_110.setKey("dsEdit.modbusIp.encapsulated");
    int _jspx_eval_fmt_message_110 = _jspx_th_fmt_message_110.doStartTag();
    if (_jspx_th_fmt_message_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_5 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_5.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_sst_checkbox_5.setId("encapsulated");
    _jspx_th_sst_checkbox_5.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.encapsulated}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_checkbox_5 = _jspx_th_sst_checkbox_5.doStartTag();
    if (_jspx_th_sst_checkbox_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_111(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_111 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_111.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_111.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_111.setKey("dsEdit.modbus.slaveId");
    int _jspx_eval_fmt_message_111 = _jspx_th_fmt_message_111.doStartTag();
    if (_jspx_th_fmt_message_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
    return false;
  }

  private boolean _jspx_meth_fmt_message_112(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_112 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_112.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_112.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_112.setKey("dsEdit.modbus.registerRange");
    int _jspx_eval_fmt_message_112 = _jspx_th_fmt_message_112.doStartTag();
    if (_jspx_th_fmt_message_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
    return false;
  }

  private boolean _jspx_meth_fmt_message_113(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_113 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_113.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_113.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_113.setKey("dsEdit.modbus.coilStatus");
    int _jspx_eval_fmt_message_113 = _jspx_th_fmt_message_113.doStartTag();
    if (_jspx_th_fmt_message_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
    return false;
  }

  private boolean _jspx_meth_fmt_message_114(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_114 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_114.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_114.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_114.setKey("dsEdit.modbus.inputStatus");
    int _jspx_eval_fmt_message_114 = _jspx_th_fmt_message_114.doStartTag();
    if (_jspx_th_fmt_message_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
    return false;
  }

  private boolean _jspx_meth_fmt_message_115(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_115 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_115.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_115.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_115.setKey("dsEdit.modbus.holdingRegister");
    int _jspx_eval_fmt_message_115 = _jspx_th_fmt_message_115.doStartTag();
    if (_jspx_th_fmt_message_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
    return false;
  }

  private boolean _jspx_meth_fmt_message_116(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_116 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_116.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_116.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_116.setKey("dsEdit.modbus.inputRegister");
    int _jspx_eval_fmt_message_116 = _jspx_th_fmt_message_116.doStartTag();
    if (_jspx_th_fmt_message_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
    return false;
  }

  private boolean _jspx_meth_fmt_message_117(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_117 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_117.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_117.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_117.setKey("dsEdit.modbus.modbusDataType");
    int _jspx_eval_fmt_message_117 = _jspx_th_fmt_message_117.doStartTag();
    if (_jspx_th_fmt_message_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
    return false;
  }

  private boolean _jspx_meth_fmt_message_118(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_118 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_118.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_118.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_118.setKey("dsEdit.modbus.modbusDataType.binary");
    int _jspx_eval_fmt_message_118 = _jspx_th_fmt_message_118.doStartTag();
    if (_jspx_th_fmt_message_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
    return false;
  }

  private boolean _jspx_meth_fmt_message_119(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_119 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_119.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_119.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_119.setKey("dsEdit.modbus.modbusDataType.2bUnsigned");
    int _jspx_eval_fmt_message_119 = _jspx_th_fmt_message_119.doStartTag();
    if (_jspx_th_fmt_message_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
    return false;
  }

  private boolean _jspx_meth_fmt_message_120(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_120 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_120.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_120.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_120.setKey("dsEdit.modbus.modbusDataType.2bSigned");
    int _jspx_eval_fmt_message_120 = _jspx_th_fmt_message_120.doStartTag();
    if (_jspx_th_fmt_message_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
    return false;
  }

  private boolean _jspx_meth_fmt_message_121(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_121 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_121.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_121.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_121.setKey("dsEdit.modbus.modbusDataType.2bBcd");
    int _jspx_eval_fmt_message_121 = _jspx_th_fmt_message_121.doStartTag();
    if (_jspx_th_fmt_message_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
    return false;
  }

  private boolean _jspx_meth_fmt_message_122(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_122 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_122.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_122.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_122.setKey("dsEdit.modbus.modbusDataType.4bUnsigned");
    int _jspx_eval_fmt_message_122 = _jspx_th_fmt_message_122.doStartTag();
    if (_jspx_th_fmt_message_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
    return false;
  }

  private boolean _jspx_meth_fmt_message_123(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_123 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_123.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_123.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_123.setKey("dsEdit.modbus.modbusDataType.4bSigned");
    int _jspx_eval_fmt_message_123 = _jspx_th_fmt_message_123.doStartTag();
    if (_jspx_th_fmt_message_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
    return false;
  }

  private boolean _jspx_meth_fmt_message_124(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_124 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_124.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_124.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_124.setKey("dsEdit.modbus.modbusDataType.4bUnsignedSwapped");
    int _jspx_eval_fmt_message_124 = _jspx_th_fmt_message_124.doStartTag();
    if (_jspx_th_fmt_message_124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
    return false;
  }

  private boolean _jspx_meth_fmt_message_125(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_125 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_125.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_125.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_125.setKey("dsEdit.modbus.modbusDataType.4bSignedSwapped");
    int _jspx_eval_fmt_message_125 = _jspx_th_fmt_message_125.doStartTag();
    if (_jspx_th_fmt_message_125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
    return false;
  }

  private boolean _jspx_meth_fmt_message_126(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_126 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_126.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_126.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_126.setKey("dsEdit.modbus.modbusDataType.4bFloat");
    int _jspx_eval_fmt_message_126 = _jspx_th_fmt_message_126.doStartTag();
    if (_jspx_th_fmt_message_126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
    return false;
  }

  private boolean _jspx_meth_fmt_message_127(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_127 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_127.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_127.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_127.setKey("dsEdit.modbus.modbusDataType.4bFloatSwapped");
    int _jspx_eval_fmt_message_127 = _jspx_th_fmt_message_127.doStartTag();
    if (_jspx_th_fmt_message_127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
    return false;
  }

  private boolean _jspx_meth_fmt_message_128(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_128 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_128.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_128.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_128.setKey("dsEdit.modbus.modbusDataType.4bBcd");
    int _jspx_eval_fmt_message_128 = _jspx_th_fmt_message_128.doStartTag();
    if (_jspx_th_fmt_message_128.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_128);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_128);
    return false;
  }

  private boolean _jspx_meth_fmt_message_129(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_129 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_129.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_129.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_129.setKey("dsEdit.modbus.modbusDataType.4bBcdSwapped");
    int _jspx_eval_fmt_message_129 = _jspx_th_fmt_message_129.doStartTag();
    if (_jspx_th_fmt_message_129.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_129);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_129);
    return false;
  }

  private boolean _jspx_meth_fmt_message_130(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_130 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_130.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_130.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_130.setKey("dsEdit.modbus.modbusDataType.8bUnsigned");
    int _jspx_eval_fmt_message_130 = _jspx_th_fmt_message_130.doStartTag();
    if (_jspx_th_fmt_message_130.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_130);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_130);
    return false;
  }

  private boolean _jspx_meth_fmt_message_131(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_131 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_131.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_131.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_131.setKey("dsEdit.modbus.modbusDataType.8bSigned");
    int _jspx_eval_fmt_message_131 = _jspx_th_fmt_message_131.doStartTag();
    if (_jspx_th_fmt_message_131.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_131);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_131);
    return false;
  }

  private boolean _jspx_meth_fmt_message_132(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_132 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_132.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_132.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_132.setKey("dsEdit.modbus.modbusDataType.8bUnsignedSwapped");
    int _jspx_eval_fmt_message_132 = _jspx_th_fmt_message_132.doStartTag();
    if (_jspx_th_fmt_message_132.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_132);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_132);
    return false;
  }

  private boolean _jspx_meth_fmt_message_133(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_133 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_133.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_133.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_133.setKey("dsEdit.modbus.modbusDataType.8bSignedSwapped");
    int _jspx_eval_fmt_message_133 = _jspx_th_fmt_message_133.doStartTag();
    if (_jspx_th_fmt_message_133.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_133);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_133);
    return false;
  }

  private boolean _jspx_meth_fmt_message_134(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_134 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_134.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_134.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_134.setKey("dsEdit.modbus.modbusDataType.8bFloat");
    int _jspx_eval_fmt_message_134 = _jspx_th_fmt_message_134.doStartTag();
    if (_jspx_th_fmt_message_134.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_134);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_134);
    return false;
  }

  private boolean _jspx_meth_fmt_message_135(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_135 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_135.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_135.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_135.setKey("dsEdit.modbus.modbusDataType.8bFloatSwapped");
    int _jspx_eval_fmt_message_135 = _jspx_th_fmt_message_135.doStartTag();
    if (_jspx_th_fmt_message_135.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_135);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_135);
    return false;
  }

  private boolean _jspx_meth_fmt_message_136(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_136 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_136.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_136.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_136.setKey("dsEdit.modbus.modbusDataType.char");
    int _jspx_eval_fmt_message_136 = _jspx_th_fmt_message_136.doStartTag();
    if (_jspx_th_fmt_message_136.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_136);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_136);
    return false;
  }

  private boolean _jspx_meth_fmt_message_137(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_137 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_137.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_137.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_137.setKey("dsEdit.modbus.modbusDataType.varchar");
    int _jspx_eval_fmt_message_137 = _jspx_th_fmt_message_137.doStartTag();
    if (_jspx_th_fmt_message_137.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_137);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_137);
    return false;
  }

  private boolean _jspx_meth_fmt_message_138(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_138 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_138.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_138.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_138.setKey("dsEdit.modbus.offset");
    int _jspx_eval_fmt_message_138 = _jspx_th_fmt_message_138.doStartTag();
    if (_jspx_th_fmt_message_138.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_138);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_138);
    return false;
  }

  private boolean _jspx_meth_fmt_message_139(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_139 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_139.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_139.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_139.setKey("dsEdit.modbus.bit");
    int _jspx_eval_fmt_message_139 = _jspx_th_fmt_message_139.doStartTag();
    if (_jspx_th_fmt_message_139.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_139);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_139);
    return false;
  }

  private boolean _jspx_meth_fmt_message_140(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_140 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_140.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_140.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_140.setKey("dsEdit.modbus.registerCount");
    int _jspx_eval_fmt_message_140 = _jspx_th_fmt_message_140.doStartTag();
    if (_jspx_th_fmt_message_140.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_140);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_140);
    return false;
  }

  private boolean _jspx_meth_fmt_message_141(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_141 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_141.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_141.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_141.setKey("dsEdit.modbus.charset");
    int _jspx_eval_fmt_message_141 = _jspx_th_fmt_message_141.doStartTag();
    if (_jspx_th_fmt_message_141.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_141);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_141);
    return false;
  }

  private boolean _jspx_meth_fmt_message_142(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_142 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_142.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_142.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_142.setKey("dsEdit.modbus.writeType");
    int _jspx_eval_fmt_message_142 = _jspx_th_fmt_message_142.doStartTag();
    if (_jspx_th_fmt_message_142.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_142);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_142);
    return false;
  }

  private boolean _jspx_meth_fmt_message_143(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_143 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_143.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_143.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_143.setKey("dsEdit.modbus.multiplier");
    int _jspx_eval_fmt_message_143 = _jspx_th_fmt_message_143.doStartTag();
    if (_jspx_th_fmt_message_143.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_143);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_143);
    return false;
  }

  private boolean _jspx_meth_fmt_message_144(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_144 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_144.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_144.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_144.setKey("dsEdit.modbus.additive");
    int _jspx_eval_fmt_message_144 = _jspx_th_fmt_message_144.doStartTag();
    if (_jspx_th_fmt_message_144.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_144);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_144);
    return false;
  }

  private class editModbus_jspfHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public editModbus_jspfHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<td valign=\"top\">\n      <div class=\"borderDiv marB marR\" style=\"float:left;\">\n        <table>\n          <tr><td colspan=\"2\" class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n          <tr>\n            <td colspan=\"2\" align=\"center\">\n              <input id=\"scanBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"scan();\"/>\n              <input id=\"scanCancelBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"scanCancel();\"/>\n            </td>\n          </tr>\n          \n          <tr><td colspan=\"2\" id=\"scanMessage\" class=\"formError\"></td></tr>\n          \n          <tr>\n            <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><select id=\"scanNodes\" size=\"8\"></select></td>\n          </tr>\n        </table>\n      </div>\n      \n      <div class=\"borderDiv marB marR\" style=\"float:left;\">\n        <table>\n          <tr><td colspan=\"2\" class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"dataTest_slaveId\" value=\"1\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <select id=\"dataTest_range\">\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_9.setPageContext(_jspx_page_context);
      _jspx_th_c_out_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_9.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
      if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_10.setPageContext(_jspx_page_context);
      _jspx_th_c_out_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_10.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
      if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_11.setPageContext(_jspx_page_context);
      _jspx_th_c_out_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_11.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
      if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_12.setPageContext(_jspx_page_context);
      _jspx_th_c_out_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_12.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
      if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              </select>\n            </td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"dataTest_offset\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"dataTest_length\" value=\"100\"/></td>\n          </tr>\n          \n          <tr>\n            <td colspan=\"2\" align=\"center\">\n              <input id=\"dataTestBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"dataTest();\"/>\n            </td>\n          </tr>\n          \n          <tr><td colspan=\"2\"><div id=\"dataTestResults\" style=\"height: 200px; width: 100%; overflow: scroll; display: none;\"></div></td></tr>\n          \n          <tr><td colspan=\"2\"><table><tbody id=\"dataTestGeneric\"></tbody></table></td></tr> \n        </table>\n      </div>\n      \n      <!-- MODBUS Write Data Tool -->\n       <div class=\"borderDiv marB marR\" style=\"float:left;\">\n        <table>\n          <tr><td colspan=\"2\" class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"number\" id=\"dataTest_write_slaveId\" value=\"1\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <select id=\"dataTest_write_range\" onchange=\"changeRange('dataTest_write_')\">\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_13.setPageContext(_jspx_page_context);
      _jspx_th_c_out_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_13.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
      if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_14.setPageContext(_jspx_page_context);
      _jspx_th_c_out_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_14.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
      if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              </select>\n            </td>\n          </tr>\n         \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <select id=\"dataTest_write_modbusDataType\" onchange=\"changeDataType('dataTest_write_')\">\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_15.setPageContext(_jspx_page_context);
      _jspx_th_c_out_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_15.setValue( DataType.BINARY );
      int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
      if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_16.setPageContext(_jspx_page_context);
      _jspx_th_c_out_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_16.setValue( DataType.TWO_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
      if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_17.setPageContext(_jspx_page_context);
      _jspx_th_c_out_17.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_17.setValue( DataType.TWO_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
      if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_18.setPageContext(_jspx_page_context);
      _jspx_th_c_out_18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_18.setValue( DataType.TWO_BYTE_BCD );
      int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
      if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_19.setPageContext(_jspx_page_context);
      _jspx_th_c_out_19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_19.setValue( DataType.FOUR_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
      if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_20.setPageContext(_jspx_page_context);
      _jspx_th_c_out_20.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_20.setValue( DataType.FOUR_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
      if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_21.setPageContext(_jspx_page_context);
      _jspx_th_c_out_21.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_21.setValue( DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
      if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_22.setPageContext(_jspx_page_context);
      _jspx_th_c_out_22.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_22.setValue( DataType.FOUR_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
      if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_23.setPageContext(_jspx_page_context);
      _jspx_th_c_out_23.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_23.setValue( DataType.FOUR_BYTE_FLOAT );
      int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
      if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_24.setPageContext(_jspx_page_context);
      _jspx_th_c_out_24.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_24.setValue( DataType.FOUR_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
      if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_25.setPageContext(_jspx_page_context);
      _jspx_th_c_out_25.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_25.setValue( DataType.FOUR_BYTE_BCD );
      int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
      if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_26.setPageContext(_jspx_page_context);
      _jspx_th_c_out_26.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_26.setValue( DataType.FOUR_BYTE_BCD_SWAPPED );
      int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
      if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_27.setPageContext(_jspx_page_context);
      _jspx_th_c_out_27.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_27.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_27 = _jspx_th_c_out_27.doStartTag();
      if (_jspx_th_c_out_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_28.setPageContext(_jspx_page_context);
      _jspx_th_c_out_28.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_28.setValue( DataType.EIGHT_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_28 = _jspx_th_c_out_28.doStartTag();
      if (_jspx_th_c_out_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_29.setPageContext(_jspx_page_context);
      _jspx_th_c_out_29.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_29.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_29 = _jspx_th_c_out_29.doStartTag();
      if (_jspx_th_c_out_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_30.setPageContext(_jspx_page_context);
      _jspx_th_c_out_30.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_30.setValue( DataType.EIGHT_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_30 = _jspx_th_c_out_30.doStartTag();
      if (_jspx_th_c_out_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_31.setPageContext(_jspx_page_context);
      _jspx_th_c_out_31.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_31.setValue( DataType.EIGHT_BYTE_FLOAT );
      int _jspx_eval_c_out_31 = _jspx_th_c_out_31.doStartTag();
      if (_jspx_th_c_out_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_32.setPageContext(_jspx_page_context);
      _jspx_th_c_out_32.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_32.setValue( DataType.EIGHT_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_32 = _jspx_th_c_out_32.doStartTag();
      if (_jspx_th_c_out_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_33.setPageContext(_jspx_page_context);
      _jspx_th_c_out_33.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_33.setValue( DataType.CHAR );
      int _jspx_eval_c_out_33 = _jspx_th_c_out_33.doStartTag();
      if (_jspx_th_c_out_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_34.setPageContext(_jspx_page_context);
      _jspx_th_c_out_34.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_34.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_34 = _jspx_th_c_out_34.doStartTag();
      if (_jspx_th_c_out_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              </select>\n            </td>\n          </tr>\n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"number\" id=\"dataTest_write_offset\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"dataTest_write_bit\" type=\"number\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"dataTest_write_registerCount\" type=\"number\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"dataTest_write_charset\" type=\"text\" value=\"ASCII\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"dataTest_write_data\" /></td>\n          </tr>\n          \n          <tr>\n            <td colspan=\"2\" align=\"center\">\n              <input id=\"dataTestWriteBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"dataWrite();\"/>\n            </td>\n          </tr>\n          \n          <tr><td colspan=\"2\"><table><tbody id=\"dataTestWriteGeneric\"></tbody></table></td></tr> \n        </table>\n      </div>\n      \n      \n      \n      \n      \n      \n      \n      \n            \n      <div class=\"borderDiv marB\" id=\"locatorTestDiv\" style=\"clear:both;\">\n        <table>\n          <tr><td colspan=\"2\" class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_51((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_52((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"test_slaveId\" value=\"1\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_53((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <select id=\"test_range\" onchange=\"changeRange('test_')\">\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_35.setPageContext(_jspx_page_context);
      _jspx_th_c_out_35.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_35.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_35 = _jspx_th_c_out_35.doStartTag();
      if (_jspx_th_c_out_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_54((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_36.setPageContext(_jspx_page_context);
      _jspx_th_c_out_36.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_36.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_36 = _jspx_th_c_out_36.doStartTag();
      if (_jspx_th_c_out_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_55((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_37.setPageContext(_jspx_page_context);
      _jspx_th_c_out_37.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_37.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_37 = _jspx_th_c_out_37.doStartTag();
      if (_jspx_th_c_out_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_56((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_38.setPageContext(_jspx_page_context);
      _jspx_th_c_out_38.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_38.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_38 = _jspx_th_c_out_38.doStartTag();
      if (_jspx_th_c_out_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_57((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              </select>\n            </td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_58((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <select id=\"test_modbusDataType\" onchange=\"changeDataType('test_')\">\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_39 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_39.setPageContext(_jspx_page_context);
      _jspx_th_c_out_39.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_39.setValue( DataType.BINARY );
      int _jspx_eval_c_out_39 = _jspx_th_c_out_39.doStartTag();
      if (_jspx_th_c_out_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_59((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_40 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_40.setPageContext(_jspx_page_context);
      _jspx_th_c_out_40.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_40.setValue( DataType.TWO_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_40 = _jspx_th_c_out_40.doStartTag();
      if (_jspx_th_c_out_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_60((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_41 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_41.setPageContext(_jspx_page_context);
      _jspx_th_c_out_41.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_41.setValue( DataType.TWO_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_41 = _jspx_th_c_out_41.doStartTag();
      if (_jspx_th_c_out_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_61((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_42 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_42.setPageContext(_jspx_page_context);
      _jspx_th_c_out_42.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_42.setValue( DataType.TWO_BYTE_BCD );
      int _jspx_eval_c_out_42 = _jspx_th_c_out_42.doStartTag();
      if (_jspx_th_c_out_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_62((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_43 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_43.setPageContext(_jspx_page_context);
      _jspx_th_c_out_43.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_43.setValue( DataType.FOUR_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_43 = _jspx_th_c_out_43.doStartTag();
      if (_jspx_th_c_out_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_63((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_44 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_44.setPageContext(_jspx_page_context);
      _jspx_th_c_out_44.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_44.setValue( DataType.FOUR_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_44 = _jspx_th_c_out_44.doStartTag();
      if (_jspx_th_c_out_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_64((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_45 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_45.setPageContext(_jspx_page_context);
      _jspx_th_c_out_45.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_45.setValue( DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_45 = _jspx_th_c_out_45.doStartTag();
      if (_jspx_th_c_out_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_65((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_46 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_46.setPageContext(_jspx_page_context);
      _jspx_th_c_out_46.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_46.setValue( DataType.FOUR_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_46 = _jspx_th_c_out_46.doStartTag();
      if (_jspx_th_c_out_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_66((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_47 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_47.setPageContext(_jspx_page_context);
      _jspx_th_c_out_47.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_47.setValue( DataType.FOUR_BYTE_FLOAT );
      int _jspx_eval_c_out_47 = _jspx_th_c_out_47.doStartTag();
      if (_jspx_th_c_out_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_67((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_48 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_48.setPageContext(_jspx_page_context);
      _jspx_th_c_out_48.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_48.setValue( DataType.FOUR_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_48 = _jspx_th_c_out_48.doStartTag();
      if (_jspx_th_c_out_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_68((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_49 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_49.setPageContext(_jspx_page_context);
      _jspx_th_c_out_49.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_49.setValue( DataType.FOUR_BYTE_BCD );
      int _jspx_eval_c_out_49 = _jspx_th_c_out_49.doStartTag();
      if (_jspx_th_c_out_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_69((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_50 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_50.setPageContext(_jspx_page_context);
      _jspx_th_c_out_50.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_50.setValue( DataType.FOUR_BYTE_BCD_SWAPPED );
      int _jspx_eval_c_out_50 = _jspx_th_c_out_50.doStartTag();
      if (_jspx_th_c_out_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_70((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_51 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_51.setPageContext(_jspx_page_context);
      _jspx_th_c_out_51.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_51.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_51 = _jspx_th_c_out_51.doStartTag();
      if (_jspx_th_c_out_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_71((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_52 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_52.setPageContext(_jspx_page_context);
      _jspx_th_c_out_52.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_52.setValue( DataType.EIGHT_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_52 = _jspx_th_c_out_52.doStartTag();
      if (_jspx_th_c_out_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_72((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_53 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_53.setPageContext(_jspx_page_context);
      _jspx_th_c_out_53.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_53.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_53 = _jspx_th_c_out_53.doStartTag();
      if (_jspx_th_c_out_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_53);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_53);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_73((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_54 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_54.setPageContext(_jspx_page_context);
      _jspx_th_c_out_54.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_54.setValue( DataType.EIGHT_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_54 = _jspx_th_c_out_54.doStartTag();
      if (_jspx_th_c_out_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_74((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_55 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_55.setPageContext(_jspx_page_context);
      _jspx_th_c_out_55.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_55.setValue( DataType.EIGHT_BYTE_FLOAT );
      int _jspx_eval_c_out_55 = _jspx_th_c_out_55.doStartTag();
      if (_jspx_th_c_out_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_55);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_55);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_75((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_56 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_56.setPageContext(_jspx_page_context);
      _jspx_th_c_out_56.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_56.setValue( DataType.EIGHT_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_56 = _jspx_th_c_out_56.doStartTag();
      if (_jspx_th_c_out_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_56);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_56);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_76((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_57 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_57.setPageContext(_jspx_page_context);
      _jspx_th_c_out_57.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_57.setValue( DataType.CHAR );
      int _jspx_eval_c_out_57 = _jspx_th_c_out_57.doStartTag();
      if (_jspx_th_c_out_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_57);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_57);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_77((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_58 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_58.setPageContext(_jspx_page_context);
      _jspx_th_c_out_58.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_58.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_58 = _jspx_th_c_out_58.doStartTag();
      if (_jspx_th_c_out_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_58);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_58);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_78((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              </select>\n            </td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_79((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"test_offset\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_80((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"test_bit\" type=\"text\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_81((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"test_registerCount\" type=\"text\" value=\"0\"/></td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_82((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"test_charset\" type=\"text\" value=\"ASCII\"/></td>\n          </tr>\n          \n          <tr>\n            <td colspan=\"2\" align=\"center\">\n              <input id=\"locatorTestBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_83((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"locatorTest();\"/>\n              <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_84((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"addPoint();\"/>\n            </td>\n          </tr>\n          \n          <tr><td colspan=\"2\" id=\"locatorTestResult\" class=\"formError\"></td></tr>\n          <tr><td colspan=\"2\"><table><tbody id=\"locatorTestGeneric\"></tbody></table></td></tr>\n        </table>\n      </div>\n    </td>");
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_85((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input type=\"text\" id=\"updatePeriods\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.updatePeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\n        ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_86((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">");
      if (_jspx_meth_sst_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_87((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"timeout\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.timeout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_88((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"retries\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.retries}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_89((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">");
      if (_jspx_meth_sst_checkbox_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_90((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">");
      if (_jspx_meth_sst_checkbox_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_91((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">");
      if (_jspx_meth_sst_checkbox_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_92((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"maxReadBitCount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.maxReadBitCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_93((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"maxReadRegisterCount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.maxReadRegisterCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_94((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"maxWriteRegisterCount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.maxWriteRegisterCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_95((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        ");
      if (_jspx_meth_sst_checkbox_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        <div id=\"ioLogPathMsg\">\n          ");
      if (_jspx_meth_fmt_message_96((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </div>\n      </td>\n    </tr>\n              \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_97((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"discardDataDelay\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.discardDataDelay}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n      ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_2.setPageContext(_jspx_page_context);
          _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'MODBUS_SERIAL'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
          if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n        ");
              out.write('\n');
              out.write('\n');
              out.write("\n\n<script type=\"text/javascript\">\n   \n   var concurrencyValue = 1; //Removed uppermost level concurrency setting as it isn't used anymore.\n\n  function scanImpl() {\n\t  ModbusEditDwr.modbusSerialScan($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n              $get(\"encoding\"), concurrencyValue, scanCB);\n  }\n  \n  function locatorTestImpl(locator) {\n\t  ModbusEditDwr.testModbusSerialLocator($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n              $get(\"encoding\"), concurrencyValue, locator, locatorTestCB);\n  }\n  \n  function dataTestImpl(slaveId, range, offset, length) {\n\t  ModbusEditDwr.testModbusSerialData($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n");
              out.write("              $get(\"encoding\"), concurrencyValue, slaveId, range, offset, length, dataTestCB);\n  }\n\n  function dataWriteImpl(slaveId, range, offset, modbusDataType, value) {\n      ModbusEditDwr.writeModbusSerialData($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n              $get(\"encoding\"), concurrencyValue, slaveId, range, offset,  modbusDataType, value, dataWriteCB);\n  }\n\n  \n  function saveDataSourceImpl(basic) {\n\t  ModbusEditDwr.saveModbusSerialDataSource(basic, $get(\"updatePeriods\"), \n              $get(\"updatePeriodType\"), $get(\"quantize\"), $get(\"timeout\"), $get(\"retries\"),  $get(\"multipleWritesOnly\"),\n              $get(\"contiguousBatches\"), $get(\"createSlaveMonitorPoints\"), $get(\"maxReadBitCount\"), \n              $get(\"maxReadRegisterCount\"), $get(\"maxWriteRegisterCount\"), $get(\"logIO\"), $get(\"discardDataDelay\"),\n              $get(\"commPortId\"), $get(\"baudRate\"), $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), \n");
              out.write("              $get(\"stopBits\"), $get(\"parity\"), $get(\"encoding\"), $get(\"echo\"), concurrencyValue, saveDataSourceCB);\n  }\n</script>\n\n");
              if (_jspx_meth_tag_serialSettings_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
                return;
              out.write("\n\n<tr>\n  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_message_98((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
                return;
              out.write("</td>\n  <td class=\"formField\">\n    ");
              //  sst:select
              com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
              _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
              _jspx_th_sst_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
              _jspx_th_sst_select_0.setId("encoding");
              _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.encoding}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
              if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n      ");
                  //  sst:option
                  com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                  _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
                  _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                  _jspx_th_sst_option_0.setValue( ModbusSerialDataSourceVO.EncodingType.RTU.toString() );
                  int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
                  if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_sst_option_0.doInitBody();
                    }
                    do {
                      if (_jspx_meth_fmt_message_99((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
                  out.write("\n      ");
                  //  sst:option
                  com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                  _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
                  _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                  _jspx_th_sst_option_1.setValue( ModbusSerialDataSourceVO.EncodingType.ASCII.toString() );
                  int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
                  if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_sst_option_1.doInitBody();
                    }
                    do {
                      if (_jspx_meth_fmt_message_100((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_1, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
                  out.write("\n    ");
                  int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
                throw new SkipPageException();
              }
              _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
              out.write("\n  </td>\n</tr>\n\n<tr>\n  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_message_101((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
                return;
              out.write("</td>\n  <td class=\"formField\">\n    ");
              if (_jspx_meth_sst_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
                return;
              out.write("\n  </td>\n</tr>\n");
              out.write("\n      ");
              int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
          out.write("\n      ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'MODBUS_IP'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n        ");
              out.write('\n');
              out.write("\n\n<script type=\"text/javascript\">\n  function scanImpl() {\n      ModbusEditDwr.modbusIpScan($get(\"timeout\"), $get(\"retries\"), $get(\"transportType\"), $get(\"host\"), \n              $get(\"port\"), $get(\"encapsulated\"), scanCB);\n  }\n  \n  function locatorTestImpl(locator) {\n\t  ModbusEditDwr.testModbusIpLocator($get(\"timeout\"), $get(\"retries\"), $get(\"transportType\"), $get(\"host\"), \n              $get(\"port\"), $get(\"encapsulated\"), locator, locatorTestCB);\n  }\n  \n  function dataTestImpl(slaveId, range, offset, length) {\n\t  ModbusEditDwr.testModbusIpData($get(\"timeout\"), $get(\"retries\"), $get(\"transportType\"), $get(\"host\"), \n              $get(\"port\"), $get(\"encapsulated\"), slaveId, range, offset, length, dataTestCB);\n  }\n\n  function dataWriteImpl(slaveId, range, offset, modbusDataType, value) {\n      ModbusEditDwr.writeModbusIpData($get(\"timeout\"), $get(\"retries\"), $get(\"transportType\"), $get(\"host\"), \n              $get(\"port\"), $get(\"encapsulated\"), slaveId, range, offset, modbusDataType, value, dataWriteCB);\n  }\n  \n  \n");
              out.write("  function saveDataSourceImpl(basic) {\n\t  ModbusEditDwr.saveModbusIpDataSource(basic, $get(\"updatePeriods\"),\n              $get(\"updatePeriodType\"), $get(\"quantize\"), $get(\"timeout\"), $get(\"retries\"), $get(\"multipleWritesOnly\"),\n              $get(\"contiguousBatches\"), $get(\"createSlaveMonitorPoints\"), $get(\"maxReadBitCount\"), \n              $get(\"maxReadRegisterCount\"), $get(\"maxWriteRegisterCount\"), $get(\"logIO\"), $get(\"discardDataDelay\"), \n              $get(\"transportType\"), $get(\"host\"), $get(\"port\"), $get(\"encapsulated\"), saveDataSourceCB);\n  }\n</script>\n\n<tr>\n  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_message_104((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("</td>\n  <td class=\"formField\">\n    ");
              //  sst:select
              com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_2 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
              _jspx_th_sst_select_2.setPageContext(_jspx_page_context);
              _jspx_th_sst_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
              _jspx_th_sst_select_2.setId("transportType");
              _jspx_th_sst_select_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.transportType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              int _jspx_eval_sst_select_2 = _jspx_th_sst_select_2.doStartTag();
              if (_jspx_eval_sst_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n      ");
                  //  sst:option
                  com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                  _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
                  _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                  _jspx_th_sst_option_4.setValue( ModbusIpDataSourceVO.TransportType.TCP.toString() );
                  int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
                  if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_sst_option_4.doInitBody();
                    }
                    do {
                      if (_jspx_meth_fmt_message_105((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_4, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
                  out.write("\n      ");
                  //  sst:option
                  com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                  _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
                  _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                  _jspx_th_sst_option_5.setValue( ModbusIpDataSourceVO.TransportType.TCP_KEEP_ALIVE.toString() );
                  int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
                  if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_sst_option_5.doInitBody();
                    }
                    do {
                      if (_jspx_meth_fmt_message_106((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_5, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
                  out.write("\n      ");
                  //  sst:option
                  com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                  _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
                  _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                  _jspx_th_sst_option_6.setValue( ModbusIpDataSourceVO.TransportType.UDP.toString() );
                  int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
                  if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_sst_option_6.doInitBody();
                    }
                    do {
                      if (_jspx_meth_fmt_message_107((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_6, _jspx_page_context))
                        return;
                      int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = _jspx_page_context.popBody();
                  }
                  if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
                    throw new SkipPageException();
                  }
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
                  out.write("\n    ");
                  int evalDoAfterBody = _jspx_th_sst_select_2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_sst_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_2);
                throw new SkipPageException();
              }
              _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_2);
              out.write("\n  </td>\n</tr>\n\n<tr>\n  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_message_108((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("</td>\n  <td class=\"formField\"><input id=\"host\" type=\"text\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.host}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"/></td>\n</tr>\n\n<tr>\n  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_message_109((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("</td>\n  <td class=\"formField\"><input id=\"port\" type=\"text\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.port}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\"/></td>\n</tr>\n\n<tr>\n  <td class=\"formLabelRequired\">");
              if (_jspx_meth_fmt_message_110((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("</td>\n  <td class=\"formField\">");
              if (_jspx_meth_sst_checkbox_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("</td>\n</tr>");
              out.write("\n      ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\n    ");
          int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      out.write("\n  ");
      return;
    }
    public void invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_111((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\"><input type=\"text\" id=\"slaveId\"/></td>\n  </tr>\n  \n  <tbody id=\"nonSlaveMonitor\">\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_112((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <select id=\"range\" onchange=\"changeRange('')\">\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_59 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_59.setPageContext(_jspx_page_context);
      _jspx_th_c_out_59.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_59.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_59 = _jspx_th_c_out_59.doStartTag();
      if (_jspx_th_c_out_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_59);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_59);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_113((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_60 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_60.setPageContext(_jspx_page_context);
      _jspx_th_c_out_60.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_60.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_60 = _jspx_th_c_out_60.doStartTag();
      if (_jspx_th_c_out_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_60);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_60);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_114((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_61 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_61.setPageContext(_jspx_page_context);
      _jspx_th_c_out_61.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_61.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_61 = _jspx_th_c_out_61.doStartTag();
      if (_jspx_th_c_out_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_61);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_61);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_115((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_62 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_62.setPageContext(_jspx_page_context);
      _jspx_th_c_out_62.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_62.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_62 = _jspx_th_c_out_62.doStartTag();
      if (_jspx_th_c_out_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_62);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_62);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_116((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        </select>\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_117((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <select id=\"modbusDataType\" onchange=\"changeDataType('')\">\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_63 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_63.setPageContext(_jspx_page_context);
      _jspx_th_c_out_63.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_63.setValue( DataType.BINARY );
      int _jspx_eval_c_out_63 = _jspx_th_c_out_63.doStartTag();
      if (_jspx_th_c_out_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_63);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_63);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_118((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_64 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_64.setPageContext(_jspx_page_context);
      _jspx_th_c_out_64.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_64.setValue( DataType.TWO_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_64 = _jspx_th_c_out_64.doStartTag();
      if (_jspx_th_c_out_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_64);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_64);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_119((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_65 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_65.setPageContext(_jspx_page_context);
      _jspx_th_c_out_65.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_65.setValue( DataType.TWO_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_65 = _jspx_th_c_out_65.doStartTag();
      if (_jspx_th_c_out_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_65);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_65);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_120((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_66 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_66.setPageContext(_jspx_page_context);
      _jspx_th_c_out_66.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_66.setValue( DataType.TWO_BYTE_BCD );
      int _jspx_eval_c_out_66 = _jspx_th_c_out_66.doStartTag();
      if (_jspx_th_c_out_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_66);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_66);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_121((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_67 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_67.setPageContext(_jspx_page_context);
      _jspx_th_c_out_67.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_67.setValue( DataType.FOUR_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_67 = _jspx_th_c_out_67.doStartTag();
      if (_jspx_th_c_out_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_67);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_67);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_122((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_68 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_68.setPageContext(_jspx_page_context);
      _jspx_th_c_out_68.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_68.setValue( DataType.FOUR_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_68 = _jspx_th_c_out_68.doStartTag();
      if (_jspx_th_c_out_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_68);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_68);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_123((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_69 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_69.setPageContext(_jspx_page_context);
      _jspx_th_c_out_69.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_69.setValue( DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_69 = _jspx_th_c_out_69.doStartTag();
      if (_jspx_th_c_out_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_69);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_69);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_124((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_70 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_70.setPageContext(_jspx_page_context);
      _jspx_th_c_out_70.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_70.setValue( DataType.FOUR_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_70 = _jspx_th_c_out_70.doStartTag();
      if (_jspx_th_c_out_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_70);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_70);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_125((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_71 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_71.setPageContext(_jspx_page_context);
      _jspx_th_c_out_71.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_71.setValue( DataType.FOUR_BYTE_FLOAT );
      int _jspx_eval_c_out_71 = _jspx_th_c_out_71.doStartTag();
      if (_jspx_th_c_out_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_71);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_71);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_126((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_72 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_72.setPageContext(_jspx_page_context);
      _jspx_th_c_out_72.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_72.setValue( DataType.FOUR_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_72 = _jspx_th_c_out_72.doStartTag();
      if (_jspx_th_c_out_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_72);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_72);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_127((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_73 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_73.setPageContext(_jspx_page_context);
      _jspx_th_c_out_73.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_73.setValue( DataType.FOUR_BYTE_BCD );
      int _jspx_eval_c_out_73 = _jspx_th_c_out_73.doStartTag();
      if (_jspx_th_c_out_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_73);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_73);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_128((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_74 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_74.setPageContext(_jspx_page_context);
      _jspx_th_c_out_74.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_74.setValue( DataType.FOUR_BYTE_BCD_SWAPPED );
      int _jspx_eval_c_out_74 = _jspx_th_c_out_74.doStartTag();
      if (_jspx_th_c_out_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_74);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_74);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_129((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_75 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_75.setPageContext(_jspx_page_context);
      _jspx_th_c_out_75.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_75.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_75 = _jspx_th_c_out_75.doStartTag();
      if (_jspx_th_c_out_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_75);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_75);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_130((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_76 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_76.setPageContext(_jspx_page_context);
      _jspx_th_c_out_76.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_76.setValue( DataType.EIGHT_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_76 = _jspx_th_c_out_76.doStartTag();
      if (_jspx_th_c_out_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_76);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_76);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_131((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_77 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_77.setPageContext(_jspx_page_context);
      _jspx_th_c_out_77.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_77.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_77 = _jspx_th_c_out_77.doStartTag();
      if (_jspx_th_c_out_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_77);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_77);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_132((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_78 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_78.setPageContext(_jspx_page_context);
      _jspx_th_c_out_78.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_78.setValue( DataType.EIGHT_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_78 = _jspx_th_c_out_78.doStartTag();
      if (_jspx_th_c_out_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_78);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_78);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_133((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_79 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_79.setPageContext(_jspx_page_context);
      _jspx_th_c_out_79.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_79.setValue( DataType.EIGHT_BYTE_FLOAT );
      int _jspx_eval_c_out_79 = _jspx_th_c_out_79.doStartTag();
      if (_jspx_th_c_out_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_79);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_79);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_134((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_80 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_80.setPageContext(_jspx_page_context);
      _jspx_th_c_out_80.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_80.setValue( DataType.EIGHT_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_80 = _jspx_th_c_out_80.doStartTag();
      if (_jspx_th_c_out_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_80);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_80);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_135((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_81 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_81.setPageContext(_jspx_page_context);
      _jspx_th_c_out_81.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_81.setValue( DataType.CHAR );
      int _jspx_eval_c_out_81 = _jspx_th_c_out_81.doStartTag();
      if (_jspx_th_c_out_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_81);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_81);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_136((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n          <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_82 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_82.setPageContext(_jspx_page_context);
      _jspx_th_c_out_82.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_82.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_82 = _jspx_th_c_out_82.doStartTag();
      if (_jspx_th_c_out_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_82);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_82);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_137((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        </select>\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_138((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"offset\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_139((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input id=\"bit\" type=\"text\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_140((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input id=\"registerCount\" type=\"text\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_141((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input id=\"charset\" type=\"text\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_142((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        ");
      //  tag:exportCodesOptions
      org.apache.jsp.tag.web.exportCodesOptions_tag _jspx_th_tag_exportCodesOptions_0 = new org.apache.jsp.tag.web.exportCodesOptions_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_exportCodesOptions_0        );
      }
      _jspx_th_tag_exportCodesOptions_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_exportCodesOptions_0.setParent(_jspx_parent);
      _jspx_th_tag_exportCodesOptions_0.setId("writeType");
      _jspx_th_tag_exportCodesOptions_0.setOptionList( ModbusPointLocatorVO.WRITE_TYPE_TYPE_CODES.getIdKeys() );
      _jspx_th_tag_exportCodesOptions_0.doTag();
      out.write("\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_143((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"multiplier\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_144((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\"><input type=\"text\" id=\"additive\"/></td>\n    </tr>\n  </tbody>\n");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
