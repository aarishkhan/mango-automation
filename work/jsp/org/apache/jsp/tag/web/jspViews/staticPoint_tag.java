package org.apache.jsp.tag.web.jspViews;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staticPoint_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/modules/jspViews/web/jviews.tld");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jviews_staticPoint_xid_raw_disabledValue_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String xid;
  private java.lang.Boolean raw;
  private java.lang.String disabledValue;

  public java.lang.String getXid() {
    return this.xid;
  }

  public void setXid(java.lang.String xid) {
    this.xid = xid;
  }

  public java.lang.Boolean getRaw() {
    return this.raw;
  }

  public void setRaw(java.lang.Boolean raw) {
    this.raw = raw;
  }

  public java.lang.String getDisabledValue() {
    return this.disabledValue;
  }

  public void setDisabledValue(java.lang.String disabledValue) {
    this.disabledValue = disabledValue;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_jviews_staticPoint_xid_raw_disabledValue_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_jviews_staticPoint_xid_raw_disabledValue_nobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getXid() != null ) {
      _jspx_page_context.setAttribute("xid", getXid());
}
    if( getRaw() != null ) {
      _jspx_page_context.setAttribute("raw", getRaw());
}
    if( getDisabledValue() != null ) {
      _jspx_page_context.setAttribute("disabledValue", getDisabledValue());
}

    try {
      if (_jspx_meth_jviews_staticPoint_0(_jspx_page_context))
        return;
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_jviews_staticPoint_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  jviews:staticPoint
    com.serotonin.m2m2.jviews.taglib.StaticPointTag _jspx_th_jviews_staticPoint_0 = (com.serotonin.m2m2.jviews.taglib.StaticPointTag) _jspx_tagPool_jviews_staticPoint_xid_raw_disabledValue_nobody.get(com.serotonin.m2m2.jviews.taglib.StaticPointTag.class);
    _jspx_th_jviews_staticPoint_0.setPageContext(_jspx_page_context);
    _jspx_th_jviews_staticPoint_0.setParent(null);
    _jspx_th_jviews_staticPoint_0.setXid((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${xid}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_jviews_staticPoint_0.setRaw(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${raw}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    _jspx_th_jviews_staticPoint_0.setDisabledValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disabledValue}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_jviews_staticPoint_0 = _jspx_th_jviews_staticPoint_0.doStartTag();
    if (_jspx_th_jviews_staticPoint_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jviews_staticPoint_xid_raw_disabledValue_nobody.reuse(_jspx_th_jviews_staticPoint_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_jviews_staticPoint_xid_raw_disabledValue_nobody.reuse(_jspx_th_jviews_staticPoint_0);
    return false;
  }
}