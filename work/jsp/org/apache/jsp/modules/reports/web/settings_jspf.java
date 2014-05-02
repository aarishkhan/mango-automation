package org.apache.jsp.modules.reports.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Common;
import com.serotonin.m2m2.reports.ReportPurgeDefinition;

public final class settings_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.release();
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
      out.write('\n');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("reportPurgePeriods");
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_set_0.doInitBody();
        }
        do {
          out.print( ReportPurgeDefinition.REPORT_PURGE_PERIODS );
          int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_1.setPageContext(_jspx_page_context);
      _jspx_th_c_set_1.setParent(null);
      _jspx_th_c_set_1.setVar("reportPurgePeriodType");
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_set_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_set_1.doInitBody();
        }
        do {
          out.print( ReportPurgeDefinition.REPORT_PURGE_PERIOD_TYPE );
          int evalDoAfterBody = _jspx_th_c_set_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
        return;
      }
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
      out.write("\n\n<script type=\"text/javascript\">\n  function saveReportSettings() {\n      setUserMessage(\"reportsMessage\");\n      setDisabled(\"saveReportSettingsBtn\", true);\n      \n\t  var settings = {};\n      settings[\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"] = $get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\");\n      settings[\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"] = $get(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\");\n\t  SystemSettingsDwr.saveSettings(settings, function() {\n          setDisabled(\"saveReportSettingsBtn\", false);\n          setUserMessage(\"reportsMessage\", \"");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\");\n\t  });\n  }\n</script>\n<table>\n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\">\n      <input id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" value=\"");
      if (_jspx_meth_m2m2_systemSetting_0(_jspx_page_context))
        return;
      out.write("\" class=\"formShort\"/>\n      ");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_2.setPageContext(_jspx_page_context);
      _jspx_th_c_set_2.setParent(null);
      _jspx_th_c_set_2.setVar("type");
      int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
      if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_set_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_set_2.doInitBody();
        }
        do {
          out.print( Common.TimePeriods.MONTHS );
          int evalDoAfterBody = _jspx_th_c_set_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_set_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_2);
        return;
      }
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_2);
      out.write("\n      ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\n      ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n    </td>\n  </tr>\n  \n  <tr>\n    <td colspan=\"2\" align=\"center\">\n      <input id=\"saveReportSettingsBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("\" onclick=\"saveReportSettings()\"/>\n      ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n    </td>\n  </tr>\n  \n  <tr><td colspan=\"2\" id=\"reportsMessage\" class=\"formError\"></td></tr>\n</table>");
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
    _jspx_th_fmt_message_0.setKey("systemSettings.reportsSettingsSaved");
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
    _jspx_th_fmt_message_1.setKey("systemSettings.purgeReports");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_m2m2_systemSetting_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:systemSetting
    com.serotonin.m2m2.web.taglib.SystemSettingTag _jspx_th_m2m2_systemSetting_0 = (com.serotonin.m2m2.web.taglib.SystemSettingTag) _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.get(com.serotonin.m2m2.web.taglib.SystemSettingTag.class);
    _jspx_th_m2m2_systemSetting_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_systemSetting_0.setParent(null);
    _jspx_th_m2m2_systemSetting_0.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_m2m2_systemSetting_0.setDefaultValue("1");
    int _jspx_eval_m2m2_systemSetting_0 = _jspx_th_m2m2_systemSetting_0.doStartTag();
    if (_jspx_th_m2m2_systemSetting_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.reuse(_jspx_th_m2m2_systemSetting_0);
      return true;
    }
    _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.reuse(_jspx_th_m2m2_systemSetting_0);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("periods");
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_eval_c_set_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_3.doInitBody();
      }
      do {
        if (_jspx_meth_m2m2_systemSetting_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_m2m2_systemSetting_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:systemSetting
    com.serotonin.m2m2.web.taglib.SystemSettingTag _jspx_th_m2m2_systemSetting_1 = (com.serotonin.m2m2.web.taglib.SystemSettingTag) _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.get(com.serotonin.m2m2.web.taglib.SystemSettingTag.class);
    _jspx_th_m2m2_systemSetting_1.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_systemSetting_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_3);
    _jspx_th_m2m2_systemSetting_1.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_m2m2_systemSetting_1.setDefaultValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m2m2_systemSetting_1 = _jspx_th_m2m2_systemSetting_1.doStartTag();
    if (_jspx_th_m2m2_systemSetting_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.reuse(_jspx_th_m2m2_systemSetting_1);
      return true;
    }
    _jspx_tagPool_m2m2_systemSetting_key_defaultValue_nobody.reuse(_jspx_th_m2m2_systemSetting_1);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_0 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_0      );
    }
    _jspx_th_tag_timePeriods_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reportPurgePeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${periods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_0.doTag();
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
    _jspx_th_fmt_message_2.setKey("common.save");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_tag_help_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setId("reportSettings");
    _jspx_th_tag_help_0.doTag();
    return false;
  }
}
