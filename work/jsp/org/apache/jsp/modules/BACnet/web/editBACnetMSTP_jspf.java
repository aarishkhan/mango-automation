package org.apache.jsp.modules.BACnet.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.bacnet4j.type.enumerated.ObjectType;

public final class editBACnetMSTP_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(8);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/dataSourceAttrs.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/dsEvents.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_checkbox_selectedValue_id_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sst_select_value_id.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_sst_option.release();
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.release();
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

      out.write("\n\n\n<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/web/bacnet.js\"></script>\n<script type=\"text/javascript\">\n  bndwr = BACnetMSTPEditDwr;\n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bacnet.jspf", out, false);
      out.write("\n\n  function sendBACnetWhoIs() {\n      bndwr.sendBACnetMstpWhoIs($get(\"deviceId\"), $get(\"commPortId\"), $get(\"baudRate\"), $get(\"thisStation\"),\n              $get(\"retryCount\"), $get(\"timeout\"), $get(\"segTimeout\"), $get(\"segWindow\"), $get(\"retries\"),\n              $get(\"maxReadMultipleReferencesSegmented\"), $get(\"maxReadMultipleReferencesNonsegmented\"), sendWhoIsCB);\n  }\n  \n  function sendObjectListRequest(cb) {\n      bndwr.sendMstpObjectListRequest($get(\"deviceId\"), $get(\"commPortId\"), $get(\"baudRate\"), $get(\"thisStation\"),\n              $get(\"retryCount\"), $get(\"timeout\"), $get(\"segTimeout\"), $get(\"segWindow\"), $get(\"retries\"),\n              $get(\"maxReadMultipleReferencesSegmented\"), $get(\"maxReadMultipleReferencesNonsegmented\"),\n              $get(\"objListNetNumber\"), $get(\"objListMac\"), $get(\"objListLink\"), $get(\"objListDevId\"), cb);\n  }\n  \n  function saveDataSourceImpl(basic) {\n      cancelWhoIs();\n      bndwr.saveBACnetMstpDataSource(basic, $get(\"updatePeriods\"), $get(\"updatePeriodType\"), $get(\"deviceId\"),\n");
      out.write("              $get(\"commPortId\"), $get(\"baudRate\"), $get(\"thisStation\"), $get(\"retryCount\"), $get(\"strict\"),\n              $get(\"timeout\"), $get(\"segTimeout\"), $get(\"segWindow\"), $get(\"retries\"), \n              $get(\"covSubscriptionTimeoutMinutes\"), $get(\"maxReadMultipleReferencesSegmented\"),\n              $get(\"maxReadMultipleReferencesNonsegmented\"), saveDataSourceCB);\n  }\n  \n  function saveBACnetPointLocator(id, xid, name, locator, cb) {\n      bndwr.saveBACnetMSTPPointLocator(id, xid, name, locator, savePointCB);\n  }\n</script>\n    \n");
      if (_jspx_meth_tag_dataSourceAttrs_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "points.jspf" + (("points.jspf").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("linkKey", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("mod.bacnetMstp.remoteDeviceLinkStation", request.getCharacterEncoding()), out, false);
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

  private boolean _jspx_meth_tag_dataSourceAttrs_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  tag:dataSourceAttrs
    org.apache.jsp.tag.web.dataSourceAttrs_tag _jspx_th_tag_dataSourceAttrs_0 = new org.apache.jsp.tag.web.dataSourceAttrs_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dataSourceAttrs_0      );
    }
    _jspx_th_tag_dataSourceAttrs_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_dataSourceAttrs_0.setDescriptionKey("mod.bacnetMstp.desc");
    _jspx_th_tag_dataSourceAttrs_0.setHelpId("bacnetMstpDS");
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new editBACnetMSTP_jspfHelper( 0, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null);
    _jspx_th_tag_dataSourceAttrs_0.setExtraPanels(_jspx_temp0);
    _jspx_th_tag_dataSourceAttrs_0.setJspBody(new editBACnetMSTP_jspfHelper( 1, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null));
    _jspx_th_tag_dataSourceAttrs_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("dsEdit.updatePeriod");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_1.setKey("mod.bacnet.deviceId");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_2.setKey("mod.bacnetMstp.commPortId");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n          ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      throw new SkipPageException();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty commPortError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n            <input id=\"commPortId\" type=\"hidden\" value=\"\"/>\n            <span class=\"formError\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${commPortError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n          ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              ");
        if (_jspx_meth_sst_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n          ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_sst_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_sst_select_0.setId("commPortId");
    _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.commPortId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
    if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\n            ");
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
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${commPorts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("port");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                ");
          if (_jspx_meth_sst_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_sst_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_sst_option_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${port.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_0.doInitBody();
      }
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${port.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_3.setKey("mod.bacnetMstp.baudRate");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_sst_select_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_1 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_select_1.setId("baudRate");
    _jspx_th_sst_select_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.baudRate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_1 = _jspx_th_sst_select_1.doStartTag();
    if (_jspx_eval_sst_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n          ");
        if (_jspx_meth_sst_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n          ");
        if (_jspx_meth_sst_option_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_1, _jspx_page_context))
          return true;
        out.write("\n        ");
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

  private boolean _jspx_meth_sst_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
    if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_1.doInitBody();
      }
      do {
        out.write("110");
        int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_1);
    return false;
  }

  private boolean _jspx_meth_sst_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
    if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_2.doInitBody();
      }
      do {
        out.write("300");
        int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_2);
    return false;
  }

  private boolean _jspx_meth_sst_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
    if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_3.doInitBody();
      }
      do {
        out.write("1200");
        int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_3);
    return false;
  }

  private boolean _jspx_meth_sst_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
    if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_4.doInitBody();
      }
      do {
        out.write("2400");
        int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_4);
    return false;
  }

  private boolean _jspx_meth_sst_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
    if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_5.doInitBody();
      }
      do {
        out.write("4800");
        int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_5);
    return false;
  }

  private boolean _jspx_meth_sst_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
    if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_6.doInitBody();
      }
      do {
        out.write("9600");
        int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_6);
    return false;
  }

  private boolean _jspx_meth_sst_option_7(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_7 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_7.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_7 = _jspx_th_sst_option_7.doStartTag();
    if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_7.doInitBody();
      }
      do {
        out.write("19200");
        int evalDoAfterBody = _jspx_th_sst_option_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_7);
    return false;
  }

  private boolean _jspx_meth_sst_option_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_8 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_8.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_8 = _jspx_th_sst_option_8.doStartTag();
    if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_8.doInitBody();
      }
      do {
        out.write("38400");
        int evalDoAfterBody = _jspx_th_sst_option_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_8);
    return false;
  }

  private boolean _jspx_meth_sst_option_9(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_9 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_9.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_9 = _jspx_th_sst_option_9.doStartTag();
    if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_9.doInitBody();
      }
      do {
        out.write("57600");
        int evalDoAfterBody = _jspx_th_sst_option_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_9);
    return false;
  }

  private boolean _jspx_meth_sst_option_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_10 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_10.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_10 = _jspx_th_sst_option_10.doStartTag();
    if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_10.doInitBody();
      }
      do {
        out.write("76800");
        int evalDoAfterBody = _jspx_th_sst_option_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_10);
    return false;
  }

  private boolean _jspx_meth_sst_option_11(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_11 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_11.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_11 = _jspx_th_sst_option_11.doStartTag();
    if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_11.doInitBody();
      }
      do {
        out.write("115200");
        int evalDoAfterBody = _jspx_th_sst_option_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_11);
    return false;
  }

  private boolean _jspx_meth_sst_option_12(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_12 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_12.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_12 = _jspx_th_sst_option_12.doStartTag();
    if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_12.doInitBody();
      }
      do {
        out.write("230400");
        int evalDoAfterBody = _jspx_th_sst_option_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_12);
    return false;
  }

  private boolean _jspx_meth_sst_option_13(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_13 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_13.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_13 = _jspx_th_sst_option_13.doStartTag();
    if (_jspx_eval_sst_option_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_13.doInitBody();
      }
      do {
        out.write("460800");
        int evalDoAfterBody = _jspx_th_sst_option_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_13);
    return false;
  }

  private boolean _jspx_meth_sst_option_14(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_14 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_14.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
    int _jspx_eval_sst_option_14 = _jspx_th_sst_option_14.doStartTag();
    if (_jspx_eval_sst_option_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_14.doInitBody();
      }
      do {
        out.write("921600");
        int evalDoAfterBody = _jspx_th_sst_option_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_14);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_4.setKey("mod.bacnetMstp.thisStation");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_fmt_message_5.setKey("mod.bacnetMstp.retryCount");
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
    _jspx_th_fmt_message_6.setKey("mod.bacnet.strict");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
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
    _jspx_th_sst_checkbox_0.setId("strict");
    _jspx_th_sst_checkbox_0.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.strict}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_checkbox_0 = _jspx_th_sst_checkbox_0.doStartTag();
    if (_jspx_th_sst_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_id_nobody.reuse(_jspx_th_sst_checkbox_0);
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
    _jspx_th_fmt_message_7.setKey("mod.bacnet.timeout");
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
    _jspx_th_fmt_message_8.setKey("mod.bacnet.segmentTimeout");
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
    _jspx_th_fmt_message_9.setKey("mod.bacnet.segmentWindow");
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
    _jspx_th_fmt_message_10.setKey("mod.bacnet.retries");
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
    _jspx_th_fmt_message_11.setKey("mod.bacnet.covLease");
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
    _jspx_th_fmt_message_12.setKey("mod.bacnet.maxReadMultSeg");
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
    _jspx_th_fmt_message_13.setKey("mod.bacnet.maxReadMultNonseg");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private class editBACnetMSTP_jspfHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public editBACnetMSTP_jspfHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
      HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "discovery.jspf" + (("discovery.jspf").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("linkKey", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("mod.bacnetMstp.remoteDeviceLinkStation", request.getCharacterEncoding()), out, false);
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\">\n        <input type=\"text\" id=\"updatePeriods\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.updatePeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\n        ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"deviceId\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.deviceId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\">\n        ");
      if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\">\n        ");
      if (_jspx_meth_sst_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"thisStation\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.thisStation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"retryCount\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.retryCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\">");
      if (_jspx_meth_sst_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"timeout\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.timeout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"segTimeout\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.segTimeout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"segWindow\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.segWindow}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"retries\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.retries}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"covSubscriptionTimeoutMinutes\" type=\"text\" \n              value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.covSubscriptionTimeoutMinutes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"maxReadMultipleReferencesSegmented\" type=\"text\" \n              value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.maxReadMultipleReferencesSegmented}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\n      <td class=\"formField\"><input id=\"maxReadMultipleReferencesNonsegmented\" type=\"text\" \n              value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.maxReadMultipleReferencesNonsegmented}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n    </tr>\n  ");
      return false;
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
