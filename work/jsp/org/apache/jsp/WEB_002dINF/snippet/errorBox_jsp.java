package org.apache.jsp.WEB_002dINF.snippet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class errorBox_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');
      out.write("\n\n<script type=\"text/javascript\" >\n    function closeErrorBox() {\n        var errorBox = dojo.byId(\"mangoErrorBox\");\n        hide(errorBox);\n        var divs = errorBox.getElementsByTagName(\"div\");\n        while(divs.length > 0) {\n            errorBox.removeChild(divs[0]);\n        }\n    }\n    \n    // TODO rename these, way too generic\n    function addErrorDiv(message) {\n        var errorBox = dojo.byId(\"mangoErrorBox\");\n        var div = document.createElement('div');\n        div.innerHTML = message;\n        errorBox.appendChild(div);\n        show(errorBox);\n    }\n    \n    function addContextualMessage(key, message) {\n        addErrorDiv(\"Error with '\" + key + \"': \" + message);\n    }\n    \n    function addMessage(message) {\n        if (message.contextualMessage) {\n            addContextualMessage(message.contextKey, message.contextualMessage);\n        } else {\n            addErrorDiv(message.genericMessage);\n        }\n    }\n    \n    function addMessages(messages) {\n        for (var i = 0; i < messages.length; i++) {\n");
      out.write("            addMessage(messages[i])\n        }\n    }\n</script>\n\n<div id=\"mangoErrorBox\" class=\"borderDiv\" style=\"display:none\">\n  ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n</div>\n");
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
    _jspx_th_tag_img_0.setId("closeErrorBoxImg");
    _jspx_th_tag_img_0.setPng("cross");
    _jspx_th_tag_img_0.setOnclick("closeErrorBox()");
    _jspx_th_tag_img_0.setTitle("downtime.view.clearErrors");
    _jspx_th_tag_img_0.doTag();
    return false;
  }
}
