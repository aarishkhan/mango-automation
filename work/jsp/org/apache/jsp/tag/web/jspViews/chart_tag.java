package org.apache.jsp.tag.web.jspViews;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart_tag
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_list_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jviews_chart_width_height_durationType_duration;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_jviews_chartPoint_xid_color_nobody;

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
  private java.lang.Integer duration;
  private java.lang.String durationType;
  private java.lang.Integer width;
  private java.lang.Integer height;

  public java.lang.Integer getDuration() {
    return this.duration;
  }

  public void setDuration(java.lang.Integer duration) {
    this.duration = duration;
  }

  public java.lang.String getDurationType() {
    return this.durationType;
  }

  public void setDurationType(java.lang.String durationType) {
    this.durationType = durationType;
  }

  public java.lang.Integer getWidth() {
    return this.width;
  }

  public void setWidth(java.lang.Integer width) {
    this.width = width;
  }

  public java.lang.Integer getHeight() {
    return this.height;
  }

  public void setHeight(java.lang.Integer height) {
    this.height = height;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_sst_list_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_jviews_chart_width_height_durationType_duration = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_jviews_chartPoint_xid_color_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_sst_list_var_nobody.release();
    _jspx_tagPool_jviews_chart_width_height_durationType_duration.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_jviews_chartPoint_xid_color_nobody.release();
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
    if( getDuration() != null ) {
      _jspx_page_context.setAttribute("duration", getDuration());
}
    if( getDurationType() != null ) {
      _jspx_page_context.setAttribute("durationType", getDurationType());
}
    if( getWidth() != null ) {
      _jspx_page_context.setAttribute("width", getWidth());
}
    if( getHeight() != null ) {
      _jspx_page_context.setAttribute("height", getHeight());
}

    try {
      if (_jspx_meth_sst_list_0(_jspx_page_context))
        return;
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      if (_jspx_meth_jviews_chart_0(_jspx_page_context))
        return;
      out.write("<img id=\"c");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\" src=\"images/hourglass.png\"/>");
      out.write("<script type=\"text/javascript\">\n  mango.view.jsp.functions[\"c");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"] = function(value) { $(\"c");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${componentId}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\").src = value; }\n</script>");
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

  private boolean _jspx_meth_sst_list_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:list
    com.serotonin.web.taglib.ListTag _jspx_th_sst_list_0 = (com.serotonin.web.taglib.ListTag) _jspx_tagPool_sst_list_var_nobody.get(com.serotonin.web.taglib.ListTag.class);
    _jspx_th_sst_list_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_list_0.setParent(null);
    _jspx_th_sst_list_0.setVar("chartPointList");
    int _jspx_eval_sst_list_0 = _jspx_th_sst_list_0.doStartTag();
    if (_jspx_th_sst_list_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_list_var_nobody.reuse(_jspx_th_sst_list_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_list_var_nobody.reuse(_jspx_th_sst_list_0);
    return false;
  }

  private boolean _jspx_meth_jviews_chart_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  jviews:chart
    com.serotonin.m2m2.jviews.taglib.ChartTag _jspx_th_jviews_chart_0 = (com.serotonin.m2m2.jviews.taglib.ChartTag) _jspx_tagPool_jviews_chart_width_height_durationType_duration.get(com.serotonin.m2m2.jviews.taglib.ChartTag.class);
    _jspx_th_jviews_chart_0.setPageContext(_jspx_page_context);
    _jspx_th_jviews_chart_0.setParent(null);
    _jspx_th_jviews_chart_0.setDuration(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${duration}", java.lang.Integer.class, (PageContext)this.getJspContext(), null)).intValue());
    _jspx_th_jviews_chart_0.setDurationType((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${durationType}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_jviews_chart_0.setWidth(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${width}", java.lang.Integer.class, (PageContext)this.getJspContext(), null)).intValue());
    _jspx_th_jviews_chart_0.setHeight(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${height}", java.lang.Integer.class, (PageContext)this.getJspContext(), null)).intValue());
    int _jspx_eval_jviews_chart_0 = _jspx_th_jviews_chart_0.doStartTag();
    if (_jspx_eval_jviews_chart_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_jviews_chart_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_jviews_chart_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_jviews_chart_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jviews_chart_width_height_durationType_duration.reuse(_jspx_th_jviews_chart_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_jviews_chart_width_height_durationType_duration.reuse(_jspx_th_jviews_chart_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_jviews_chart_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_jviews_chart_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chartPointList}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_0.setVar("chartPoint");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_jviews_chartPoint_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_jviews_chartPoint_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  jviews:chartPoint
    com.serotonin.m2m2.jviews.taglib.ChartPointTag _jspx_th_jviews_chartPoint_0 = (com.serotonin.m2m2.jviews.taglib.ChartPointTag) _jspx_tagPool_jviews_chartPoint_xid_color_nobody.get(com.serotonin.m2m2.jviews.taglib.ChartPointTag.class);
    _jspx_th_jviews_chartPoint_0.setPageContext(_jspx_page_context);
    _jspx_th_jviews_chartPoint_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_jviews_chartPoint_0.setXid((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chartPoint.xid}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_jviews_chartPoint_0.setColor((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chartPoint.color}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_jviews_chartPoint_0 = _jspx_th_jviews_chartPoint_0.doStartTag();
    if (_jspx_th_jviews_chartPoint_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_jviews_chartPoint_xid_color_nobody.reuse(_jspx_th_jviews_chartPoint_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_jviews_chartPoint_xid_color_nobody.reuse(_jspx_th_jviews_chartPoint_0);
    return false;
  }
}
