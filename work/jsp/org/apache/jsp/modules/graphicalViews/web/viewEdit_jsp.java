package org.apache.jsp.modules.graphicalViews.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.view.ShareUser;
import com.serotonin.m2m2.gviews.component.SimpleCompoundComponent;

public final class viewEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m2m2:escapeScripts", com.serotonin.m2m2.web.taglib.Functions.class, "escapeScripts", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(14);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/modules/graphicalViews/web/include/staticEditor.jsp");
    _jspx_dependants.add("/modules/graphicalViews/web/include/settingsEditor.jsp");
    _jspx_dependants.add("/modules/graphicalViews/web/include/graphicRendererEditor.jsp");
    _jspx_dependants.add("/modules/graphicalViews/web/include/compoundEditor.jsp");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/newId.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/sharedUsers.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_convert_obj_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_convert_obj_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_sst_convert_obj_nobody.release();
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_sst_select_value_id.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("\n\n\n");
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_page_0        );
      }
      _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_page_0.setDwr("GraphicalViewDwr");
      _jspx_th_tag_page_0.setJs((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/resources/view.js,${modulePath}/web/graphicalViews.js,${modulePath}/web/wz_jsgraphics.js", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_tag_page_0.setJspBody(new viewEdit_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null));
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.viewComponents}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("vc");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n          ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n          createViewComponent(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m2m2:escapeScripts(compContent)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write(", false);\n        ");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_set_0.setVar("compContent");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        if (_jspx_meth_sst_convert_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_set_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_sst_convert_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_0 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_0);
    _jspx_th_sst_convert_0.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vc}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_convert_0 = _jspx_th_sst_convert_0.doStartTag();
    if (_jspx_th_sst_convert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
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
    _jspx_th_m2m2_translate_0.setKey("viewEdit.chooseImage");
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
    _jspx_th_m2m2_translate_1.setKey("viewEdit.confirmSaved");
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
    _jspx_th_m2m2_translate_2.setKey("viewEdit.confirmDelete");
    _jspx_th_m2m2_translate_2.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_2 = _jspx_th_m2m2_translate_2.doStartTag();
    if (_jspx_th_m2m2_translate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_2);
    return false;
  }

  private boolean _jspx_meth_tag_newId_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:newId
    org.apache.jsp.tag.web.newId_tag _jspx_th_tag_newId_0 = new org.apache.jsp.tag.web.newId_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_newId_0      );
    }
    _jspx_th_tag_newId_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_newId_0.setParent(_jspx_parent);
    _jspx_th_tag_newId_0.doTag();
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
    _jspx_th_tag_img_0.setSrc((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}/web/slide.png", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_img_0.setTitle("viewEdit.editView");
    _jspx_th_tag_img_0.doTag();
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
    _jspx_th_fmt_message_0.setKey("viewEdit.viewProperties");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_tag_help_0.setId("editingGraphicalViews");
    _jspx_th_tag_help_0.doTag();
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
    _jspx_th_fmt_message_1.setKey("viewEdit.name");
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
    _jspx_th_fmt_message_2.setKey("common.xid");
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
    _jspx_th_fmt_message_3.setKey("viewEdit.anonymous");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_4.setKey("common.access.none");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
    _jspx_th_fmt_message_5.setKey("common.access.read");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
    _jspx_th_fmt_message_6.setKey("common.access.set");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
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
    _jspx_th_fmt_message_7.setKey("viewEdit.background");
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
    _jspx_th_fmt_message_8.setKey("viewEdit.upload");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
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
    _jspx_th_fmt_message_9.setKey("viewEdit.clearImage");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_tag_sharedUsers_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:sharedUsers
    org.apache.jsp.tag.web.sharedUsers_tag _jspx_th_tag_sharedUsers_0 = new org.apache.jsp.tag.web.sharedUsers_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_sharedUsers_0      );
    }
    _jspx_th_tag_sharedUsers_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_sharedUsers_0.setParent(_jspx_parent);
    _jspx_th_tag_sharedUsers_0.setDoxId("viewSharing");
    _jspx_th_tag_sharedUsers_0.setNoUsersKey("share.noViewUsers");
    _jspx_th_tag_sharedUsers_0.doTag();
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
    _jspx_th_fmt_message_10.setKey("viewEdit.viewComponents");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
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
    _jspx_th_tag_img_1.setPng("add");
    _jspx_th_tag_img_1.setTitle("viewEdit.addViewComponent");
    _jspx_th_tag_img_1.setOnclick("addViewComponent()");
    _jspx_th_tag_img_1.doTag();
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
    _jspx_th_fmt_message_11.setKey("viewEdit.iconify");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                  ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n                  ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n                ");
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
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty view.backgroundFilename}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                    <img id=\"viewBackground\" src=\"images/spacer.gif\" alt=\"\" style=\"top:1px;left:1px;width:740px;height:500px;\"/>\n                  ");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                    <img id=\"viewBackground\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.backgroundFilename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"\" style=\"top:1px;left:1px;\"/>\n                  ");
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
    _jspx_th_tag_img_2.setPng("html");
    _jspx_th_tag_img_2.setTitle("viewEdit.static.editor");
    _jspx_th_tag_img_2.setStyle("display:inline;");
    _jspx_th_tag_img_2.doTag();
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
    _jspx_th_tag_img_3.setPng("save");
    _jspx_th_tag_img_3.setOnclick("staticEditor.save()");
    _jspx_th_tag_img_3.setTitle("common.save");
    _jspx_th_tag_img_3.setStyle("display:inline;");
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
    _jspx_th_tag_img_4.setPng("cross");
    _jspx_th_tag_img_4.setOnclick("staticEditor.close()");
    _jspx_th_tag_img_4.setTitle("common.close");
    _jspx_th_tag_img_4.setStyle("display:inline;");
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
    _jspx_th_tag_img_5.setPng("pencil");
    _jspx_th_tag_img_5.setTitle("viewEdit.settings.editor");
    _jspx_th_tag_img_5.setStyle("display:inline;");
    _jspx_th_tag_img_5.doTag();
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
    _jspx_th_tag_img_6.setPng("save");
    _jspx_th_tag_img_6.setOnclick("settingsEditor.save()");
    _jspx_th_tag_img_6.setTitle("common.save");
    _jspx_th_tag_img_6.setStyle("display:inline;");
    _jspx_th_tag_img_6.doTag();
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
    _jspx_th_tag_img_7.setPng("cross");
    _jspx_th_tag_img_7.setOnclick("settingsEditor.close()");
    _jspx_th_tag_img_7.setTitle("common.close");
    _jspx_th_tag_img_7.setStyle("display:inline;");
    _jspx_th_tag_img_7.doTag();
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
    _jspx_th_fmt_message_12.setKey("viewEdit.settings.point");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
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
    _jspx_th_fmt_message_13.setKey("viewEdit.settings.nameOverride");
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
    _jspx_th_fmt_message_14.setKey("viewEdit.settings.settableOverride");
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
    _jspx_th_fmt_message_15.setKey("viewEdit.settings.background");
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
    _jspx_th_fmt_message_16.setKey("viewEdit.settings.displayControls");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_tag_img_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_8 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_8      );
    }
    _jspx_th_tag_img_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_8.setParent(_jspx_parent);
    _jspx_th_tag_img_8.setPng("graphic");
    _jspx_th_tag_img_8.setTitle("viewEdit.graphic.editor");
    _jspx_th_tag_img_8.setStyle("display:inline;");
    _jspx_th_tag_img_8.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_9 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_9      );
    }
    _jspx_th_tag_img_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_9.setParent(_jspx_parent);
    _jspx_th_tag_img_9.setPng("save");
    _jspx_th_tag_img_9.setOnclick("graphicRendererEditor.save()");
    _jspx_th_tag_img_9.setTitle("common.save");
    _jspx_th_tag_img_9.setStyle("display:inline;");
    _jspx_th_tag_img_9.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_10 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_10      );
    }
    _jspx_th_tag_img_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_10.setParent(_jspx_parent);
    _jspx_th_tag_img_10.setPng("cross");
    _jspx_th_tag_img_10.setOnclick("graphicRendererEditor.close()");
    _jspx_th_tag_img_10.setTitle("common.close");
    _jspx_th_tag_img_10.setStyle("display:inline;");
    _jspx_th_tag_img_10.doTag();
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
    _jspx_th_fmt_message_17.setKey("viewEdit.graphic.min");
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
    _jspx_th_fmt_message_18.setKey("viewEdit.graphic.max");
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
    _jspx_th_fmt_message_19.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_20.setKey("viewEdit.graphic.imageSet");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("imageSet");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write(")</option>\n              ");
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

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_message_21.setKey("viewEdit.graphic.images");
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
    _jspx_th_fmt_message_22.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_23.setKey("viewEdit.graphic.imageSet");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("imageSet");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write(")</option>\n              ");
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

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_fmt_message_24.setKey("viewEdit.graphic.images");
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
    _jspx_th_fmt_message_25.setKey("viewEdit.graphic.zero");
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
    _jspx_th_fmt_message_26.setKey("viewEdit.graphic.one");
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
    _jspx_th_fmt_message_27.setKey("viewEdit.graphic.min");
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
    _jspx_th_fmt_message_28.setKey("viewEdit.graphic.max");
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
    _jspx_th_fmt_message_29.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_30.setKey("viewEdit.graphic.dynamicImage");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("dynamicImage");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImage.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n              ");
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
    _jspx_th_fmt_message_31.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_32.setKey("viewEdit.graphic.imageSet");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("imageSet");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write(")</option>\n              ");
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
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_fmt_message_33.setKey("viewEdit.graphic.images");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
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
    _jspx_th_fmt_message_34.setKey("viewEdit.graphic.state");
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
    _jspx_th_fmt_message_35.setKey("viewEdit.graphic.script");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
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
    _jspx_th_fmt_message_36.setKey("viewEdit.graphic.noConfig");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private boolean _jspx_meth_fmt_message_37(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_37.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_37.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_37.setKey("viewEdit.graphic.displayPointName");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
    return false;
  }

  private boolean _jspx_meth_fmt_message_38(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_38.setKey("viewEdit.graphic.styleAttribute");
    int _jspx_eval_fmt_message_38 = _jspx_th_fmt_message_38.doStartTag();
    if (_jspx_th_fmt_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
    return false;
  }

  private boolean _jspx_meth_fmt_message_39(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_39.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_39.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_39.setKey("viewEdit.graphic.scale");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }

  private boolean _jspx_meth_sst_convert_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_1 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_convert_1.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_convert_1 = _jspx_th_sst_convert_1.doStartTag();
    if (_jspx_th_sst_convert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_1);
    return false;
  }

  private boolean _jspx_meth_sst_convert_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_2 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_2.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_convert_2.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_convert_2 = _jspx_th_sst_convert_2.doStartTag();
    if (_jspx_th_sst_convert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_2);
    return false;
  }

  private boolean _jspx_meth_tag_img_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_11 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_11      );
    }
    _jspx_th_tag_img_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_11.setParent(_jspx_parent);
    _jspx_th_tag_img_11.setPng("graphic");
    _jspx_th_tag_img_11.setTitle("viewEdit.graphic.imageSample");
    _jspx_th_tag_img_11.setStyle("display:inline;");
    _jspx_th_tag_img_11.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_40(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_40.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_40.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_40.setKey("viewEdit.graphic.image");
    int _jspx_eval_fmt_message_40 = _jspx_th_fmt_message_40.doStartTag();
    if (_jspx_th_fmt_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
    return false;
  }

  private boolean _jspx_meth_fmt_message_41(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_41.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_41.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_41.setKey("viewEdit.graphic.stateList");
    int _jspx_eval_fmt_message_41 = _jspx_th_fmt_message_41.doStartTag();
    if (_jspx_th_fmt_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
    return false;
  }

  private boolean _jspx_meth_fmt_message_42(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_42.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_42.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_42.setKey("viewEdit.graphic.default");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }

  private boolean _jspx_meth_tag_img_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_12 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_12      );
    }
    _jspx_th_tag_img_12.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_12.setParent(_jspx_parent);
    _jspx_th_tag_img_12.setPng("pencil");
    _jspx_th_tag_img_12.setTitle("viewEdit.compound.editor");
    _jspx_th_tag_img_12.setStyle("display:inline;");
    _jspx_th_tag_img_12.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_13 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_13      );
    }
    _jspx_th_tag_img_13.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_13.setParent(_jspx_parent);
    _jspx_th_tag_img_13.setPng("save");
    _jspx_th_tag_img_13.setOnclick("compoundEditor.save()");
    _jspx_th_tag_img_13.setTitle("common.save");
    _jspx_th_tag_img_13.setStyle("display:inline;");
    _jspx_th_tag_img_13.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_14 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_14      );
    }
    _jspx_th_tag_img_14.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_14.setParent(_jspx_parent);
    _jspx_th_tag_img_14.setPng("cross");
    _jspx_th_tag_img_14.setOnclick("compoundEditor.close()");
    _jspx_th_tag_img_14.setTitle("common.close");
    _jspx_th_tag_img_14.setStyle("display:inline;");
    _jspx_th_tag_img_14.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_43(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_43.setKey("viewEdit.compound.name");
    int _jspx_eval_fmt_message_43 = _jspx_th_fmt_message_43.doStartTag();
    if (_jspx_th_fmt_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
    return false;
  }

  private boolean _jspx_meth_fmt_message_44(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_44.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_44.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_44.setKey("viewEdit.compound.backgroundColour");
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
    return false;
  }

  private boolean _jspx_meth_fmt_message_45(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_45.setKey("viewEdit.compound.width");
    int _jspx_eval_fmt_message_45 = _jspx_th_fmt_message_45.doStartTag();
    if (_jspx_th_fmt_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
    return false;
  }

  private boolean _jspx_meth_fmt_message_46(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_46.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_46.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_46.setKey("viewEdit.compound.height");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
    return false;
  }

  private boolean _jspx_meth_fmt_message_47(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_47 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_47.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_47.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_47.setKey("viewEdit.compound.duration");
    int _jspx_eval_fmt_message_47 = _jspx_th_fmt_message_47.doStartTag();
    if (_jspx_th_fmt_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
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
    _jspx_th_tag_timePeriods_0.setId("imageChartDurationType");
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_48(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_48 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_48.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_48.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_48.setKey("common.save");
    int _jspx_eval_fmt_message_48 = _jspx_th_fmt_message_48.doStartTag();
    if (_jspx_th_fmt_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
    return false;
  }

  private boolean _jspx_meth_fmt_message_49(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_49 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_49.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_49.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_49.setKey("common.delete");
    int _jspx_eval_fmt_message_49 = _jspx_th_fmt_message_49.doStartTag();
    if (_jspx_th_fmt_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
    return false;
  }

  private boolean _jspx_meth_fmt_message_50(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_50.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_50.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_50.setKey("common.close");
    int _jspx_eval_fmt_message_50 = _jspx_th_fmt_message_50.doStartTag();
    if (_jspx_th_fmt_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
    return false;
  }

  private boolean _jspx_meth_tag_img_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_15 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_15      );
    }
    _jspx_th_tag_img_15.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_15.setParent(_jspx_parent);
    _jspx_th_tag_img_15.setPng("hourglass");
    _jspx_th_tag_img_15.setTitle("common.gettingData");
    _jspx_th_tag_img_15.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_16 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_16      );
    }
    _jspx_th_tag_img_16.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_16.setParent(_jspx_parent);
    _jspx_th_tag_img_16.setPng("pencil");
    _jspx_th_tag_img_16.setOnclick("openSettingsEditor(getViewComponentId(this))");
    _jspx_th_tag_img_16.setTitle("viewEdit.editPointView");
    _jspx_th_tag_img_16.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_17 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_17      );
    }
    _jspx_th_tag_img_17.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_17.setParent(_jspx_parent);
    _jspx_th_tag_img_17.setPng("graphic");
    _jspx_th_tag_img_17.setOnclick("openGraphicRendererEditor(getViewComponentId(this))");
    _jspx_th_tag_img_17.setTitle("viewEdit.editGraphicalRenderer");
    _jspx_th_tag_img_17.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_18 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_18      );
    }
    _jspx_th_tag_img_18.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_18.setParent(_jspx_parent);
    _jspx_th_tag_img_18.setPng("delete");
    _jspx_th_tag_img_18.setOnclick("deleteViewComponent(getViewComponentId(this))");
    _jspx_th_tag_img_18.setTitle("viewEdit.deletePointView");
    _jspx_th_tag_img_18.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_19 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_19      );
    }
    _jspx_th_tag_img_19.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_19.setParent(_jspx_parent);
    _jspx_th_tag_img_19.setPng("warn");
    _jspx_th_tag_img_19.setTitle("common.warning");
    _jspx_th_tag_img_19.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_20 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_20      );
    }
    _jspx_th_tag_img_20.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_20.setParent(_jspx_parent);
    _jspx_th_tag_img_20.setPng("pencil");
    _jspx_th_tag_img_20.setOnclick("openStaticEditor(getViewComponentId(this))");
    _jspx_th_tag_img_20.setTitle("viewEdit.editStaticView");
    _jspx_th_tag_img_20.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_21 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_21      );
    }
    _jspx_th_tag_img_21.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_21.setParent(_jspx_parent);
    _jspx_th_tag_img_21.setPng("html_delete");
    _jspx_th_tag_img_21.setOnclick("deleteViewComponent(getViewComponentId(this))");
    _jspx_th_tag_img_21.setTitle("viewEdit.deleteStaticView");
    _jspx_th_tag_img_21.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_22 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_22      );
    }
    _jspx_th_tag_img_22.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_22.setParent(_jspx_parent);
    _jspx_th_tag_img_22.setPng("pencil");
    _jspx_th_tag_img_22.setOnclick("openCompoundEditor(getViewComponentId(this))");
    _jspx_th_tag_img_22.setTitle("viewEdit.editPointView");
    _jspx_th_tag_img_22.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_23 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_23      );
    }
    _jspx_th_tag_img_23.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_23.setParent(_jspx_parent);
    _jspx_th_tag_img_23.setPng("delete");
    _jspx_th_tag_img_23.setOnclick("deleteViewComponent(getViewComponentId(this))");
    _jspx_th_tag_img_23.setTitle("viewEdit.deletePointView");
    _jspx_th_tag_img_23.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_24 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_24      );
    }
    _jspx_th_tag_img_24.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_24.setParent(_jspx_parent);
    _jspx_th_tag_img_24.setPng("hourglass");
    _jspx_th_tag_img_24.setTitle("common.gettingData");
    _jspx_th_tag_img_24.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_25 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_25      );
    }
    _jspx_th_tag_img_25.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_25.setParent(_jspx_parent);
    _jspx_th_tag_img_25.setPng("pencil");
    _jspx_th_tag_img_25.setOnclick("openCompoundEditor(getViewComponentId(this))");
    _jspx_th_tag_img_25.setTitle("viewEdit.editPointView");
    _jspx_th_tag_img_25.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_26 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_26      );
    }
    _jspx_th_tag_img_26.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_26.setParent(_jspx_parent);
    _jspx_th_tag_img_26.setPng("delete");
    _jspx_th_tag_img_26.setOnclick("deleteViewComponent(getViewComponentId(this))");
    _jspx_th_tag_img_26.setTitle("viewEdit.deletePointView");
    _jspx_th_tag_img_26.doTag();
    return false;
  }

  private class viewEdit_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public viewEdit_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <style type=\"text/css\">\n    #viewContent #compCoords {\n        position: absolute; \n        right: -1px; \n        top: -20px; \n        text-align: right;\n        background: #F8BB00;\n        white-space: nowrap;\n        border: 1px solid #F07800;\n        padding: 2px;\n        border-bottom: none;\n    }\n  </style>\n  <script type=\"text/javascript\">\n    dojo.require(\"dojo.dnd.move\");\n    \n    mango.view.initEditView();\n    mango.share.dwr = GraphicalViewDwr;\n    \n    var viewId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n    \n    dojo.ready(function() {\n        ");
      if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        \n        GraphicalViewDwr.editInit(function(result) {\n            mango.share.users = result.shareUsers;\n            mango.share.writeSharedUsers(result.viewUsers);\n            dwr.util.addOptions($(\"componentList\"), result.componentTypes, \"key\", \"value\");\n            settingsEditor.setPointList(result.pointList);\n            compoundEditor.setPointList(result.pointList);\n            MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n        });\n    });\n    \n    function addViewComponent() {\n        GraphicalViewDwr.addComponent($get(\"componentList\"), function(viewComponent) {\n            createViewComponent(viewComponent, true);\n            MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n        });\n    }\n    \n    function createViewComponent(viewComponent, center) {\n        var content;\n    \n        if (viewComponent.pointComponent)\n            content = $(\"pointTemplate\").cloneNode(true);\n        else if (viewComponent.defName == 'imageChart')\n            content = $(\"imageChartTemplate\").cloneNode(true);\n");
      out.write("        else if (viewComponent.compoundComponent)\n            content = $(\"compoundTemplate\").cloneNode(true);\n        else\n            content = $(\"htmlTemplate\").cloneNode(true);\n        \n        configureComponentContent(content, viewComponent, $(\"viewContent\"), center);\n        \n        if (viewComponent.defName == 'simpleCompound') {\n            childContent = $(\"compoundChildTemplate\").cloneNode(true);\n            configureComponentContent(childContent, viewComponent.leadComponent, $(\"c\"+ viewComponent.id +\"Content\"),\n                    false);\n        }\n        else if (viewComponent.defName == 'imageChart')\n            ;\n        else if (viewComponent.compoundComponent) {\n            // Compound components only have their static content set at page load.\n            $set(content.id +\"Content\", viewComponent.staticContent);\n            \n            // Add the child components.\n            var childContent;\n            for (var i=0; i<viewComponent.childComponents.length; i++) {\n                childContent = $(\"compoundChildTemplate\").cloneNode(true);\n");
      out.write("                configureComponentContent(childContent, viewComponent.childComponents[i].viewComponent,\n                        $(\"c\"+ viewComponent.id +\"ChildComponents\"), false);\n            }\n        }\n        \n        addDnD(content.id);\n        \n        if (center)\n            updateViewComponentLocation(content.id);\n    }\n    \n    function configureComponentContent(content, viewComponent, parent, center) {\n        content.id = \"c\"+ viewComponent.id;\n        content.viewComponentId = viewComponent.id;\n        updateNodeIds(content, viewComponent.id);\n        parent.appendChild(content);\n        \n        if (viewComponent.defName == \"html\")\n            // HTML components only get updated at page load and editing.\n            updateHtmlComponentContent(content.id, viewComponent.content);\n        \n        show(content);\n        \n        if (center) {\n            // Calculate the location for the new point. For now just put it in the center.\n            var bkgd = $(\"viewBackground\");\n            var bkgdBox = dojo.getMarginBox(bkgd);\n");
      out.write("            var compContentBox = dojo.getMarginBox(content);\n            content.style.left = parseInt((bkgdBox.w - compContentBox.w) / 2) +\"px\";\n            content.style.top = parseInt((bkgdBox.h - compContentBox.h) / 2) +\"px\";\n        }\n        else {\n            content.style.left = viewComponent.x +\"px\";\n            content.style.top = viewComponent.y +\"px\";\n        }\n    }\n    \n    function updateNodeIds(elem, id) {\n        var i;\n        for (i=0; i<elem.attributes.length; i++) {\n            if (elem.attributes[i].value && elem.attributes[i].value.indexOf(\"_TEMPLATE_\") != -1)\n                elem.attributes[i].value = elem.attributes[i].value.replace(/_TEMPLATE_/, id);\n        }\n        for (var i=0; i<elem.childNodes.length; i++) {\n            if (elem.childNodes[i].attributes)\n                updateNodeIds(elem.childNodes[i], id);\n        }\n    }\n    \n    function updateHtmlComponentContent(id, content) {\n        if (!content || content == \"\")\n            $set(id +\"Content\", '<img src=\"images/html.png\" alt=\"\"/>');\n");
      out.write("        else\n            $set(id +\"Content\", content);\n    }\n    \n    function openStaticEditor(viewComponentId) {\n        closeEditors();\n        staticEditor.open(viewComponentId);\n    }\n    \n    function openSettingsEditor(cid) {\n        closeEditors();\n        settingsEditor.open(cid);\n    }\n    \n    function openGraphicRendererEditor(cid) {\n        closeEditors();\n        graphicRendererEditor.open(cid);\n    }\n    \n    function openCompoundEditor(cid) {\n        closeEditors();\n        compoundEditor.open(cid);\n    }\n    \n    function positionEditor(compId, editorId) {\n        // Position and display the renderer editor.\n        var pDim = getNodeBounds($(\"c\"+ compId));\n        var editDiv = $(editorId);\n        editDiv.style.left = (pDim.x + pDim.w + 20) +\"px\";\n        editDiv.style.top = (pDim.y + 10) +\"px\";\n    }\n    \n    function closeEditors() {\n        settingsEditor.close();\n        graphicRendererEditor.close();\n        staticEditor.close();\n        compoundEditor.close();\n    }\n    \n    function updateViewComponentLocation(divId) {\n");
      out.write("        var div = $(divId);\n        var lt = div.style.left;\n        var tp = div.style.top;\n        \n        // Remove the 'px's from the positions.\n        lt = lt.substring(0, lt.length-2);\n        tp = tp.substring(0, tp.length-2);\n        \n        // Save the new location.\n        GraphicalViewDwr.setViewComponentLocation(div.viewComponentId, lt, tp);\n    }\n    \n    function addDnD(divId) {\n        var div = $(\"viewContent\")\n        var cs = dojo.getComputedStyle(div);\n        var mb = dojo.getMarginBox(div, cs);\n        \n        div = $(divId)\n        var coords = $(\"compCoords\");\n        //var moveable = new dojo.dnd.move.parentConstrainedMoveable(div);\n        var moveable = new dojo.dnd.move.boxConstrainedMoveable(div, { box: { l:0, t:0, w:mb.w, h:mb.h }})\n        \n        // Save the movable in the div in case it gets deleted. See below.\n        div.moveable = moveable;\n        \n        moveable.onMoveStart = function() {\n            closeEditors();\n            var lt = div.style.left;\n            var tp = div.style.top;\n");
      out.write("            lt = lt.substring(0, lt.length-2);\n            tp = tp.substring(0, tp.length-2);\n            moveable.onMoved(moveable, { l: lt, t: tp });\n            show(coords);\n        };\n        \n        moveable.onMoved = function(mover, leftTop) {\n            $set(coords, leftTop.l +\", \"+ leftTop.t);\n        };\n        \n        moveable.onMoveStop = function() { \n            hide(coords);\n            updateViewComponentLocation(divId);\n        };\n    }\n    \n    function deleteViewComponent(viewComponentId) {\n        closeEditors();\n        GraphicalViewDwr.deleteViewComponent(viewComponentId);\n        \n        var div = $(\"c\"+ viewComponentId);\n        \n        // Unregister the moveable from the DnD manager.\n        div.moveable.destroy();\n        \n        // Disconnect the event handling for drag ends on this guy.\n        $(\"viewContent\").removeChild(div);\n    }\n    \n    function getViewComponentId(node) {\n        while (!(node.viewComponentId))\n            node = node.parentNode;\n        return node.viewComponentId;\n");
      out.write("    }\n    \n    function iconizeClicked() {\n        GraphicalViewDwr.getViewComponentIds(function(ids) {\n            var i, comp, content;\n            if ($get(\"iconifyCB\")) {\n                mango.view.edit.iconize = true;\n                for (i=0; i<ids.length; i++) {\n                    comp = $(\"c\"+ ids[i]);\n                    content = $(\"c\"+ ids[i] +\"Content\");\n                    if (!comp.savedContent)\n                        comp.savedContent = content.innerHTML;\n                    content.innerHTML = \"<img src='images/logo_icon.gif'/>\";\n                }\n            }\n            else {\n                mango.view.edit.iconize = false;\n                for (i=0; i<ids.length; i++) {\n                    comp = $(\"c\"+ ids[i]);\n                    content = $(\"c\"+ ids[i] +\"Content\");\n                    if (comp.savedState)\n                        mango.view.setContent(comp.savedState);                \n                    else if (comp.savedContent)\n                        content.innerHTML = comp.savedContent;\n");
      out.write("                    else\n                        content.innerHTML = '';\n                    comp.savedState = null;\n                    comp.savedContent = null;\n                }\n            }\n        });\n    }\n    \n    function bgUpload() {\n        if (!$get(\"backgroundImage\"))\n            alert(\"");
      if (_jspx_meth_m2m2_translate_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n        else {\n            GraphicalViewDwr.clearBackground(function() {\n                document.getElementById(\"daform\").submit();\n                bgUploadCheck();\n            });\n        }\n    }\n    \n    function bgClear() {\n        GraphicalViewDwr.clearBackground(function() { imageUpdate(\"images/spacer.gif\", 740, 500); });\n    }\n    \n    function bgUploadCheck() {\n        GraphicalViewDwr.getBackgroundUrl(function(bgurl) {\n            if (bgurl)\n                imageUpdate(bgurl);\n            else\n                setTimeout(bgUploadCheck, 500);\n        });\n    }\n    \n    function imageUpdate(url, width, height) {\n        var bg = $(\"viewBackground\");\n        bg.src = url;\n        if (width) {\n            bg.style.width = width +\"px\";\n            bg.style.height = height +\"px\";\n        }\n        else {\n            bg.style.width = \"\";\n            bg.style.height = \"\";\n        }\n    }\n    \n    function saveView() {\n        hideContextualMessages($(\"viewProperties\"));\n        GraphicalViewDwr.saveView($get(\"name\"), $get(\"xid\"), $get(\"anonymousAccess\"), function(result) {\n");
      out.write("            if (result.hasMessages)\n                showDwrMessages(result.messages);\n            else {\n                viewId = result.data.view.id;\n                alert(\"");
      if (_jspx_meth_m2m2_translate_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n                // Write confirmation message?\n            }\n        });\n    }\n    \n    function deleteView() {\n        if (confirm(\"");
      if (_jspx_meth_m2m2_translate_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\"))\n            GraphicalViewDwr.deleteView(function(result) { window.location = \"/views.shtm\"; });\n    }\n    \n    function cancelEdit() {\n        if (viewId == ");
      if (_jspx_meth_tag_newId_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(")\n            window.location = \"/views.shtm\";\n        else\n            window.location = \"/views.shtm?viewId=\"+ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n    }\n  </script>\n  \n  <table>\n    <tr>\n      <td valign=\"top\">\n        <div class=\"borderDiv marR\">\n          <table id=\"viewProperties\">\n            <tr>\n              <td colspan=\"2\">\n                ");
      if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\n                ");
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input type=\"text\" id=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\"><input type=\"text\" id=\"xid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.xid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                ");
      //  sst:select
      com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
      _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
      _jspx_th_sst_select_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_sst_select_0.setId("anonymousAccess");
      _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.anonymousAccess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
      if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_0.setValue( Integer.toString(ShareUser.ACCESS_NONE) );
          int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
          if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_0.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
          out.write("\n                  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_1.setValue( Integer.toString(ShareUser.ACCESS_READ) );
          int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
          if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_1.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_1, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
          out.write("\n                  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_2.setValue( Integer.toString(ShareUser.ACCESS_SET) );
          int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
          if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_2.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_2, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
          out.write("\n                ");
          int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
      out.write("\n              </td>\n            </tr>\n            \n            <tr>\n              <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td class=\"formField\">\n                <iframe id=\"target_upload\" name=\"target_upload\" src=\"\" style=\"display: none;\"></iframe>\n                <form id=\"daform\" action=\"/graphicalViewsBackgroundUpload\" method=\"post\" enctype=\"multipart/form-data\" target=\"target_upload\">\n                  <input type=\"file\" name=\"backgroundImage\"/><br/>\n                  <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"bgUpload();\"/>&nbsp;\n                  <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"bgClear();\"/>\n                </form>\n              </td>\n            </tr>\n            \n            <tr>\n              <td colspan=\"2\" align=\"center\">\n              </td>\n            </tr>\n          </table>\n        </div>\n      </td>\n      \n      <td valign=\"top\">\n        <div class=\"borderDiv\">\n          ");
      if (_jspx_meth_tag_sharedUsers_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </div>\n      </td>\n    </tr>\n  </table>\n  \n  <table>\n    <tr>\n      <td>\n        ");
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(":\n        <select id=\"componentList\"></select>\n        ");
      if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n      </td>\n      <td style=\"width:30px;\"></td>\n      <td>\n        <input type=\"checkbox\" id=\"iconifyCB\" onclick=\"iconizeClicked();\"/>\n        <label for=\"iconifyCB\">");
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</label>\n      </td>\n    </tr>\n  </table>\n  \n  <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\n    <tr>\n      <td>\n        <table cellspacing=\"0\" cellpadding=\"0\">\n          <tr>\n            <td colspan=\"3\">\n              <div id=\"viewContent\" class=\"borderDiv\" style=\"left:0px;top:0px;float:left;\n                      padding-right:1px;padding-bottom:1px;\">\n                <span id=\"compCoords\" style=\"display:none;\"></span>\n                \n                ");
      if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                \n                ");
      out.write('\n');
      out.write("\n<div id=\"staticEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    <table>\n      <tr>\n        <td class=\"formField\"><textarea id=\"staticPointContent\" rows=\"10\" cols=\"50\"></textarea></td>\n      </tr>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n    function StaticEditor() {\n        this.componentId = null;\n        \n        this.open = function(compId) {\n            staticEditor.componentId = compId;\n            \n            GraphicalViewDwr.getViewComponent(compId, function(comp) {\n                // Update the data in the form.\n                $set(\"staticPointContent\", comp.content);\n                show(\"staticEditorPopup\");\n            });\n            \n            positionEditor(compId, \"staticEditorPopup\");\n        };\n        \n        this.close = function() {\n            hide(\"staticEditorPopup\");\n        };\n        \n        this.save = function() {\n            GraphicalViewDwr.saveHtmlComponent(staticEditor.componentId, $get(\"staticPointContent\"), function() {\n                staticEditor.close();\n                updateHtmlComponentContent(\"c\"+ staticEditor.componentId, $get(\"staticPointContent\"));\n");
      out.write("            });\n        };\n    }\n    var staticEditor = new StaticEditor();\n  </script>\n</div>");
      out.write("\n                ");
      out.write('\n');
      out.write("\n<div id=\"settingsEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n          <span class=\"copyTitle\" id=\"settingsComponentName\"></span>\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    <table>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><select id=\"settingsPointList\"></select><span id=\"settingsPointInfo\"></span></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsPointName\" type=\"text\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsSettable\" type=\"checkbox\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsBkgdColor\" type=\"text\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"settingsControls\" type=\"checkbox\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">x</td>\n        <td class=\"formField\"><input id=\"settingsX\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">y</td>\n        <td class=\"formField\"><input id=\"settingsY\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n  dojo.require(\"dojo.store.Memory\");\n  dojo.require(\"dijit.form.FilteringSelect\");\n  var pointFilteringSelect; //Global to use select easily\n  dojo.ready(function(){\n      // Point lookup\n      pointFilteringSelect = new dijit.form.FilteringSelect({\n          store: new dojo.store.Memory(),\n          autoComplete: false,\n          queryExpr: \"*${0}*\",\n          highlightMatch: \"all\",\n          required: true,\n          onChange: function(point) {\n          \tsettingsEditor.pointSelectChanged();\n          }\n      }, \"settingsPointList\");  \n  })\n  \n  \n    // Script requires\n");
      out.write("    //  - Drag and Drop library for locating objects and positioning the window.\n    //  - DWR utils for using $() prototype.\n    //  - common.js\n    function SettingsEditor() {\n        this.componentId = null;\n        this.pointList = [];\n        \n        this.open = function(compId) {\n            settingsEditor.componentId = compId;\n            \n            GraphicalViewDwr.getViewComponent(compId, function(comp) {\n                $set(\"settingsComponentName\", comp.displayName);\n                \n                // Update the point list\n                settingsEditor.updatePointList(comp.supportedDataTypes);\n                \n                // Update the data in the form.\n                pointFilteringSelect.set('value',comp.dataPointId);\n                $set(\"settingsPointName\", comp.nameOverride);\n                $set(\"settingsSettable\", comp.settableOverride);\n                $set(\"settingsBkgdColor\", comp.bkgdColorOverride);\n                $set(\"settingsControls\", comp.displayControls);\n                $set(\"settingsX\", comp.x);\n");
      out.write("                $set(\"settingsY\", comp.y);\n\n                settingsEditor.pointSelectChanged();\n                show(\"settingsEditorPopup\");\n            });\n            \n            positionEditor(compId, \"settingsEditorPopup\");\n        };\n        \n        this.close = function() {\n            hide(\"settingsEditorPopup\");\n            hideContextualMessages(\"settingsEditorPopup\");\n        };\n        \n        this.save = function() {\n            hideContextualMessages(\"settingsEditorPopup\");\n            GraphicalViewDwr.setPointComponentSettings(settingsEditor.componentId, pointFilteringSelect.value,\n                    $get(\"settingsPointName\"), $get(\"settingsSettable\"), $get(\"settingsBkgdColor\"),\n                    $get(\"settingsControls\"), $get(\"settingsX\"), $get(\"settingsY\"), function(response) {\n                if (response.hasMessages) {\n                    showDwrMessages(response.messages);\n                }\n                else {\n                    var div = $(\"c\"+ settingsEditor.componentId);\n                    div.style.left = response.data.x +\"px\";\n");
      out.write("                    div.style.top = response.data.y +\"px\";\n                    \n                    settingsEditor.close();\n                    MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n                }\n            });\n        };\n        \n        this.setPointList = function(pointList) {\n            settingsEditor.pointList = pointList;\n        };\n        \n        this.pointSelectChanged = function() {\n            var point = getElement(settingsEditor.pointList, $get(\"settingsPointList\"));\n            if (!point || !point.settable) {\n                $set(\"settingsSettable\", false);\n                $(\"settingsSettable\").disabled = true;\n            }\n            else\n                $(\"settingsSettable\").disabled = false;\n        };\n        \n        this.updatePointList = function(dataTypes) {\n\n            pointFilteringSelect.store = new dojo.store.Memory({ data: settingsEditor.pointList });\n\t\t\tpointFilteringSelect.store.data.push({id: 0, name: \"\"});        \t\n\t\t\tpointFilteringSelect.reset();\n        \t\n");
      out.write("//             dwr.util.removeAllOptions(\"settingsPointList\");\n//             var sel = $(\"settingsPointList\");\n//             sel.options[0] = new Option(\"\", 0);\n            \n//             for (var i=0; i<settingsEditor.pointList.length; i++) {\n//                 if (contains(dataTypes, settingsEditor.pointList[i].dataType))\n//                     sel.options[sel.options.length] = new Option(settingsEditor.pointList[i].name,\n//                             settingsEditor.pointList[i].id);\n//             }\n        };\n    }\n    var settingsEditor = new SettingsEditor();\n  </script>\n</div>");
      out.write("\n                ");
      out.write('\n');
      out.write("\n<div id=\"graphicRendererEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n          <span class=\"copyTitle\" id=\"graphicsComponentName\"></span>\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    \n    <table>\n      <tbody id=\"graphicRenderer_analogGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererAnalogMin\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererAnalogMax\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererAnalogDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererAnalogImageSet\" onchange=\"graphicRendererEditor.updateSampleImageSet(this)\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            </select><br/>\n            <img id=\"graphicRendererAnalogImageSetSample\"/>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_binaryGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererBinaryDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererBinaryImageSet\" onchange=\"graphicRendererEditor.displayBinaryImages($get(this));\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            </select>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <div id=\"graphicRendererBinaryImageSetZero\" style=\"width:200px; overflow:auto; white-space:nowrap;\"></div>\n            <input type=\"hidden\" id=\"graphicRendererBinaryImageSetZeroMsg\"/>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <div id=\"graphicRendererBinaryImageSetOne\" style=\"width:200px; overflow:auto; white-space:nowrap;\"></div>\n            <input type=\"hidden\" id=\"graphicRendererBinaryImageSetOneMsg\"/>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_dynamicGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererDynamicMin\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererDynamicMax\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererDynamicDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererDynamicImage\" onchange=\"graphicRendererEditor.updateSampleDynamicImage(this)\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            </select><br/>\n            <img id=\"graphicRendererDynamicImageSample\"/>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_multistateGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererMultistateDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererMultistateImageSet\" onchange=\"graphicRendererEditor.displayMultistateImages($get(this));\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            </select>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\" id=\"graphicRendererMultistateImageSetList\">\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_script\" style=\"display:none;\">\n        <tr>\n          <td colspan=\"2\">\n            <span class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span><br/>\n            <span class=\"formField\"><textarea id=\"graphicRendererScriptScript\" rows=\"10\" cols=\"50\"></textarea></span>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_simpleImage\" style=\"display:none;\">\n        <tr><td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_simple\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererSimpleDisplayPointName\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererSimpleStyleAttribute\" type=\"text\"/></td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_thumbnailImage\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererThumbnailScalePercent\" type=\"text\"/></td>\n        </tr>\n      </tbody>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n    // Script requires\n    //  - Drag and Drop library for locating objects and positioning the window.\n    //  - DWR utils for using $() prototype.\n    //  - common.js\n    function GraphicRendererEditor() {\n        this.currentImageSetId = null;\n        this.zeroImage = -1;\n        this.oneImage = -1;\n        this.componentId = null;\n        this.typeName = null;\n        this.imageSets = ");
      if (_jspx_meth_sst_convert_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(";\n        this.dynamicImages = ");
      if (_jspx_meth_sst_convert_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(";\n        \n        this.open = function(compId) {\n            graphicRendererEditor.currentImageSetId = null;\n            graphicRendererEditor.zeroImage = -1;\n            graphicRendererEditor.oneImage = -1;\n        \n            graphicRendererEditor.componentId = compId;\n            \n            // Set the renderers for the data type of this point view.\n            GraphicalViewDwr.getViewComponent(compId, graphicRendererEditor.setViewComponent);\n            \n            positionEditor(compId, \"graphicRendererEditorPopup\");\n        };\n        \n        this.setViewComponent = function(comp) {\n            graphicRendererEditor.typeName = comp.typeName;\n            $set(\"graphicsComponentName\", comp.displayName);\n            \n            // Clear the form data.\n            $set(\"graphicRendererBinaryDisplayText\");\n            $set(\"graphicRendererBinaryImageSet\");\n            $set(\"graphicRendererMultistateDisplayText\");\n            $set(\"graphicRendererMultistateImageSet\");\n            $set(\"graphicRendererAnalogMin\");\n");
      out.write("            $set(\"graphicRendererAnalogMax\");\n            $set(\"graphicRendererAnalogDisplayText\");\n            $set(\"graphicRendererAnalogImageSet\");\n            $set(\"graphicRendererThumbnailScalePercent\");\n            $set(\"graphicRendererDynamicMin\");\n            $set(\"graphicRendererDynamicMax\");\n            $set(\"graphicRendererDynamicDisplayText\");\n            $set(\"graphicRendererDynamicImage\");\n            $set(\"graphicRendererScriptScript\");\n            $set(\"graphicRendererSimpleDisplayPointName\");\n            $set(\"graphicRendererSimpleStyleAttribute\");\n            graphicRendererEditor.displayBinaryImages(null);\n            graphicRendererEditor.displayMultistateImages(null);\n            \n            // Update the data in the form.\n            if (comp.typeName == \"analogGraphic\") {\n                $set(\"graphicRendererAnalogMin\", comp.min);\n                $set(\"graphicRendererAnalogMax\", comp.max);\n                $set(\"graphicRendererAnalogDisplayText\", comp.displayText);\n                $set(\"graphicRendererAnalogImageSet\", comp.imageSetId);\n");
      out.write("                graphicRendererEditor.updateSampleImageSet($(\"graphicRendererAnalogImageSet\"));\n            }\n            else if (comp.typeName == \"binaryGraphic\") {\n                $set(\"graphicRendererBinaryDisplayText\", comp.displayText);\n                $set(\"graphicRendererBinaryImageSet\", comp.imageSetId);\n                graphicRendererEditor.displayBinaryImages(comp.imageSetId);\n                graphicRendererEditor.setZeroImage(comp.zeroImage);\n                graphicRendererEditor.setOneImage(comp.oneImage);\n            }\n            else if (comp.typeName == \"dynamicGraphic\") {\n                $set(\"graphicRendererDynamicMin\", comp.min);\n                $set(\"graphicRendererDynamicMax\", comp.max);\n                $set(\"graphicRendererDynamicDisplayText\", comp.displayText);\n                $set(\"graphicRendererDynamicImage\", comp.dynamicImageId);\n            }\n            else if (comp.typeName == \"multistateGraphic\") {\n                $set(\"graphicRendererMultistateDisplayText\", comp.displayText);\n");
      out.write("                $set(\"graphicRendererMultistateImageSet\", comp.imageSetId);\n                graphicRendererEditor.displayMultistateImages(comp.imageSetId);\n                var imageStates = comp.imageStateList;\n                \n                var i=0;\n                while ($(\"graphicRendererMultistateState\"+ i))\n                    $set(\"graphicRendererMultistateState\"+ (i++), \"\");\n                for (var i=0; i<imageStates.length; i++)\n                    $set(\"graphicRendererMultistateState\"+ imageStates[i].key, imageStates[i].value);\n                $set(\"graphicRendererMultistateDefault\", comp.defaultImage);\n            }\n            else if (comp.typeName == \"script\")\n                $set(\"graphicRendererScriptScript\", comp.script);\n            else if (comp.typeName == \"simple\") {\n                $set(\"graphicRendererSimpleDisplayPointName\", comp.displayPointName);\n                $set(\"graphicRendererSimpleStyleAttribute\", comp.styleAttribute);\n            } else if (comp.typeName == \"thumbnailImage\")\n");
      out.write("                $set(\"graphicRendererThumbnailScalePercent\", comp.scalePercent);\n            \n            show(\"graphicRenderer_\"+ comp.typeName);\n            show(\"graphicRendererEditorPopup\");\n        };\n    \n        this.close = function() {\n            hide(\"graphicRendererEditorPopup\");\n            hideContextualMessages(\"graphicRendererEditorPopup\");\n            if (graphicRendererEditor.typeName)\n                hide(\"graphicRenderer_\"+ graphicRendererEditor.typeName);\n        };\n        \n        this.save = function() {\n            hideContextualMessages(\"graphicRendererEditorPopup\");\n            \n            if (graphicRendererEditor.typeName == \"analogGraphic\")\n                GraphicalViewDwr.saveAnalogGraphicComponent(graphicRendererEditor.componentId, $get(\"graphicRendererAnalogMin\"),\n                        $get(\"graphicRendererAnalogMax\"), $get(\"graphicRendererAnalogDisplayText\"),\n                        $get(\"graphicRendererAnalogImageSet\"), graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"binaryGraphic\")\n");
      out.write("                GraphicalViewDwr.saveBinaryGraphicComponent(graphicRendererEditor.componentId, graphicRendererEditor.zeroImage,\n                        graphicRendererEditor.oneImage, $get(\"graphicRendererBinaryDisplayText\"),\n                        $get(\"graphicRendererBinaryImageSet\"), graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"dynamicGraphic\")\n                GraphicalViewDwr.saveDynamicGraphicComponent(graphicRendererEditor.componentId,\n                        $get(\"graphicRendererDynamicMin\"), $get(\"graphicRendererDynamicMax\"),\n                        $get(\"graphicRendererDynamicDisplayText\"), $get(\"graphicRendererDynamicImage\"),\n                        graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"multistateGraphic\") {\n                var imageSet = $get(\"graphicRendererMultistateImageSet\");\n                var i = 0, j;\n                var imageStates = new Array();\n                if (imageSet) {\n                    while ($(\"graphicRendererMultistateState\"+ i)) {\n");
      out.write("                        text = $get(\"graphicRendererMultistateState\"+ i);\n                        if (text.trim() != \"\")\n                            imageStates[imageStates.length] = {key: i, value: text};\n                        i++;\n                    }\n                }\n                \n                GraphicalViewDwr.saveMultistateGraphicComponent(graphicRendererEditor.componentId, imageStates,\n                        $get(\"graphicRendererMultistateDefault\"), $get(\"graphicRendererMultistateDisplayText\"),\n                        imageSet, graphicRendererEditor.saveCB);\n            }\n            else if (graphicRendererEditor.typeName == \"script\")\n                GraphicalViewDwr.saveScriptComponent(graphicRendererEditor.componentId, $get(\"graphicRendererScriptScript\"),\n                        graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"simple\")\n                GraphicalViewDwr.saveSimplePointComponent(graphicRendererEditor.componentId,\n                        $get(\"graphicRendererSimpleDisplayPointName\"), \n");
      out.write("                        $get(\"graphicRendererSimpleStyleAttribute\"), graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"thumbnailImage\")\n                GraphicalViewDwr.saveThumbnailComponent(graphicRendererEditor.componentId,\n                        $get(\"graphicRendererThumbnailScalePercent\"), graphicRendererEditor.saveCB);\n            else\n                graphicRendererEditor.close();\n        };\n        \n        this.saveCB = function(response) {\n            if (response.hasMessages)\n                showDwrMessages(response.messages);\n            else {\n                graphicRendererEditor.close();\n                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n            }\n        };\n        \n        this.displayBinaryImages = function(imageSetId) {\n            graphicRendererEditor.setZeroImage(-1);\n            graphicRendererEditor.setOneImage(-1);\n            graphicRendererEditor.currentImageSetId = imageSetId;\n            \n            var imageSet = graphicRendererEditor.findImageSet(imageSetId);\n");
      out.write("            if (imageSet) {\n                $set(\"graphicRendererBinaryImageSetZero\", graphicRendererEditor.createImageList(imageSet, \"Zero\"));\n                $set(\"graphicRendererBinaryImageSetOne\", graphicRendererEditor.createImageList(imageSet, \"One\"));\n            }\n            else {\n                $set(\"graphicRendererBinaryImageSetZero\");\n                $set(\"graphicRendererBinaryImageSetOne\");\n            }\n        };\n        \n        this.createImageList = function(imageSet, type) {\n            var html = \"\";\n            for (var i=0; i<imageSet.imageFilenames.length; i++) {\n                html += \"<a\\\n                  href='javascript:void(0)' onclick='graphicRendererEditor.set\"+ type +\"Image(\"+ i +\")'><img\\\n                    id='graphicRendererBinaryImageSet\"+ type + i +\"' src='\"+ imageSet.imageFilenames[i] +\"'\\\n                    style='display:inline;'/></a>&nbsp;\";\n            }\n            return html;\n        };\n        \n        this.displayMultistateImages = function(imageSetId) {\n            var imageSet = graphicRendererEditor.findImageSet(imageSetId);\n");
      out.write("            var graphicImg = '");
      if (_jspx_meth_tag_img_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("';\n            if (imageSet) {\n                var html = \"\\\n                    <table>\\\n                      <tr>\\\n                        <th>");
      if (_jspx_meth_fmt_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\\\n                        <th>");
      if (_jspx_meth_fmt_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\\\n                        <th>");
      if (_jspx_meth_fmt_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\\\n                      </tr>\";\n\n                for (var i=0; i<imageSet.imageFilenames.length; i++) {\n                    html += \"\\\n                        <tr>\\\n                          <td align='center'>\\\n                            <div onmouseover='show(\\\"graphicRendererMultistateImageSet\"+ i +\"\\\");'\\\n                                    onmouseout='hide(\\\"graphicRendererMultistateImageSet\"+ i +\"\\\");'\\\n                                    style='position:relative;display:inline;'>\"+ graphicImg +\"<div \\\n                                    id='graphicRendererMultistateImageSet\"+ i +\"' class='imageDiv'\\\n                                    style='display:none;top:18px;'><img src='\"+ imageSet.imageFilenames[i] +\"'/></div></div>\\\n                          </td>\\\n                          <td><input id='graphicRendererMultistateState\"+ i +\"' type='text' class='formShort'/></td>\\\n                          <td align='center'><input type='radio' name='graphicRendererMultistateDefault' value='\"+ i +\"'/></td>\\\n");
      out.write("                        </tr>\";\n                }\n                \n                html += \"</table>\";\n                \n                $set(\"graphicRendererMultistateImageSetList\", html);\n            }\n            else\n                $set(\"graphicRendererMultistateImageSetList\");\n        };\n        \n        this.setZeroImage = function(imageId) {\n            var image;\n            if (graphicRendererEditor.zeroImage != -1 && graphicRendererEditor.currentImageSetId)\n                dojo.removeClass(\"graphicRendererBinaryImageSetZero\"+ graphicRendererEditor.zeroImage, \"selectedImage\");\n            graphicRendererEditor.zeroImage = imageId;\n            if (graphicRendererEditor.zeroImage != -1 && graphicRendererEditor.currentImageSetId)\n                dojo.addClass(\"graphicRendererBinaryImageSetZero\"+ graphicRendererEditor.zeroImage, \"selectedImage\");\n        };\n        this.setOneImage = function(imageId) {\n            var image;\n            if (graphicRendererEditor.oneImage != -1 && graphicRendererEditor.currentImageSetId)\n");
      out.write("                dojo.removeClass(\"graphicRendererBinaryImageSetOne\"+ graphicRendererEditor.oneImage, \"selectedImage\");\n            graphicRendererEditor.oneImage = imageId;\n            if (graphicRendererEditor.oneImage != -1 && graphicRendererEditor.currentImageSetId)\n                dojo.addClass(\"graphicRendererBinaryImageSetOne\"+ graphicRendererEditor.oneImage, \"selectedImage\");\n        };\n        \n        this.updateSampleImageSet = function(selectComp) {\n            var img = $(selectComp.id +\"Sample\");\n            var imageSet = graphicRendererEditor.findImageSet($get(selectComp));\n            if (imageSet) {\n                img.src = imageSet.imageFilenames[0];\n                show(img);\n            }\n            else\n                hide(img);\n        };\n        \n        this.updateSampleDynamicImage = function(selectComp) {\n            var img = $(selectComp.id +\"Sample\");\n            var dynamicImage = graphicRendererEditor.findDynamicImage($get(selectComp));\n            if (dynamicImage) {\n                img.src = dynamicImage.imageFilename;\n");
      out.write("                show(img);\n            }\n            else\n                hide(img);\n        };\n        \n        this.findImageSet = function(id) {\n            for (var i=0; i<graphicRendererEditor.imageSets.length; i++) {\n                if (graphicRendererEditor.imageSets[i].id == id)\n                    return graphicRendererEditor.imageSets[i];\n            }\n            return null;\n        };\n        \n        this.findDynamicImage = function(id) {\n            for (var i=0; i<graphicRendererEditor.dynamicImages.length; i++) {\n                if (graphicRendererEditor.dynamicImages[i].id == id)\n                    return graphicRendererEditor.dynamicImages[i];\n            }\n            return null;\n        };\n    }\n    var graphicRendererEditor = new GraphicRendererEditor();\n  </script>\n</div>");
      out.write("\n                ");
      out.write('\n');
      out.write("\n\n<div id=\"compoundEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n          <span class=\"copyTitle\" id=\"compoundComponentName\"></span>\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    <table>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"compoundName\" type=\"text\"/></td>\n      </tr>\n      <tbody id=\"simpleCompoundAttrs\">\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"compoundBackgroundColour\" type=\"text\"/></td>\n        </tr>\n      </tbody>\n      <tbody id=\"imageChartAttrs\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"imageChartWidth\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"imageChartHeight\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <input type=\"text\" id=\"imageChartDurationPeriods\" class=\"formShort\"/>\n            ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n          </td>\n        </tr>\n      </tbody>\n      <tbody id=\"pointLists\"></tbody>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n    function CompoundEditor() {\n        this.component = null;\n        this.pointList = [];\n        \n        this.open = function(compId) {\n            GraphicalViewDwr.getViewComponent(compId, function(comp) {\n                compoundEditor.component = comp;\n                $set(\"compoundComponentName\", comp.displayName);\n                \n                // Update the point lists\n                compoundEditor.updatePointLists();\n                \n                // Update the data in the form.\n                $set(\"compoundName\", comp.name);\n                \n                if (comp.defName == \"simpleCompound\") {\n                    $set(\"compoundBackgroundColour\", comp.backgroundColour);\n                    show(\"simpleCompoundAttrs\");\n                }\n                else\n                    hide(\"simpleCompoundAttrs\");\n                \n                if (comp.defName == \"imageChart\") {\n");
      out.write("                    $set(\"imageChartWidth\", comp.width);\n                    $set(\"imageChartHeight\", comp.height);\n                    $set(\"imageChartDurationType\", comp.durationType);\n                    $set(\"imageChartDurationPeriods\", comp.durationPeriods);\n                    show(\"imageChartAttrs\");\n                }\n                else\n                    hide(\"imageChartAttrs\");\n                \n                show(\"compoundEditorPopup\");\n            });\n            \n            positionEditor(compId, \"compoundEditorPopup\");\n        };\n        \n        this.close = function() {\n            hide(\"compoundEditorPopup\");\n            hideContextualMessages(\"compoundEditorPopup\");\n        };\n        \n        this.save = function() {\n            hideContextualMessages(\"compoundEditorPopup\");\n            \n            // Gather the point settings\n            var pointChildren = compoundEditor.getPointChildren();\n            var childPointIds = new Array();\n            var sel;\n            for (var i=0; i<pointChildren.length; i++)\n");
      out.write("                childPointIds.push({key: pointChildren[i].id, value: $get(\"compoundPointSelect\"+ pointChildren[i].id)});\n            \n            if (compoundEditor.component.defName == \"simpleCompound\")\n                GraphicalViewDwr.saveSimpleCompoundComponent(compoundEditor.component.id, $get(\"compoundName\"),\n                        $get(\"compoundBackgroundColour\"), childPointIds, compoundEditor.saveCB);\n            else if (compoundEditor.component.defName == \"imageChart\")\n                GraphicalViewDwr.saveImageChartComponent(compoundEditor.component.id, $get(\"compoundName\"),\n                        $get(\"imageChartWidth\"), $get(\"imageChartHeight\"), $get(\"imageChartDurationType\"),\n                        $get(\"imageChartDurationPeriods\"), childPointIds, compoundEditor.saveCB);\n            else\n                GraphicalViewDwr.saveCompoundComponent(compoundEditor.component.id, $get(\"compoundName\"), childPointIds,\n                        compoundEditor.saveCB);\n        };\n        \n        this.saveCB = function(response) {\n");
      out.write("            if (response.hasMessages)\n                showDwrMessages(response.messages);\n            else {\n                if (compoundEditor.component.defName == \"simpleCompound\")\n                    $(\"c\"+ compoundEditor.component.id +\"Info\").style.background = $get(\"compoundBackgroundColour\");\n                \n                compoundEditor.close();\n                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n            }\n        };\n        \n        this.setPointList = function(pointList) {\n            compoundEditor.pointList = pointList;\n        };\n        \n        this.updatePointLists = function() {\n            var pointChildren = compoundEditor.getPointChildren();\n            \n            // Create the select controls\n            dwr.util.removeAllRows(\"pointLists\");\n            dwr.util.addRows(\"pointLists\", pointChildren,\n                [\n                    function(data) { return data.description; },\n                    function(data) { return '<select id=\"compoundPointSelect'+ data.id +'\"></select>'; }\n");
      out.write("                ],\n                {\n                    cellCreator: function(options) {\n                        var td = document.createElement(\"td\");\n                        if (options.cellNum == 0) {\n                            if (compoundEditor.component.defName == \"simpleCompound\" &&\n                                    options.rowData.id == \"");
      out.print( SimpleCompoundComponent.LEAD_POINT );
      out.write("\")\n                                td.className = \"formLabelRequired\";\n                            else\n                                td.className = \"formLabel\";\n                        }\n                        else if (options.cellNum == 1)\n                            td.className = \"formField\";\n                        return td;\n                    }\n                }\n            );\n            \n            // Add options to the controls.\n            var sel, p;\n            for (var i=0; i<pointChildren.length; i++) {\n                sel = $(\"compoundPointSelect\"+ pointChildren[i].id);\n                sel.options[0] = new Option(\"\", 0);\n                for (p=0; p<compoundEditor.pointList.length; p++) {\n                    if (contains(pointChildren[i].dataTypes, compoundEditor.pointList[p].dataType))\n                        sel.options[sel.options.length] = new Option(settingsEditor.pointList[p].name,\n                                settingsEditor.pointList[p].id);\n                }\n                \n                // Set the control default value.\n");
      out.write("                $set(sel, pointChildren[i].viewComponent.dataPointId);\n            }\n        };\n        \n        this.getPointChildren = function() {\n            var pointChildren = new Array();\n            for (var i=0; i<compoundEditor.component.childComponents.length; i++) {\n                if (compoundEditor.component.childComponents[i].viewComponent.pointComponent)\n                    pointChildren.push(compoundEditor.component.childComponents[i]);\n            }\n            return pointChildren;\n        };\n    }\n    var compoundEditor = new CompoundEditor();\n  </script>\n</div>");
      out.write("\n              </div>\n            </td>\n          </tr>\n          \n          <tr><td colspan=\"3\">&nbsp;</td></tr>\n          \n          <tr>\n            <td colspan=\"2\" align=\"center\">\n              <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"saveView();\"/>\n              <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"deleteView();\"/>\n              <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"cancelEdit();\"/>\n            </td>\n            <td></td>\n          </tr>\n        </table>\n      \n        <div id=\"pointTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\n                onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\n                style=\"position:absolute;left:0px;top:0px;display:none;\">\n          <div id=\"c_TEMPLATE_Content\"><img src=\"images/icon_comp.png\" alt=\"\"/></div>\n          <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\n            <table cellpadding=\"0\" cellspacing=\"1\">\n              <tr onmouseover=\"showMenu('c'+ getViewComponentId(this) +'Info', 16, 0);\"\n                      onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Info');\">\n                <td>\n                  <img src=\"images/information.png\" alt=\"\"/>\n                  <div id=\"c_TEMPLATE_Info\" onmouseout=\"hideLayer(this);\">\n                    ");
      if (_jspx_meth_tag_img_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                  </div>\n                </td>\n              </tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n            </table>\n          </div>\n          <div style=\"position:absolute;left:-16px;top:0px;z-index:1;\">\n            <div id=\"c_TEMPLATE_Warning\" style=\"display:none;\"\n                    onmouseover=\"showMenu('c'+ getViewComponentId(this) +'Messages', 16, 0);\"\n                    onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Messages');\">\n              ");
      if (_jspx_meth_tag_img_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              <div id=\"c_TEMPLATE_Messages\" onmouseout=\"hideLayer(this);\" class=\"controlContent\"></div>\n            </div>\n          </div>\n        </div>\n        \n        <div id=\"htmlTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\n                onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\n                style=\"position:absolute;left:0px;top:0px;display:none;\">\n          <div id=\"c_TEMPLATE_Content\"></div>\n          <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\n            <table cellpadding=\"0\" cellspacing=\"1\">\n              <tr><td>");
      if (_jspx_meth_tag_img_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n            </table>\n          </div>\n        </div>\n        \n        <div id=\"imageChartTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\n                onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\n                style=\"position:absolute;left:0px;top:0px;display:none;\">\n          <span id=\"c_TEMPLATE_Content\"></span>\n          <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\n            <table cellpadding=\"0\" cellspacing=\"1\">\n              <tr><td>");
      if (_jspx_meth_tag_img_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n            </table>\n          </div>\n        </div>\n          \n        <div id=\"compoundTemplate\" onmouseover=\"showLayer('c'+ getViewComponentId(this) +'Controls');\"\n                onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Controls');\"\n                style=\"position:absolute;left:0px;top:0px;display:none;\">\n          <span id=\"c_TEMPLATE_Content\"></span>\n          <div id=\"c_TEMPLATE_Controls\" class=\"controlsDiv\">\n            <table cellpadding=\"0\" cellspacing=\"1\">\n              <tr onmouseover=\"showMenu('c'+ getViewComponentId(this) +'Info', 16, 0);\"\n                      onmouseout=\"hideLayer('c'+ getViewComponentId(this) +'Info');\">\n                <td>\n                  <img src=\"images/information.png\" alt=\"\"/>\n                  <div id=\"c_TEMPLATE_Info\" onmouseout=\"hideLayer(this);\">\n                    ");
      if (_jspx_meth_tag_img_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                  </div>\n                </td>\n              </tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n              <tr><td>");
      if (_jspx_meth_tag_img_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td></tr>\n            </table>\n          </div>\n          \n          <div id=\"c_TEMPLATE_ChildComponents\"></div>\n        </div>\n        \n        <div id=\"compoundChildTemplate\" style=\"position:absolute;left:0px;top:0px;display:none;\">\n          <div id=\"c_TEMPLATE_Content\"><img src=\"images/icon_comp.png\" alt=\"\"/></div>\n        </div>\n      </td>\n    </tr>\n  </table>\n");
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
