package org.apache.jsp.tag.web.jspViews;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chartPoint_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_map_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_mapEntry_value_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_listEntry_value_listVar_nobody;

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
  private java.lang.String color;

  public java.lang.String getXid() {
    return this.xid;
  }

  public void setXid(java.lang.String xid) {
    this.xid = xid;
  }

  public java.lang.String getColor() {
    return this.color;
  }

  public void setColor(java.lang.String color) {
    this.color = color;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_sst_map_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_sst_mapEntry_value_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_sst_listEntry_value_listVar_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_sst_map_var.release();
    _jspx_tagPool_sst_mapEntry_value_key_nobody.release();
    _jspx_tagPool_sst_listEntry_value_listVar_nobody.release();
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
    if( getColor() != null ) {
      _jspx_page_context.setAttribute("color", getColor());
}

    try {
      if (_jspx_meth_sst_map_0(_jspx_page_context))
        return;
      if (_jspx_meth_sst_listEntry_0(_jspx_page_context))
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

  private boolean _jspx_meth_sst_map_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:map
    com.serotonin.web.taglib.MapTag _jspx_th_sst_map_0 = (com.serotonin.web.taglib.MapTag) _jspx_tagPool_sst_map_var.get(com.serotonin.web.taglib.MapTag.class);
    _jspx_th_sst_map_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_map_0.setParent(null);
    _jspx_th_sst_map_0.setVar("pointMap");
    int _jspx_eval_sst_map_0 = _jspx_th_sst_map_0.doStartTag();
    if (_jspx_eval_sst_map_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_sst_mapEntry_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_map_0, _jspx_page_context))
          return true;
        if (_jspx_meth_sst_mapEntry_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_map_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_sst_map_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_map_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_map_var.reuse(_jspx_th_sst_map_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_map_var.reuse(_jspx_th_sst_map_0);
    return false;
  }

  private boolean _jspx_meth_sst_mapEntry_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_map_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:mapEntry
    com.serotonin.web.taglib.MapEntryTag _jspx_th_sst_mapEntry_0 = (com.serotonin.web.taglib.MapEntryTag) _jspx_tagPool_sst_mapEntry_value_key_nobody.get(com.serotonin.web.taglib.MapEntryTag.class);
    _jspx_th_sst_mapEntry_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_mapEntry_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_map_0);
    _jspx_th_sst_mapEntry_0.setKey("xid");
    _jspx_th_sst_mapEntry_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${xid}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_sst_mapEntry_0 = _jspx_th_sst_mapEntry_0.doStartTag();
    if (_jspx_th_sst_mapEntry_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_mapEntry_value_key_nobody.reuse(_jspx_th_sst_mapEntry_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_mapEntry_value_key_nobody.reuse(_jspx_th_sst_mapEntry_0);
    return false;
  }

  private boolean _jspx_meth_sst_mapEntry_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_map_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:mapEntry
    com.serotonin.web.taglib.MapEntryTag _jspx_th_sst_mapEntry_1 = (com.serotonin.web.taglib.MapEntryTag) _jspx_tagPool_sst_mapEntry_value_key_nobody.get(com.serotonin.web.taglib.MapEntryTag.class);
    _jspx_th_sst_mapEntry_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_mapEntry_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_map_0);
    _jspx_th_sst_mapEntry_1.setKey("color");
    _jspx_th_sst_mapEntry_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_sst_mapEntry_1 = _jspx_th_sst_mapEntry_1.doStartTag();
    if (_jspx_th_sst_mapEntry_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_mapEntry_value_key_nobody.reuse(_jspx_th_sst_mapEntry_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_mapEntry_value_key_nobody.reuse(_jspx_th_sst_mapEntry_1);
    return false;
  }

  private boolean _jspx_meth_sst_listEntry_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:listEntry
    com.serotonin.web.taglib.ListEntryTag _jspx_th_sst_listEntry_0 = (com.serotonin.web.taglib.ListEntryTag) _jspx_tagPool_sst_listEntry_value_listVar_nobody.get(com.serotonin.web.taglib.ListEntryTag.class);
    _jspx_th_sst_listEntry_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_listEntry_0.setParent(null);
    _jspx_th_sst_listEntry_0.setListVar("chartPointList");
    _jspx_th_sst_listEntry_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pointMap}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_sst_listEntry_0 = _jspx_th_sst_listEntry_0.doStartTag();
    if (_jspx_th_sst_listEntry_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_listEntry_value_listVar_nobody.reuse(_jspx_th_sst_listEntry_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_listEntry_value_listVar_nobody.reuse(_jspx_th_sst_listEntry_0);
    return false;
  }
}
