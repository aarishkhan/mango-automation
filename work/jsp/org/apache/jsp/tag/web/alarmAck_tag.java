package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alarmAck_tag
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
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
  private com.serotonin.m2m2.rt.event.EventInstance event;

  public com.serotonin.m2m2.rt.event.EventInstance getEvent() {
    return this.event;
  }

  public void setEvent(com.serotonin.m2m2.rt.event.EventInstance event) {
    this.event = event;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
    if( getEvent() != null ) {
      _jspx_page_context.setAttribute("event", getEvent());
}

    try {
      if (_jspx_meth_c_if_0(_jspx_page_context))
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.userNotified}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n  ");
        if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write('\n');
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

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.acknowledged}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
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

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_th_c_when_0);
    _jspx_th_tag_img_0.setPng("tick_off");
    _jspx_th_tag_img_0.setTitle("events.acknowledged");
    _jspx_th_tag_img_0.setStyle("display:inline;");
    _jspx_th_tag_img_0.doTag();
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
        out.write("\n      ");
        if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n      ");
        if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n    ");
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

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_th_c_otherwise_0);
    _jspx_th_tag_img_1.setPng("tick");
    _jspx_th_tag_img_1.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("ackImg${event.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_img_1.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("ackEvent(${event.id})", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_img_1.setTitle("events.acknowledge");
    _jspx_th_tag_img_1.setStyle("display:inline;");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n      ");
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

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${event.silenced}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n          ");
        if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n        ");
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

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_th_c_when_1);
    _jspx_th_tag_img_2.setPng("sound_mute");
    _jspx_th_tag_img_2.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("silenceImg${event.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_img_2.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("toggleSilence(${event.id})", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_img_2.setTitle("events.unsilence");
    _jspx_th_tag_img_2.setStyle("display:inline;");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n          ");
        if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n        ");
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

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_th_c_otherwise_1);
    _jspx_th_tag_img_3.setPng("sound_none");
    _jspx_th_tag_img_3.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("silenceImg${event.id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_img_3.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("toggleSilence(${event.id})", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_img_3.setTitle("events.silence");
    _jspx_th_tag_img_3.setStyle("display:inline;");
    _jspx_th_tag_img_3.doTag();
    return false;
  }
}
