package org.apache.jsp.WEB_002dINF.snippet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setPointContentRadio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n<input type=\"hidden\" id=\"setPointValue");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"\"/>\n<input type=\"radio\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${text == point.textRenderer.zeroLabel ? \" checked=\\\"checked\\\"\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n        name=\"setPointValueRB");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"setPointValueRBF");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \n        onclick=\"$('setPointValue");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').value = 'false'\"/>\n<label for=\"setPointValueRBF");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.textRenderer.zeroLabel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n<input type=\"radio\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${text == point.textRenderer.oneLabel ? \" checked=\\\"checked\\\"\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n        name=\"setPointValueRB");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"setPointValueRBT");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \n        onclick=\"$('setPointValue");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').value = 'true'\"/>\n<label for=\"setPointValueRBT");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${idSuffix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.textRenderer.oneLabel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>");
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
}
