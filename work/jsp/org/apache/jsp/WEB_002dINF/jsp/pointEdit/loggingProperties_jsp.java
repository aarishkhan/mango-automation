package org.apache.jsp.WEB_002dINF.jsp.pointEdit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.vo.DataPointVO;
import com.serotonin.m2m2.DataTypes;

public final class loggingProperties_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onchange_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_onchange_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_sst_select_value_onchange_name_id.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sst_select_value_name_id.release();
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.release();
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
      out.write("\n\n\n\n<script type=\"text/javascript\">\n  function changeLoggingType() {\n      var loggingType = $get(\"loggingType\");\n      var tolerance = $(\"tolerance\");\n      var purgeOverride = $(\"purgeOverride\");\n      var purgePeriod = $(\"purgePeriod\");\n      var purgeType = $(\"purgeType\");\n      \n      if ($(\"toleranceSection\") && loggingType == ");
      out.print( DataPointVO.LoggingTypes.ON_CHANGE );
      out.write(")\n          // On change logging for a numeric requires a tolerance setting.\n          tolerance.disabled = false;\n      else\n          tolerance.disabled = true;\n      \n      if (loggingType == ");
      out.print( DataPointVO.LoggingTypes.NONE );
      out.write(") {\n          purgeOverride.disabled = true;\n          purgePeriod.disabled = true;\n          purgeType.disabled = true;\n      }\n      else {\n          purgeOverride.disabled = false;\n          changePurgeOverride();\n      }\n      \n      if (loggingType == ");
      out.print( DataPointVO.LoggingTypes.INTERVAL );
      out.write(")\n          show(\"intervalLoggingSection\");\n      else\n          hide(\"intervalLoggingSection\");\n  }\n  \n  function changePurgeOverride() {\n      var purgePeriod = $(\"purgePeriod\");\n      var purgeType = $(\"purgeType\");\n      if ($get(\"purgeOverride\")) {\n          purgePeriod.disabled = false;\n          purgeType.disabled = false;\n      }\n      else {\n          purgePeriod.disabled = true;\n          purgeType.disabled = true;\n      }\n  }\n  \n  function changeDiscard() {\n      var discard = $get(\"discardExtremeValues\");\n      if (discard) {\n          $(\"discardLowLimit\").disabled = false;\n          $(\"discardHighLimit\").disabled = false;\n      }\n      else {\n          $(\"discardLowLimit\").disabled = true;\n          $(\"discardHighLimit\").disabled = true;\n      }\n  }\n  \n  function clearPointCache() {\n      setDisabled(\"clearCacheBtn\", true);\n      DataPointEditDwr.clearPointCache(function() {\n          setDisabled(\"clearCacheBtn\", false);\n      });\n  }\n  \n  dojo.ready(function() {\n      if (dataTypeId == ");
      out.print( DataTypes.NUMERIC );
      out.write(") {\n          show(\"toleranceSection\");\n          show(\"discardSection\");\n      }\n      else {\n          $(\"intervalLoggingType\").disabled = true;\n          $set(\"intervalLoggingType\", ");
      out.print( DataPointVO.IntervalLoggingTypes.INSTANT );
      out.write(");\n      }\n      changeLoggingType();\n      changeDiscard();\n  });\n</script>\n\n<div class=\"borderDiv marB marR\">\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_0.setParent(null);
      _jspx_th_spring_bind_0.setPath("form.loggingType");
      int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
        if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n      <tr>\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
              return;
            out.write("</td>\n        <td class=\"formField\">\n          ");
            //  sst:select
            com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_name_id.get(com.serotonin.web.taglib.SelectTag.class);
            _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
            _jspx_th_sst_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
            _jspx_th_sst_select_0.setId("loggingType");
            _jspx_th_sst_select_0.setName("loggingType");
            _jspx_th_sst_select_0.setOnchange("changeLoggingType();");
            _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
            if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_0.setValue( Integer.toString(DataPointVO.LoggingTypes.ON_CHANGE) );
                int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
                if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_0[0]++;
                    _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_0.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_0[0]--;
                }
                if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
                out.write("\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_1.setValue( Integer.toString(DataPointVO.LoggingTypes.ALL) );
                int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
                if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_0[0]++;
                    _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_1.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_1, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_0[0]--;
                }
                if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
                out.write("\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_2.setValue( Integer.toString(DataPointVO.LoggingTypes.NONE) );
                int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
                if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_0[0]++;
                    _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_2.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_2, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_0[0]--;
                }
                if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
                out.write("\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_3.setValue( Integer.toString(DataPointVO.LoggingTypes.INTERVAL) );
                int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
                if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_0[0]++;
                    _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_3.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_3, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_0[0]--;
                }
                if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
                out.write("\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_4.setValue( Integer.toString(DataPointVO.LoggingTypes.ON_TS_CHANGE) );
                int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
                if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_0[0]++;
                    _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_4.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_4, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_0[0]--;
                }
                if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
                out.write("\n          ");
                int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_0);
              return;
            }
            _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_0);
            out.write("\n        </td>\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n      </tr>\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_0.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_0.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
      }
      out.write("\n    \n    <tbody id=\"intervalLoggingSection\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write(" <input type=\"text\" name=\"intervalLoggingPeriod\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.intervalLoggingPeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formError\">\n          ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_1.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_1.setParent(null);
      _jspx_th_spring_bind_1.setPath("form.intervalLoggingPeriodType");
      int[] _jspx_push_body_count_spring_bind_1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
        if (_jspx_eval_spring_bind_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n            ");
            if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_1, _jspx_page_context, _jspx_push_body_count_spring_bind_1))
              return;
            out.write("\n          ");
            int evalDoAfterBody = _jspx_th_spring_bind_1.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_1.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_1);
      }
      out.write("\n          ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_2.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_2.setParent(null);
      _jspx_th_spring_bind_2.setPath("form.intervalLoggingPeriod");
      int[] _jspx_push_body_count_spring_bind_2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
        if (_jspx_eval_spring_bind_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_spring_bind_2.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_2.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_2);
      }
      out.write("\n        </td>\n      </tr>\n      \n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_3.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_3.setParent(null);
      _jspx_th_spring_bind_3.setPath("form.intervalLoggingType");
      int[] _jspx_push_body_count_spring_bind_3 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
        if (_jspx_eval_spring_bind_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n        <tr>\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_3, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
              return;
            out.write("</td>\n          <td class=\"formField\">\n            ");
            //  sst:select
            com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_1 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_name_id.get(com.serotonin.web.taglib.SelectTag.class);
            _jspx_th_sst_select_1.setPageContext(_jspx_page_context);
            _jspx_th_sst_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_3);
            _jspx_th_sst_select_1.setId("intervalLoggingType");
            _jspx_th_sst_select_1.setName("intervalLoggingType");
            _jspx_th_sst_select_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.intervalLoggingType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int _jspx_eval_sst_select_1 = _jspx_th_sst_select_1.doStartTag();
            if (_jspx_eval_sst_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_5.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.INSTANT) );
                int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
                if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_3[0]++;
                    _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_5.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_5, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_3[0]--;
                }
                if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
                out.write("\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_6.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.MAXIMUM) );
                int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
                if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_3[0]++;
                    _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_6.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_6, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_3[0]--;
                }
                if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
                out.write("\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_7 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_7.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_7.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.MINIMUM) );
                int _jspx_eval_sst_option_7 = _jspx_th_sst_option_7.doStartTag();
                if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_3[0]++;
                    _jspx_th_sst_option_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_7.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_7, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_7.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_3[0]--;
                }
                if (_jspx_th_sst_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_7);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_7);
                out.write("\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_8 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_8.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_8.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.AVERAGE) );
                int _jspx_eval_sst_option_8 = _jspx_th_sst_option_8.doStartTag();
                if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_3[0]++;
                    _jspx_th_sst_option_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_8.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_8, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_8.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_3[0]--;
                }
                if (_jspx_th_sst_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_8);
                  return;
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_8);
                out.write("\n            ");
                int evalDoAfterBody = _jspx_th_sst_select_1.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_sst_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_sst_select_value_name_id.reuse(_jspx_th_sst_select_1);
              return;
            }
            _jspx_tagPool_sst_select_value_name_id.reuse(_jspx_th_sst_select_1);
            out.write("\n          </td>\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n        </tr>\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_3.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_3.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_3);
      }
      out.write("\n    </tbody>\n    \n    <tbody id=\"toleranceSection\" style=\"display:none;\">\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_4 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_4.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_4.setParent(null);
      _jspx_th_spring_bind_4.setPath("form.tolerance");
      int[] _jspx_push_body_count_spring_bind_4 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_4 = _jspx_th_spring_bind_4.doStartTag();
        if (_jspx_eval_spring_bind_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n        <tr>\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_4, _jspx_page_context, _jspx_push_body_count_spring_bind_4))
              return;
            out.write("</td>\n          <td class=\"formField\">\n            <input id=\"tolerance\" type=\"text\" name=\"tolerance\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\n          </td>\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n        </tr>\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_4.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_4.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_4);
      }
      out.write("\n    </tbody>\n      \n    <tbody id=\"discardSection\" style=\"display:none;\">\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_5 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_5.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_5.setParent(null);
      _jspx_th_spring_bind_5.setPath("form.discardExtremeValues");
      int[] _jspx_push_body_count_spring_bind_5 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_5 = _jspx_th_spring_bind_5.doStartTag();
        if (_jspx_eval_spring_bind_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n        <tr>\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_5, _jspx_page_context, _jspx_push_body_count_spring_bind_5))
              return;
            out.write("</td>\n          <td class=\"formField\">\n            ");
            if (_jspx_meth_sst_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_5, _jspx_page_context, _jspx_push_body_count_spring_bind_5))
              return;
            out.write("\n          </td>\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n        </tr>\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_5.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_5.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_5);
      }
      out.write("\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_6 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_6.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_6.setParent(null);
      _jspx_th_spring_bind_6.setPath("form.discardLowLimit");
      int[] _jspx_push_body_count_spring_bind_6 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_6 = _jspx_th_spring_bind_6.doStartTag();
        if (_jspx_eval_spring_bind_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n        <tr>\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_6, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
              return;
            out.write("</td>\n          <td class=\"formField\">\n            <input id=\"discardLowLimit\" type=\"text\" name=\"discardLowLimit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\n          </td>\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n        </tr>\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_6.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_6[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_6.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_6.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_6);
      }
      out.write("\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_7 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_7.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_7.setParent(null);
      _jspx_th_spring_bind_7.setPath("form.discardHighLimit");
      int[] _jspx_push_body_count_spring_bind_7 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_7 = _jspx_th_spring_bind_7.doStartTag();
        if (_jspx_eval_spring_bind_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n        <tr>\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_7, _jspx_page_context, _jspx_push_body_count_spring_bind_7))
              return;
            out.write("</td>\n          <td class=\"formField\">\n            <input id=\"discardHighLimit\" type=\"text\" name=\"discardHighLimit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\n          </td>\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n        </tr>\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_7.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_7[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_7.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_7.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_7);
      }
      out.write("\n    </tbody>\n      \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <div>\n          ");
      if (_jspx_meth_sst_checkbox_1(_jspx_page_context))
        return;
      out.write("\n          <label for=\"purgeOverride\">");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("</label>\n        </div>\n        <div>\n          ");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write(" <input id=\"purgePeriod\" type=\"text\" name=\"purgePeriod\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_1(_jspx_page_context))
        return;
      out.write("\n        </div>\n      </td>\n      <td class=\"formError\">\n        ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_8 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_8.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_8.setParent(null);
      _jspx_th_spring_bind_8.setPath("form.purgeType");
      int[] _jspx_push_body_count_spring_bind_8 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_8 = _jspx_th_spring_bind_8.doStartTag();
        if (_jspx_eval_spring_bind_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n          ");
            if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_8, _jspx_page_context, _jspx_push_body_count_spring_bind_8))
              return;
            out.write("\n        ");
            int evalDoAfterBody = _jspx_th_spring_bind_8.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_8[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_8.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_8.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_8);
      }
      out.write("\n        ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_9 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_9.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_9.setParent(null);
      _jspx_th_spring_bind_9.setPath("form.purgePeriod");
      int[] _jspx_push_body_count_spring_bind_9 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_9 = _jspx_th_spring_bind_9.doStartTag();
        if (_jspx_eval_spring_bind_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_spring_bind_9.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_9[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_9.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_9.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_9);
      }
      out.write("\n      </td>\n    </tr>\n      \n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_10 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_10.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_10.setParent(null);
      _jspx_th_spring_bind_10.setPath("form.defaultCacheSize");
      int[] _jspx_push_body_count_spring_bind_10 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_10 = _jspx_th_spring_bind_10.doStartTag();
        if (_jspx_eval_spring_bind_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\n      <tr>\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_10, _jspx_page_context, _jspx_push_body_count_spring_bind_10))
              return;
            out.write("</td>\n        <td class=\"formField\">\n          <input id=\"defaultCacheSize\" type=\"text\" name=\"defaultCacheSize\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\n          <input id=\"clearCacheBtn\" type=\"button\" value=\"");
            if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_10, _jspx_page_context, _jspx_push_body_count_spring_bind_10))
              return;
            out.write("\" onclick=\"clearPointCache();\"/>\n        </td>\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n      </tr>\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_10.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_10[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_10.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_10.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_10);
      }
      out.write("\n  </table>\n</div>");
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
    _jspx_th_fmt_message_0.setKey("pointEdit.logging.props");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_tag_help_0.setId("pointValueLogging");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
    _jspx_th_fmt_message_1.setKey("pointEdit.logging.type");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_2.setKey("pointEdit.logging.type.change");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
    _jspx_th_fmt_message_3.setKey("pointEdit.logging.type.all");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
    _jspx_th_fmt_message_4.setKey("pointEdit.logging.type.never");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_3);
    _jspx_th_fmt_message_5.setKey("pointEdit.logging.type.interval");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_4);
    _jspx_th_fmt_message_6.setKey("pointEdit.logging.type.tsChange");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(null);
    _jspx_th_fmt_message_7.setKey("pointEdit.logging.period");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(null);
    _jspx_th_fmt_message_8.setKey("pointEdit.logging.every");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
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
    _jspx_th_tag_timePeriods_0.setName("intervalLoggingPeriodType");
    _jspx_th_tag_timePeriods_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.intervalLoggingPeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<br/>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_3);
    _jspx_th_fmt_message_9.setKey("pointEdit.logging.valueType");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_5);
    _jspx_th_fmt_message_10.setKey("pointEdit.logging.valueType.instant");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_6);
    _jspx_th_fmt_message_11.setKey("pointEdit.logging.valueType.maximum");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_7);
    _jspx_th_fmt_message_12.setKey("pointEdit.logging.valueType.minimum");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_8);
    _jspx_th_fmt_message_13.setKey("pointEdit.logging.valueType.average");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_4);
    _jspx_th_fmt_message_14.setKey("pointEdit.logging.tolerance");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_5);
    _jspx_th_fmt_message_15.setKey("pointEdit.logging.discard");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_0 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_5);
    _jspx_th_sst_checkbox_0.setId("discardExtremeValues");
    _jspx_th_sst_checkbox_0.setName("discardExtremeValues");
    _jspx_th_sst_checkbox_0.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sst_checkbox_0.setOnclick("changeDiscard()");
    int _jspx_eval_sst_checkbox_0 = _jspx_th_sst_checkbox_0.doStartTag();
    if (_jspx_th_sst_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_0);
      return true;
    }
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_6);
    _jspx_th_fmt_message_16.setKey("pointEdit.logging.discardLow");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_7);
    _jspx_th_fmt_message_17.setKey("pointEdit.logging.discardHigh");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(null);
    _jspx_th_fmt_message_18.setKey("pointEdit.logging.purge");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_1 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_1.setParent(null);
    _jspx_th_sst_checkbox_1.setId("purgeOverride");
    _jspx_th_sst_checkbox_1.setName("purgeOverride");
    _jspx_th_sst_checkbox_1.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgeOverride}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sst_checkbox_1.setOnclick("changePurgeOverride()");
    int _jspx_eval_sst_checkbox_1 = _jspx_th_sst_checkbox_1.doStartTag();
    if (_jspx_th_sst_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_1);
      return true;
    }
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(null);
    _jspx_th_fmt_message_19.setKey("pointEdit.logging.purgeOverride");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(null);
    _jspx_th_fmt_message_20.setKey("pointEdit.logging.after");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_1 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_1      );
    }
    _jspx_th_tag_timePeriods_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_1.setId("purgeType");
    _jspx_th_tag_timePeriods_1.setName("purgeType");
    _jspx_th_tag_timePeriods_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgeType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_1.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_8);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<br/>");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_10);
    _jspx_th_fmt_message_21.setKey("pointEdit.logging.defaultCache");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_10);
    _jspx_th_fmt_message_22.setKey("pointEdit.logging.clearCache");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }
}
