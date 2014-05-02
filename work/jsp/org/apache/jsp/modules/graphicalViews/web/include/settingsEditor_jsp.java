package org.apache.jsp.modules.graphicalViews.web.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class settingsEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
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
      out.write("\n<div id=\"settingsEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n          <span class=\"copyTitle\" id=\"settingsComponentName\"></span>\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    <table>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><select id=\"settingsPointList\"></select><span id=\"settingsPointInfo\"></span></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsPointName\" type=\"text\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsSettable\" type=\"checkbox\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsBkgdColor\" type=\"text\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsControls\" type=\"checkbox\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">x</td>\n        <td class=\"formField\"><input id=\"settingsX\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">y</td>\n        <td class=\"formField\"><input id=\"settingsY\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n  dojo.require(\"dojo.store.Memory\");\n  dojo.require(\"dijit.form.FilteringSelect\");\n  var pointFilteringSelect; //Global to use select easily\n  dojo.ready(function(){\n      // Point lookup\n      pointFilteringSelect = new dijit.form.FilteringSelect({\n          store: new dojo.store.Memory(),\n          autoComplete: false,\n          queryExpr: \"*${0}*\",\n          highlightMatch: \"all\",\n          required: true,\n          onChange: function(point) {\n          \tsettingsEditor.pointSelectChanged();\n          }\n      }, \"settingsPointList\");  \n  })\n  \n  \n    // Script requires\n");
      out.write("    //  - Drag and Drop library for locating objects and positioning the window.\n    //  - DWR utils for using $() prototype.\n    //  - common.js\n    function SettingsEditor() {\n        this.componentId = null;\n        this.pointList = [];\n        \n        this.open = function(compId) {\n            settingsEditor.componentId = compId;\n            \n            GraphicalViewDwr.getViewComponent(compId, function(comp) {\n                $set(\"settingsComponentName\", comp.displayName);\n                \n                // Update the point list\n                settingsEditor.updatePointList(comp.supportedDataTypes);\n                \n                // Update the data in the form.\n                pointFilteringSelect.set('value',comp.dataPointId);\n                $set(\"settingsPointName\", comp.nameOverride);\n                $set(\"settingsSettable\", comp.settableOverride);\n                $set(\"settingsBkgdColor\", comp.bkgdColorOverride);\n                $set(\"settingsControls\", comp.displayControls);\n                $set(\"settingsX\", comp.x);\n");
      out.write("                $set(\"settingsY\", comp.y);\n\n                settingsEditor.pointSelectChanged();\n                show(\"settingsEditorPopup\");\n            });\n            \n            positionEditor(compId, \"settingsEditorPopup\");\n        };\n        \n        this.close = function() {\n            hide(\"settingsEditorPopup\");\n            hideContextualMessages(\"settingsEditorPopup\");\n        };\n        \n        this.save = function() {\n            hideContextualMessages(\"settingsEditorPopup\");\n            GraphicalViewDwr.setPointComponentSettings(settingsEditor.componentId, pointFilteringSelect.value,\n                    $get(\"settingsPointName\"), $get(\"settingsSettable\"), $get(\"settingsBkgdColor\"),\n                    $get(\"settingsControls\"), $get(\"settingsX\"), $get(\"settingsY\"), function(response) {\n                if (response.hasMessages) {\n                    showDwrMessages(response.messages);\n                }\n                else {\n                    var div = $(\"c\"+ settingsEditor.componentId);\n                    div.style.left = response.data.x +\"px\";\n");
      out.write("                    div.style.top = response.data.y +\"px\";\n                    \n                    settingsEditor.close();\n                    MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n                }\n            });\n        };\n        \n        this.setPointList = function(pointList) {\n            settingsEditor.pointList = pointList;\n        };\n        \n        this.pointSelectChanged = function() {\n            var point = getElement(settingsEditor.pointList, $get(\"settingsPointList\"));\n            if (!point || !point.settable) {\n                $set(\"settingsSettable\", false);\n                $(\"settingsSettable\").disabled = true;\n            }\n            else\n                $(\"settingsSettable\").disabled = false;\n        };\n        \n        this.updatePointList = function(dataTypes) {\n\n            pointFilteringSelect.store = new dojo.store.Memory({ data: settingsEditor.pointList });\n\t\t\tpointFilteringSelect.store.data.push({id: 0, name: \"\"});        \t\n\t\t\tpointFilteringSelect.reset();\n        \t\n");
      out.write("//             dwr.util.removeAllOptions(\"settingsPointList\");\n//             var sel = $(\"settingsPointList\");\n//             sel.options[0] = new Option(\"\", 0);\n            \n//             for (var i=0; i<settingsEditor.pointList.length; i++) {\n//                 if (contains(dataTypes, settingsEditor.pointList[i].dataType))\n//                     sel.options[sel.options.length] = new Option(settingsEditor.pointList[i].name,\n//                             settingsEditor.pointList[i].id);\n//             }\n        };\n    }\n    var settingsEditor = new SettingsEditor();\n  </script>\n</div>");
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

  private boolean _jspx_meth_tag_img_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setPng("pencil");
    _jspx_th_tag_img_0.setTitle("viewEdit.settings.editor");
    _jspx_th_tag_img_0.setStyle("display:inline;");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setPng("save");
    _jspx_th_tag_img_1.setOnclick("settingsEditor.save()");
    _jspx_th_tag_img_1.setTitle("common.save");
    _jspx_th_tag_img_1.setStyle("display:inline;");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setPng("cross");
    _jspx_th_tag_img_2.setOnclick("settingsEditor.close()");
    _jspx_th_tag_img_2.setTitle("common.close");
    _jspx_th_tag_img_2.setStyle("display:inline;");
    _jspx_th_tag_img_2.doTag();
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
    _jspx_th_fmt_message_0.setKey("viewEdit.settings.point");
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
    _jspx_th_fmt_message_1.setKey("viewEdit.settings.nameOverride");
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
    _jspx_th_fmt_message_2.setKey("viewEdit.settings.settableOverride");
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
    _jspx_th_fmt_message_3.setKey("viewEdit.settings.background");
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
    _jspx_th_fmt_message_4.setKey("viewEdit.settings.displayControls");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }
}
