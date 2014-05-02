package org.apache.jsp.WEB_002dINF.snippet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Common;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n\n\n<!-- Add in useful messages for page, also done in M2M2ContextListener, should be moved to here -->\n");

String[] mangoMessageKeys = {
		
	    "common.active",
	    "common.alarmLevel",
	    "common.alarmLevel.greaterthan.none",
	    "common.alarmLevel.greaterthan.info",
	    "common.alarmLevel.greaterthan.urgent",
	    "common.alarmLevel.greaterthan.critical",
	    "common.alarmLevel.greaterthan.lifeSafety",
	    "common.alarmLevel.none",
	    "common.alarmLevel.none.rtn",
	    "common.alarmLevel.info",
	    "common.alarmLevel.info.rtn",
	    "common.alarmLevel.urgent",
	    "common.alarmLevel.urgent.rtn",
	    "common.alarmLevel.critical",
	    "common.alarmLevel.critical.rtn",
	    "common.alarmLevel.lifeSafety",
	    "common.alarmLevel.lifeSafety.rtn",
	    "common.alarmLevel.unknown",
	    "common.all",
	    "common.dateRangeFrom",
	    "common.dateRangeTo",
	    "common.duration",
	    "common.durationStd",
	    "common.durationDays",
	    "common.inactiveTime",
		"common.nortn",
		"common.name",
		"common.status",
	    "common.time",
		"common.totalResults",
		"common.clearDates",
		"common.xid",
		
		"chartRenderer.none",
		"chartRenderer.image",
		"chartRenderer.flipbook",
		"chartRenderer.statistics",
		"chartRenderer.table",
		
	    "dsList.name",
	    "dsList.type",
	    "dsList.connection",
	    "dsList.status",
	    
	    "dsEdit.deviceName",
	    "dsEdit.dataSourceType",
	    "dsEdit.pointDataType",
	    "dsEdit.pointSaved",
	    "dsEdit.dataSourceSaved",
	    "dsEdit.saved",
	    "dsEdit.saveWarning",
	    "dsEdit.points.details",
	    
	    "emport.export",
	    "emport.import",
	    
	    "event.rtn.rtn",
	    
        "events.acknowledge",
        "events.acknowledged",
        "events.editDataSource",
        "events.editEventHandler",
        "events.editPublisher",
	    "events.id",
        "events.msg",
        "events.pointDetails",
        "events.pointEdit",
	    "events.silence",
	    "events.showAuditEvents",
        "events.unsilence",
        "events.unacknowledged",
        
	    
        "header.dataPoints",
        
        "modules.modules",
        
	    "notes.addNote",
	    "notes.enterComment",
	    
	    "pointEdit.chart.missingLimit",
	    "pointEdit.chart.invalidLimit",
	    "pointEdit.chart.missingPeriods",
	    "pointEdit.chart.invalidPeriods",
	    "pointEdit.detectors.highLimit",
	    "pointEdit.detectors.lowLimit",
	    "pointEdit.detectors.change",
	    "pointEdit.detectors.state",
	    "pointEdit.detectors.changeCount",
	    "pointEdit.detectors.noChange",
	    "pointEdit.detectors.noUpdate",
	    "pointEdit.detectors.posCusum",
	    "pointEdit.detectors.negCusum",
	    "pointEdit.detectors.regexState",
	    
	    "pointEdit.logging.period",
	    
	    "pointEdit.logging.tolerance",
	    
	    "pointEdit.logging.type",
	    "pointEdit.logging.type.change",
	    "pointEdit.logging.type.all",
	    "pointEdit.logging.type.never",
	    "pointEdit.logging.type.interval",
	    "pointEdit.logging.type.tsChange",
	    
        "table.confirmDelete.DataSource",
        "table.confirmDelete.DataPoint",
        "table.confirmDelete.AllDataPoints",
        
        "table.edit",
        "table.add",
        "table.delete",
        "table.copy",
        "table.toggle",
        "table.export",
        "table.noData",
        "table.missingKey",
        "table.error.wrongId",
        "table.error.dwr",
        "table.pointDetails",
        
        "textRenderer.analog",
        "textRenderer.binary",
        "textRenderer.multistate",
        "textRenderer.none",
        "textRenderer.plain",
        "textRenderer.range",
        "textRenderer.time",
        "textRenderer.engineeringUnits",        
        
        "view.browse",
        "view.clear",
        "view.submit",
        
};
application.setAttribute("mangoMessageKeys",mangoMessageKeys);


      out.write("\n\n\n\n<script type=\"text/javascript\">\n\t\n\t//Setup the mango New ID Parameter\n\tmango.newId = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(null);
      _jspx_th_c_out_0.setValue( Common.NEW_ID );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write(";\n\t\n\t\n\t//Create a global array of available messages\n\tvar mangoMsg = {};\n\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n\n\t\n\tfunction mangoImg(name) {\n\t\treturn \"/images/\" + name;\n\t}\n\t\n\tfunction mangoTranslate(key, vars) {\n\t    var msg = mangoMsg[key];\n       if(typeof msg == 'undefined'){\n           console.log(\"Missing Key in mangoMsg: \" + key);\n           return \"Missing Msg Key: \" + key;\n       }\n\n\t    if (typeof vars == 'undefined') {\n\t        return msg;\n\t    }\n\t    \n\n\t    \n\t    for (var i = 0; i < vars.length; i++) {\n\t\t        msg = msg.replace(\"'{\" + i + \"}'\", vars[i]);\n\t\t        msg = msg.replace(\"{\" + i + \"}\", vars[i]);\n\t\t}\n\t    return msg;\n\t}\n\t\n\tfunction mangoAppendTranslations(map) {\n\t\tif(typeof(map) != \"object\")\n\t\t\treturn;\n\t\tfor(key in map) {\n\t\t\tif(key in mangoMsg)\n\t\t\t\tconsole.log(\"Recieved duplicate key: \" + key);\n\t\t\telse if(typeof(map[key]) != \"string\")\n\t\t\t\tconsole.log(\"Recieved nonstring value as translation for: \" + key);\n\t\t\telse\n\t\t\t\tmangoMsg[key] = map[key];\n\t\t}\n\t}\n</script>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mangoMessageKeys}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("messageKey");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n\tmangoMsg['");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messageKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'] = \"");
          if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write(';');
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_message_0.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messageKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }
}
