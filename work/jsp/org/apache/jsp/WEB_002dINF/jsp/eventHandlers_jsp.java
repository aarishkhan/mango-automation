package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.module.EventTypeDefinition;
import com.serotonin.m2m2.module.ModuleRegistry;
import com.serotonin.m2m2.Common;
import com.serotonin.m2m2.vo.event.EventHandlerVO;
import com.serotonin.m2m2.DataTypes;

public final class eventHandlers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(8);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
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

      out.write("\n\n\n");
      out.write("\n\n\n\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("NEW_ID");
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_set_0.doInitBody();
        }
        do {
          out.print( Common.NEW_ID );
          int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      out.write('\n');
      out.write('\n');
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_page_0        );
      }
      _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_page_0.setShowHeader((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.showHeader}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_tag_page_0.setShowToolbar((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.showToolbar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_tag_page_0.setDwr("EventHandlersDwr");
      _jspx_th_tag_page_0.setJs("/resources/emailRecipients.js");
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new eventHandlers_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null);
      _jspx_th_tag_page_0.setStyles(_jspx_temp0);
      _jspx_th_tag_page_0.setJspBody(new eventHandlers_jspHelper( 1, _jspx_page_context, _jspx_th_tag_page_0, null));
      _jspx_th_tag_page_0.doTag();
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty param.ehid}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n              defaultHandlerId = ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.ehid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(";\n            ");
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

  private boolean _jspx_meth_m2m2_translate_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_0 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_0.setKey("eventHandlers.recipTestEmailMessage");
    _jspx_th_m2m2_translate_0.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_0 = _jspx_th_m2m2_translate_0.doStartTag();
    if (_jspx_th_m2m2_translate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_0);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_1 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_1.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_1.setKey("eventHandlers.emailRecipients");
    _jspx_th_m2m2_translate_1.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_1 = _jspx_th_m2m2_translate_1.doStartTag();
    if (_jspx_th_m2m2_translate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_1);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_2 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_2.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_2.setKey("eventHandlers.escalTestEmailMessage");
    _jspx_th_m2m2_translate_2.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_2 = _jspx_th_m2m2_translate_2.doStartTag();
    if (_jspx_th_m2m2_translate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_2);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_3 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_3.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_3.setKey("eventHandlers.escalRecipients");
    _jspx_th_m2m2_translate_3.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_3 = _jspx_th_m2m2_translate_3.doStartTag();
    if (_jspx_th_m2m2_translate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_3);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_4 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_4.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_4.setKey("eventHandlers.inactiveTestEmailMessage");
    _jspx_th_m2m2_translate_4.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_4 = _jspx_th_m2m2_translate_4.doStartTag();
    if (_jspx_th_m2m2_translate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_4);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_5 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_5.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_5.setKey("eventHandlers.inactiveRecipients");
    _jspx_th_m2m2_translate_5.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_5 = _jspx_th_m2m2_translate_5.doStartTag();
    if (_jspx_th_m2m2_translate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("eventHandlers.pointEventDetector");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_1.setKey("eventHandlers.dataSourceEvents");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_2.setKey("eventHandlers.publisherEvents");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_3.setKey("eventHandlers.systemEvents");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_4.setKey("eventHandlers.auditEvents");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_5.setKey("eventHandlers.saved");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_parent);
    _jspx_th_tag_img_0.setPng("cog");
    _jspx_th_tag_img_0.setTitle("eventHandlers.eventHandlers");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_6.setKey("eventHandlers.eventHandlers");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_tag_help_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setParent(_jspx_parent);
    _jspx_th_tag_help_0.setId("eventHandlers");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_7.setKey("eventHandlers.types");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_8.setKey("eventHandlers.eventHandler");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_parent);
    _jspx_th_tag_img_1.setId("deleteImg");
    _jspx_th_tag_img_1.setPng("delete");
    _jspx_th_tag_img_1.setTitle("common.delete");
    _jspx_th_tag_img_1.setOnclick("deleteHandler();");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_parent);
    _jspx_th_tag_img_2.setId("saveImg");
    _jspx_th_tag_img_2.setPng("save");
    _jspx_th_tag_img_2.setTitle("common.save");
    _jspx_th_tag_img_2.setOnclick("saveHandler();");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_9.setKey("eventHandlers.type");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_10.setKey("eventHandlers.type.email");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_11.setKey("eventHandlers.type.setPoint");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_12.setKey("eventHandlers.type.process");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_parent);
    _jspx_th_tag_img_3.setId("handler1Img");
    _jspx_th_tag_img_3.setPng("cog_wrench");
    _jspx_th_tag_img_3.setTitle("eventHandlers.type.setPointHandler");
    _jspx_th_tag_img_3.setStyle("display:none;");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_4 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_4      );
    }
    _jspx_th_tag_img_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_4.setParent(_jspx_parent);
    _jspx_th_tag_img_4.setId("handler2Img");
    _jspx_th_tag_img_4.setPng("cog_email");
    _jspx_th_tag_img_4.setTitle("eventHandlers.type.emailHandler");
    _jspx_th_tag_img_4.setStyle("display:none;");
    _jspx_th_tag_img_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_5 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_5      );
    }
    _jspx_th_tag_img_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_5.setParent(_jspx_parent);
    _jspx_th_tag_img_5.setId("handler3Img");
    _jspx_th_tag_img_5.setPng("cog_process");
    _jspx_th_tag_img_5.setTitle("eventHandlers.type.processHandler");
    _jspx_th_tag_img_5.setStyle("display:none;");
    _jspx_th_tag_img_5.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_13.setKey("common.xid");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_14.setKey("eventHandlers.alias");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_15.setKey("common.disabled");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_16.setKey("eventHandlers.target");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_17.setKey("eventHandlers.activeAction");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_18.setKey("eventHandlers.action.none");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_19.setKey("eventHandlers.action.point");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_20.setKey("eventHandlers.action.static");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_21.setKey("eventHandlers.sourcePoint");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_22.setKey("eventHandlers.valueToSet");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_23.setKey("eventHandlers.inactiveAction");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_24.setKey("eventHandlers.action.none");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_25.setKey("eventHandlers.action.point");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_26.setKey("eventHandlers.action.static");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_27.setKey("eventHandlers.sourcePoint");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_28.setKey("eventHandlers.valueToSet");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_29.setKey("eventHandlers.escal");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_30.setKey("eventHandlers.escalPeriod");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_0 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_0      );
    }
    _jspx_th_tag_timePeriods_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_0.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_0.setId("escalationDelayType");
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_31.setKey("eventHandlers.inactiveNotif");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_32.setKey("eventHandlers.inactiveOverride");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_33.setKey("eventHandlers.activeCommand");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_tag_img_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_6 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_6      );
    }
    _jspx_th_tag_img_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_6.setParent(_jspx_parent);
    _jspx_th_tag_img_6.setPng("cog_go");
    _jspx_th_tag_img_6.setOnclick("testProcessCommand(true)");
    _jspx_th_tag_img_6.setTitle("eventHandlers.commandTest.title");
    _jspx_th_tag_img_6.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_34.setKey("eventHandlers.activeTimeout");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_35.setKey("eventHandlers.inactiveCommand");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }

  private boolean _jspx_meth_tag_img_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_7 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_7      );
    }
    _jspx_th_tag_img_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_7.setParent(_jspx_parent);
    _jspx_th_tag_img_7.setPng("cog_go");
    _jspx_th_tag_img_7.setOnclick("testProcessCommand(false)");
    _jspx_th_tag_img_7.setTitle("eventHandlers.commandTest.title");
    _jspx_th_tag_img_7.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_36(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_36.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_36.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_36.setKey("eventHandlers.inactiveTimeout");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private class eventHandlers_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public eventHandlers_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<style>\n    html > body .dijitTreeNodeLabelSelected { background-color: inherit; color: inherit; }\n    .dijitTreeIcon { display: none; }\n  </style>");
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <script>\n    dojo.require(\"dijit.Tree\");\n    dojo.require(\"dijit.tree.TreeStoreModel\");\n    dojo.require(\"dojo.data.ItemFileWriteStore\");\n    dojo.require(\"dojo.store.Memory\");\n    dojo.require(\"dijit.form.FilteringSelect\");\n    \n    var allPoints;\n    var defaultHandlerId;\n    var emailRecipients;\n    var escalRecipients;\n    var inactiveRecipients;\n    var store;\n    var targetPointSelector,activePointSelector,inactivePointSelector;\n    \n    // Define a convenience function for unwrapping values in the store.\n    function $$(item, attr, value) {\n        if (typeof(value) == \"undefined\")\n            // Get\n            return store.getValue(item, attr);\n        // Set\n        item[attr][0] = value;\n    };\n    var tree;\n    \n    dojo.ready(function() {\n        EventHandlersDwr.getInitData(function(data) {\n            ");
      if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            \n            var i, j, k;\n            var dp, ds, p, et;\n            var pointNode, dataSourceNode, publisherNode, etNode, wid;\n            \n            allPoints = data.allPoints;\n            \n            //Create the filtering Selects for the points\n            targetPointSelector = new dijit.form.FilteringSelect({\n                store: null,\n                searchAttr: \"name\",                  \n                autoComplete: false,\n                style: \"width: 100%\",\n                highlightMatch: \"all\",\n                queryExpr: \"*${0}*\",\n                onChange: function(point) {\n                    if (this.item) {\n                    \ttargetPointSelectChanged();\n                    }\n                },\n                required: true\n            }, \"targetPointSelect\");\n            activePointSelector = new dijit.form.FilteringSelect({\n                store: null,\n                searchAttr: \"name\",                  \n                autoComplete: false,\n                style: \"width: 100%\",\n");
      out.write("                highlightMatch: \"all\",\n                queryExpr: \"*${0}*\",\n                required: true\n            }, \"activePointId\");\n            inactivePointSelector = new dijit.form.FilteringSelect({\n                store: null,\n                searchAttr: \"name\",                  \n                autoComplete: false,\n                style: \"width: 100%\",\n                highlightMatch: \"all\",\n                queryExpr: \"*${0}*\",\n                required: true\n            }, \"inactivePointId\");            \n            \n            emailRecipients = new mango.erecip.EmailRecipients(\"emailRecipients\",\n                    \"");
      if (_jspx_meth_m2m2_translate_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\",\n                    data.mailingLists, data.users);\n            emailRecipients.write(\"emailRecipients\", \"emailRecipients\", null,\n                    \"");
      if (_jspx_meth_m2m2_translate_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n            \n            escalRecipients = new mango.erecip.EmailRecipients(\"escalRecipients\",\n                    \"");
      if (_jspx_meth_m2m2_translate_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\",\n                    data.mailingLists, data.users);\n            escalRecipients.write(\"escalRecipients\", \"escalRecipients\", \"escalationAddresses2\",\n                    \"");
      if (_jspx_meth_m2m2_translate_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n            \n            inactiveRecipients = new mango.erecip.EmailRecipients(\"inactiveRecipients\",\n                    \"");
      if (_jspx_meth_m2m2_translate_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\",\n                    data.mailingLists, data.users);\n            inactiveRecipients.write(\"inactiveRecipients\", \"inactiveRecipients\", \"inactiveAddresses2\",\n                    \"");
      if (_jspx_meth_m2m2_translate_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n            \n            var storeItems = [];\n            \n            //\n            // Point event detectors\n            var pedRoot = {\n                    name: '<img src=\"images/bell.png\"/> ");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("',\n                    children: []\n            };\n            storeItems.push(pedRoot);\n            \n            for (i=0; i<data.dataPoints.length; i++) {\n                dp = makeNonTreeItem(data.dataPoints[i]);\n                var pointNode = { name: \"<img src='images/icon_comp.png'/> \"+ dp.name, object: dp };\n                pedRoot.children.push(pointNode);\n                \n                for (j=0; j<dp.eventTypes.length; j++) {\n                    et = dp.eventTypes[j];\n                    createEventTypeNode(\"ped\"+ et.typeRef2, et, pointNode);\n                }\n            }\n            \n            //\n            // Data source events\n            var dataSourceRoot = {\n                    name: '");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("',\n                    children: []\n            };\n            storeItems.push(dataSourceRoot);\n            \n            for (i=0; i<data.dataSources.length; i++) {\n                ds = makeNonTreeItem(data.dataSources[i]);\n                var dataSourceNode = { name: \"<img src='images/icon_ds.png'/> \"+ ds.name, object: ds };\n                dataSourceRoot.children.push(dataSourceNode);\n                \n                for (j=0; j<ds.eventTypes.length; j++) {\n                    et = ds.eventTypes[j];\n                    createEventTypeNode(\"dse\"+ et.typeRef1 +\"/\"+ et.typeRef2, et, dataSourceNode);\n                }\n            }\n            \n            //\n            // User-accessible module-defined events.\n            if (data.userEventTypes) {\n                for (type in data.userEventTypes) {\n                    var info = data.userEventTypes[type];\n                    \n                    var name = info.description;\n                    if (info.iconPath)\n                        name = '<img src=\"'+ info.iconPath +'\"/> '+ name;\n");
      out.write("                    \n                    var etRoot = { name: name, children: [] };\n                    storeItems.push(etRoot);\n                    \n                    for (i=0; i<info.vos.length; i++) {\n                        et = info.vos[i];\n                        createEventTypeNode(type +\"/\"+ et.subtype +\"/\"+ et.typeRef1 +\"/\"+ et.typeRef2, et, etRoot);\n                    }\n                }\n            }\n            \n            //\n            // Publisher events\n            if (data.publishers) {\n                var publisherRoot = {\n                        name: '");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("',\n                        children: []\n                };\n                storeItems.push(publisherRoot);\n                \n                for (i=0; i<data.publishers.length; i++) {\n                    p = makeNonTreeItem(data.publishers[i]);\n                    var publisherNode = { name: \"<img src='images/transmit.png'/> \"+ p.name, object: p  };\n                    publisherRoot.children.push(publisherNode);\n                    \n                    for (j=0; j<p.eventTypes.length; j++) {\n                        et = p.eventTypes[j];\n                        createEventTypeNode(\"pube\"+ et.typeRef1 +\"/\"+ et.typeRef2, et, publisherNode);\n                    }\n                }\n            }\n            \n            //\n            // System events\n            if (data.systemEvents) {\n                var systemRoot = {\n                        name: '");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("',\n                        children: []\n                };\n                storeItems.push(systemRoot);\n                \n                for (i=0; i<data.systemEvents.length; i++) {\n                    et = data.systemEvents[i];\n                    //createEventTypeNode(\"sys\"+ et.typeRef1, et, systemRoot);\n                    createEventTypeNode(\"sys\"+ et.subtype, et, systemRoot);\n                }\n            }\n            \n            //\n            // Audit events\n            if (data.auditEvents) {\n                var auditRoot = {\n                        name: '");
      if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("',\n                        children: []\n                };\n                storeItems.push(auditRoot);\n                \n                for (i=0; i<data.auditEvents.length; i++) {\n                    et = data.auditEvents[i];\n                    //createEventTypeNode(\"aud\"+ et.typeRef1, et, auditRoot);\n                    createEventTypeNode(\"aud\"+ et.subtype, et, auditRoot);\n                }\n            }\n            \n            //\n            // Admin-accessible module-defined events.\n            if (data.adminEventTypes) {\n                for (type in data.adminEventTypes) {\n                    var info = data.adminEventTypes[type];\n                    \n                    var name = info.description;\n                    if (info.iconPath)\n                        name = '<img src=\"'+ info.iconPath +'\"/> '+ name;\n                    \n                    var etRoot = { name: name, children: [] };\n                    storeItems.push(etRoot);\n                    \n                    for (i=0; i<info.vos.length; i++) {\n");
      out.write("                        et = info.vos[i];\n                        createEventTypeNode(type +\"/\"+ et.subtype +\"/\"+ et.typeRef1 +\"/\"+ et.typeRef2, et, etRoot);\n                    }\n                }\n            }\n            \n            function createEventTypeNode(widgetId, eventType, parent) {\n                makeNonTreeItem(eventType);\n                var node = {\n                        name: \"<img id='\"+ widgetId +\"Img'/> \"+ eventType.description,\n                        rawNode: true,\n                        eventTypeNode: true,\n                        widgetId: widgetId,\n                        object: eventType\n                };\n                if (!parent.children)\n                    parent.children = [];\n                parent.children.push(node);\n                addHandlerItems(eventType.handlers, node);\n            }\n            \n            function addHandlerItems(handlers, parent) {\n                for (var i=0; i<handlers.length; i++) {\n                    if (!parent.children)\n                        parent.children = [];\n");
      out.write("                    parent.children.push(createHandlerItem(handlers[i]));\n                }\n            }\n            \n            // Create the item store\n            store = new dojo.data.ItemFileWriteStore({data: { label: 'name', items: storeItems } });\n            \n            // Create the tree.\n            tree = new dijit.Tree({\n                model: new dijit.tree.ForestStoreModel({ store: store }),\n                showRoot: false,\n                persist: false,\n                onClick: function(item, widget) {\n                    if (item.eventTypeNode) {\n                        selectedEventTypeNode = widget;\n                        selectedHandlerNode = null;\n                        showHandlerEdit();\n                    }\n                    else if (item.handlerNode) {\n                        selectedHandlerNode = widget;\n                        selectedEventTypeNode = widget.getParent();\n                        showHandlerEdit();\n                    }\n                    else\n                        hide(\"handlerEditDiv\");\n");
      out.write("                },\n                _createTreeNode: function(args){\n                    var tnode = new dijit._TreeNode(args);\n                    tnode.labelNode.innerHTML = args.label;\n                    return tnode;\n                },\n                onOpen: function(item, node) {\n                    if (item.children) {\n                        for (var i=0; i<item.children.length; i++) {\n                            var child = item.children[i];\n                            if ($$(child, \"rawNode\")) {\n                                setAlarmLevelImg($$(child, \"object\").alarmLevel, $($$(child, \"widgetId\") +\"Img\"));\n                                delete child.rawNode;\n                            }\n                        }\n                    }\n                }\n            }, \"eventTypeTree\");\n            \n            hide(\"loadingImg\");\n            show(\"tree\");\n            \n            tree._expandNode(tree.getNodesByItem(pedRoot)[0]);\n\n            // Default the selection if the parameter was provided.\n");
      out.write("            if (defaultHandlerId) {\n                var path = [];\n                function findHandler(arr) {\n                    for (var i=0; i<arr.length; i++) {\n                        var item = arr[i];\n                        var wid = $$(item, \"widgetId\");\n                        if (wid && wid.startsWith(\"handler\")) {\n                            var id = $$(item, \"object\").id;\n                            if (id == defaultHandlerId) {\n                                path.push(item);\n                                return true;\n                            }\n                        }\n                        \n                        if (item.children) {\n                            if (findHandler(item.children)) {\n                                path.push(item);\n                                return true;\n                            }\n                        }\n                    }\n                }\n                findHandler(storeItems);\n                \n                // Path is in reverse order.\n                for (var i=path.length-1; i>0; i--)\n");
      out.write("                    tree._expandNode(tree.getNodesByItem(path[i])[0]);\n                \n                selectedHandlerNode = tree.getNodesByItem(path[0])[0];\n                tree._setSelectedNodesAttr([selectedHandlerNode]);\n                tree.onClick(selectedHandlerNode.item, selectedHandlerNode);\n            }\n            defaultHandler = null;\n        });\n    });\n    \n    function createHandlerItem(handler) {\n        makeNonTreeItem(handler);\n        var img = \"images/cog_wrench.png\";\n        if (handler.handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_0.setValue( EventHandlerVO.TYPE_EMAIL );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write(")\n            img = \"images/cog_email.png\";\n        else if (handler.handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_1.setValue( EventHandlerVO.TYPE_PROCESS );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write(")\n            img = \"images/cog_process.png\";\n        var item = {\n                name: \"<img src='\"+ img +\"'/> <span id='\"+ handler.id +\"Msg'>\"+ handler.message +\"</span>\",\n                widgetId: \"handler\"+ handler.id,\n                object: handler,\n                handlerNode: true\n        };\n        return item;\n    }\n    \n    var selectedEventTypeNode;\n    var selectedHandlerNode;\n    \n    function showHandlerEdit() {\n        show(\"handlerEditDiv\");\n        setUserMessage(\"\");\n        \n        // Set the target points.\n        targetPointSelector.store = new dojo.store.Memory();\n        for (var i=0; i<allPoints.length; i++) {\n            dp = allPoints[i];\n            if (dp.settable)\n               targetPointSelector.store.put(dp);\n        }        \n//         //Default to first in list\n//         if(targetPointSelector.store.data.length > 0){\n//             //Set selection to first in list\n//             targetPointSelector.set('value',targetPointSelector.store[0].id);\n//             targetPointSelector.set('displayedValue',targetPointSelector.store[0].name);\n");
      out.write("//         }\n        \n        \n        if (selectedHandlerNode) {\n            $(\"saveImg\").src = \"images/save.png\";\n            show(\"deleteImg\");\n            \n            // Put values from the handler object into the input controls.\n            var handler = $$(selectedHandlerNode.item, \"object\");\n            $set(\"handlerTypeSelect\", handler.handlerType);\n            $(\"handlerTypeSelect\").disabled = true;\n            $set(\"xid\", handler.xid);\n            $set(\"alias\", handler.alias);\n            $set(\"disabled\", handler.disabled);\n            if (handler.handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_2.setPageContext(_jspx_page_context);
      _jspx_th_c_out_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_2.setValue( EventHandlerVO.TYPE_SET_POINT );
      int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
      if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      out.write(") {\n                targetPointSelector.set('value',handler.targetPointId);\n                $set(\"activeAction\", handler.activeAction);\n                $set(\"inactiveAction\", handler.inactiveAction);\n            }\n            else if (handler.handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_3.setPageContext(_jspx_page_context);
      _jspx_th_c_out_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_3.setValue( EventHandlerVO.TYPE_EMAIL );
      int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
      if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      out.write(") {\n                emailRecipients.updateRecipientList(handler.activeRecipients);\n                $set(\"sendEscalation\", handler.sendEscalation);\n                $set(\"escalationDelayType\", handler.escalationDelayType);\n                $set(\"escalationDelay\", handler.escalationDelay);\n                escalRecipients.updateRecipientList(handler.escalationRecipients);\n                $set(\"sendInactive\", handler.sendInactive);\n                $set(\"inactiveOverride\", handler.inactiveOverride);\n                inactiveRecipients.updateRecipientList(handler.inactiveRecipients);\n            }\n            else if (handler.handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_4.setPageContext(_jspx_page_context);
      _jspx_th_c_out_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_4.setValue( EventHandlerVO.TYPE_PROCESS );
      int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
      if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      out.write(") {\n                $set(\"activeProcessCommand\", handler.activeProcessCommand);\n                $set(\"activeProcessTimeout\", handler.activeProcessTimeout);\n                $set(\"inactiveProcessCommand\", handler.inactiveProcessCommand);\n                $set(\"inactiveProcessTimeout\", handler.inactiveProcessTimeout);\n            }\n        }\n        else {\n            $(\"saveImg\").src = \"images/save_add.png\";\n            hide(\"deleteImg\");\n            $(\"handlerTypeSelect\").disabled = false;\n            \n            // Clear values that may be left over from another handler.\n            $set(\"xid\", \"\");\n            $set(\"alias\", \"\");\n            $set(\"disabled\", false);\n            $set(\"activeAction\", ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_5.setPageContext(_jspx_page_context);
      _jspx_th_c_out_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_5.setValue( EventHandlerVO.SET_ACTION_NONE );
      int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
      if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      out.write(");\n            $set(\"inactiveAction\", ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_6.setPageContext(_jspx_page_context);
      _jspx_th_c_out_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_6.setValue( EventHandlerVO.SET_ACTION_NONE );
      int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
      if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      out.write(");\n            $set(\"sendEscalation\", false);\n            $set(\"escalationDelayType\", ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_7.setPageContext(_jspx_page_context);
      _jspx_th_c_out_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_7.setValue( Common.TimePeriods.HOURS );
      int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
      if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      out.write(");\n            $set(\"escalationDelay\", 1);\n            $set(\"sendInactive\", false);\n            $set(\"inactiveOverride\", false);\n            $set(\"activeProcessCommand\", \"\");\n            $set(\"activeProcessTimeout\", 15);\n            $set(\"inactiveProcessCommand\", \"\");\n            $set(\"inactiveProcessTimeout\", 15);\n            \n            // Clear the recipient lists.\n            emailRecipients.updateRecipientList();\n            escalRecipients.updateRecipientList();\n            inactiveRecipients.updateRecipientList();\n        }\n        \n        // Set the use source value checkbox.\n        handlerTypeChanged();\n        activeActionChanged();\n        inactiveActionChanged();\n        targetPointSelectChanged();\n        sendEscalationChanged();\n        sendInactiveChanged();\n    }\n    \n    var currentHandlerEditor;\n    function handlerTypeChanged() {\n        setUserMessage();\n        var handlerId = $get(\"handlerTypeSelect\");\n        if (currentHandlerEditor) {\n            hide(currentHandlerEditor);\n            hide($(currentHandlerEditor.id +\"Img\"));\n");
      out.write("        }\n        currentHandlerEditor = $(\"handler\"+ handlerId);\n        show(currentHandlerEditor);\n        show($(currentHandlerEditor.id +\"Img\"));\n    }\n    \n    function targetPointSelectChanged() {\n        \n        // Make sure there are points in the list.\n        if (targetPointSelector.store.data.length === 0)\n            return;\n        \n        // Get the content for the value to set section.\n        var targetPointId = targetPointSelector.value;\n\t\tif(targetPointId === ''){\n\t\t\treturn; //Don't care\n\t\t}\n        \n        var activeValueStr = \"\";\n        var inactiveValueStr = \"\";\n        if (selectedHandlerNode) {\n            var handler = $$(selectedHandlerNode.item, \"object\");\n            activeValueStr = handler.activeValueToSet;\n            inactiveValueStr = handler.inactiveValueToSet;\n        }\n        EventHandlersDwr.createSetValueContent(targetPointId, activeValueStr, \"Active\",\n                function(content) { $(\"activeValueToSetContent\").innerHTML = content; });\n        EventHandlersDwr.createSetValueContent(targetPointId, inactiveValueStr, \"Inactive\",\n");
      out.write("                function(content) { $(\"inactiveValueToSetContent\").innerHTML = content; });\n        \n        // Update the source point lists.\n        var targetDataTypeId = getPoint(targetPointId).dataType;\n        //Clear out the active and inactive stores\n        activePointSelector.store = new dojo.store.Memory();\n        activePointSelector.reset();\n\t\tinactivePointSelector.store = new dojo.store.Memory();  \n\t\tinactivePointSelector.reset();\n\t\t//Add the necessary points\n        for (var i=0; i<allPoints.length; i++) {\n            dp = allPoints[i];\n            if (dp.id != targetPointId && dp.dataType == targetDataTypeId) {\n                activePointSelector.store.put(dp);\n                inactivePointSelector.store.put(dp);\n            }\n        }\n\t\t//Set the values to the currently selected handler\n        if (selectedHandlerNode) {\n            var handler = $$(selectedHandlerNode.item, \"object\");\n            activePointSelector.set('value',handler.activePointId);\n            inactivePointSelector.set('value',handler.inactivePointId);\n");
      out.write("        }\n    }\n    \n    function activeActionChanged() {\n        var action = $get(\"activeAction\");\n        if (action == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_8.setPageContext(_jspx_page_context);
      _jspx_th_c_out_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_8.setValue( EventHandlerVO.SET_ACTION_POINT_VALUE );
      int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
      if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      out.write(") {\n            show(\"activePointIdRow\");\n            hide(\"activeValueToSetRow\");\n        }\n        else if (action == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_9.setPageContext(_jspx_page_context);
      _jspx_th_c_out_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_9.setValue( EventHandlerVO.SET_ACTION_STATIC_VALUE );
      int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
      if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      out.write(") {\n            hide(\"activePointIdRow\");\n            show(\"activeValueToSetRow\");\n        }\n        else {\n            hide(\"activePointIdRow\");\n            hide(\"activeValueToSetRow\");\n        }\n    }\n    \n    function inactiveActionChanged() {\n        var action = $get(\"inactiveAction\");\n        if (action == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_10.setPageContext(_jspx_page_context);
      _jspx_th_c_out_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_10.setValue( EventHandlerVO.SET_ACTION_POINT_VALUE );
      int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
      if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      out.write(") {\n            show(\"inactivePointIdRow\");\n            hide(\"inactiveValueToSetRow\");\n        }\n        else if (action == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_11.setPageContext(_jspx_page_context);
      _jspx_th_c_out_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_11.setValue( EventHandlerVO.SET_ACTION_STATIC_VALUE );
      int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
      if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      out.write(") {\n            hide(\"inactivePointIdRow\");\n            show(\"inactiveValueToSetRow\");\n        }\n        else {\n            hide(\"inactivePointIdRow\");\n            hide(\"inactiveValueToSetRow\");\n        }\n    }\n    \n    function sendEscalationChanged() {\n        if ($get(\"sendEscalation\")) {\n            show(\"escalationAddresses1\");\n            show(\"escalationAddresses2\");\n        }\n        else {\n            hide(\"escalationAddresses1\");\n            hide(\"escalationAddresses2\");\n        }\n    }\n    \n    function getPoint(id) {\n        return getElement(allPoints, id);\n    }\n    \n    function saveHandler() {\n        setUserMessage();\n        hideGenericMessages(\"genericMessages\")\n        \n        var handlerId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${NEW_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n        if (selectedHandlerNode)\n            handlerId = $$(selectedHandlerNode.item, \"object\").id;\n        \n        // Do some validation.\n        var handlerType = $get(\"handlerTypeSelect\");\n        var xid = $get(\"xid\");\n        var alias = $get(\"alias\");\n        var disabled = $get(\"disabled\");\n        var eventType = $$(selectedEventTypeNode.item, \"object\");\n        if (handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_12.setPageContext(_jspx_page_context);
      _jspx_th_c_out_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_12.setValue( EventHandlerVO.TYPE_EMAIL );
      int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
      if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      out.write(") {\n            var emailList = emailRecipients.createRecipientArray();\n            var escalList = escalRecipients.createRecipientArray();\n            var inactiveList = inactiveRecipients.createRecipientArray();\n            EventHandlersDwr.saveEmailEventHandler(eventType.type, eventType.subtype, eventType.typeRef1,\n                    eventType.typeRef2, handlerId, xid, alias, disabled, emailList, $get(\"sendEscalation\"),\n                    $get(\"escalationDelayType\"), $get(\"escalationDelay\"), escalList, $get(\"sendInactive\"),\n                    $get(\"inactiveOverride\"), inactiveList, saveEventHandlerCB);\n        }\n        else if (handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_13.setPageContext(_jspx_page_context);
      _jspx_th_c_out_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_13.setValue( EventHandlerVO.TYPE_SET_POINT );
      int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
      if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      out.write(") {\n            EventHandlersDwr.saveSetPointEventHandler(eventType.type, eventType.subtype, eventType.typeRef1,\n                    eventType.typeRef2, handlerId, xid, alias, disabled, targetPointSelector.value,\n                    $get(\"activeAction\"), $get(\"setPointValueActive\"), activePointSelector.value, $get(\"inactiveAction\"), \n                    $get(\"setPointValueInactive\"), inactivePointSelector.value, saveEventHandlerCB);\n        }\n        else if (handlerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_14.setPageContext(_jspx_page_context);
      _jspx_th_c_out_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_14.setValue( EventHandlerVO.TYPE_PROCESS );
      int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
      if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      out.write(") {\n            EventHandlersDwr.saveProcessEventHandler(eventType.type, eventType.subtype, eventType.typeRef1,\n                    eventType.typeRef2, handlerId, xid, alias, disabled, $get(\"activeProcessCommand\"),\n                    $get(\"activeProcessTimeout\"), $get(\"inactiveProcessCommand\"), $get(\"inactiveProcessTimeout\"), \n                    saveEventHandlerCB);\n        }\n    }\n    \n    function saveEventHandlerCB(response) {\n        if (response.hasMessages)\n            showDwrMessages(response.messages, $(\"genericMessages\"));\n        else {\n            var handler = response.data.handler;\n            setUserMessage(\"");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n            if (!selectedHandlerNode) {\n                var storeItem = createHandlerItem(handler);\n                var item = store.newItem(storeItem, {parent: selectedEventTypeNode.item, attribute: \"children\"});\n                tree._expandNode(selectedEventTypeNode);\n                selectedHandlerNode = tree.getNodesByItem(item)[0];\n                tree._setSelectedNodesAttr([selectedHandlerNode]);\n                tree.onClick(selectedHandlerNode.item, selectedHandlerNode);\n            }\n            else\n                $set(handler.id +\"Msg\", handler.message);\n            \n            $$(selectedHandlerNode.item, \"object\", makeNonTreeItem(handler));\n        }\n    }\n    \n    function deleteHandler() {\n        EventHandlersDwr.deleteEventHandler($$(selectedHandlerNode.item, \"object\").id);\n        store.deleteItem(selectedHandlerNode.item);\n        hide(\"handlerEditDiv\");\n    }\n    \n    function setUserMessage(msg) {\n        showMessage(\"userMessage\", msg);\n    }\n    \n    function testProcessCommand(active) {\n");
      out.write("        var comm = active ? $get(\"activeProcessCommand\") : $get(\"inactiveProcessCommand\")\n        var to = active ? $get(\"activeProcessTimeout\") : $get(\"inactiveProcessTimeout\")\n        EventHandlersDwr.testProcessCommand(comm, to, function(msg) {\n            if (msg)\n                alert(msg);\n        });\n    }\n    \n    function sendInactiveChanged() {\n        if ($get(\"sendInactive\")) {\n            show(\"inactiveAddresses1\");\n            inactiveOverrideChanged();\n        }\n        else {\n            hide(\"inactiveAddresses1\");\n            hide(\"inactiveAddresses2\");\n        }\n    }\n    \n    function inactiveOverrideChanged() {\n        if ($get(\"inactiveOverride\"))\n            show(\"inactiveAddresses2\");\n        else\n            hide(\"inactiveAddresses2\");\n    }\n  </script>\n  \n  <table class=\"borderDiv marB\"><tr><td>\n    ");
      if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n    <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\n    ");
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n  </td></tr></table>\n  \n  <table cellpadding=\"0\" cellspacing=\"0\">\n    <tr>\n      <td valign=\"top\">\n        <div class=\"borderDivPadded marR\">\n          <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\n          <img src=\"images/hourglass.png\" id=\"loadingImg\"/>\n          <div id=\"tree\" style=\"display:none;\"><div id=\"eventTypeTree\"></div></div>\n        </div>\n      </td>\n      \n      <td valign=\"top\">\n        <div id=\"handlerEditDiv\" class=\"borderDivPadded\" style=\"display:none;\">\n          <table width=\"100%\">\n            <tr>\n              <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td align=\"right\">\n                ");
      if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                ");
      if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            <tr><td class=\"formError\" id=\"userMessage\"></td></tr>\n          </table>\n          \n          <table width=\"100%\">\n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <select id=\"handlerTypeSelect\" onchange=\"handlerTypeChanged()\">\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_15.setPageContext(_jspx_page_context);
      _jspx_th_c_out_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_15.setValue( EventHandlerVO.TYPE_EMAIL );
      int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
      if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_16.setPageContext(_jspx_page_context);
      _jspx_th_c_out_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_16.setValue( EventHandlerVO.TYPE_SET_POINT );
      int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
      if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_17.setPageContext(_jspx_page_context);
      _jspx_th_c_out_17.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_17.setValue( EventHandlerVO.TYPE_PROCESS );
      int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
      if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                </select>\n                ");
      if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                ");
      if (_jspx_meth_tag_img_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                ");
      if (_jspx_meth_tag_img_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input type=\"text\" id=\"xid\"/></td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input id=\"alias\" type=\"text\"/></td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input type=\"checkbox\" id=\"disabled\"/></td>\n            </tr>\n            \n            <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n          </table>\n          \n          <table id=\"handler");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_18.setPageContext(_jspx_page_context);
      _jspx_th_c_out_18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_18.setValue( EventHandlerVO.TYPE_SET_POINT );
      int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
      if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
      out.write("\" style=\"display:none\" width=\"100%\">\n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <select id=\"targetPointSelect\"></select>\n              </td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <select id=\"activeAction\" onchange=\"activeActionChanged()\">\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_19.setPageContext(_jspx_page_context);
      _jspx_th_c_out_19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_19.setValue( EventHandlerVO.SET_ACTION_NONE );
      int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
      if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_20.setPageContext(_jspx_page_context);
      _jspx_th_c_out_20.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_20.setValue( EventHandlerVO.SET_ACTION_POINT_VALUE );
      int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
      if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_21.setPageContext(_jspx_page_context);
      _jspx_th_c_out_21.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_21.setValue( EventHandlerVO.SET_ACTION_STATIC_VALUE );
      int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
      if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                </select>\n              </td>\n            </tr>\n          \n            <tr id=\"activePointIdRow\">\n              <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><select id=\"activePointId\"></select></td>\n            </tr>\n          \n            <tr id=\"activeValueToSetRow\">\n              <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\" id=\"activeValueToSetContent\"></td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <select id=\"inactiveAction\" onchange=\"inactiveActionChanged()\">\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_22.setPageContext(_jspx_page_context);
      _jspx_th_c_out_22.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_22.setValue( EventHandlerVO.SET_ACTION_NONE );
      int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
      if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_23.setPageContext(_jspx_page_context);
      _jspx_th_c_out_23.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_23.setValue( EventHandlerVO.SET_ACTION_POINT_VALUE );
      int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
      if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                  <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_24.setPageContext(_jspx_page_context);
      _jspx_th_c_out_24.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_24.setValue( EventHandlerVO.SET_ACTION_STATIC_VALUE );
      int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
      if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                </select>\n              </td>\n            </tr>\n          \n            <tr id=\"inactivePointIdRow\">\n              <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><select id=\"inactivePointId\"></select></td>\n            </tr>\n          \n            <tr id=\"inactiveValueToSetRow\">\n              <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\" id=\"inactiveValueToSetContent\"></td>\n            </tr>\n          </table>\n            \n          <table id=\"handler");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_25.setPageContext(_jspx_page_context);
      _jspx_th_c_out_25.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_25.setValue( EventHandlerVO.TYPE_EMAIL );
      int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
      if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
      out.write("\" style=\"display:none\" width=\"100%\">\n            <tbody id=\"emailRecipients\"></tbody>\n            \n            <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input id=\"sendEscalation\" type=\"checkbox\" onclick=\"sendEscalationChanged()\"/></td>\n            </tr>\n            \n            <tr id=\"escalationAddresses1\">\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <input id=\"escalationDelay\" type=\"text\" class=\"formShort\"/>\n                ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n              \n            <tbody id=\"escalRecipients\"></tbody>\n            \n            <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input id=\"sendInactive\" type=\"checkbox\" onclick=\"sendInactiveChanged()\"/></td>\n            </tr>\n            \n            <tr id=\"inactiveAddresses1\">\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input id=\"inactiveOverride\" type=\"checkbox\" onclick=\"inactiveOverrideChanged()\"/></td>\n            </tr>\n              \n            <tbody id=\"inactiveRecipients\"></tbody>\n          </table>\n          \n          <table id=\"handler");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_26.setPageContext(_jspx_page_context);
      _jspx_th_c_out_26.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_26.setValue( EventHandlerVO.TYPE_PROCESS );
      int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
      if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
      out.write("\" style=\"display:none\" width=\"100%\">\n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <input type=\"text\" id=\"activeProcessCommand\" class=\"formLong\"/>\n                ");
      if (_jspx_meth_tag_img_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input type=\"text\" id=\"activeProcessTimeout\" class=\"formShort\"/></td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <input type=\"text\" id=\"inactiveProcessCommand\" class=\"formLong\"/>\n                ");
      if (_jspx_meth_tag_img_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input type=\"text\" id=\"inactiveProcessTimeout\" class=\"formShort\"/></td>\n            </tr>\n          </table>\n          \n          <table>\n            <tbody id=\"genericMessages\"></tbody>\n          </table>\n        </div>\n      </td>\n    </tr>\n  </table>\n");
      return;
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
