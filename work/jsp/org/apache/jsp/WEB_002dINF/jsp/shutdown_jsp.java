package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shutdown_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(6);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n\r\n\r\n\r\n");
      if (_jspx_meth_tag_page_0(_jspx_page_context))
        return;
      out.write('\r');
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

  private boolean _jspx_meth_tag_page_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:page
    org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_page_0      );
    }
    _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_page_0.setDwr("StartupDwr");
    _jspx_th_tag_page_0.setJspBody(new shutdown_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null));
    _jspx_th_tag_page_0.doTag();
    return false;
  }

  private class shutdown_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public shutdown_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n<script type=\"text/javascript\">\r\nvar lastMessage; //Holds the last recieved log message\r\n\r\nrequire([\"dojo/topic\",\"dijit/ProgressBar\", \"dojo/_base/window\", \"dojo/domReady!\"], \r\n        function(topic, ProgressBar, win){\r\n\r\n    //Setup the console messages target\r\n    topic.subscribe(\"startupTopic\", function(message) {\r\n        //Message has members:\r\n        // duration - int\r\n        // message - string\r\n        // type - string\r\n        var startupConsole = dijit.byId(\"startupConsole\");\r\n        if (message.type == 'clear')\r\n            startupConsole.set('content', \"\");\r\n        else {\r\n            startupConsole.set('content', \r\n                    startupConsole.get('content') + message.message + \"</br>\");\r\n        }\r\n    });\r\n    \r\n    \r\n    var i = 0;\r\n    var myProgressBar = new ProgressBar({\r\n        style: \"width: 300px\"\r\n    },\"startupProgress\");\r\n    \r\n    \r\n    setInterval(function(){\r\n        StartupDwr.getStartupProgress(function(response){\r\n            \r\n            //Do we have a new message\r\n");
      out.write("            if(typeof response.data.message != 'undefined'){\r\n\t            if((typeof lastMessage == 'undefined')||(lastMessage != response.data.message)){\r\n\t                lastMessage = response.data.message;\r\n\t\t            dojo.publish(\"startupTopic\",[{\r\n\t\t                    message:response.data.message,\r\n\t\t                    type: \"message\",\r\n\t\t                    duration: -1, //Don't go away\r\n\t\t                    }]\r\n\t\t            );\r\n\t            }\r\n            }\r\n\r\n            var redirect = false;\r\n            \r\n            //Print the message for what Mango is doing\r\n            var startingMessageDiv = dojo.byId(\"startingMessage\");\r\n            startingMessageDiv.innerHTML = response.data.processMessage; \r\n            \r\n            var progress = 0;\r\n            //We don't care if we are starting up or shutting down, just need to know which one\r\n            if((response.data.startupProgress >= 100) && (response.data.shutdownProgress > 0)){\r\n                //Dirty hack for now to show that the restart has happened, once the web server is off no more messages.\r\n");
      out.write("                progress = 98; //This looks like its almost restarted, then if it does it will flip over to 'Starting' messages\r\n            }\r\n\r\n            if(response.data.startupProgress < 100)\r\n                progress = response.data.startupProgress;\r\n\r\n            \r\n            //If the interval is > 100 then we should redirect, just remember at this point we could be shutting down\r\n             if((response.data.startupProgress >= 100) && (response.data.shutdownProgress == 0)){\r\n                 progress = 100; //Ready for start, redirect now\r\n                 redirect = true;\r\n             }\r\n            \r\n            \r\n            myProgressBar.set(\"value\", progress + \"%\");\r\n            var startupMessageDiv = dojo.byId(\"startupMessage\");\r\n            startupMessageDiv.innerHTML = response.data.state;\r\n            \r\n            //Do redirect?\r\n            if(redirect)\r\n                window.location.href = response.data.startupUri;\r\n            \r\n       });\r\n    }, 700);\r\n});\r\n\r\n</script>\r\n    <div style=\"width: 100%; padding: 1em 2em 1em 1em;\"\r\n");
      out.write("            data-dojo-type=\"dijit/layout/ContentPane\"\r\n            data-dojo-props=\"region:'center'\">\r\n    <div id=\"startingMessage\" class='bigTitle'></div>\r\n    <div id=\"startupProgress\"></div>\r\n    <div id=\"startupMessage\">Mango is starting up, please wait...</div>\r\n    <div id=\"startupConsole\"\r\n            style=\" height: 200px; margin: 1em 3em 1em 1em; border: 2px; padding: .2em 1em 1em 1em; overflow:auto; border: 2px solid; border-radius:10px; border-color: lightblue;\"\r\n            data-dojo-type=\"dijit/layout/ContentPane\"></div>\r\n    </div>\r\n");
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
