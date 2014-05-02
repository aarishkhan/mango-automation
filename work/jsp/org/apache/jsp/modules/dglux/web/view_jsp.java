package org.apache.jsp.modules.dglux.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.util.*;
import java.io.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n\r\n\r\n\r\n<html lang=\"en\">\r\n<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/core/\"/>\r\n<!-- \r\n  Smart developers always View Source. \r\n  \r\n  This application was built using Adobe Flex, an open source framework\r\n  for building rich Internet applications that get delivered via the\r\n  Flash Player or to desktops via Adobe AIR. \r\n  \r\n  Learn more about Flex at http://flex.org\r\n// -->\r\n\r\n<head>\r\n  <meta http-equiv='Content-Type' content='text/html; charset=utf-8' />\r\n  \r\n  <!--  BEGIN Browser History required section -->\r\n  <link rel='stylesheet' type='text/css' href='history/history.css' />\r\n  <!--  END Browser History required section -->\r\n  \r\n  <title>DGLux</title>\r\n  <link rel=\"icon\" href=\"/images/favicon.ico\"/>\r\n  <link rel=\"shortcut icon\" href=\"/images/favicon.ico\"/>\r\n  <script src='AC_OETags.js' language='javascript'></script>\r\n  \r\n  <!--  BEGIN Browser History required section -->\r\n  <script src='history/history.js' language='javascript'></script>\r\n  <!--  END Browser History required section -->\r\n  \r\n  <style>\r\n    body { margin: 0px;  }\r\n  </style>\r\n  <script language='JavaScript' type='text/javascript'>\r\n");
      out.write("    <!--\r\n    // -----------------------------------------------------------------------------\r\n    // Globals\r\n    // Major version of Flash required\r\n    var requiredMajorVersion = 10;\r\n    // Minor version of Flash required\r\n    var requiredMinorVersion = 1;\r\n    // Minor version of Flash required\r\n    var requiredRevision = 0;\r\n    // -----------------------------------------------------------------------------\r\n    // -->\r\n  </script>\r\n</head>\r\n \r\n<body  bgcolor='#000000'>\r\n  <script language='JavaScript' type='text/javascript'>\r\n    <!--\r\n    // Version check for the Flash Player that has the ability to start Player Product Install (6.0r65)\r\n    var hasProductInstall = DetectFlashVer(6, 0, 65);\r\n    \r\n    // Version check based upon the values defined in globals\r\n    var hasRequestedVersion = DetectFlashVer(requiredMajorVersion, requiredMinorVersion, requiredRevision);\r\n    \r\n    if (!");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allowAccess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\r\n        window.location = \"/dglux/login.htm\";\r\n    else if (hasProductInstall && !hasRequestedVersion ) {\r\n        // DO NOT MODIFY THE FOLLOWING FOUR LINES\r\n        // Location visited after installation is complete if installation is required\r\n        var MMPlayerType = (isIE == true) ? 'ActiveX' : 'PlugIn';\r\n        var MMredirectURL = window.location;\r\n        document.title = document.title.slice(0, 47) + ' - Flash Player Installation';\r\n        var MMdoctitle = document.title;\r\n        \r\n        AC_FL_RunContent(\r\n            'src', 'playerProductInstall',\r\n            'FlashVars', 'MMredirectURL='+MMredirectURL+'&MMplayerType='+MMPlayerType+'&MMdoctitle='+MMdoctitle+'',\r\n            'width', '100%',\r\n            'height', '100%',\r\n            'align', 'middle',\r\n            'id', 'dglux',\r\n            'quality', 'high',\r\n            'bgcolor', '#869ca7',\r\n            'name', 'dglux',\r\n            'allowScriptAccess','sameDomain',\r\n            'type', 'application/x-shockwave-flash',\r\n            'wmode', 'transparent',\r\n");
      out.write("            'pluginspage', 'http://www.adobe.com/go/getflashplayer',\r\n            'flashvars', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flashVars}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\r\n        );\r\n    }\r\n    else if (hasRequestedVersion) {\r\n        // if we've detected an acceptable version\r\n        // embed the Flash Content SWF when all tests are passed\r\n        AC_FL_RunContent(\r\n                'src', 'dglux',\r\n                'width', '100%',\r\n                'height', '100%',\r\n                'align', 'middle',\r\n                'id', 'dglux',\r\n                'quality', 'high',\r\n                'bgcolor', '#869ca7',\r\n                'name', 'dglux',\r\n                'allowScriptAccess','sameDomain',\r\n                'type', 'application/x-shockwave-flash',\r\n                'wmode', 'transparent',\r\n                'pluginspage', 'http://www.adobe.com/go/getflashplayer',\r\n                'flashvars', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flashVars}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\r\n        );\r\n    }\r\n    else {  // flash is too old or we can't detect the plugin\r\n        var alternateContent = 'Alternate HTML content should be placed here. '\r\n                + 'This content requires the Adobe Flash Player. '\r\n                + '<a href=http://www.adobe.com/go/getflash/>Get Flash</a>';\r\n        document.write(alternateContent);  // insert non-flash content\r\n    }\r\n    // -->\r\n  </script>\r\n  <noscript>\r\n    <object classid='clsid:D27CDB6E-AE6D-11cf-96B8-444553540000'\r\n            id='dglux' width='100%' height='100%'\r\n            codebase='http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab'>\r\n            <param name='movie' value='dglux.swf' />\r\n            <param name='quality' value='high' />\r\n            <param name='bgcolor' value='#869ca7' />\r\n            <param name='wmode' value='transparent' />\r\n            <param name='flashvars' value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flashVars}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' />\r\n            <param name='allowScriptAccess' value='sameDomain' />\r\n            <embed src='dglux.swf' quality='high' bgcolor='#869ca7'\r\n                width='100%' height='100%' name='dglux' align='middle'\r\n                play='true'\r\n                loop='false'\r\n                quality='high'\r\n                wmode='transparent'\r\n                flashvars='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flashVars}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\r\n                allowScriptAccess='sameDomain'\r\n                type='application/x-shockwave-flash'\r\n                pluginspage='http://www.adobe.com/go/getflashplayer'>\r\n            </embed>\r\n    </object>\r\n  </noscript>\r\n</body>\r\n</html>");
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
