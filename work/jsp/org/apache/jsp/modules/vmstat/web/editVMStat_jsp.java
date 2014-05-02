package org.apache.jsp.modules.vmstat.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.vmstat.VMStatDataSourceVO;
import com.serotonin.m2m2.vmstat.VMStatPointLocatorVO;

public final class editVMStat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(11);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/m2m2.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/dataSourceAttrs.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/dsEvents.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/exportCodesOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/pointList.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      out.write("\n\n<script type=\"text/javascript\">\n  function saveDataSourceImpl(basic) {\n      VMStatEditDwr.saveVMStatDataSource(basic, $get(\"pollSeconds\"),\n              $get(\"outputScale\"), saveDataSourceCB);\n  }\n  \n  function appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions) {\n      pointListColumnHeaders[pointListColumnHeaders.length] = \"");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\";\n      pointListColumnFunctions[pointListColumnFunctions.length] =\n              function(p) { return p.pointLocator.configurationDescription; };\n  }\n  \n  function editPointCBImpl(locator) {\n      $set(\"attributeId\", locator.attributeId);\n  }\n  \n  function savePointImpl(locator) {\n      delete locator.settable;\n      delete locator.dataTypeId;\n      delete locator.relinquishable;\n      \n      locator.attributeId = $get(\"attributeId\");\n      \n      VMStatEditDwr.saveVMStatPointLocator(currentPoint.id, $get(\"xid\"), $get(\"name\"), locator, savePointCB);\n  }\n</script>\n\n");
      //  tag:dataSourceAttrs
      org.apache.jsp.tag.web.dataSourceAttrs_tag _jspx_th_tag_dataSourceAttrs_0 = new org.apache.jsp.tag.web.dataSourceAttrs_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_dataSourceAttrs_0        );
      }
      _jspx_th_tag_dataSourceAttrs_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_dataSourceAttrs_0.setDescriptionKey("dsEdit.vmstat.desc");
      _jspx_th_tag_dataSourceAttrs_0.setHelpId("vmstatDS");
      _jspx_th_tag_dataSourceAttrs_0.setJspBody(new editVMStat_jspHelper( 0, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null));
      _jspx_th_tag_dataSourceAttrs_0.doTag();
      out.write('\n');
      out.write('\n');
      //  tag:pointList
      org.apache.jsp.tag.web.pointList_tag _jspx_th_tag_pointList_0 = new org.apache.jsp.tag.web.pointList_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_pointList_0        );
      }
      _jspx_th_tag_pointList_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_pointList_0.setPointHelpId("vmstatPP");
      _jspx_th_tag_pointList_0.setJspBody(new editVMStat_jspHelper( 1, _jspx_page_context, _jspx_th_tag_pointList_0, null));
      _jspx_th_tag_pointList_0.doTag();
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
    _jspx_th_fmt_message_0.setKey("dsEdit.vmstat.attribute");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
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
    _jspx_th_fmt_message_1.setKey("dsEdit.vmstat.pollSeconds");
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
    _jspx_th_fmt_message_2.setKey("dsEdit.vmstat.outputScale");
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
    _jspx_th_fmt_message_3.setKey("dsEdit.vmstat.attribute");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private class editVMStat_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public editVMStat_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\"><input id=\"pollSeconds\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.pollSeconds}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n  </tr>\n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\">\n      ");
      //  tag:exportCodesOptions
      org.apache.jsp.tag.web.exportCodesOptions_tag _jspx_th_tag_exportCodesOptions_0 = new org.apache.jsp.tag.web.exportCodesOptions_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_exportCodesOptions_0        );
      }
      _jspx_th_tag_exportCodesOptions_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_exportCodesOptions_0.setParent(_jspx_parent);
      _jspx_th_tag_exportCodesOptions_0.setId("outputScale");
      _jspx_th_tag_exportCodesOptions_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.outputScale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_tag_exportCodesOptions_0.setOptionList( VMStatDataSourceVO.OUTPUT_SCALE_CODES.getIdKeys() );
      _jspx_th_tag_exportCodesOptions_0.doTag();
      out.write("\n    </td>\n  </tr>\n");
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\">\n      ");
      //  tag:exportCodesOptions
      org.apache.jsp.tag.web.exportCodesOptions_tag _jspx_th_tag_exportCodesOptions_1 = new org.apache.jsp.tag.web.exportCodesOptions_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_exportCodesOptions_1        );
      }
      _jspx_th_tag_exportCodesOptions_1.setJspContext(_jspx_page_context);
      _jspx_th_tag_exportCodesOptions_1.setParent(_jspx_parent);
      _jspx_th_tag_exportCodesOptions_1.setId("attributeId");
      _jspx_th_tag_exportCodesOptions_1.setOptionList( VMStatPointLocatorVO.ATTRIBUTE_CODES.getIdKeys() );
      _jspx_th_tag_exportCodesOptions_1.doTag();
      out.write("\n    </td>\n  </tr>\n");
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
