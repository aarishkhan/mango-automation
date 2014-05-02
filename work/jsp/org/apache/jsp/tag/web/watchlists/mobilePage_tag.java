package org.apache.jsp.tag.web.watchlists;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.module.ModuleRegistry;
import com.serotonin.m2m2.Common;

public final class mobilePage_tag
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_convert_obj_nobody;

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
  private javax.servlet.jsp.tagext.JspFragment styles;
  private java.lang.String dwr;
  private java.lang.String js;
  private java.lang.String onload;

  public javax.servlet.jsp.tagext.JspFragment getStyles() {
    return this.styles;
  }

  public void setStyles(javax.servlet.jsp.tagext.JspFragment styles) {
    this.styles = styles;
  }

  public java.lang.String getDwr() {
    return this.dwr;
  }

  public void setDwr(java.lang.String dwr) {
    this.dwr = dwr;
  }

  public java.lang.String getJs() {
    return this.js;
  }

  public void setJs(java.lang.String js) {
    this.js = js;
  }

  public java.lang.String getOnload() {
    return this.onload;
  }

  public void setOnload(java.lang.String onload) {
    this.onload = onload;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_sst_convert_obj_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sst_convert_obj_nobody.release();
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
    if( getStyles() != null ) {
      _jspx_page_context.setAttribute("styles", getStyles());
}
    if( getDwr() != null ) {
      _jspx_page_context.setAttribute("dwr", getDwr());
}
    if( getJs() != null ) {
      _jspx_page_context.setAttribute("js", getJs());
}
    if( getOnload() != null ) {
      _jspx_page_context.setAttribute("onload", getOnload());
}

    try {
      out.write("<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.2//EN\" \"http://www.openmobilealliance.org/tech/DTD/xhtml-mobile12.dtd\">\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\r\n\r\n\r\n<html>\r\n<head>\r\n  <title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</title>\r\n  <meta http-equiv=\"content-type\" content=\"application/xhtml+xml;charset=utf-8\"/>\r\n  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/web/mobile/mobile.css\" type=\"text/css\" rel=\"stylesheet\"/>\r\n  \r\n    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n  \r\n  <!-- Scripts -->\r\n  <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dojoURI}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("dojo/dojo.js\" data-dojo-config=\"async: false, parseOnLoad: true, isDebug:true, extraLocale: ['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lang}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("']\"></script>\r\n  <script type=\"text/javascript\" src=\"/dwr/engine.js\"></script>\r\n  <script type=\"text/javascript\" src=\"/dwr/util.js\"></script>\r\n  <script type=\"text/javascript\" src=\"/dwr/interface/MiscDwr.js\"></script>\r\n  <script type=\"text/javascript\" src=\"/resources/common.js\"></script>\r\n  <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("/web/mobile/mobile-header.js\"></script>\r\n    \r\n  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n  ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n\r\n  <script type=\"text/javascript\">mango.i18n = ");
      if (_jspx_meth_sst_convert_0(_jspx_page_context))
        return;
      out.write(";\r\n  </script>\r\n  \r\n  ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_2.setParent(null);
      _jspx_th_c_forEach_2.setItems( Common.moduleScripts );
      _jspx_th_c_forEach_2.setVar("modScript");
      int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("<script type=\"text/javascript\" src=\"/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modScript}", java.lang.String.class, (PageContext)this.getJspContext(), null));
            out.write("\"></script>\r\n  ");
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
      out.write("\r\n  \r\n  <!-- Setup the Header and Start the Longpoll -->\r\n  <script type=\"text/javascript\">dojo.ready(mango.header.onLoad);</script>\r\n  \r\n</head>\r\n\r\n<body>\r\n<!-- Header Area, must exist for long poll to update alarms -->\r\n <div style=\"width:100%;background-color:white;text-align:center;margin:20px 0 60px;\">\r\n <img style=\"width:150px;\" src=\"/images/logo.png\">\r\n  <a href=\"/events.shtm\">\r\n    <span id=\"__header__alarmLevelDiv\" style=\"display:none;\">\r\n      <img id=\"__header__alarmLevelImg\" src=\"/images/spacer.gif\" alt=\"\" title=\"\"/>\r\n      <span id=\"__header__alarmLevelText\"></span>\r\n    </span>\r\n  </a>\r\n </div>\r\n<!-- End Header area -->\r\n\r\n");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      out.write("\r\n\r\n<!-- Footer Area -->\r\n<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n  <tr>\r\n    <td class=\"footer\" align=\"center\">&copy;2013 Infinite Automation ");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\r\n  </tr>\r\n</table>\r\n  ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n\r\n<!-- End Footer Area --> \r\n</body>\r\n</html>");
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("header.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty dojoURI}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n    ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_0.setVar("dojoURI");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("http://ajax.googleapis.com/ajax/libs/dojo/1.9.1/");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dwr}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_0.setVar("dwrname");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<script type=\"text/javascript\" src=\"/dwr/interface/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dwrname}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write(".js\"></script>\r\n  ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${js}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_1.setVar("jspath");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<script type=\"text/javascript\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jspath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("\"></script>\r\n  ");
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

  private boolean _jspx_meth_sst_convert_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_0 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_0.setParent(null);
    _jspx_th_sst_convert_0.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${clientSideMessages}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    int _jspx_eval_sst_convert_0 = _jspx_th_sst_convert_0.doStartTag();
    if (_jspx_th_sst_convert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("footer.rightsReserved");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty onload}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n  \t<script type=\"text/javascript\">dojo.ready(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onload}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write(");</script>\r\n  ");
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
}
