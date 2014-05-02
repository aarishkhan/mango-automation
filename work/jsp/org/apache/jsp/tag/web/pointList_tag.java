package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Common;

public final class pointList_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
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
  private java.lang.String pointHelpId;

  public java.lang.String getPointHelpId() {
    return this.pointHelpId;
  }

  public void setPointHelpId(java.lang.String pointHelpId) {
    this.pointHelpId = pointHelpId;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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
    if( getPointHelpId() != null ) {
      _jspx_page_context.setAttribute("pointHelpId", getPointHelpId());
}

    try {
      out.write('\n');
      out.write("\n\n\n<!-- <div data-dojo-type=\"dijit/layout/ContentPane\" title=\"Point Details\" style=\"overflow-y:auto\" id=\"pointDetails\" style=\"display: none;\"> -->\n<!--      <div  class=\"borderDiv marB\"> -->\n    <div id=\"pointDetails\" class=\"borderDiv marB\" style=\"display:none\" >\n    <div id=\"pointProperties\" style=\"display:none\"></div> <!-- For tricking the legacy modules to believe this is still in use, it will be \"shown\" when a data source is saved or viewed -->    \n        <table width=\"100%\">\n          <tr>\n            <td>\n              <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n              ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n            </td>\n            <td align=\"right\">\n              ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n              ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("\n              ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n              ");
      if (_jspx_meth_tag_img_3(_jspx_page_context))
        return;
      out.write("\n              ");
      if (_jspx_meth_tag_img_4(_jspx_page_context))
        return;
      out.write("\n            </td>\n          </tr>\n        </table>\n        <div id=\"pointMessage\" class=\"ctxmsg formError\"></div>\n        \n        <table>\n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input id=\"deviceName\"/></td>\n          </tr>\n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"name\"/></td>\n          </tr>\n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\"><input type=\"text\" id=\"xid\"/></td>\n          </tr>\n          \n          ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      out.write("\n        </table>\n        <div id=\"extraPointSettings\">\n        <hr class=\"styled-hr\"></hr>\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/pointProperties.jsp", out, false);
      out.write("\n        <hr class=\"styled-hr\"></hr>\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/loggingProperties.jsp", out, false);
      out.write("\n        <hr class=\"styled-hr\"></hr>\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/valuePurge.jsp", out, false);
      out.write("\n        <hr class=\"styled-hr\"></hr>\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/textRenderer.jsp", out, false);
      out.write("\n        <hr class=\"styled-hr\"></hr>\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/chartRenderer.jsp", out, false);
      out.write("\n        <hr class=\"styled-hr\"></hr>\n        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/snippet/view/dataPoint/eventDetectors.jsp", out, false);
      out.write("\n        </div>\n      \n      </div>\n<!--       <div  class=\"borderDiv marB\"> -->\n<!--         Could put the point settings here.  Would require fresh re-write of that page to fit here and have binding js and dwr. -->\n<!--       </div> -->\n<!-- </div> -->\n\n\n<!-- <table cellpadding=\"0\" cellspacing=\"0\" id=\"pointProperties\" style=\"display:none;\"> -->\n<!--   <tr> -->\n<!--     <td valign=\"top\"> -->\n<!--       <div class=\"borderDiv marR marB\"> -->\n<!--         <table width=\"100%\"> -->\n<!--           <tr> -->\n");
      out.write("\n<!--             <td align=\"right\"> -->\n");
      out.write('\n');
      out.write("\n<!--             </td> -->\n<!--           </tr> -->\n<!--         </table> -->\n<!--         <table cellspacing=\"1\"> -->\n<!--           <tr class=\"rowHeader\" id=\"pointListHeaders\"></tr> -->\n<!--           <tbody id=\"pointsList\"></tbody> -->\n<!--         </table> -->\n<!--       </div> -->\n<!--     </td> -->\n\n<!--     <td valign=\"top\"> -->\n<!--       <div id=\"pointDetails\" class=\"borderDiv marB mangoEdit\" style=\"display: none; position:absolute;\"> -->\n<!--         <table width=\"100%\"> -->\n<!--           <tr> -->\n<!--             <td> -->\n");
      out.write('\n');
      out.write("\n<!--             </td> -->\n<!--             <td align=\"right\"> -->\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n<!--             </td> -->\n<!--           </tr> -->\n<!--         </table> -->\n<!--         <div id=\"pointMessage\" class=\"ctxmsg formError\"></div> -->\n        \n<!--         <table> -->\n<!--           <tr> -->\n");
      out.write("\n<!--             <td class=\"formField\"><input type=\"text\" id=\"name\"/></td> -->\n<!--           </tr> -->\n<!--           <tr> -->\n");
      out.write("\n<!--             <td class=\"formField\"><input type=\"text\" id=\"xid\"/></td> -->\n<!--           </tr> -->\n          \n");
      out.write("\n          \n<!--         </table> -->\n<!--       </div> -->\n<!--     </td> -->\n<!--   </tr> -->\n<!-- </table> -->");
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
    _jspx_th_fmt_message_0.setKey("dsEdit.points.details");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty pointHelpId}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_tag_help_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setParent(_jspx_th_c_if_0);
    _jspx_th_tag_help_0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pointHelpId}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setId("toggleDataPoint");
    _jspx_th_tag_img_0.setPng("icon_ds");
    _jspx_th_tag_img_0.setOnclick("togglePoint()");
    _jspx_th_tag_img_0.setStyle("display:none");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setId("pointSaveImg");
    _jspx_th_tag_img_1.setPng("save");
    _jspx_th_tag_img_1.setOnclick("savePoint()");
    _jspx_th_tag_img_1.setTitle("common.save");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setId("pointDeleteImg");
    _jspx_th_tag_img_2.setPng("delete");
    _jspx_th_tag_img_2.setOnclick("deletePoint()");
    _jspx_th_tag_img_2.setTitle("common.delete");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setPng("emport");
    _jspx_th_tag_img_3.setTitle("emport.export");
    _jspx_th_tag_img_3.setOnclick("exportDataPoint()");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_4(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_4 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_4      );
    }
    _jspx_th_tag_img_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_4.setPng("cross");
    _jspx_th_tag_img_4.setTitle("common.close");
    _jspx_th_tag_img_4.setOnclick("closePoint()");
    _jspx_th_tag_img_4.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("dsEdit.deviceName");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("dsEdit.points.name");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("common.xid");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }
}
