package org.apache.jsp.modules.graphicalViews.web.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.gviews.component.SimpleCompoundComponent;

public final class compoundEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/m2m2.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
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
      out.write("\n\n<div id=\"compoundEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n          <span class=\"copyTitle\" id=\"compoundComponentName\"></span>\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    <table>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"compoundName\" type=\"text\"/></td>\n      </tr>\n      <tbody id=\"simpleCompoundAttrs\">\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"compoundBackgroundColour\" type=\"text\"/></td>\n        </tr>\n      </tbody>\n      <tbody id=\"imageChartAttrs\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"imageChartWidth\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"imageChartHeight\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <input type=\"text\" id=\"imageChartDurationPeriods\" class=\"formShort\"/>\n            ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n          </td>\n        </tr>\n      </tbody>\n      <tbody id=\"pointLists\"></tbody>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n    function CompoundEditor() {\n        this.component = null;\n        this.pointList = [];\n        \n        this.open = function(compId) {\n            GraphicalViewDwr.getViewComponent(compId, function(comp) {\n                compoundEditor.component = comp;\n                $set(\"compoundComponentName\", comp.displayName);\n                \n                // Update the point lists\n                compoundEditor.updatePointLists();\n                \n                // Update the data in the form.\n                $set(\"compoundName\", comp.name);\n                \n                if (comp.defName == \"simpleCompound\") {\n                    $set(\"compoundBackgroundColour\", comp.backgroundColour);\n                    show(\"simpleCompoundAttrs\");\n                }\n                else\n                    hide(\"simpleCompoundAttrs\");\n                \n                if (comp.defName == \"imageChart\") {\n");
      out.write("                    $set(\"imageChartWidth\", comp.width);\n                    $set(\"imageChartHeight\", comp.height);\n                    $set(\"imageChartDurationType\", comp.durationType);\n                    $set(\"imageChartDurationPeriods\", comp.durationPeriods);\n                    show(\"imageChartAttrs\");\n                }\n                else\n                    hide(\"imageChartAttrs\");\n                \n                show(\"compoundEditorPopup\");\n            });\n            \n            positionEditor(compId, \"compoundEditorPopup\");\n        };\n        \n        this.close = function() {\n            hide(\"compoundEditorPopup\");\n            hideContextualMessages(\"compoundEditorPopup\");\n        };\n        \n        this.save = function() {\n            hideContextualMessages(\"compoundEditorPopup\");\n            \n            // Gather the point settings\n            var pointChildren = compoundEditor.getPointChildren();\n            var childPointIds = new Array();\n            var sel;\n            for (var i=0; i<pointChildren.length; i++)\n");
      out.write("                childPointIds.push({key: pointChildren[i].id, value: $get(\"compoundPointSelect\"+ pointChildren[i].id)});\n            \n            if (compoundEditor.component.defName == \"simpleCompound\")\n                GraphicalViewDwr.saveSimpleCompoundComponent(compoundEditor.component.id, $get(\"compoundName\"),\n                        $get(\"compoundBackgroundColour\"), childPointIds, compoundEditor.saveCB);\n            else if (compoundEditor.component.defName == \"imageChart\")\n                GraphicalViewDwr.saveImageChartComponent(compoundEditor.component.id, $get(\"compoundName\"),\n                        $get(\"imageChartWidth\"), $get(\"imageChartHeight\"), $get(\"imageChartDurationType\"),\n                        $get(\"imageChartDurationPeriods\"), childPointIds, compoundEditor.saveCB);\n            else\n                GraphicalViewDwr.saveCompoundComponent(compoundEditor.component.id, $get(\"compoundName\"), childPointIds,\n                        compoundEditor.saveCB);\n        };\n        \n        this.saveCB = function(response) {\n");
      out.write("            if (response.hasMessages)\n                showDwrMessages(response.messages);\n            else {\n                if (compoundEditor.component.defName == \"simpleCompound\")\n                    $(\"c\"+ compoundEditor.component.id +\"Info\").style.background = $get(\"compoundBackgroundColour\");\n                \n                compoundEditor.close();\n                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n            }\n        };\n        \n        this.setPointList = function(pointList) {\n            compoundEditor.pointList = pointList;\n        };\n        \n        this.updatePointLists = function() {\n            var pointChildren = compoundEditor.getPointChildren();\n            \n            // Create the select controls\n            dwr.util.removeAllRows(\"pointLists\");\n            dwr.util.addRows(\"pointLists\", pointChildren,\n                [\n                    function(data) { return data.description; },\n                    function(data) { return '<select id=\"compoundPointSelect'+ data.id +'\"></select>'; }\n");
      out.write("                ],\n                {\n                    cellCreator: function(options) {\n                        var td = document.createElement(\"td\");\n                        if (options.cellNum == 0) {\n                            if (compoundEditor.component.defName == \"simpleCompound\" &&\n                                    options.rowData.id == \"");
      out.print( SimpleCompoundComponent.LEAD_POINT );
      out.write("\")\n                                td.className = \"formLabelRequired\";\n                            else\n                                td.className = \"formLabel\";\n                        }\n                        else if (options.cellNum == 1)\n                            td.className = \"formField\";\n                        return td;\n                    }\n                }\n            );\n            \n            // Add options to the controls.\n            var sel, p;\n            for (var i=0; i<pointChildren.length; i++) {\n                sel = $(\"compoundPointSelect\"+ pointChildren[i].id);\n                sel.options[0] = new Option(\"\", 0);\n                for (p=0; p<compoundEditor.pointList.length; p++) {\n                    if (contains(pointChildren[i].dataTypes, compoundEditor.pointList[p].dataType))\n                        sel.options[sel.options.length] = new Option(settingsEditor.pointList[p].name,\n                                settingsEditor.pointList[p].id);\n                }\n                \n                // Set the control default value.\n");
      out.write("                $set(sel, pointChildren[i].viewComponent.dataPointId);\n            }\n        };\n        \n        this.getPointChildren = function() {\n            var pointChildren = new Array();\n            for (var i=0; i<compoundEditor.component.childComponents.length; i++) {\n                if (compoundEditor.component.childComponents[i].viewComponent.pointComponent)\n                    pointChildren.push(compoundEditor.component.childComponents[i]);\n            }\n            return pointChildren;\n        };\n    }\n    var compoundEditor = new CompoundEditor();\n  </script>\n</div>");
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
    _jspx_th_tag_img_0.setTitle("viewEdit.compound.editor");
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
    _jspx_th_tag_img_1.setOnclick("compoundEditor.save()");
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
    _jspx_th_tag_img_2.setOnclick("compoundEditor.close()");
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
    _jspx_th_fmt_message_0.setKey("viewEdit.compound.name");
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
    _jspx_th_fmt_message_1.setKey("viewEdit.compound.backgroundColour");
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
    _jspx_th_fmt_message_2.setKey("viewEdit.compound.width");
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
    _jspx_th_fmt_message_3.setKey("viewEdit.compound.height");
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
    _jspx_th_fmt_message_4.setKey("viewEdit.compound.duration");
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
    _jspx_th_tag_timePeriods_0.setId("imageChartDurationType");
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
}
