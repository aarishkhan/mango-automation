package org.apache.jsp.WEB_002dINF.snippet.view.dataPoint;

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

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      out.write("\n\n<div >\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"chartRendererSelect\"></input>\n      </td>\n    </tr>\n    <tbody id=\"timePeriodRow\" style=\"display:none\">\n       <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"numberOfPeriods\" type=\"text\" class=\"formVeryShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </tbody>  \n    <tbody id=\"limitRow\" style=\"display:none\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"includeSumRow\" style=\"display:none\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"includeSum\" data-dojo-type=\"dijit/form/CheckBox\"/></td>\n      </tr>\n    </tbody>\n    \n    \n    \n    <tr>\n      <td colspan=\"2\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n  </table>\n</div>\n\n<script type=\"text/javascript\">\n\ndojo.require(\"dijit.form.Select\");\ndojo.require(\"dijit.form.CheckBox\");\n\nvar chartRendererSelect = new dijit.form.Select({\n    name: 'chartRendererSelect',\n},\"chartRendererSelect\");\n\n  /*\n   * Set the page values from the current data point VO\n   */\n  function setChartRenderer(vo){\n\t  \n      //Clear and Setup the Chart Renderer Options\n      DataPointDwr.getChartRendererOptions(vo.pointLocator.dataTypeId,function (response){\n    \t  var options = [];\n    \t  for(var i=0; i<response.data.options.length; i++){\n    \t\t  options.push({\n    \t\t\t  label: mangoMsg[response.data.options[i].nameKey],\n    \t\t\t  value: response.data.options[i].name,\n    \t\t  })\n    \t  }\n    \t  chartRendererSelect.options = [];\n          chartRendererSelect.addOption(options);\n          \n          \n          if(vo.chartRenderer != null){\n              chartRendererSelect.set('value',vo.chartRenderer.typeName);\n\n              if(vo.chartRenderer.typeName == \"chartRendererTable\"){\n");
      out.write("                  $set(\"limit\", vo.chartRenderer.limit);\n              }else if(vo.chartRenderer.typeName === \"chartRendererImage\"){\n                  $set(\"numberOfPeriods\", vo.chartRenderer.numberOfPeriods);\n                  $set(\"timePeriod\", vo.chartRenderer.timePeriod);\n              }else if(vo.chartRenderer.typeName == \"chartRendererStats\"){\n                  $set(\"numberOfPeriods\", vo.chartRenderer.numberOfPeriods);\n                  $set(\"timePeriod\", vo.chartRenderer.timePeriod);\n                  dijit.byId(\"includeSum\").set(\"checked\", vo.chartRenderer.includeSum);\n              }else if(vo.chartRenderer.typeName == \"chartRendererImageFlipbook\"){\n                  $set(\"limit\", vo.chartRenderer.limit);\n              }else{\n                  dojo.debug(\"Unknown chart renderer: \" + vo.chartRenderer.typeName);\n              }\n          }//Not null\n      });\n\t  \n\n  }\n\n  \n  /*\n   * Get the values from the page and put into current data point VO\n   */\n  function getChartRenderer(vo){\n      \n      //Save all pertinent pieces\n");
      out.write("      var typeName = chartRendererSelect.get('value');\n      var renderer;\n      if (typeName == \"chartRendererNone\"){\n    \t  renderer = null;\n      }else if (typeName == \"chartRendererTable\") {\n          var limit = parseInt($get(\"limit\"));\n          if(isNaN(limit))\n        \t  limit=-1;\n          renderer = new TableChartRenderer();\n          renderer.limit = limit;\n      }\n      else if (typeName == \"chartRendererImage\") {\n          renderer = new ImageChartRenderer();\n          renderer.timePeriod = $get(\"timePeriod\");\n          renderer.numberOfPeriods = parseInt($get(\"numberOfPeriods\"));\n          if(isNaN(renderer.numberOfPeriods))\n        \t  renderer.numberOfPeriods=-1;\n      }\n      else if (typeName == \"chartRendererStats\") {\n          renderer = new StatisticsChartRenderer();\n          renderer.timePeriod = $get(\"timePeriod\");\n    \t  renderer.numberOfPeriods = parseInt($get(\"numberOfPeriods\"));\n    \t  renderer.includeSum = dijit.byId(\"includeSum\").get('checked');\n          if(isNaN(renderer.numberOfPeriods))\n");
      out.write("              renderer.numberOfPeriods=-1;\n      }\n      else if (typeName == \"chartRendererImageFlipbook\") {\n    \t  renderer = new ImageFlipbookRenderer();\n    \t  renderer.limit = parseInt($get(\"limit\"));\n    \t  if(isNaN(renderer.limit))\n    \t\t  renderer.limit=-1;\n      }\n\n      //Set the renderer\n      vo.chartRenderer = renderer;\n  }\n  \n  function ChartRendererEditor() {\n\n  \n      this.change = function(name,oldValue,value) {\n    \t  \n    \t  if(value != null){\n              if(value == \"chartRendererTable\"){\n            \t  hide(\"timePeriodRow\");\n            \t  show(\"limitRow\");\n            \t  hide(\"includeSumRow\");\n              }else if(value === \"chartRendererImage\"){\n                  show(\"timePeriodRow\");\n                  hide(\"limitRow\");\n                  hide(\"includeSumRow\");\n              }else if(value == \"chartRendererStats\"){\n                  show(\"timePeriodRow\");\n                  hide(\"limitRow\");\n                  show(\"includeSumRow\");\n              }else if(value == \"chartRendererImageFlipbook\"){\n");
      out.write("                  hide(\"timePeriodRow\");\n                  show(\"limitRow\");\n                  hide(\"includeSumRow\");\n              }else if(value == \"chartRendererNone\"){\n                  hide(\"timePeriodRow\");\n                  hide(\"limitRow\");\n                  hide(\"includeSumRow\");            \t  \n              }else{\n                  alert(\"Unknown chart renderer: \" + value);\n              }\n\n    \t  }\n    \t  \n    \t  \n      };\n      \n      chartRendererSelect.watch(\"value\",this.change);\n\n  }\n  var chartRendererEditor = new ChartRendererEditor();\n\n\n</script>");
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

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("pointEdit.chart.timePeriod");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
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
    _jspx_th_tag_timePeriods_0.setId("timePeriod");
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
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
    _jspx_th_fmt_message_4.setKey("pointEdit.chart.includeSum");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_fmt_message_5.setKey("pointEdit.chart.note");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }
}
