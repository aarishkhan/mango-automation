package org.apache.jsp.modules.modbus.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.modbus4j.serial.SerialMaster;
import com.serotonin.m2m2.modbus.vo.ModbusSerialDataSourceVO;

public final class editModbusSerial_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/serialSettings.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n\n<script type=\"text/javascript\">\n   \n   var concurrencyValue = 1; //Removed uppermost level concurrency setting as it isn't used anymore.\n\n  function scanImpl() {\n\t  ModbusEditDwr.modbusSerialScan($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n              $get(\"encoding\"), concurrencyValue, scanCB);\n  }\n  \n  function locatorTestImpl(locator) {\n\t  ModbusEditDwr.testModbusSerialLocator($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n              $get(\"encoding\"), concurrencyValue, locator, locatorTestCB);\n  }\n  \n  function dataTestImpl(slaveId, range, offset, length) {\n\t  ModbusEditDwr.testModbusSerialData($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n");
      out.write("              $get(\"encoding\"), concurrencyValue, slaveId, range, offset, length, dataTestCB);\n  }\n\n  function dataWriteImpl(slaveId, range, offset, modbusDataType, value) {\n      ModbusEditDwr.writeModbusSerialData($get(\"timeout\"), $get(\"retries\"), $get(\"commPortId\"), $get(\"baudRate\"),\n              $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), $get(\"stopBits\"), $get(\"parity\"), \n              $get(\"encoding\"), concurrencyValue, slaveId, range, offset,  modbusDataType, value, dataWriteCB);\n  }\n\n  \n  function saveDataSourceImpl(basic) {\n\t  ModbusEditDwr.saveModbusSerialDataSource(basic, $get(\"updatePeriods\"), \n              $get(\"updatePeriodType\"), $get(\"quantize\"), $get(\"timeout\"), $get(\"retries\"),  $get(\"multipleWritesOnly\"),\n              $get(\"contiguousBatches\"), $get(\"createSlaveMonitorPoints\"), $get(\"maxReadBitCount\"), \n              $get(\"maxReadRegisterCount\"), $get(\"maxWriteRegisterCount\"), $get(\"logIO\"), $get(\"discardDataDelay\"),\n              $get(\"commPortId\"), $get(\"baudRate\"), $get(\"flowControlIn\"), $get(\"flowControlOut\"), $get(\"dataBits\"), \n");
      out.write("              $get(\"stopBits\"), $get(\"parity\"), $get(\"encoding\"), $get(\"echo\"), concurrencyValue, saveDataSourceCB);\n  }\n</script>\n\n");
      if (_jspx_meth_tag_serialSettings_0(_jspx_page_context))
        return;
      out.write("\n\n<tr>\n  <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</td>\n  <td class=\"formField\">\n    ");
      //  sst:select
      com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
      _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
      _jspx_th_sst_select_0.setParent(null);
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
              if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context))
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
            return;
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
              if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_1, _jspx_page_context))
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
            return;
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
        return;
      }
      _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
      out.write("\n  </td>\n</tr>\n\n<tr>\n  <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n  <td class=\"formField\">\n    ");
      if (_jspx_meth_sst_select_1(_jspx_page_context))
        return;
      out.write("\n  </td>\n</tr>\n");
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

  private boolean _jspx_meth_tag_serialSettings_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:serialSettings
    org.apache.jsp.tag.web.serialSettings_tag _jspx_th_tag_serialSettings_0 = new org.apache.jsp.tag.web.serialSettings_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_serialSettings_0      );
    }
    _jspx_th_tag_serialSettings_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_serialSettings_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("dsEdit.modbusSerial.encoding");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_1.setKey("dsEdit.modbusSerial.encoding.rtu");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
    _jspx_th_fmt_message_2.setKey("dsEdit.modbusSerial.encoding.ascii");
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
    _jspx_th_fmt_message_3.setKey("dsEdit.modbusSerial.echo");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_sst_select_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_1 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_1.setParent(null);
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
      return true;
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
        if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_2, _jspx_page_context))
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
      return true;
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
    _jspx_th_fmt_message_4.setKey("dsEdit.modbusSerial.echo.off");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
        if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_3, _jspx_page_context))
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
      return true;
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_3);
    _jspx_th_fmt_message_5.setKey("dsEdit.modbusSerial.echo.on");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }
}
