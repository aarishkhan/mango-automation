package org.apache.jsp.tag.web.graphicalViews;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pointComponent_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

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
  private com.serotonin.m2m2.gviews.component.ViewComponent vc;

  public com.serotonin.m2m2.gviews.component.ViewComponent getVc() {
    return this.vc;
  }

  public void setVc(com.serotonin.m2m2.gviews.component.ViewComponent vc) {
    this.vc = vc;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
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
    if( getVc() != null ) {
      _jspx_page_context.setAttribute("vc", getVc());
}

    try {
      out.write('\n');
      if (_jspx_meth_c_choose_0(_jspx_page_context))
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
        out.write("\n  ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n  ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n  ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\n');
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.pointComponent && !vc.visible}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<!-- vc ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write(" not a point component or not visible -->");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.pointComponent}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\" style=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.style}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\"\n            ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write(">\n      <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Content\"><img src=\"images/icon_comp.png\" alt=\"\"/></div>\n      ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n      <div style=\"position:absolute;left:-16px;top:0px;z-index:1;\">\n        <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Warning\" style=\"display:none;\" onmouseover=\"showMenu('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Messages', 16, 0);\"\n                onmouseout=\"hideLayer('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Messages');\">\n          ");
        if (_jspx_meth_tag_img_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n          <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Messages\" onmouseout=\"hideLayer(this);\" class=\"controlContent\"></div>\n        </div>\n        <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Changing\" style=\"display:none;\">");
        if (_jspx_meth_tag_img_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("</div>\n      </div>\n    </div>\n  ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.displayControls}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("onmouseover=\"vcOver('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("');\" onmouseout=\"vcOut('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("');\"");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.displayControls}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Controls\" class=\"controlsDiv\">\n          <table cellpadding=\"0\" cellspacing=\"1\">\n            <tr onmouseover=\"showMenu('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info', 16, 0);\" onmouseout=\"hideLayer('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info');\"><td>\n              ");
        if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n              <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Info\" onmouseout=\"hideLayer(this);\">\n                ");
        if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n              </div>\n            </td></tr>\n            ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n          </table>\n        </div>\n      ");
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

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_img_0.setPng("information");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_img_1.setPng("hourglass");
    _jspx_th_tag_img_1.setTitle("common.gettingData");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.settable}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              <tr id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("ChangeMin\" onmouseout=\"mango.view.hideChange('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Change');\"\n                      onmouseover=\"mango.view.showChange('c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Change', 16, 0);\"><td>\n                <img src=\"images/icon_edit.png\" alt=\"\"/>\n                <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Change\" onmouseout=\"hideLayer(this);\">\n                  ");
        if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n                </div>\n              </td></tr>\n            ");
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

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_th_c_if_2);
    _jspx_th_tag_img_2.setPng("hourglass");
    _jspx_th_tag_img_2.setTitle("common.gettingData");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.chartRenderer}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              <tr onmouseover=\"mango.view.showChart('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', event, this);\"\n                      onmouseout=\"mango.view.hideChart('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("', event, this);\"><td>\n                <img src=\"images/icon_chart.png\" alt=\"\"/>\n                <div id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("ChartLayer\"></div>\n                <textarea style=\"display:none;\" id=\"c");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("Chart\">");
        if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("</textarea>\n              </td></tr>\n            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_img_3.setPng("hourglass");
    _jspx_th_tag_img_3.setTitle("common.gettingData");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_4 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_4      );
    }
    _jspx_th_tag_img_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_4.setParent(_jspx_th_c_when_1);
    _jspx_th_tag_img_4.setPng("warn");
    _jspx_th_tag_img_4.setTitle("common.warning");
    _jspx_th_tag_img_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_5 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_5      );
    }
    _jspx_th_tag_img_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_5.setParent(_jspx_th_c_when_1);
    _jspx_th_tag_img_5.setPng("icon_edit");
    _jspx_th_tag_img_5.setTitle("common.settingValue");
    _jspx_th_tag_img_5.doTag();
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
        out.write("\n    <div style=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.style}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc.staticContent}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("</div>\n  ");
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
}
