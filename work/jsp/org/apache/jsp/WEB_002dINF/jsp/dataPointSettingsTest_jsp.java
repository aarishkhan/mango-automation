package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataPointSettingsTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
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
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("dwrClasses");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("DataPointDwr,DataPointEditDwr");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_tag_page_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  tag:page
    org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_page_0      );
    }
    _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_page_0.setDwr((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dwrClasses}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_page_0.setOnload("initDataPointSettings");
    javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new dataPointSettingsTest_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null);
    _jspx_th_tag_page_0.setStyles(_jspx_temp0);
    _jspx_th_tag_page_0.setJspBody(new dataPointSettingsTest_jspHelper( 1, _jspx_page_context, _jspx_th_tag_page_0, null));
    _jspx_th_tag_page_0.doTag();
    return false;
  }

  private class dataPointSettingsTest_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public dataPointSettingsTest_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<style type=\"text/css\">\n    .mangoForm ul { margin: 0; padding: 0; }\n    .mangoForm ul li { margin-bottom: 5px; list-style: none; }\n    .mangoForm label { width: 100px; text-align: right; padding-right: 10px; display: inline-block; }\n    .mangoForm label.required { font-weight: bold; }\n    \n    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("dgrid/css/dgrid.css\" type=\"text/css\" rel=\"stylesheet\"/>\n    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("dojox/form/resources/UploaderFileList.css\" type=\"text/css\" rel=\"stylesheet\"/>\n    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("dojox/form/resources/Rating.css\" type=\"text/css\" rel=\"stylesheet\"/>\n  </style>\n  \n  <script type=\"text/javascript\"></script>");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
      HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
      out.write("\n       \n  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/dataPointSettings.jsp", out, false);
      out.write("\n    \n  ");
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
          case 1:
            invoke1( out );
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
