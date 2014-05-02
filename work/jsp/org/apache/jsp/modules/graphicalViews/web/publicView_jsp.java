package org.apache.jsp.modules.graphicalViews.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Common;

public final class publicView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/graphicalViews/displayView.tag");
    _jspx_dependants.add("/WEB-INF/tags/graphicalViews/pointComponent.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_convert_obj_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_convert_obj_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sst_convert_obj_nobody.release();
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
      out.write('\n');
      out.write("\n\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">\n\n<html>\n<head>\n  <title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</title>\n  ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n  \n  <!-- Style -->\n  <link rel=\"icon\" href=\"images/favicon.ico\"/>\n  <link rel=\"shortcut icon\" href=\"images/favicon.ico\"/>\n  <link href=\"resources/common.css\" type=\"text/css\" rel=\"stylesheet\"/>\n  <style type=\"text/css\">\n    @import \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dojox/editor/plugins/resources/css/StatusBar.css\";\n    @import \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dojox/layout/resources/FloatingPane.css\";\n    @import \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dijit/themes/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${theme}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${theme}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".css\";\n    @import \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dojo/resources/dojo.css\";\n  </style>  \n  \n  <!-- Script -->\n  <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dojo/dojo.js\" data-dojo-config=\"async: false, parseOnLoad: true, isDebug:true, extraLocale: ['en-us', 'nl', 'nl-nl', 'ja-jp', 'fi-fi', 'sv-se', 'zh-cn', 'zh-tw','xx']\"></script>\n  <script type=\"text/javascript\" src=\"dwr/engine.js\"></script>\n  <script type=\"text/javascript\" src=\"dwr/util.js\"></script>\n  <script type=\"text/javascript\" src=\"resources/common.js\"></script>\n  <script type=\"text/javascript\" src=\"dwr/interface/GraphicalViewDwr.js\"></script>\n  <script type=\"text/javascript\" src=\"dwr/interface/MiscDwr.js\"></script>\n  <script type=\"text/javascript\" src=\"resources/view.js\"></script>\n  <script type=\"text/javascript\" src=\"resources/header.js\"></script>\n  <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/web/graphicalViews.js\"></script>\n  <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/web/wz_jsgraphics.js\"></script>\n");
      out.write('\n');
      out.write("\n</head>\n\n<body style=\"background-color:transparent\">\n  ");
      if (_jspx_meth_views_displayView_0(_jspx_page_context))
        return;
      out.write("\n  \n  ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n</body>\n</html>");
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("header.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("dojoURI");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("http://ajax.googleapis.com/ajax/libs/dojo/1.7.2/");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_views_displayView_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  views:displayView
    org.apache.jsp.tag.web.graphicalViews.displayView_tag _jspx_th_views_displayView_0 = new org.apache.jsp.tag.web.graphicalViews.displayView_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_views_displayView_0      );
    }
    _jspx_th_views_displayView_0.setJspContext(_jspx_page_context);
    _jspx_th_views_displayView_0.setView((com.serotonin.m2m2.gviews.GraphicalView) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view}", com.serotonin.m2m2.gviews.GraphicalView.class, (PageContext)_jspx_page_context, null));
    _jspx_th_views_displayView_0.setEmptyMessageKey("publicView.notFound");
    _jspx_th_views_displayView_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty view}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n    <script type=\"text/javascript\">\n      mango.i18n = ");
        if (_jspx_meth_sst_convert_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write(";\n      dwr.util.setEscapeHtml(false);\n      mango.view.initAnonymousView(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(");\n      dojo.ready(mango.longPoll.start);\n    </script>\n  ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sst_convert_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_0 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_sst_convert_0.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientSideMessages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_convert_0 = _jspx_th_sst_convert_0.doStartTag();
    if (_jspx_th_sst_convert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
      return true;
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
    return false;
  }
}
