package org.apache.jsp.WEB_002dINF.jsp.pointEdit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chartRenderer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onchange_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_onchange_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_sst_select_value_onchange_id.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("\n<div class=\"borderDiv marB marR\">\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        ");
      if (_jspx_meth_sst_select_0(_jspx_page_context))
        return;
      out.write("\n      </td>\n    </tr>\n    \n    <tbody id=\"chartRendererNone\" style=\"display:none;\"></tbody>\n    <tbody id=\"chartRendererTable\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"chartRendererTableLimit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"chartRendererImage\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"chartRendererImageNumberOfPeriods\" type=\"text\" class=\"formVeryShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </tbody>\n    <tbody id=\"chartRendererStats\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"chartRendererStatsNumberOfPeriods\" type=\"text\" class=\"formVeryShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_1(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"chartRendererStatsIncludeSum\" type=\"checkbox\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"chartRendererImageFlipbook\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"chartRendererImageFlipbookLimit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n    </tbody>\n    \n    <tr>\n      <td colspan=\"2\">");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n  </table>\n</div>\n\n<script type=\"text/javascript\">\n  function ChartRendererEditor() {\n      var currentChartRenderer;\n      \n      this.init = function() {\n          // Figure out which fields to populate with data.\n          \n          ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n          \n          chartRendererEditor.change();\n      };\n  \n      this.change = function() {\n          if (currentChartRenderer)\n              hide(currentChartRenderer);\n          currentChartRenderer = $(\"chartRendererSelect\").value\n          show(currentChartRenderer);\n      };\n      \n      this.save = function(callback) {\n          var typeName = $get(\"chartRendererSelect\");\n          if (typeName == \"chartRendererNone\")\n              DataPointEditDwr.setNoneChartRenderer(callback);\n          else if (typeName == \"chartRendererTable\") {\n              var limit = parseInt($get(\"chartRendererTableLimit\"));\n              if (isNaN(limit))\n                  alert(\"");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("\");\n              else if (limit < 2 || limit > 50)\n                  alert(\"");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("\");\n              else\n                  DataPointEditDwr.setTableChartRenderer(limit, callback);\n          }\n          else if (typeName == \"chartRendererImage\") {\n              var numberOfPeriods = parseInt($get(\"chartRendererImageNumberOfPeriods\"));\n              if (isNaN(numberOfPeriods))\n                  alert(\"");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("\");\n              else if (numberOfPeriods < 1)\n                  alert(\"");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("\");\n              else\n                  DataPointEditDwr.setImageChartRenderer($get(\"chartRendererImageTimePeriod\"),\n                          numberOfPeriods, callback);\n          }\n          else if (typeName == \"chartRendererStats\") {\n              var numberOfPeriods = parseInt($get(\"chartRendererStatsNumberOfPeriods\"));\n              if (isNaN(numberOfPeriods))\n                  alert(\"");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write("\");\n              else if (numberOfPeriods < 1)\n                  alert(\"");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("\");\n              else\n                  DataPointEditDwr.setStatisticsChartRenderer($get(\"chartRendererStatsTimePeriod\"), \n                          numberOfPeriods, $get(\"chartRendererStatsIncludeSum\"), callback);\n          }\n          else if (typeName == \"chartRendererImageFlipbook\") {\n              var limit = parseInt($get(\"chartRendererImageFlipbookLimit\"));\n              if (isNaN(limit))\n                  alert(\"");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("\");\n              else if (limit < 2 || limit > 50)\n                  alert(\"");
      if (_jspx_meth_fmt_message_16(_jspx_page_context))
        return;
      out.write("\");\n              else\n                  DataPointEditDwr.setImageFlipbookRenderer(limit, callback);\n          }\n          else\n              callback();\n      };\n  }\n  var chartRendererEditor = new ChartRendererEditor();\n  dojo.ready(chartRendererEditor, \"init\");\n</script>");
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
    _jspx_th_fmt_message_0.setKey("pointEdit.chart.props");
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
    _jspx_th_tag_help_0.setId("chartRenderers");
    _jspx_th_tag_help_0.doTag();
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
    _jspx_th_fmt_message_1.setKey("pointEdit.chart.type");
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
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_0.setParent(null);
    _jspx_th_sst_select_0.setId("chartRendererSelect");
    _jspx_th_sst_select_0.setOnchange("chartRendererEditor.change()");
    _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
    if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n          ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\n        ");
        int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_onchange_id.reuse(_jspx_th_sst_select_0);
      return true;
    }
    _jspx_tagPool_sst_select_value_onchange_id.reuse(_jspx_th_sst_select_0);
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chartRenderers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("crdef");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n            ");
          if (_jspx_meth_sst_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
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
    _jspx_th_sst_option_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${crdef.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_0.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
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
      return true;
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_2.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${crdef.nameKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_fmt_message_3.setKey("pointEdit.chart.limit");
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
    _jspx_th_fmt_message_4.setKey("pointEdit.chart.timePeriod");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_tag_timePeriods_0.setId("chartRendererImageTimePeriod");
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setKey("pointEdit.chart.timePeriod");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
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
    _jspx_th_tag_timePeriods_1.setId("chartRendererStatsTimePeriod");
    _jspx_th_tag_timePeriods_1.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setKey("pointEdit.chart.includeSum");
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
    _jspx_th_fmt_message_7.setKey("pointEdit.chart.limit");
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
    _jspx_th_fmt_message_8.setKey("pointEdit.chart.note");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
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
        out.write("\n            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n          ");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty form.chartRenderer}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n            ");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererTable\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              $set(\"chartRendererTableLimit\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.limit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n            ");
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

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererImage\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              $set(\"chartRendererImageNumberOfPeriods\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.numberOfPeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n              $set(\"chartRendererImageTimePeriod\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.timePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n            ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererStats\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              $set(\"chartRendererStatsNumberOfPeriods\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.numberOfPeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n              $set(\"chartRendererStatsTimePeriod\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.timePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n              $set(\"chartRendererStatsIncludeSum\", ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.includeSum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(");\n            ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererImageFlipbook\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              $set(\"chartRendererImageFlipbookLimit\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.limit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n            ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
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
        out.write("\n              dojo.debug(\"Unknown chart renderer: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(null);
    _jspx_th_fmt_message_9.setKey("pointEdit.chart.missingLimit");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(null);
    _jspx_th_fmt_message_10.setKey("pointEdit.chart.invalidLimit");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(null);
    _jspx_th_fmt_message_11.setKey("pointEdit.chart.missingPeriods");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(null);
    _jspx_th_fmt_message_12.setKey("pointEdit.chart.invalidPeriods");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(null);
    _jspx_th_fmt_message_13.setKey("pointEdit.chart.missingPeriods");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(null);
    _jspx_th_fmt_message_14.setKey("pointEdit.chart.invalidPeriods");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(null);
    _jspx_th_fmt_message_15.setKey("pointEdit.chart.missingLimit");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(null);
    _jspx_th_fmt_message_16.setKey("pointEdit.chart.invalidLimit");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }
}
