package org.apache.jsp.WEB_002dINF.jsp.mobile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.vo.UserComment;

public final class dataPointDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("\n\n\n\n\n\n");
      if (_jspx_meth_tag_mobile$1page_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
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

  private boolean _jspx_meth_tag_mobile$1page_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:mobile-page
    org.apache.jsp.tag.web.mobile_002dpage_tag _jspx_th_tag_mobile$1page_0 = new org.apache.jsp.tag.web.mobile_002dpage_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_mobile$1page_0      );
    }
    _jspx_th_tag_mobile$1page_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_mobile$1page_0.setDwr("DataPointDetailsDwr");
    _jspx_th_tag_mobile$1page_0.setJs("/resources/stores.js");
    _jspx_th_tag_mobile$1page_0.setJspBody(new dataPointDetails_jspHelper( 0, _jspx_page_context, _jspx_th_tag_mobile$1page_0, null));
    _jspx_th_tag_mobile$1page_0.doTag();
    return false;
  }

  private class dataPointDetails_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public dataPointDetails_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n    <script type=\"text/javascript\">\n    require([\n             \"dojox/mobile/parser\",\n             \"dojox/mobile\",\n             \"dojox/mobile/compat\", // For non-webkit browsers (FF, IE)\n             \"dojox/mobile/FilteredListMixin\",\n             \"dojox/mobile/EdgeToEdgeDataList\",\n             \"dojox/mobile/ScrollableView\"\n     ]);\n    </script>\n<div data-dojo-type=\"dojox/mobile/View\">\n        <h1 data-dojo-type=\"dojox/mobile/Heading\" data-dojo-props=\"fixed: 'top'\">Data Points</h1>\n        <div data-dojo-type=\"dojox/mobile/ScrollableView\">\n\t        <ul id=\"list\" data-dojo-type=\"dojox/mobile/EdgeToEdgeDataList\"\n\t                data-dojo-mixins=\"dojox/mobile/FilteredListMixin\"\n\t                data-dojo-props=\"placeHolder: 'Search', store: stores.dataPointDetails\">\n\t        </ul>\n        </div>\n</div>\n\n\n\n\n");
      return false;
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
