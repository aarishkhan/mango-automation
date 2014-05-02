package org.apache.jsp.modules.dnp3.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.org.scadabr.dnp3.vo.Dnp3SerialDataSourceVO;

public final class editDnp3Serial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_sst_select_value_id.release();
    _jspx_tagPool_sst_option.release();
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

      out.write("\r\n\r\n\r\n<script type=\"text/javascript\">\r\nfunction saveDataSourceImpl(basic) {\r\n    DnpEditDwr.saveDNP3SerialDataSource(basic,\r\n          $get(\"sourceAddress\"), $get(\"slaveAddress\"), $get(\"commPortId\"), $get(\"baudRate\"), \r\n          $get(\"staticPollPeriods\"), $get(\"rbePollPeriods\"),\r\n          $get(\"rbePeriodType\"), $get(\"timeout\"), $get(\"retries\"), saveDataSourceCB);\r\n}\r\n</script>\r\n\r\n<tr>\r\n  <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</td>\r\n  <td class=\"formField\"><input id=\"commPortId\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.commPortId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n</tr>\r\n\r\n<tr>\r\n  <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\r\n  <td class=\"formField\">\r\n    ");
      if (_jspx_meth_sst_select_0(_jspx_page_context))
        return;
      out.write("\r\n  </td>\r\n</tr>");
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
    _jspx_th_fmt_message_0.setKey("dsEdit.dnp3Serial.commPortId");
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
    _jspx_th_fmt_message_1.setKey("dsEdit.dnp3Serial.baud");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_sst_select_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_0.setParent(null);
    _jspx_th_sst_select_0.setId("baudRate");
    _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.baudRate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
    if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
      return true;
    }
    _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
    return false;
  }

  private boolean _jspx_meth_sst_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_0.doInitBody();
      }
      do {
        out.write("110");
        int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_0);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_0);
    return false;
  }

  private boolean _jspx_meth_sst_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
    if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_1.doInitBody();
      }
      do {
        out.write("300");
        int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_1);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_1);
    return false;
  }

  private boolean _jspx_meth_sst_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
    if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_2.doInitBody();
      }
      do {
        out.write("1200");
        int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_2);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_2);
    return false;
  }

  private boolean _jspx_meth_sst_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
    if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_3.doInitBody();
      }
      do {
        out.write("2400");
        int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_3);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_3);
    return false;
  }

  private boolean _jspx_meth_sst_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
    if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_4.doInitBody();
      }
      do {
        out.write("4800");
        int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_4);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_4);
    return false;
  }

  private boolean _jspx_meth_sst_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
    if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_5.doInitBody();
      }
      do {
        out.write("9600");
        int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_5);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_5);
    return false;
  }

  private boolean _jspx_meth_sst_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
    if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_6.doInitBody();
      }
      do {
        out.write("19200");
        int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_6);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_6);
    return false;
  }

  private boolean _jspx_meth_sst_option_7(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_7 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_7.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_7 = _jspx_th_sst_option_7.doStartTag();
    if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_7.doInitBody();
      }
      do {
        out.write("38400");
        int evalDoAfterBody = _jspx_th_sst_option_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_7);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_7);
    return false;
  }

  private boolean _jspx_meth_sst_option_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_8 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_8.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_8 = _jspx_th_sst_option_8.doStartTag();
    if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_8.doInitBody();
      }
      do {
        out.write("57600");
        int evalDoAfterBody = _jspx_th_sst_option_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_8);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_8);
    return false;
  }

  private boolean _jspx_meth_sst_option_9(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_9 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_9.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_9 = _jspx_th_sst_option_9.doStartTag();
    if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_9.doInitBody();
      }
      do {
        out.write("115200");
        int evalDoAfterBody = _jspx_th_sst_option_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_9);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_9);
    return false;
  }

  private boolean _jspx_meth_sst_option_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_10 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_10.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_10 = _jspx_th_sst_option_10.doStartTag();
    if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_10.doInitBody();
      }
      do {
        out.write("230400");
        int evalDoAfterBody = _jspx_th_sst_option_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_10);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_10);
    return false;
  }

  private boolean _jspx_meth_sst_option_11(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_11 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_11.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_11 = _jspx_th_sst_option_11.doStartTag();
    if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_11.doInitBody();
      }
      do {
        out.write("460800");
        int evalDoAfterBody = _jspx_th_sst_option_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_11);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_11);
    return false;
  }

  private boolean _jspx_meth_sst_option_12(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_12 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_12.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_12 = _jspx_th_sst_option_12.doStartTag();
    if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_12.doInitBody();
      }
      do {
        out.write("921600");
        int evalDoAfterBody = _jspx_th_sst_option_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_12);
      return true;
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_12);
    return false;
  }
}
