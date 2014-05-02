package org.apache.jsp.WEB_002dINF.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.module.ModuleRegistry;
import com.serotonin.m2m2.module.MenuItemDefinition;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(6);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/mobile-page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/mobile-header.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/mobile-toolbar.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.release();
    _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.release();
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

      out.write("\n\n\n\n\n ");
      //  tag:mobile-page
      org.apache.jsp.tag.web.mobile_002dpage_tag _jspx_th_tag_mobile$1page_0 = new org.apache.jsp.tag.web.mobile_002dpage_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_mobile$1page_0        );
      }
      _jspx_th_tag_mobile$1page_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_mobile$1page_0.setJspBody(new home_jspHelper( 0, _jspx_page_context, _jspx_th_tag_mobile$1page_0, null));
      _jspx_th_tag_mobile$1page_0.doTag();
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

  private boolean _jspx_meth_m2m2_mobile$1menuItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_0 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_m2m2_mobile$1menuItem_0.setDef((com.serotonin.m2m2.module.MenuItemDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.MenuItemDefinition.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m2m2_mobile$1menuItem_0 = _jspx_th_m2m2_mobile$1menuItem_0.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_0);
    return false;
  }

  private boolean _jspx_meth_m2m2_mobile$1menuItem_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_1 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_1.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_m2m2_mobile$1menuItem_1.setDef((com.serotonin.m2m2.module.MenuItemDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.MenuItemDefinition.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m2m2_mobile$1menuItem_1 = _jspx_th_m2m2_mobile$1menuItem_1.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_1);
    return false;
  }

  private boolean _jspx_meth_m2m2_mobile$1menuItem_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_2 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_2.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_m2m2_mobile$1menuItem_2.setId("usersMi");
    _jspx_th_m2m2_mobile$1menuItem_2.setHref("/users.shtm");
    _jspx_th_m2m2_mobile$1menuItem_2.setPng("user");
    _jspx_th_m2m2_mobile$1menuItem_2.setKey("header.users");
    int _jspx_eval_m2m2_mobile$1menuItem_2 = _jspx_th_m2m2_mobile$1menuItem_2.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_2);
    return false;
  }

  private boolean _jspx_meth_m2m2_mobile$1menuItem_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_3 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_3.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_m2m2_mobile$1menuItem_3.setDef((com.serotonin.m2m2.module.MenuItemDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.MenuItemDefinition.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m2m2_mobile$1menuItem_3 = _jspx_th_m2m2_mobile$1menuItem_3.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_3);
    return false;
  }

  private boolean _jspx_meth_m2m2_mobile$1menuItem_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_4 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_4.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_m2m2_mobile$1menuItem_4.setDef((com.serotonin.m2m2.module.MenuItemDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.MenuItemDefinition.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m2m2_mobile$1menuItem_4 = _jspx_th_m2m2_mobile$1menuItem_4.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_4);
    return false;
  }

  private boolean _jspx_meth_m2m2_mobile$1menuItem_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_5 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_5.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_m2m2_mobile$1menuItem_5.setId("loginMi");
    _jspx_th_m2m2_mobile$1menuItem_5.setHref("/login.htm");
    _jspx_th_m2m2_mobile$1menuItem_5.setPng("control_play_blue");
    _jspx_th_m2m2_mobile$1menuItem_5.setKey("header.login");
    int _jspx_eval_m2m2_mobile$1menuItem_5 = _jspx_th_m2m2_mobile$1menuItem_5.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_png_key_id_href_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_5);
    return false;
  }

  private boolean _jspx_meth_m2m2_mobile$1menuItem_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:mobile-menuItem
    com.serotonin.m2m2.web.taglib.MobileMenuItemTag _jspx_th_m2m2_mobile$1menuItem_6 = (com.serotonin.m2m2.web.taglib.MobileMenuItemTag) _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.get(com.serotonin.m2m2.web.taglib.MobileMenuItemTag.class);
    _jspx_th_m2m2_mobile$1menuItem_6.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_mobile$1menuItem_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_m2m2_mobile$1menuItem_6.setDef((com.serotonin.m2m2.module.MenuItemDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.MenuItemDefinition.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_m2m2_mobile$1menuItem_6 = _jspx_th_m2m2_mobile$1menuItem_6.doStartTag();
    if (_jspx_th_m2m2_mobile$1menuItem_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_mobile$1menuItem_def_nobody.reuse(_jspx_th_m2m2_mobile$1menuItem_6);
    return false;
  }

  private class home_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public home_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n     <div id=\"icons\" dojoType=\"dojox.mobile.View\">\n         <div id=\"iconsMain\">\n             <ul dojoType=\"dojox.mobile.IconContainer\" defaultIcon=\"/images/cog.png\">\n                 ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                   ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_forEach_0.setItems( ModuleRegistry.getMenuItems().get(MenuItemDefinition.Visibility.USER) );
          _jspx_th_c_forEach_0.setVar("mi");
          int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
            if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n                     ");
                if (_jspx_meth_m2m2_mobile$1menuItem_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
                  return;
                out.write("\n                   ");
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
          out.write("\n                         \n                   ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_1.setPageContext(_jspx_page_context);
          _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionUser.dataSourcePermission}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
          if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n                     ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
              _jspx_th_c_forEach_1.setItems( ModuleRegistry.getMenuItems().get(MenuItemDefinition.Visibility.DATA_SOURCE) );
              _jspx_th_c_forEach_1.setVar("mi");
              int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n                       ");
                    if (_jspx_meth_m2m2_mobile$1menuItem_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                      return;
                    out.write("\n                     ");
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
              out.write("\n                   ");
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
          out.write("\n                   \n                   ");
          if (_jspx_meth_m2m2_mobile$1menuItem_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\n                   \n                   ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_2.setPageContext(_jspx_page_context);
          _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionUser.admin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
          if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n                     ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
              _jspx_th_c_forEach_2.setItems( ModuleRegistry.getMenuItems().get(MenuItemDefinition.Visibility.ADMINISTRATOR) );
              _jspx_th_c_forEach_2.setVar("mi");
              int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
                if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n                       ");
                    if (_jspx_meth_m2m2_mobile$1menuItem_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
                      return;
                    out.write("\n                     ");
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
              out.write("\n                   ");
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
          out.write("\n                   \n                   ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_forEach_3.setItems( ModuleRegistry.getMenuItems().get(MenuItemDefinition.Visibility.ANONYMOUS) );
          _jspx_th_c_forEach_3.setVar("mi");
          int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
            if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n                     ");
                if (_jspx_meth_m2m2_mobile$1menuItem_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
                  return;
                out.write("\n                   ");
                int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              throw new SkipPageException();
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_forEach_3.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_forEach_3.doFinally();
            _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
          }
          out.write("\n                 ");
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
      out.write("\n                 ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_3.setPageContext(_jspx_page_context);
      _jspx_th_c_if_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                   ");
          if (_jspx_meth_m2m2_mobile$1menuItem_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
            return;
          out.write("\n                   ");
          //  c:forEach
          org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
          _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
          _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
          _jspx_th_c_forEach_4.setItems( ModuleRegistry.getMenuItems().get(MenuItemDefinition.Visibility.ANONYMOUS) );
          _jspx_th_c_forEach_4.setVar("mi");
          int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
          try {
            int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
            if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\n                     ");
                if (_jspx_meth_m2m2_mobile$1menuItem_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
                  return;
                out.write("\n                   ");
                int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              throw new SkipPageException();
            }
          } catch (Throwable _jspx_exception) {
            while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
              out = _jspx_page_context.popBody();
            _jspx_th_c_forEach_4.doCatch(_jspx_exception);
          } finally {
            _jspx_th_c_forEach_4.doFinally();
            _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
          }
          out.write("\n                 ");
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
      out.write("\n           \n             \n             </ul>\n         </div>\n     </div>\n\n <script type=\"text/javascript\">\n         require([\"dojox/mobile\", \"dojox/mobile/parser\", \"dojo/ready\", \n             \"mango/mobile/DataSource\", \"dojox/mobile/compat\", \"dojox/mobile/Button\",\n             \"dojox/mobile/View\", \"dojox/mobile/IconContainer\", \"dojox/mobile/ScrollableView\",\n             \"dojox/mobile/IconItem\",\n             \"dojo/domReady!\"], function(mobile, parser, ready, DataSource){\n                 ready(function(){\n                     DataSource.init();\n                 });\n             });\n </script>\n \n \n ");
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
