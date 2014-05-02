package org.apache.jsp.WEB_002dINF.snippet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changeContentRadio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/snippet/common.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/relinquish.tag");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write(":<br/>\n<input type=\"radio\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pointValue.booleanValue == false ? \" checked=\\\"checked\\\"\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" name=\"rbChange");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n        id=\"rbChange");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("F\" onclick=\"mango.view.setPoint(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', 'false')\"/>\n<label for=\"rbChange");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("F\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.textRenderer.zeroLabel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n<input type=\"radio\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pointValue.booleanValue == true ? \" checked=\\\"checked\\\"\" : \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  name=\"rbChange");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n        id=\"rbChange");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("T\" onclick=\"mango.view.setPoint(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', 'true')\"/>\n<label for=\"rbChange");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("T\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.textRenderer.oneLabel}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      if (_jspx_meth_tag_relinquish_0(_jspx_page_context))
        return;
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
    _jspx_th_fmt_message_0.setKey("common.chooseSetPoint");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_tag_relinquish_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:relinquish
    org.apache.jsp.tag.web.relinquish_tag _jspx_th_tag_relinquish_0 = new org.apache.jsp.tag.web.relinquish_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_relinquish_0      );
    }
    _jspx_th_tag_relinquish_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_relinquish_0.doTag();
    return false;
  }
}
