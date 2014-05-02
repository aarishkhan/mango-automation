package org.apache.jsp.modules.pachube.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editPachubePub_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
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

      out.write('\n');
      out.write("\n<script type=\"text/javascript\">\n  dojo.require(\"dojo.store.Memory\");\n  dojo.require(\"dijit.form.ComboBox\");\n  \n  var allPoints = [];  \n  var selectedPoints = [];  \n  var pointLookupText = \"\"; //For selection to remain in the filter\n\n  dojo.ready(function() { \n      PachubePublisherDwr.initSender(function(response) {\n          dojo.forEach(response.data.allPoints, function(item) {\n              allPoints.push({\n                  id: item.id, \n                  name: item.extendedName, \n                  enabled: item.enabled, \n                  type: item.dataTypeMessage,\n                  fancyName: item.extendedName\n              });\n          });\n          \n          dojo.forEach(response.data.publisher.points, function(item) {\n              addToSelectedArray(item.dataPointId, item.feedId, item.dataStreamId);\n          });\n          refreshSelectedPoints();\n          \n          // Create the lookup\n          new dijit.form.ComboBox({\n              store: new dojo.store.Memory({ data: allPoints }),\n              labelAttr: \"fancyName\",\n");
      out.write("              labelType: \"html\",\n              searchAttr: \"name\",\n              autoComplete: false,\n              style: \"width: 254px;\",\n              queryExpr: \"*${0}*\",\n              highlightMatch: \"all\",\n              required: false,\n              onChange: function(point) {\n                  if (this.item) {\n                      selectPoint(this.item.id);\n                      this.loadAndOpenDropDown();\n                      this.set('displayedValue',pointLookupText);\n                      if(typeof(this._startSearch) == 'function')\n                          this._startSearch(pointLookupText); //Dangerous because could change, but works!\n                  }\n              },\n              onKeyUp: function(event){\n                  pointLookupText = this.get('displayedValue');\n              }\n          }, \"pointLookup\");        \n      });\n  });\n  \n  function selectPoint(pointId) {\n      if (!containsPoint(pointId)) {\n          addToSelectedArray(pointId, \"\", \"\");\n          refreshSelectedPoints();\n      }\n");
      out.write("  }\n  \n  function containsPoint(pointId) {\n      return getElement(selectedPoints, pointId, \"id\") != null;\n  }\n  \n  function addToSelectedArray(pointId, feedId, dataStreamId) {\n      var data = getElement(allPoints, pointId);\n      \n      if (data) {\n          data.fancyName = \"<span class='disabled'>\"+ data.name +\"</span>\";\n          \n          // Missing names imply that the point was deleted, so ignore.\n          selectedPoints[selectedPoints.length] = {\n              id : pointId,\n              pointName : data.name,\n              enabled : data.enabled,\n              pointType : data.type,\n              feedId: feedId,\n              dataStreamId: dataStreamId\n          };\n      }\n  }\n  \n  function removeFromSelectedPoints(pointId) {\n      removeElement(selectedPoints, pointId);\n      refreshSelectedPoints();\n      \n      var data = getElement(allPoints, pointId);\n      if (data)\n          data.fancyName = data.name;\n  }\n  \n  function refreshSelectedPoints() {\n      dwr.util.removeAllRows(\"selectedPoints\");\n");
      out.write("      if (selectedPoints.length == 0)\n          show(\"selectedPointsEmpty\");\n      else {\n          hide(\"selectedPointsEmpty\");\n          dwr.util.addRows(\"selectedPoints\", selectedPoints,\n              [\n                  function(data) { return data.pointName; },\n                  function(data) { return \"<img src='images/\"+ (data.enabled ? \"brick_go\" : \"brick_stop\") +\".png'/>\"; },\n                  function(data) { return data.pointType; },\n                  function(data) {\n                          return \"<input type='text' value='\"+ data.feedId +\"' \"+\n                                  \"onblur='updateFeedId(\"+ data.id +\", this.value)'/>\";\n                  },\n                  function(data) {\n                          return \"<input type='text' value='\"+ data.dataStreamId +\"' \"+\n                                  \"onblur='updateDataStreamId(\"+ data.id +\", this.value)'/>\";\n                  },\n                  function(data) { \n                          return \"<img src='images/bullet_delete.png' class='ptr' \"+\n");
      out.write("                                  \"onclick='removeFromSelectedPoints(\"+ data.id +\")'/>\";\n                  }\n              ],\n              {\n                  rowCreator: function(options) {\n                      var tr = document.createElement(\"tr\");\n                      tr.className = \"row\"+ (options.rowIndex % 2 == 0 ? \"\" : \"Alt\");\n                      return tr;\n                  },\n                  cellCreator: function(options) {\n                      var td = document.createElement(\"td\");\n                      if (options.cellNum == 1 || options.cellNum == 4)\n                          td.align = \"center\";\n                      return td;\n                  } \n              });\n      }\n  }\n  \n  function updateFeedId(pointId, feedId) {\n      updateElement(selectedPoints, pointId, \"feedId\", feedId);\n  }\n  \n  function updateDataStreamId(pointId, dataStreamId) {\n      updateElement(selectedPoints, pointId, \"dataStreamId\", dataStreamId);\n  }\n  \n  function savePublisherImpl(name, xid, enabled, cacheWarningSize, cacheDiscardSize, changesOnly, sendSnapshot,\n");
      out.write("          snapshotSendPeriods, snapshotSendPeriodType) {\n      // Clear messages.\n      hide(\"apiKeyMsg\");\n      hide(\"timeoutSecondsMsg\");\n      hide(\"retriesMsg\");\n      hide(\"pointsMsg\");\n      \n      var points = new Array();\n      for (var i=0; i<selectedPoints.length; i++)\n          points[points.length] = {dataPointId: selectedPoints[i].id, feedId: selectedPoints[i].feedId,\n                  dataStreamId: selectedPoints[i].dataStreamId};\n      \n      PachubePublisherDwr.savePachubeSender(name, xid, enabled, points, $get(\"apiKey\"), $get(\"timeoutSeconds\"),\n              $get(\"retries\"), cacheWarningSize, cacheDiscardSize, changesOnly, sendSnapshot, snapshotSendPeriods,\n              snapshotSendPeriodType, savePublisherCB);\n  }\n</script>\n\n<table cellpadding=\"0\" cellspacing=\"0\">\n  <tr>\n    <td valign=\"top\">\n      <div class=\"borderDiv marR marB\">\n        <table>\n          <tr>\n            <td colspan=\"2\" class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("</td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <input type=\"text\" id=\"apiKey\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.apiKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formLong\"/>\n              <div id=\"apiKeyMsg\" class=\"formError\" style=\"display:none;\"></div>\n              <div>");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</div>\n            </td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <input type=\"text\" id=\"timeoutSeconds\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.timeoutSeconds}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n              <div id=\"timeoutSecondsMsg\" class=\"formError\" style=\"display:none;\"></div>\n            </td>\n          </tr>\n          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <input type=\"text\" id=\"retries\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.retries}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n              <div id=\"retriesMsg\" class=\"formError\" style=\"display:none;\"></div>\n            </td>\n          </tr>\n        </table>\n      </div>\n    </td>\n  </tr>\n</table>\n\n<table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n  <div class=\"borderDiv\">\n    <table width=\"100%\">\n      <tr>\n        <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n        <td align=\"right\"><div id=\"pointLookup\"></div></td>\n      </tr>\n    </table>\n    \n    <table cellspacing=\"1\" cellpadding=\"0\">\n      <tr class=\"rowHeader\">\n        <td>");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("</td>\n        <td></td>\n      </tr>\n      <tbody id=\"selectedPointsEmpty\" style=\"display:none;\"><tr><td colspan=\"5\">");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("</td></tr></tbody>\n      <tbody id=\"selectedPoints\"></tbody>\n    </table>\n    <div id=\"pointsMsg\" class=\"formError\" style=\"display:none;\"></div>\n  </div>\n</td></tr></table>");
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
    _jspx_th_fmt_message_0.setKey("publisherEdit.pachube.props");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_tag_help_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setId("pachubePublishing");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("publisherEdit.pachube.apiKey");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("publisherEdit.pachube.apiKeyAuthority");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("publisherEdit.pachube.timeoutSeconds");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setKey("publisherEdit.pachube.retries");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setKey("publisherEdit.points");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setKey("publisherEdit.point.name");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(null);
    _jspx_th_fmt_message_7.setKey("publisherEdit.point.status");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(null);
    _jspx_th_fmt_message_8.setKey("publisherEdit.point.type");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(null);
    _jspx_th_fmt_message_9.setKey("publisherEdit.pachube.point.feedId");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(null);
    _jspx_th_fmt_message_10.setKey("publisherEdit.pachube.point.dataStreamId");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(null);
    _jspx_th_fmt_message_11.setKey("publisherEdit.noPoints");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }
}
