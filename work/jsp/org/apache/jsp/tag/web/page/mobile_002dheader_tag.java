package org.apache.jsp.tag.web.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Common;

public final class mobile_002dheader_tag
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_menuItem_png_key_id_href_nobody;

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

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_m2m2_menuItem_png_key_id_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_m2m2_menuItem_png_key_id_href_nobody.release();
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

    try {
      out.write("\n\n  <script type=\"text/javascript\">\n          require([ \"dojox/mobile/ToolBarButton\",\"dojo/domReady!\"]);\n  </script>\n<h1 id=\"header\" dojoType=\"dojox.mobile.Heading\" fixed=\"top\">\n    <button style=\"display:none\" id=\"navButton\" dojoType=\"dojox.mobile.ToolBarButton\" data-dojo-props=\"arrow:'left'\">Back</button>\n\n    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n    \n    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n                 \n    <a href=\"/events.shtm\" style=\"float:right\">\n       <span id=\"__header__alarmLevelDiv\" style=\"display:none;\">\n         <img id=\"__header__alarmLevelImg\" src=\"/images/spacer.gif\" alt=\"\" title=\"\"/>\n         <span id=\"__header__alarmLevelText\"></span>\n       </span>\n    </a>\n</h1>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty instanceDescription}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    <span style=\"float:center;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${instanceDescription}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("</span>\n    ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    <span style=\"float:right; padding-left:10px;\">\n     ");
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write(':');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionUser.username}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("\n     ");
        if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n     ");
        if (_jspx_meth_m2m2_menuItem_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n     </span>\n     \n    ");
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_fmt_message_0.setKey("header.user");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_tag_img_0.setId("userMutedImg");
    _jspx_th_tag_img_0.setOnclick("MiscDwr.toggleUserMuted(setUserMuted)");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_m2m2_menuItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:menuItem
    com.serotonin.m2m2.web.taglib.MenuItemTag _jspx_th_m2m2_menuItem_0 = (com.serotonin.m2m2.web.taglib.MenuItemTag) _jspx_tagPool_m2m2_menuItem_png_key_id_href_nobody.get(com.serotonin.m2m2.web.taglib.MenuItemTag.class);
    _jspx_th_m2m2_menuItem_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_menuItem_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_m2m2_menuItem_0.setId("logoutMi");
    _jspx_th_m2m2_menuItem_0.setHref("/logout.htm");
    _jspx_th_m2m2_menuItem_0.setPng("control-power");
    _jspx_th_m2m2_menuItem_0.setKey("header.logout");
    int _jspx_eval_m2m2_menuItem_0 = _jspx_th_m2m2_menuItem_0.doStartTag();
    if (_jspx_th_m2m2_menuItem_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_menuItem_png_key_id_href_nobody.reuse(_jspx_th_m2m2_menuItem_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_menuItem_png_key_id_href_nobody.reuse(_jspx_th_m2m2_menuItem_0);
    return false;
  }
}
