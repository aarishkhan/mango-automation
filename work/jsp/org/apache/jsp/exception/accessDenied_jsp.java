package org.apache.jsp.exception;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class accessDenied_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(6);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_log_error_message_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_log_error_message_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_log_error_message_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    response.setStatus(((Integer)request.getAttribute("javax.servlet.error.status_code")).intValue());
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

// Store the stack trace as a request attribute.
java.io.StringWriter sw = new java.io.StringWriter();
exception.printStackTrace(new java.io.PrintWriter(sw));

// Write the request url into the message.
sw.append("\r\nREQUEST URL\r\n");
sw.append(request.getRequestURL());

// Write the request parameters.
sw.append("\r\n\r\nREQUEST PARAMETERS\r\n");
java.util.Enumeration names = request.getParameterNames();
while (names.hasMoreElements()) {
    String name = (String) names.nextElement();
    sw.append("   ").append(name).append('=').append(request.getParameter(name)).append("\r\n");
}

// Write the request headers.
sw.append("\r\n\r\nREQUEST HEADERS\r\n");
names = request.getHeaderNames();
while (names.hasMoreElements()) {
    String name = (String) names.nextElement();
    sw.append("   ").append(name).append('=').append(request.getHeader(name)).append("\r\n");
}

// Write the page attributes.
//sw.append("\r\n\r\nPAGE ATTRIBUTES\r\n");
//names = pageContext.getAttributeNames();
//while (names.hasMoreElements()) {
//    String name = (String) names.nextElement();
//    sw.append("   ").append(name).append('=').append(pageContext.getAttribute(name)).append("\r\n");
//}

// Write the request attributes.
sw.append("\r\n\r\nREQUEST ATTRIBUTES\r\n");
names = request.getAttributeNames();
while (names.hasMoreElements()) {
    String name = (String) names.nextElement();
    sw.append("   ").append(name).append('=').append(String.valueOf(request.getAttribute(name))).append("\r\n");
}

if (request.getSession() != null) {
    // Write the session attributes.
    sw.append("\r\n\r\nSESSION ATTRIBUTES\r\n");
    names = session.getAttributeNames();
    while (names.hasMoreElements()) {
        String name = (String) names.nextElement();
        sw.append("   ").append(name).append('=').append(String.valueOf(session.getAttribute(name))).append("\r\n");
    }
}

request.setAttribute("stackTrace", sw.toString());

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_tag_page_0(_jspx_page_context))
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

  private boolean _jspx_meth_tag_page_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:page
    org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_page_0      );
    }
    _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_page_0.setJspBody(new accessDenied_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null));
    _jspx_th_tag_page_0.doTag();
    return false;
  }

  private boolean _jspx_meth_log_error_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  log:error
    org.apache.taglibs.log.ErrorTag _jspx_th_log_error_0 = (org.apache.taglibs.log.ErrorTag) _jspx_tagPool_log_error_message_nobody.get(org.apache.taglibs.log.ErrorTag.class);
    _jspx_th_log_error_0.setPageContext(_jspx_page_context);
    _jspx_th_log_error_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_log_error_0.setMessage((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${stackTrace}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_log_error_0 = _jspx_th_log_error_0.doStartTag();
    if (_jspx_th_log_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_log_error_message_nobody.reuse(_jspx_th_log_error_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_log_error_message_nobody.reuse(_jspx_th_log_error_0);
    return false;
  }

  private class accessDenied_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public accessDenied_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <br/>\n  <span class=\"bigTitle\">Permission denied!</span><br/>\n  <br/>\n  You do not have sufficient authority to access the resource you requested. Sadly, this exception must be logged\n  for review by a system administrator.<br/>\n  <br/>\n  \n  ");
      if (_jspx_meth_log_error_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write('\n');
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
