package org.apache.jsp.modules.jspViews.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jviews_tld extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n<!--\n    Copyright (C) 2014 Infinite Automation Systems Inc. All rights reserved.\n    @author Matthew Lohbihler\n-->\n\n<taglib xmlns=\"http://java.sun.com/xml/ns/j2ee\" \n    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n    xsi:schemaLocation=\"http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd\" \n    version=\"2.0\">\n  <tlib-version>1.0</tlib-version>\n  <jsp-version>1.2</jsp-version>\n  <short-name>jviews</short-name>\n  <description>Tag library for the JSP views. Author: Matthew Lohbihler</description>\n  \n  <tag>\n    <name>chart</name>\n    <tag-class>com.serotonin.m2m2.jviews.taglib.ChartTag</tag-class>\n    <body-content>JSP</body-content>\n    <attribute>\n      <name>duration</name>\n      <required>true</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>durationType</name>\n      <required>true</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>width</name>\n      <required>true</required>\n");
      out.write("      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>height</name>\n      <required>true</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n  </tag>\n  \n  <tag>\n    <name>chartPoint</name>\n    <tag-class>com.serotonin.m2m2.jviews.taglib.ChartPointTag</tag-class>\n    <body-content>empty</body-content>\n    <attribute>\n      <name>xid</name>\n      <required>true</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>color</name>\n      <required>false</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n  </tag>\n  \n  <tag>\n    <name>simplePoint</name>\n    <tag-class>com.serotonin.m2m2.jviews.taglib.SimplePointTag</tag-class>\n    <body-content>empty</body-content>\n    <attribute>\n      <name>xid</name>\n      <required>true</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>raw</name>\n      <required>false</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n");
      out.write("      <name>disabledValue</name>\n      <required>false</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>time</name>\n      <required>false</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n  </tag>\n  \n  <tag>\n    <name>staticPoint</name>\n    <tag-class>com.serotonin.m2m2.jviews.taglib.StaticPointTag</tag-class>\n    <body-content>empty</body-content>\n    <attribute>\n      <name>xid</name>\n      <required>true</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>raw</name>\n      <required>false</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n    <attribute>\n      <name>disabledValue</name>\n      <required>false</required>\n      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n  </tag>\n  \n  <tag>\n    <name>viewInit</name>\n    <tag-class>com.serotonin.m2m2.jviews.taglib.JspViewInitTag</tag-class>\n    <body-content>empty</body-content>\n    <attribute>\n      <name>username</name>\n      <required>true</required>\n");
      out.write("      <rtexprvalue>true</rtexprvalue>\n    </attribute>\n  </tag>\n</taglib>\n");
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
}
