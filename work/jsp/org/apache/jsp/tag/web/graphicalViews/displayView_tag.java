package org.apache.jsp.tag.web.graphicalViews;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class displayView_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/graphicalViews/pointComponent.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

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
  private com.serotonin.m2m2.gviews.GraphicalView view;
  private java.lang.String emptyMessageKey;

  public com.serotonin.m2m2.gviews.GraphicalView getView() {
    return this.view;
  }

  public void setView(com.serotonin.m2m2.gviews.GraphicalView view) {
    this.view = view;
  }

  public java.lang.String getEmptyMessageKey() {
    return this.emptyMessageKey;
  }

  public void setEmptyMessageKey(java.lang.String emptyMessageKey) {
    this.emptyMessageKey = emptyMessageKey;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_set_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_nobody.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_c_if_test.release();
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
    if( getView() != null ) {
      _jspx_page_context.setAttribute("view", getView());
}
    if( getEmptyMessageKey() != null ) {
      _jspx_page_context.setAttribute("emptyMessageKey", getEmptyMessageKey());
}

    try {
      out.write("\n<div id=\"viewContent\">\n  ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n  \n  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n</div>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n  ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty view}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_fmt_message_0.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emptyMessageKey}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty view.backgroundFilename}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n      <img id=\"viewBackground\" src=\"images/spacer.gif\" alt=\"\" width=\"740\" height=\"500\"/>\n    ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n      <img id=\"viewBackground\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.backgroundFilename}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\" alt=\"\"/>\n    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.viewComponents}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_0.setVar("vc");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n    <!-- vc ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write(" -->\n    ");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n  ");
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

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n      ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n      \n      ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n      \n      ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n      \n      ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n      \n      ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!vc.visible}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!-- vc ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write(" not visible -->");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.defName == 'simpleCompound'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\" style=\"position:absolute;left:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.x}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("px;top:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.y}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("px;\"\n                  onmouseover=\"vcOver('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', 5);\" onmouseout=\"vcOut('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("');\">\n          ");
        if (_jspx_meth_views_pointComponent_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n          ");
        if (_jspx_meth_c_choose_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n          <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Controls\" class=\"controlContent\" style=\"left:5px;top:5px;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bkgd}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\">\n            <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.name}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("</b><br/>\n            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n          </div>\n        </div>\n      ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_views_pointComponent_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  views:pointComponent
    org.apache.jsp.tag.web.graphicalViews.pointComponent_tag _jspx_th_views_pointComponent_0 = new org.apache.jsp.tag.web.graphicalViews.pointComponent_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_views_pointComponent_0      );
    }
    _jspx_th_views_pointComponent_0.setJspContext(_jspx_page_context);
    _jspx_th_views_pointComponent_0.setParent(_jspx_th_c_when_3);
    _jspx_th_views_pointComponent_0.setVc((com.serotonin.m2m2.gviews.component.ViewComponent) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.leadComponent}", com.serotonin.m2m2.gviews.component.ViewComponent.class, (PageContext)this.getJspContext(), null));
    _jspx_th_views_pointComponent_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n            ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n          ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty vc.backgroundColour}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_set_0.setVar("bkgd");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_nobody.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_set_1.setVar("bkgd");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_c_set_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_1.doInitBody();
      }
      do {
        out.write("background:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.backgroundColour}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write(';');
        int evalDoAfterBody = _jspx_th_c_set_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.childComponents}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_1.setVar("child");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n              ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${child.viewComponent.visible && child.viewComponent.id != vc.leadComponent.id}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                ");
        if (_jspx_meth_views_pointComponent_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\n              ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_views_pointComponent_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  views:pointComponent
    org.apache.jsp.tag.web.graphicalViews.pointComponent_tag _jspx_th_views_pointComponent_1 = new org.apache.jsp.tag.web.graphicalViews.pointComponent_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_views_pointComponent_1      );
    }
    _jspx_th_views_pointComponent_1.setJspContext(_jspx_page_context);
    _jspx_th_views_pointComponent_1.setParent(_jspx_th_c_if_0);
    _jspx_th_views_pointComponent_1.setVc((com.serotonin.m2m2.gviews.component.ViewComponent) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${child.viewComponent}", com.serotonin.m2m2.gviews.component.ViewComponent.class, (PageContext)this.getJspContext(), null));
    _jspx_th_views_pointComponent_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.defName == 'imageChart'}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\" style=\"position:absolute;left:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.x}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("px;top:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.y}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("px;\"\n                  onmouseover=\"vcOver('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', 10);\" onmouseout=\"vcOut('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("');\">\n          <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Content\"><img src=\"images/icon_comp.png\" alt=\"\"/></div>\n          <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Controls\" class=\"controlContent\">\n            <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info\">\n              ");
        if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n            </div>\n          </div>\n        </div>\n      ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_th_c_when_5);
    _jspx_th_tag_img_0.setPng("hourglass");
    _jspx_th_tag_img_0.setTitle("common.gettingData");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.compoundComponent}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\" style=\"position:absolute;left:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.x}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("px;top:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.y}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("px;\"\n                  onmouseover=\"vcOver('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', 5);\" onmouseout=\"vcOut('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("');\">\n          ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.staticContent}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\n          <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Controls\" class=\"controlsDiv\">\n            <table cellpadding=\"0\" cellspacing=\"1\">\n              <tr onmouseover=\"showMenu('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info', 16, 0);\" onmouseout=\"hideLayer('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info');\"><td>\n                ");
        if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n                <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info\" onmouseout=\"hideLayer(this);\">\n                  ");
        if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n                </div>\n              </td></tr>\n              ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n            </table>\n          </div>\n          ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\n        </div>\n      ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_th_c_when_6);
    _jspx_th_tag_img_1.setPng("information");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_th_c_when_6);
    _jspx_th_tag_img_2.setPng("hourglass");
    _jspx_th_tag_img_2.setTitle("common.gettingData");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.displayImageChart}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                <tr onmouseover=\"mango.view.showChart('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', event, this);\" \n                        onmouseout=\"mango.view.hideChart('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', event, this);\"><td>\n                  <img src=\"images/icon_chart.png\" alt=\"\"/>\n                  <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("ChartLayer\"></div>\n                  <textarea style=\"display:none;\" id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Chart\">");
        if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("</textarea>\n                </td></tr>\n              ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_img_3.setPng("hourglass");
    _jspx_th_tag_img_3.setTitle("common.gettingData");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.childComponents}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_2.setVar("child");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n          ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${child.viewComponent.visible}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_views_pointComponent_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_views_pointComponent_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  views:pointComponent
    org.apache.jsp.tag.web.graphicalViews.pointComponent_tag _jspx_th_views_pointComponent_2 = new org.apache.jsp.tag.web.graphicalViews.pointComponent_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_views_pointComponent_2      );
    }
    _jspx_th_views_pointComponent_2.setJspContext(_jspx_page_context);
    _jspx_th_views_pointComponent_2.setParent(_jspx_th_c_if_2);
    _jspx_th_views_pointComponent_2.setVc((com.serotonin.m2m2.gviews.component.ViewComponent) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${child.viewComponent}", com.serotonin.m2m2.gviews.component.ViewComponent.class, (PageContext)this.getJspContext(), null));
    _jspx_th_views_pointComponent_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_views_pointComponent_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_2, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_views_pointComponent_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  views:pointComponent
    org.apache.jsp.tag.web.graphicalViews.pointComponent_tag _jspx_th_views_pointComponent_3 = new org.apache.jsp.tag.web.graphicalViews.pointComponent_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_views_pointComponent_3      );
    }
    _jspx_th_views_pointComponent_3.setJspContext(_jspx_page_context);
    _jspx_th_views_pointComponent_3.setParent(_jspx_th_c_otherwise_2);
    _jspx_th_views_pointComponent_3.setVc((com.serotonin.m2m2.gviews.component.ViewComponent) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc}", com.serotonin.m2m2.gviews.component.ViewComponent.class, (PageContext)this.getJspContext(), null));
    _jspx_th_views_pointComponent_3.doTag();
    return false;
  }
}
