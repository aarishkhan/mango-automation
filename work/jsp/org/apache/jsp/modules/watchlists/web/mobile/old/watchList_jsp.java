package org.apache.jsp.modules.watchlists.web.mobile.old;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Constants;
import com.serotonin.m2m2.Common;
import com.serotonin.m2m2.view.ShareUser;

public final class watchList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("sst:escapeLessThan", com.serotonin.web.taglib.Functions.class, "escapeLessThan", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(14);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/sharedUsers.tag");
    _jspx_dependants.add("/WEB-INF/tags/dateRange.tag");
    _jspx_dependants.add("/WEB-INF/tags/monthOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/dayOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/hourOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/minuteOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/secondOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_moduleExists_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onmouseover_onchange_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_moduleExists_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_onmouseover_onchange_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_m2m2_moduleExists_name.release();
    _jspx_tagPool_sst_select_value_onmouseover_onchange_id.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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

      out.write("\n\n\n\n");
      out.write('\n');
      out.write('\n');
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_page_0        );
      }
      _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_page_0.setDwr("WatchListDwr");
      _jspx_th_tag_page_0.setJs((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/resources/view.js,${modulePath}/web/watchList.js", java.lang.String.class, (PageContext)_jspx_page_context, null));
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new watchList_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null);
      _jspx_th_tag_page_0.setStyles(_jspx_temp0);
      _jspx_th_tag_page_0.setJspBody(new watchList_jspHelper( 1, _jspx_page_context, _jspx_th_tag_page_0, null));
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("watchlist.addToWatchlist");
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
    _jspx_th_fmt_message_1.setKey("watchlist.noExportables");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_m2m2_moduleExists_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:moduleExists
    com.serotonin.m2m2.web.taglib.ModuleExistsTag _jspx_th_m2m2_moduleExists_0 = (com.serotonin.m2m2.web.taglib.ModuleExistsTag) _jspx_tagPool_m2m2_moduleExists_name.get(com.serotonin.m2m2.web.taglib.ModuleExistsTag.class);
    _jspx_th_m2m2_moduleExists_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_moduleExists_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_moduleExists_0.setName("reports");
    int _jspx_eval_m2m2_moduleExists_0 = _jspx_th_m2m2_moduleExists_0.doStartTag();
    if (_jspx_eval_m2m2_moduleExists_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n        function createReport() {\n            var pointIds = getChartPointList();\n            var pointList = \"\";\n            for (var i=0; i<pointIds.length; i++) {\n                if (i > 0)\n                    pointList += \",\";\n                pointList += pointIds[i];\n            }\n\n            var select = $(\"watchListSelect\");\n            var name = escape(select.options[select.selectedIndex].text);\n            window.location='reports.shtm?createName='+ name +'&createPoints='+ pointList;\n        }\n      ");
        int evalDoAfterBody = _jspx_th_m2m2_moduleExists_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_m2m2_moduleExists_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_moduleExists_name.reuse(_jspx_th_m2m2_moduleExists_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_moduleExists_name.reuse(_jspx_th_m2m2_moduleExists_0);
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
    _jspx_th_fmt_message_2.setKey("watchlist.watchlist");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
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
    _jspx_th_tag_help_0.setId("watchList");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_sst_select_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onmouseover_onchange_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_select_0.setId("watchListSelect");
    _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${selectedWatchList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sst_select_0.setOnchange("watchListChanged()");
    _jspx_th_sst_select_0.setOnmouseover("closeLayers();");
    int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
    if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                  ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\n                ");
        int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_onmouseover_onchange_id.reuse(_jspx_th_sst_select_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_select_value_onmouseover_onchange_id.reuse(_jspx_th_sst_select_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${watchLists}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("wl");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                    ");
          if (_jspx_meth_sst_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n                  ");
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

  private boolean _jspx_meth_sst_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_sst_option_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${wl.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_0.doInitBody();
      }
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:escapeLessThan(wl.value)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
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
    _jspx_th_tag_img_0.setId("wlEditImg");
    _jspx_th_tag_img_0.setPng("pencil");
    _jspx_th_tag_img_0.setTitle("watchlist.editListName");
    _jspx_th_tag_img_0.doTag();
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
    _jspx_th_fmt_message_3.setKey("watchlist.newListName");
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
    _jspx_th_fmt_message_4.setKey("common.save");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_tag_img_1.setPng("user");
    _jspx_th_tag_img_1.setTitle("share.sharing");
    _jspx_th_tag_img_1.setOnmouseover("closeLayers();");
    _jspx_th_tag_img_1.doTag();
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
    _jspx_th_tag_sharedUsers_0.setDoxId("watchListSharing");
    _jspx_th_tag_sharedUsers_0.setNoUsersKey("share.noWatchlistUsers");
    _jspx_th_tag_sharedUsers_0.setCloseFunction("hideLayer('usersEdit')");
    _jspx_th_tag_sharedUsers_0.doTag();
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
    _jspx_th_tag_img_2.setPng("copy");
    _jspx_th_tag_img_2.setOnclick("addWatchList(true)");
    _jspx_th_tag_img_2.setTitle("watchlist.copyList");
    _jspx_th_tag_img_2.setOnmouseover("closeLayers();");
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
    _jspx_th_tag_img_3.setPng("add");
    _jspx_th_tag_img_3.setOnclick("addWatchList(false)");
    _jspx_th_tag_img_3.setTitle("watchlist.addNewList");
    _jspx_th_tag_img_3.setOnmouseover("closeLayers();");
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
    _jspx_th_tag_img_4.setPng("delete");
    _jspx_th_tag_img_4.setId("watchListDeleteImg");
    _jspx_th_tag_img_4.setOnclick("deleteWatchList()");
    _jspx_th_tag_img_4.setTitle("watchlist.deleteList");
    _jspx_th_tag_img_4.setStyle("display:none;");
    _jspx_th_tag_img_4.setOnmouseover("closeLayers();");
    _jspx_th_tag_img_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_5(javax.servlet.jsp.tagext.JspTag _jspx_th_m2m2_moduleExists_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_5 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_5      );
    }
    _jspx_th_tag_img_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_5.setParent(_jspx_th_m2m2_moduleExists_1);
    _jspx_th_tag_img_5.setSrc((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/${modulesDir}/reports/web/report_add.png", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_img_5.setOnclick("createReport();");
    _jspx_th_tag_img_5.setTitle("watchlist.createReport");
    _jspx_th_tag_img_5.setOnmouseover("closeLayers();");
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
    _jspx_th_tag_img_6.setPng("hourglass");
    _jspx_th_tag_img_6.setTitle("common.gettingData");
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
    _jspx_th_tag_img_7.setPng("hourglass");
    _jspx_th_tag_img_7.setTitle("common.gettingData");
    _jspx_th_tag_img_7.doTag();
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
    _jspx_th_fmt_message_5.setKey("watchlist.consolidatedChart");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
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
    _jspx_th_tag_img_8.setPng("icon_comp");
    _jspx_th_tag_img_8.setTitle("watchlist.pointDetails");
    _jspx_th_tag_img_8.setOnclick("window.location='data_point_details.shtm?dpid='+ getMangoId(this)");
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
    _jspx_th_tag_img_9.setPng("arrow_up_thin");
    _jspx_th_tag_img_9.setId("p_TEMPLATE_MoveUp");
    _jspx_th_tag_img_9.setTitle("watchlist.moveUp");
    _jspx_th_tag_img_9.setStyle("display:none;");
    _jspx_th_tag_img_9.setOnclick("moveRowUp('p'+ getMangoId(this));");
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
    _jspx_th_tag_img_10.setPng("arrow_down_thin");
    _jspx_th_tag_img_10.setId("p_TEMPLATE_MoveDown");
    _jspx_th_tag_img_10.setTitle("watchlist.moveDown");
    _jspx_th_tag_img_10.setStyle("display:none;");
    _jspx_th_tag_img_10.setOnclick("moveRowDown('p'+ getMangoId(this));");
    _jspx_th_tag_img_10.doTag();
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
    _jspx_th_tag_img_11.setId("p_TEMPLATE_Delete");
    _jspx_th_tag_img_11.setPng("bullet_delete");
    _jspx_th_tag_img_11.setTitle("watchlist.delete");
    _jspx_th_tag_img_11.setStyle("display:none;");
    _jspx_th_tag_img_11.setOnclick("removeFromWatchList(getMangoId(this))");
    _jspx_th_tag_img_11.doTag();
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
    _jspx_th_fmt_message_6.setKey("watchlist.emptyList");
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
    _jspx_th_fmt_message_7.setKey("watchlist.chart");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_tag_help_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_1 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_1      );
    }
    _jspx_th_tag_help_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_1.setParent(_jspx_parent);
    _jspx_th_tag_help_1.setId("watchListCharts");
    _jspx_th_tag_help_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_dateRange_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dateRange
    org.apache.jsp.tag.web.dateRange_tag _jspx_th_tag_dateRange_0 = new org.apache.jsp.tag.web.dateRange_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dateRange_0      );
    }
    _jspx_th_tag_dateRange_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_dateRange_0.setParent(_jspx_parent);
    _jspx_th_tag_dateRange_0.doTag();
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
    _jspx_th_tag_img_12.setId("imageChartImg");
    _jspx_th_tag_img_12.setPng("control_play_blue");
    _jspx_th_tag_img_12.setTitle("watchlist.imageChartButton");
    _jspx_th_tag_img_12.setOnclick("getImageChart()");
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
    _jspx_th_tag_img_13.setId("chartDataImg");
    _jspx_th_tag_img_13.setPng("bullet_down");
    _jspx_th_tag_img_13.setTitle("watchlist.chartDataButton");
    _jspx_th_tag_img_13.setOnclick("getChartData()");
    _jspx_th_tag_img_13.doTag();
    return false;
  }

  private class watchList_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public watchList_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<style>\n    html > body .dijitTreeNodeLabelSelected {\n        background-color: inherit;\n        color: inherit;\n    }\n    .watchListAttr { min-width:600px; }\n    .rowIcons img { padding-right: 3px; }\n    html > body .dijitSplitContainerSizerH {\n        border: 1px solid #FFFFFF;\n        background-color: #F07800;\n        margin-top:4px;\n        margin-bottom:4px;\n    }\n    .dijitSplitContainer-child { border: none !important; }\n    .dijitTreeIcon { display: none; }\n    .wlComponentMin {\n        top:0px;\n        left:0px;\n        position:relative;\n        margin:0px;\n        padding:0px;\n        width:16px;\n        height:16px;\n    }\n    </style>");
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n    <script type=\"text/javascript\">\n      dojo.require(\"dijit.layout.SplitContainer\");\n      dojo.require(\"dijit.layout.ContentPane\");\n      dojo.require(\"dijit.Tree\");\n      dojo.require(\"dijit.tree.TreeStoreModel\");\n      dojo.require(\"dojo.data.ItemFileWriteStore\");\n      dojo.require(\"dojo.store.Memory\");\n      dojo.require(\"dijit.form.FilteringSelect\");\n      \n      mango.view.initWatchlist();\n      mango.share.dwr = WatchListDwr;\n      var owner;\n      var pointNames = {};\n      var pointList = [];\n      var watchlistChangeId = 0;\n      var iconSrc = \"images/bullet_go.png\";\n      \n      dojo.ready(function() {\n          WatchListDwr.init(function(data) {\n              mango.share.users = data.shareUsers;\n              \n              // Create the item store\n              var storeItems = [];\n              addFolder(storeItems, data.pointFolder);\n              var store = new dojo.data.ItemFileWriteStore({data: { label: 'name', items: storeItems } });\n              function $$(item, attr) { return store.getValue(item, attr); };\n");
      out.write("              \n              // Create the tree.\n              var tree = new dijit.Tree({\n                  model: new dijit.tree.ForestStoreModel({ store: store }),\n                  showRoot: false,\n                  persist: false,\n                  onClick: function(item) {\n                      var pointId = $$(item, \"pointId\");\n                      if (pointId)\n                          addToWatchList(pointId);\n                  },\n                  _createTreeNode: function(/*Object*/ args){\n                      var tnode = new dijit._TreeNode(args);\n                      tnode.labelNode.innerHTML = args.label;\n                      return tnode;\n                  },\n                  onOpen: function(item, node) {\n                      if (item.children) {\n                          for (var i=0; i<item.children.length; i++) {\n                              var child = item.children[i];\n                              if ($$(child, \"fresh\")) {\n                                  // Initialize the node\n                                  var pointId = $$(child, \"pointId\");\n");
      out.write("                                  var img = $(\"ph\"+ pointId +\"Image\");\n                                  img.src = iconSrc;\n                                  img.mangoName = \"pointTreeIcon\";\n                                  \n                                  togglePointTreeIcon(pointId, !$(\"p\"+ pointId));\n                                  \n                                  delete child.fresh;\n                              }\n                          }\n                      }\n                  }\n              }, \"tree\");\n              \n              hide(\"loadingImg\");\n              show(\"treeDiv\");\n              \n              // Add default points.\n              displayWatchList(data.selectedWatchList);\n              maybeDisplayDeleteImg();\n              \n              // Create the lookup\n              new dijit.form.FilteringSelect({\n                  store: new dojo.store.Memory({ data: pointList }),\n                  labelAttr: \"fancyName\",\n                  labelType: \"html\",\n                  searchAttr: \"name\",                  \n");
      out.write("                  autoComplete: false,\n                  style: \"width: 100%;\",\n                  queryExpr: \"*${0}*\",\n                  highlightMatch: \"all\",\n                  required: false,\n                  //onKeyPress: function() {\n                  //    alert(\"open: \"+ this._opened);\n                  //},\n                  onChange: function(point) {\n                      if (this.item) {\n                          addToWatchList(this.item.id);\n                          this.reset();\n                      }\n                  }\n              }, \"picker\");\n              \n              // Start EXPERIMENTAL\n//               var n = dojo.query(\"#widget_picker > .dijitValidationContainer\");\n//               var d = '<div id=\"pickerAddAll\" class=\"dijitReset\" style=\"float:right; display:inline; padding: 1px; background-color: #FFF; \">\\\n//                          <input class=\"dijitReset dijitInputField\" style=\"width:16px; background-image: url(images/add.png)\" type=\"text\" role=\"presentation\" readonly=\"readonly\" tabindex=\"-1\" value=\"\">\\\n");
      out.write("//                        </div>';\n//               dojo.place(d, n[0], \"before\");\n//               dojo.query(\"#pickerAddAll\")[0].onclick = function() { alert(\"asdf\"); };\n              // End EXPERIMENTAL\n          });\n          \n          WatchListDwr.getDateRangeDefaults(");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_0.setValue( Common.TimePeriods.DAYS );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write(", 1, function(data) { setDateRange(data); });\n          \n          function addFolder(parent, pointFolder) {\n              var i;\n              // Add subfolders\n              for (i=0; i<pointFolder.subfolders.length; i++) {\n                  var folder = pointFolder.subfolders[i];\n                  var node = {name: \"<img src='images/folder_brick.png'/> \"+ folder.name, children: []};\n                  parent.push(node);\n                  addFolder(node.children, folder);\n              }\n              \n              // Add points\n              for (i=0; i<pointFolder.points.length; i++) {\n                  var dps = pointFolder.points[i];\n                  var node = {pointId: dps.id, fresh: true };\n                  var name = dps.extendedName;\n                  node.name = \"<img src='images/icon_comp.png'/> <span id='ph\"+ dps.id +\"Name'>\"+ name +\"</span> \"+\n                      \"<img src='images/bullet_go.png' id='ph\"+ dps.id +\"Image' title='");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("'/>\";\n                  parent.push(node);\n                  pointNames[dps.id] = dps;\n                  pointList.push(dps);\n                  dps.fancyName = name;\n              }\n          }\n          \n          // Wire up the tree options\n          dojo.connect($(\"pointTree\"), \"onclick\", function() {\n              if (!dojo.hasClass(this, \"active\")) {\n                  dojo.addClass(this, \"active\");\n                  dojo.removeClass($(\"pointLookup\"), \"active\");\n                  hide(\"pickerDiv\");\n                  show(\"treeDiv\");\n              }\n          });\n          \n          dojo.connect($(\"pointLookup\"), \"onclick\", function() {\n              if (!dojo.hasClass(this, \"active\")) {\n                  dojo.addClass(this, \"active\");\n                  dojo.removeClass($(\"pointTree\"), \"active\");\n                  hide(\"treeDiv\");\n                  show(\"pickerDiv\");\n              }\n          });\n      });\n      \n      function displayWatchList(data) {\n          if (!data.points)\n              // Couldn't find the watchlist. Reload the page\n");
      out.write("              window.location.reload();\n          \n          var points = data.points;\n          owner = data.access == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_1.setValue( ShareUser.ACCESS_OWNER );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write(";\n          \n          // Add the new rows.\n          for (var i=0; i<points.length; i++) {\n              if (!pointNames[points[i]]) {\n                  // The point id isn't in the list. Refresh the page to ensure we have current data.\n                  window.location.reload();\n                  return;\n              }\n              addToWatchListImpl(points[i]);\n          }\n          \n          fixRowFormatting();\n          mango.view.watchList.reset();\n          \n          var select = $(\"watchListSelect\");\n          var txt = $(\"newWatchListName\");\n          $set(txt, select.options[select.selectedIndex].text);\n          \n          // Display controls based on access\n          if (owner) {\n              show(\"wlEditDiv\", \"inline\");\n              show(\"usersEditDiv\", \"inline\");\n              \n              // Set the share users.\n              mango.share.writeSharedUsers(data.users);\n              iconSrc = \"images/bullet_go.png\";\n          }\n          else {\n              hide(\"wlEditDiv\");\n              hide(\"usersEditDiv\");\n");
      out.write("              iconSrc = \"images/bullet_key.png\";\n          }\n          \n          var icons = getElementsByMangoName($(\"treeDiv\"), \"pointTreeIcon\");\n          for (var i=0; i<icons.length; i++)\n              icons[i].src = iconSrc;\n      }\n      \n      function showWatchListEdit() {\n          openLayer(\"wlEdit\");\n          $(\"newWatchListName\").select();\n      }\n    \n      function saveWatchListName() {\n          var name = $get(\"newWatchListName\");\n          var select = $(\"watchListSelect\");\n          select.options[select.selectedIndex].text = name;\n          WatchListDwr.updateWatchListName(name);\n          hideLayer(\"wlEdit\");\n      }\n      \n      function watchListChanged() {\n          // Clear the list.\n          var rows = getElementsByMangoName($(\"watchListTable\"), \"watchListRow\");\n          for (var i=0; i<rows.length; i++)\n              removeFromWatchListImpl(rows[i].id.substring(1));\n          \n          watchlistChangeId++;\n          var id = watchlistChangeId;\n          WatchListDwr.setSelectedWatchList($get(\"watchListSelect\"), function(data) {\n");
      out.write("              // Ensure that the data received is the latest data that was requested.\n              if (id == watchlistChangeId)\n                  displayWatchList(data);\n          });\n      }\n      \n      function addWatchList(copy) {\n          var copyId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${NEW_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n          if (copy)\n              copyId = $get(\"watchListSelect\");\n          \n          WatchListDwr.addNewWatchList(copyId, function(watchListData) {\n              var wlselect = $(\"watchListSelect\");\n              wlselect.options[wlselect.options.length] = new Option(watchListData.value, watchListData.key);\n              $set(wlselect, watchListData.key);\n              watchListChanged();\n              maybeDisplayDeleteImg();\n          });\n      }\n      \n      function deleteWatchList() {\n          var wlselect = $(\"watchListSelect\");\n          var deleteId = $get(wlselect);\n          wlselect.options[wlselect.selectedIndex] = null;\n          \n          watchListChanged();\n          WatchListDwr.deleteWatchList(deleteId);\n          maybeDisplayDeleteImg();\n      }\n      \n      function maybeDisplayDeleteImg() {\n          var wlselect = $(\"watchListSelect\");\n          display(\"watchListDeleteImg\", wlselect.options.length > 1);\n      }\n      \n      function showWatchListUsers() {\n          openLayer(\"usersEdit\");\n");
      out.write("      }\n      \n      function openLayer(nodeId) {\n          var nodeDiv = $(nodeId);\n          closeLayers(nodeId);\n          showLayer(nodeDiv, true);\n      }\n    \n      function closeLayers(exclude) {\n          if (exclude != \"wlEdit\")\n              hideLayer(\"wlEdit\");\n          if (exclude != \"usersEdit\")\n              hideLayer(\"usersEdit\");\n      }\n      \n      \n      //\n      // Watch list membership\n      //\n      function addToWatchList(pointId) {\n          // Check if this point is already in the watch list.\n          if ($(\"p\"+ pointId) || !owner)\n              return;\n          addToWatchListImpl(pointId);\n          WatchListDwr.addToWatchList(pointId, mango.view.watchList.setDataImpl);\n          fixRowFormatting();\n      }\n      \n      var watchListCount = 0;\n      function addToWatchListImpl(pointId) {\n          watchListCount++;\n      \n          // Add a row for the point by cloning the template row.\n          var pointContent = createFromTemplate(\"p_TEMPLATE_\", pointId, \"watchListTable\");\n          pointContent.mangoName = \"watchListRow\";\n");
      out.write("          \n          if (owner) {\n              show(\"p\"+ pointId +\"MoveUp\");\n              show(\"p\"+ pointId +\"MoveDown\");\n              show(\"p\"+ pointId +\"Delete\");\n          }\n          \n          $(\"p\"+ pointId +\"Name\").innerHTML = pointNames[pointId].extendedName;\n          \n          // Disable the element in the point list.\n          togglePointTreeIcon(pointId, false);\n      }\n      \n      function removeFromWatchList(pointId) {\n          removeFromWatchListImpl(pointId);\n          fixRowFormatting();\n          WatchListDwr.removeFromWatchList(pointId);\n      }\n      \n      function removeFromWatchListImpl(pointId) {\n          watchListCount--;\n          var pointContent = $(\"p\"+ pointId);\n          var watchListTable = $(\"watchListTable\");\n          watchListTable.removeChild(pointContent);\n          \n          // Enable the element in the point list.\n          togglePointTreeIcon(pointId, true);\n      }\n      \n      function togglePointTreeIcon(pointId, enable) {\n          // Toggle the tree icon\n          var node = $(\"ph\"+ pointId +\"Image\");\n");
      out.write("          if (node) {\n              if (enable)\n                  dojo.style(node, \"opacity\", 1);\n              else\n                  dojo.style(node, \"opacity\", 0.2);\n          }\n          \n          // Toggle the lookup text\n          var dps = pointNames[pointId];\n          if (enable)\n              dps.fancyName = dps.extendedName;\n          else\n              dps.fancyName = \"<span class='disabled'>\"+ dps.extendedName +\"</span>\";\n      }\n      \n      //\n      // List state updating\n      //\n      function moveRowDown(pointId) {\n          var watchListTable = $(\"watchListTable\");\n          var rows = getElementsByMangoName(watchListTable, \"watchListRow\");\n          var i=0;\n          for (; i<rows.length; i++) {\n              if (rows[i].id == pointId)\n                  break;\n          }\n          if (i < rows.length - 1) {\n              if (i == rows.length - 1)\n                  watchListTable.append(rows[i]);\n              else\n                  watchListTable.insertBefore(rows[i], rows[i+2]);\n              WatchListDwr.moveDown(pointId.substring(1));\n");
      out.write("              fixRowFormatting();\n          }\n      }\n      \n      function moveRowUp(pointId) {\n          var watchListTable = $(\"watchListTable\");\n          var rows = getElementsByMangoName(watchListTable, \"watchListRow\");\n          var i=0;\n          for (; i<rows.length; i++) {\n              if (rows[i].id == pointId)\n                  break;\n          }\n          if (i != 0) {\n              watchListTable.insertBefore(rows[i], rows[i-1]);\n              WatchListDwr.moveUp(pointId.substring(1));\n              fixRowFormatting();\n          }\n      }\n      \n      function fixRowFormatting() {\n          var rows = getElementsByMangoName($(\"watchListTable\"), \"watchListRow\");\n          if (rows.length == 0) {\n              show(\"emptyListMessage\");\n          }\n          else {\n              hide(\"emptyListMessage\");\n              for (var i=0; i<rows.length; i++) {\n                  if (i == 0) {\n                      hide(rows[i].id +\"BreakRow\");\n                      hide(rows[i].id +\"MoveUp\");\n                  }\n");
      out.write("                  else {\n                      show(rows[i].id +\"BreakRow\");\n                      if (owner)\n                          show(rows[i].id +\"MoveUp\");\n                  }\n                      \n                  if (i == rows.length - 1)\n                      hide(rows[i].id +\"MoveDown\");\n                  else if (owner)\n                      show(rows[i].id +\"MoveDown\");\n              }\n          }\n      }\n      \n      function showChart(mangoId, event, source) {\n          if (isMouseLeaveOrEnter(event, source)) {\n              // Take the data in the chart textarea and put it into the chart layer div\n              $set('p'+ mangoId +'ChartLayer', $get('p'+ mangoId +'Chart'));\n              showMenu('p'+ mangoId +'ChartLayer', 4, 12);\n          }\n      }\n      \n      function hideChart(mangoId, event, source) {\n          if (isMouseLeaveOrEnter(event, source))\n              hideLayer('p'+ mangoId +'ChartLayer');\n      }\n      \n      //\n      // Image chart\n      //\n      function getImageChart() {\n");
      out.write("          var width = dojo.contentBox($(\"imageChartDiv\")).w - 20;\n          startImageFader($(\"imageChartImg\"));\n          WatchListDwr.getImageChartData(getChartPointList(), $get(\"fromYear\"), $get(\"fromMonth\"), $get(\"fromDay\"), \n                  $get(\"fromHour\"), $get(\"fromMinute\"), $get(\"fromSecond\"), $get(\"fromNone\"), $get(\"toYear\"), \n                  $get(\"toMonth\"), $get(\"toDay\"), $get(\"toHour\"), $get(\"toMinute\"), $get(\"toSecond\"), $get(\"toNone\"), \n                  width, 350, function(data) {\n              $(\"imageChartDiv\").innerHTML = data;\n              stopImageFader($(\"imageChartImg\"));\n              \n              // Make sure the length of the chart doesn't mess up the watch list display. Do async to\n              // make sure the rendering gets done.\n              // TODO - onResized no longer works.\n              //setTimeout('dijit.byId(\"splitContainer\").onResized()', 2000);\n          });\n      }\n      \n      function getChartData() {\n          var pointIds = getChartPointList();\n          if (pointIds.length == 0)\n");
      out.write("              alert(\"");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n          else {\n              startImageFader($(\"chartDataImg\"));\n              WatchListDwr.getChartData(getChartPointList(), $get(\"fromYear\"), $get(\"fromMonth\"), $get(\"fromDay\"), \n                      $get(\"fromHour\"), $get(\"fromMinute\"), $get(\"fromSecond\"), $get(\"fromNone\"), $get(\"toYear\"), \n                      $get(\"toMonth\"), $get(\"toDay\"), $get(\"toHour\"), $get(\"toMinute\"), $get(\"toSecond\"), $get(\"toNone\"), \n                      function(data) {\n                  stopImageFader($(\"chartDataImg\"));\n                  window.location = \"chartExport/watchListData.csv\";\n              });\n          }\n      }\n      \n      function getChartPointList() {\n          var pointIds = $get(\"chartCB\");\n          for (var i=pointIds.length-1; i>=0; i--) {\n              if (pointIds[i] == \"_TEMPLATE_\") {\n                  pointIds.splice(i, 1);\n              }\n          }\n          return pointIds;\n      }\n\n      ");
      if (_jspx_meth_m2m2_moduleExists_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n    </script>\n    <table class=\"wide\" style=\"width:100%\">\n    <tr><td>\n      <div dojoType=\"dijit.layout.SplitContainer\" orientation=\"horizontal\" sizerWidth=\"3\" activeSizing=\"true\" class=\"borderDiv\"\n              id=\"splitContainer\" style=\"width: 100%; height: 500px;\">\n        \n        <div dojoType=\"dijit.layout.ContentPane\" sizeMin=\"50\" sizeShare=\"50\" style=\"overflow:auto; padding:2px 10px 2px 2px;\">\n          <table class=\"wide\">\n            <tr>\n              <td class=\"veryBigTitle\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n              <td align=\"right\">\n                ");
      if (_jspx_meth_sst_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                \n                <div id=\"wlEditDiv\" style=\"display:inline;\" onmouseover=\"showWatchListEdit()\">\n                  ");
      if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                  <div id=\"wlEdit\" style=\"visibility:hidden;right:0px;top:15px;\" class=\"labelDiv\"\n                          onmouseout=\"hideLayer(this)\">\n                    ");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("<br/>\n                    <input type=\"text\" id=\"newWatchListName\"\n                            onkeypress=\"if (event.keyCode==13) $('saveWatchListNameLink').onclick();\"/>\n                    <a class=\"ptr\" id=\"saveWatchListNameLink\" onclick=\"saveWatchListName()\">");
      if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</a>\n                  </div>\n                </div>\n                \n                <div id=\"usersEditDiv\" style=\"display:inline;\" onmouseover=\"showWatchListUsers()\">\n                  ");
      if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                  <div id=\"usersEdit\" style=\"visibility:hidden;right:0px;top:15px;\" class=\"labelDiv\">\n                    ");
      if (_jspx_meth_tag_sharedUsers_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                  </div>\n                </div>\n                \n                ");
      if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                ");
      if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                ");
      if (_jspx_meth_tag_img_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                ");
      //  m2m2:moduleExists
      com.serotonin.m2m2.web.taglib.ModuleExistsTag _jspx_th_m2m2_moduleExists_1 = (com.serotonin.m2m2.web.taglib.ModuleExistsTag) _jspx_tagPool_m2m2_moduleExists_name.get(com.serotonin.m2m2.web.taglib.ModuleExistsTag.class);
      _jspx_th_m2m2_moduleExists_1.setPageContext(_jspx_page_context);
      _jspx_th_m2m2_moduleExists_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_m2m2_moduleExists_1.setName("reports");
      int _jspx_eval_m2m2_moduleExists_1 = _jspx_th_m2m2_moduleExists_1.doStartTag();
      if (_jspx_eval_m2m2_moduleExists_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                  ");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
          _jspx_th_c_set_0.setPageContext(_jspx_page_context);
          _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_m2m2_moduleExists_1);
          _jspx_th_c_set_0.setVar("modulesDir");
          _jspx_th_c_set_0.setValue( Constants.DIR_MODULES );
          int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
          if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
          out.write("\n                  ");
          if (_jspx_meth_tag_img_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_m2m2_moduleExists_1, _jspx_page_context))
            return;
          out.write("\n                ");
          int evalDoAfterBody = _jspx_th_m2m2_moduleExists_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_m2m2_moduleExists_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_m2m2_moduleExists_name.reuse(_jspx_th_m2m2_moduleExists_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_m2m2_moduleExists_name.reuse(_jspx_th_m2m2_moduleExists_1);
      out.write("\n              </td>\n            </tr>\n          </table>\n          <div id=\"watchListDiv\" class=\"watchListAttr\">\n            <table style=\"display:none;\">\n              <tbody id=\"p_TEMPLATE_\">\n                <tr id=\"p_TEMPLATE_BreakRow\"><td class=\"horzSeparator\" colspan=\"5\"></td></tr>\n                <tr>\n                  <td width=\"1\">\n                    <table class=\"rowIcons\">\n                      <tr>\n                        <td onmouseover=\"mango.view.showChange('p'+ getMangoId(this) +'Change', 4, 12);\"\n                                onmouseout=\"mango.view.hideChange('p'+ getMangoId(this) +'Change');\"\n                                id=\"p_TEMPLATE_ChangeMin\" style=\"display:none;\"><img alt=\"\" id=\"p_TEMPLATE_Changing\" \n                                src=\"images/icon_edit.png\"/><div id=\"p_TEMPLATE_Change\" class=\"labelDiv\" \n                                style=\"visibility:hidden;top:10px;left:1px;\" onmouseout=\"hideLayer(this);\">\n                          ");
      if (_jspx_meth_tag_img_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                        </div></td>\n                        <td id=\"p_TEMPLATE_ChartMin\" style=\"display:none;\" onmouseover=\"showChart(getMangoId(this), event, this);\"\n                                onmouseout=\"hideChart(getMangoId(this), event, this);\"><img alt=\"\" \n                                src=\"images/icon_chart.png\"/><div id=\"p_TEMPLATE_ChartLayer\" class=\"labelDiv\" \n                                style=\"visibility:hidden;top:0;left:0;\"></div><textarea\n                                style=\"display:none;\" id=\"p_TEMPLATE_Chart\">");
      if (_jspx_meth_tag_img_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</textarea></td>\n                      </tr>\n                    </table>\n                  </td>\n                  <td id=\"p_TEMPLATE_Name\" style=\"font-weight:bold\"></td>\n                  <td id=\"p_TEMPLATE_Value\" align=\"center\"><img src=\"images/hourglass.png\"/></td>\n                  <td id=\"p_TEMPLATE_Time\" align=\"center\"></td>\n                  <td style=\"width:1px; white-space:nowrap;\">\n                    <input type=\"checkbox\" name=\"chartCB\" id=\"p_TEMPLATE_ChartCB\" value=\"_TEMPLATE_\" checked=\"checked\"\n                            title=\"");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\n                    ");
      if (_jspx_meth_tag_img_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                    ");
      if (_jspx_meth_tag_img_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_tag_img_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                    ");
      if (_jspx_meth_tag_img_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n                  </td>\n                </tr>\n                <tr><td colspan=\"5\" style=\"padding-left:16px;\" id=\"p_TEMPLATE_Messages\"></td></tr>\n              </tbody>\n            </table>\n            <table id=\"watchListTable\" class=\"wide\"></table>\n            <div id=\"emptyListMessage\" style=\"color:#888888;padding:10px;text-align:center;\">\n              ");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            </div>\n          </div>\n        </div>\n      </div>\n    </td></tr>\n    \n    <tr><td>\n      <div class=\"borderDiv\" style=\"width: 100%;\">\n        <table class=\"wide\">\n          <tr>\n            <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_help_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td align=\"right\">");
      if (_jspx_meth_tag_dateRange_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td>\n              ");
      if (_jspx_meth_tag_img_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n              ");
      if (_jspx_meth_tag_img_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n            </td>\n          </tr>\n          <tr><td colspan=\"3\" id=\"imageChartDiv\"></td></tr>\n        </table>\n      </div>\n    </td></tr>\n    \n    </table>\n  ");
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
