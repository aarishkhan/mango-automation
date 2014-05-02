package org.apache.jsp.modules.graphicalViews.web.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staticEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("\n<div id=\"staticEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    <table>\n      <tr>\n        <td class=\"formField\"><textarea id=\"staticPointContent\" rows=\"10\" cols=\"50\"></textarea></td>\n      </tr>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n    function StaticEditor() {\n        this.componentId = null;\n        \n        this.open = function(compId) {\n            staticEditor.componentId = compId;\n            \n            GraphicalViewDwr.getViewComponent(compId, function(comp) {\n                // Update the data in the form.\n                $set(\"staticPointContent\", comp.content);\n                show(\"staticEditorPopup\");\n            });\n            \n            positionEditor(compId, \"staticEditorPopup\");\n        };\n        \n        this.close = function() {\n            hide(\"staticEditorPopup\");\n        };\n        \n        this.save = function() {\n            GraphicalViewDwr.saveHtmlComponent(staticEditor.componentId, $get(\"staticPointContent\"), function() {\n                staticEditor.close();\n                updateHtmlComponentContent(\"c\"+ staticEditor.componentId, $get(\"staticPointContent\"));\n");
      out.write("            });\n        };\n    }\n    var staticEditor = new StaticEditor();\n  </script>\n</div>");
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
    _jspx_th_tag_img_0.setPng("html");
    _jspx_th_tag_img_0.setTitle("viewEdit.static.editor");
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
    _jspx_th_tag_img_1.setOnclick("staticEditor.save()");
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
    _jspx_th_tag_img_2.setOnclick("staticEditor.close()");
    _jspx_th_tag_img_2.setTitle("common.close");
    _jspx_th_tag_img_2.setStyle("display:inline;");
    _jspx_th_tag_img_2.doTag();
    return false;
  }
}
