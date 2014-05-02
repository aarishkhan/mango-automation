package org.apache.jsp.modules.jspViews.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jspViewExample_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(9);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/m2m2.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/jspViews/staticPoint.tag");
    _jspx_dependants.add("/modules/jspViews/web/jviews.tld");
    _jspx_dependants.add("/WEB-INF/tags/jspViews/simplePoint.tag");
    _jspx_dependants.add("/WEB-INF/tags/jspViews/scriptPoint.tag");
    _jspx_dependants.add("/WEB-INF/tags/jspViews/chart.tag");
    _jspx_dependants.add("/WEB-INF/tags/jspViews/chartPoint.tag");
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
      out.write("\n\n<html>\n<head>\n  <link href=\"resources/common.css\" type=\"text/css\" rel=\"stylesheet\"/>\n  \n  ");
      out.write("  \n</head>\n<body>\n<h1>JSP View Example</h1>\n\n<p>\n  The active components of this example have been commented out. To reactivate, remove the &lt;%-- --%&gt; style \n  comment tags (but not what is between them!) and replace the jview:init username and all xid attributes with valid\n  values.\n</p>\n<p>\n  <b>You will receive errors if you do not provide valid attribute values!</b> Read the error messages for clues about\n  what needs to be fixed. You can remove these instructions when you are done.\n</p>\n<p>\n  You can create as many JSP views as you want. Simply create a new JSP file in the main directory (where the \n  index.jsp is).\n</p>\n\n<!-- This code needs to remain here in order to build the Tags for the JSPs -->\n<h3>A simple table of some static values</h3>\n<table>\n  <tr>\n    <!--\n      A staticPoint tag is used to display the present value of a single point. This value is included in the HTML\n      directly, and is not updated via AJAX.\n        - xid: the point to use (required)\n        - disabledValue: the value to display if the point is disabled (defaults to \"\")\n");
      out.write("        - raw: whether the value should be fully rendered according to the text renderer, or should be provided in its\n               raw form. For example, a raw numeric is does not include a suffix, a raw multistate is its integer value,\n               and a raw binary is 0 or 1. (Defaults to false).\n    -->\n    <td align=\"right\" style=\"padding-right:20px\">A point value:</td>\n    <td>");
      if (_jspx_meth_jview_staticPoint_0(_jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n  <tr>\n    <td align=\"right\" style=\"padding-right:20px\">A raw point value:</td>\n    <td>");
      if (_jspx_meth_jview_staticPoint_1(_jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n  <tr>\n    <td align=\"right\" style=\"padding-right:20px\">A binary point value:</td>\n    <td>");
      if (_jspx_meth_jview_staticPoint_2(_jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n</table>\n  \n<h3>A simple table of some values</h3>\n<table>\n  <tr>\n    <!--\n      A simplePoint tag is used to display the value of a single point.\n        - xid: the point to use (required)\n        - disabledValue: the value to display if the point is disabled (defaults to \"\")\n        - raw: whether the value should be fully rendered according to the text renderer, or should be provided in its\n               raw form. For example, a raw numeric is does not include a suffix, a raw multistate is its integer value,\n               and a raw binary is 0 or 1. (Defaults to false).\n    -->\n    <td align=\"right\" style=\"padding-right:20px\">A point value:</td>\n    <td>");
      if (_jspx_meth_jview_simplePoint_0(_jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n  <tr>\n    <td align=\"right\" style=\"padding-right:20px\">A raw point value:</td>\n    <td>");
      if (_jspx_meth_jview_simplePoint_1(_jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n  <tr>\n    <td align=\"right\" style=\"padding-right:20px\">A binary point value:</td>\n    <td>");
      if (_jspx_meth_jview_simplePoint_2(_jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n</table>\n\n<p>A scripted point. Depending on the value of the binary source point, one of two images is shown.</p>\n<img id=\"scripted\" src=\"images/hourglass.png\"/>\n\n<!--\n  A scriptPoint tag accepts similar attributes to the simplePoint, with the addition of one:\n    - time: whether to include a time parameter in the script. The script is only called when either the value or the\n            time has changed, so care must be taken if the time attribute is set to \"true\". For example, if the \n            timestamp of the point changes but the value does not, the \"value\" parameter in the script will be null.\n            (Defaults to false.)\n            \n  The content of the scriptPoint tag is the script that will be called when the value and/or time change. For \n  convenience, the function declaration of \"function(value, time)\" is made elsewhere.\n  \n  Note that the value is always received as a string. Use parseInt() or parseFloat() to convert to numeric. \n-->\n");
      if (_jspx_meth_jview_scriptPoint_0(_jspx_page_context))
        return;
      out.write("\n<br/>\n<br/>\n\n<!--\n  To set the value of any point (to which the user in the init tag has permission to change), simply call the setPoint\n  function: setPoint(xid, value, callback)\n    - xid: the point to set (required)\n    - value: the value to set (required)\n    - callback: a function to call following the point set attempt (optional)\n-->\n<a href=\"#\" onclick=\"setPoint('changeMeBinary', !binaryValue); return false;\">Click here</a> to toggle the image above.\n<br/>\n<br/>\n\n<!--\n  Display charts with the chart tag. Include points in the chart with the chartPoint child tag. Most attributes should \n  require no explanation.\n    - color: this attribute can be an HTML-style hex, or any color name in the HTML specification.\n-->\n<h3>A chart</h3>\n");
      if (_jspx_meth_jview_chart_0(_jspx_page_context))
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

  private boolean _jspx_meth_jview_staticPoint_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:staticPoint
    org.apache.jsp.tag.web.jspViews.staticPoint_tag _jspx_th_jview_staticPoint_0 = new org.apache.jsp.tag.web.jspViews.staticPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_staticPoint_0      );
    }
    _jspx_th_jview_staticPoint_0.setJspContext(_jspx_page_context);
    _jspx_th_jview_staticPoint_0.setXid("changeMe");
    _jspx_th_jview_staticPoint_0.setDisabledValue("(disabled)");
    _jspx_th_jview_staticPoint_0.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_staticPoint_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:staticPoint
    org.apache.jsp.tag.web.jspViews.staticPoint_tag _jspx_th_jview_staticPoint_1 = new org.apache.jsp.tag.web.jspViews.staticPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_staticPoint_1      );
    }
    _jspx_th_jview_staticPoint_1.setJspContext(_jspx_page_context);
    _jspx_th_jview_staticPoint_1.setXid("changeMe");
    _jspx_th_jview_staticPoint_1.setRaw(new Boolean(true));
    _jspx_th_jview_staticPoint_1.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_staticPoint_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:staticPoint
    org.apache.jsp.tag.web.jspViews.staticPoint_tag _jspx_th_jview_staticPoint_2 = new org.apache.jsp.tag.web.jspViews.staticPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_staticPoint_2      );
    }
    _jspx_th_jview_staticPoint_2.setJspContext(_jspx_page_context);
    _jspx_th_jview_staticPoint_2.setXid("changeMe");
    _jspx_th_jview_staticPoint_2.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_simplePoint_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:simplePoint
    org.apache.jsp.tag.web.jspViews.simplePoint_tag _jspx_th_jview_simplePoint_0 = new org.apache.jsp.tag.web.jspViews.simplePoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_simplePoint_0      );
    }
    _jspx_th_jview_simplePoint_0.setJspContext(_jspx_page_context);
    _jspx_th_jview_simplePoint_0.setXid("changeMe");
    _jspx_th_jview_simplePoint_0.setDisabledValue("(disabled)");
    _jspx_th_jview_simplePoint_0.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_simplePoint_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:simplePoint
    org.apache.jsp.tag.web.jspViews.simplePoint_tag _jspx_th_jview_simplePoint_1 = new org.apache.jsp.tag.web.jspViews.simplePoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_simplePoint_1      );
    }
    _jspx_th_jview_simplePoint_1.setJspContext(_jspx_page_context);
    _jspx_th_jview_simplePoint_1.setXid("changeMe");
    _jspx_th_jview_simplePoint_1.setRaw(new Boolean(true));
    _jspx_th_jview_simplePoint_1.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_simplePoint_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:simplePoint
    org.apache.jsp.tag.web.jspViews.simplePoint_tag _jspx_th_jview_simplePoint_2 = new org.apache.jsp.tag.web.jspViews.simplePoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_simplePoint_2      );
    }
    _jspx_th_jview_simplePoint_2.setJspContext(_jspx_page_context);
    _jspx_th_jview_simplePoint_2.setXid("changeMeBinary");
    _jspx_th_jview_simplePoint_2.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_scriptPoint_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:scriptPoint
    org.apache.jsp.tag.web.jspViews.scriptPoint_tag _jspx_th_jview_scriptPoint_0 = new org.apache.jsp.tag.web.jspViews.scriptPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_scriptPoint_0      );
    }
    _jspx_th_jview_scriptPoint_0.setJspContext(_jspx_page_context);
    _jspx_th_jview_scriptPoint_0.setXid("changeMeBinary");
    _jspx_th_jview_scriptPoint_0.setRaw(new Boolean(true));
    _jspx_th_jview_scriptPoint_0.setJspBody(new jspViewExample_jspHelper( 0, _jspx_page_context, _jspx_th_jview_scriptPoint_0, null));
    _jspx_th_jview_scriptPoint_0.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_chart_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:chart
    org.apache.jsp.tag.web.jspViews.chart_tag _jspx_th_jview_chart_0 = new org.apache.jsp.tag.web.jspViews.chart_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_chart_0      );
    }
    _jspx_th_jview_chart_0.setJspContext(_jspx_page_context);
    _jspx_th_jview_chart_0.setDuration(new Integer(1));
    _jspx_th_jview_chart_0.setDurationType("hours");
    _jspx_th_jview_chart_0.setWidth(new Integer(800));
    _jspx_th_jview_chart_0.setHeight(new Integer(300));
    _jspx_th_jview_chart_0.setJspBody(new jspViewExample_jspHelper( 1, _jspx_page_context, _jspx_th_jview_chart_0, null));
    _jspx_th_jview_chart_0.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_chartPoint_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:chartPoint
    org.apache.jsp.tag.web.jspViews.chartPoint_tag _jspx_th_jview_chartPoint_0 = new org.apache.jsp.tag.web.jspViews.chartPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_chartPoint_0      );
    }
    _jspx_th_jview_chartPoint_0.setJspContext(_jspx_page_context);
    _jspx_th_jview_chartPoint_0.setParent(_jspx_parent);
    _jspx_th_jview_chartPoint_0.setXid("changeMe1");
    _jspx_th_jview_chartPoint_0.setColor("#2468AC");
    _jspx_th_jview_chartPoint_0.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_chartPoint_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:chartPoint
    org.apache.jsp.tag.web.jspViews.chartPoint_tag _jspx_th_jview_chartPoint_1 = new org.apache.jsp.tag.web.jspViews.chartPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_chartPoint_1      );
    }
    _jspx_th_jview_chartPoint_1.setJspContext(_jspx_page_context);
    _jspx_th_jview_chartPoint_1.setParent(_jspx_parent);
    _jspx_th_jview_chartPoint_1.setXid("changeMe2");
    _jspx_th_jview_chartPoint_1.setColor("#CA8642");
    _jspx_th_jview_chartPoint_1.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_chartPoint_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:chartPoint
    org.apache.jsp.tag.web.jspViews.chartPoint_tag _jspx_th_jview_chartPoint_2 = new org.apache.jsp.tag.web.jspViews.chartPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_chartPoint_2      );
    }
    _jspx_th_jview_chartPoint_2.setJspContext(_jspx_page_context);
    _jspx_th_jview_chartPoint_2.setParent(_jspx_parent);
    _jspx_th_jview_chartPoint_2.setXid("changeMe3");
    _jspx_th_jview_chartPoint_2.setColor("dodgerblue");
    _jspx_th_jview_chartPoint_2.doTag();
    return false;
  }

  private boolean _jspx_meth_jview_chartPoint_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  jview:chartPoint
    org.apache.jsp.tag.web.jspViews.chartPoint_tag _jspx_th_jview_chartPoint_3 = new org.apache.jsp.tag.web.jspViews.chartPoint_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_jview_chartPoint_3      );
    }
    _jspx_th_jview_chartPoint_3.setJspContext(_jspx_page_context);
    _jspx_th_jview_chartPoint_3.setParent(_jspx_parent);
    _jspx_th_jview_chartPoint_3.setXid("changeMe4");
    _jspx_th_jview_chartPoint_3.setColor("red");
    _jspx_th_jview_chartPoint_3.doTag();
    return false;
  }

  private class jspViewExample_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public jspViewExample_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  if (value == \"0\") {\n      $(\"scripted\").src = \"graphics/BlinkingLights/light_red.gif\";\n      // Set the global variable to false. This value is used in the toggle link.\n      binaryValue = false;\n  }\n  else {\n      $(\"scripted\").src = \"graphics/BlinkingLights/light_green.gif\";\n      // Set the global variable to true. This value is used in the toggle link.\n      binaryValue = true;\n  }\n");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  ");
      if (_jspx_meth_jview_chartPoint_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n  ");
      if (_jspx_meth_jview_chartPoint_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n  ");
      if (_jspx_meth_jview_chartPoint_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\n  ");
      if (_jspx_meth_jview_chartPoint_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write('\n');
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
