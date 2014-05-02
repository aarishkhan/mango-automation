package org.apache.jsp.modules.meta.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.meta.MetaPointLocatorVO;
import com.serotonin.m2m2.Common;

public final class editMeta_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("sst:quotEncode", com.serotonin.web.taglib.Functions.class, "quotEncode", new Class[] {java.lang.String.class});
}

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
    _jspx_dependants.add("/WEB-INF/tags/pointList.tag");
    _jspx_dependants.add("/WEB-INF/tags/dataTypeOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_translate_message_escapeDQuotes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_translate_message_escapeDQuotes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_m2m2_translate_message_escapeDQuotes_nobody.release();
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n\n\n\n<script type=\"text/javascript\">\n\n\tdojo.require(\"dojo.store.Memory\");\n\tdojo.require(\"dijit.form.ComboBox\");\n\t  \n  var pointsArray = new Array();\n  var contextArray = new Array();\n  var pointLookupText = \"\"; //For selection to remain in the filter\n  \n  function initImpl() {\n\t  \n\t  \n      ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n      \n      \n   // Create the lookup\n      new dijit.form.ComboBox({\n          store: new dojo.store.Memory({ data: pointsArray }),\n          labelType: \"html\",\n          labelAttr: \"fancyName\",\n          searchAttr: \"name\",\n          autoComplete: false,\n          style: \"width: 254px;\",\n          queryExpr: \"*${0}*\",\n          highlightMatch: \"all\",\n          required: false,\n          dropDownPosition: [\"above\"],\n          onChange: function(point) {\n              if (this.item) {\n                  selectPoint(this.item.id);\n                  this.loadAndOpenDropDown();\n                  this.set('displayedValue',pointLookupText);\n                  if(typeof(this._startSearch) == 'function')\n                      this._startSearch(pointLookupText); //Dangerous because could change, but works!\n             }\n          },\n          onKeyUp: function(event){\n              pointLookupText = this.get('displayedValue');\n          }\n      }, \"pointLookup\");\n      \n      \n      \n      createContextualMessageNode(\"contextContainer\", \"context\");\n");
      out.write("  }\n  \n  function selectPoint(pointId){\n      if(!alreadyAddedToContextArray(pointId)){\n          addToContextArray(pointId, \"p\"+pointId);\n          writeContextArray();\n      }\n  }\n  \n  function addToContextArray(pointId, scriptVarName) {\n      var data = getElement(pointsArray, pointId);\n      if (data) {\n          \n          //Were we already added\n          \n          // Missing names imply that the point was deleted, so ignore.\n          contextArray[contextArray.length] = {\n              pointId : pointId,\n              pointName : data.name,\n              pointType : data.type,\n              scriptVarName : scriptVarName\n          };\n          //Disable in list\n          data.fancyName = \"<span class='disabled'>\"+ data.name +\"</span>\";\n      }\n  }\n  \n  function removeFromContextArray(pointId) {\n      for (var i=contextArray.length-1; i>=0; i--) {\n          if (contextArray[i].pointId == pointId)\n              contextArray.splice(i, 1);\n      }\n      writeContextArray();\n      var data = getElement(pointsArray, pointId);\n");
      out.write("      if(data)\n          data.fancyName = data.name;\n  }\n\n  \n  /**\n   * Does the context array already have this item\n   */\n  function alreadyAddedToContextArray(id){\n\t  \n\t  for(var i=0; i<contextArray.length; i++){\n\t   if(contextArray[i].pointId == id)\n\t\t   return true;\n\t  }\n\t  \n\t  return false;\n  }\n  \n  function appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions) {\n      pointListColumnHeaders.push(\"\");\n      pointListColumnFunctions.push(function(p) {\n          var id = \"generateImg\"+ p.id;\n          var onclick = \"generateHistory(\"+ p.id +\")\";\n          return writeImage(id, \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modulePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/web/clock-history.png\", null,\n        \t\t  \"");
      if (_jspx_meth_m2m2_translate_1(_jspx_page_context))
        return;
      out.write("\", onclick);\n      });\n  }\n  \n  function generateHistory(pointId) {\n      startImageFader(\"generateImg\"+ pointId, true);\n      MetaEditDwr.generateMetaPointHistory(pointId, function(result) {\n          stopImageFader(\"generateImg\"+ pointId);\n          alert(result);\n      });\n  }\n  \n  function saveDataSourceImpl(basic) {\n      MetaEditDwr.saveMetaDataSource(basic, saveDataSourceCB);\n  }\n  \n  function editPointCBImpl(locator) {\n      contextArray.length = 0;\n      for (var i=0; i<locator.context.length; i++)\n          addToContextArray(locator.context[i].key, locator.context[i].value);\n      writeContextArray();\n      \n      $set(\"script\", locator.script);\n//       $set(\"scriptEngine\", locator.scriptEngine);\n      $set(\"dataTypeId\", locator.dataTypeId);\n      $set(\"settable\", locator.settable);\n      $set(\"updateEvent\", locator.updateEvent);\n      $set(\"updateCronPattern\", locator.updateCronPattern);\n      $set(\"executionDelaySeconds\", locator.executionDelaySeconds);\n      \n      updateEventChanged();\n  }\n  \n  function savePointImpl(locator) {\n");
      out.write("      delete locator.relinquishable;\n      \n      locator.context = createContextArray();\n      locator.script = $get(\"script\");\n//       locator.scriptEngine = $get(\"scriptEngine\");\n\t  locator.scriptEngine = 0;\n      locator.dataTypeId = $get(\"dataTypeId\");\n      locator.settable = $get(\"settable\");\n      locator.updateEvent = $get(\"updateEvent\");\n      locator.updateCronPattern = $get(\"updateCronPattern\");\n      locator.executionDelaySeconds = $get(\"executionDelaySeconds\");\n      \n      MetaEditDwr.saveMetaPointLocator(currentPoint.id, $get(\"xid\"), $get(\"name\"), locator, savePointCB);\n  }\n  \n  \n  function writeContextArray() {\n      dwr.util.removeAllRows(\"contextTable\");\n      if (contextArray.length == 0) {\n          show($(\"contextTableEmpty\"));\n          hide($(\"contextTableHeaders\"));\n      }\n      else {\n          hide($(\"contextTableEmpty\"));\n          show($(\"contextTableHeaders\"));\n          dwr.util.addRows(\"contextTable\", contextArray,\n              [\n                  function(data) { return data.pointName; },\n");
      out.write("                  function(data) { return data.pointType; },\n                  function(data) {\n                          return \"<input type='text' value='\"+ data.scriptVarName +\"' class='formShort' \"+\n                                  \"onblur='updateScriptVarName(\"+ data.pointId +\", this.value)'/>\";\n                  },\n                  function(data) { \n                          return \"<img src='images/bullet_delete.png' class='ptr' \"+\n                                  \"onclick='removeFromContextArray(\"+ data.pointId +\")'/>\";\n                  }\n              ],\n              {\n                  rowCreator:function(options) {\n                      var tr = document.createElement(\"tr\");\n                      tr.className = \"smRow\"+ (options.rowIndex % 2 == 0 ? \"\" : \"Alt\");\n                      return tr;\n                  }\n              });\n      }\n      updatePointsList();\n  }\n  \n  function updatePointsList() {\n      dwr.util.removeAllOptions(\"allPointsList\");\n      var availPoints = new Array();\n      for (var i=0; i<pointsArray.length; i++) {\n");
      out.write("          var found = false;\n          for (var j=0; j<contextArray.length; j++) {\n              if (contextArray[j].pointId == pointsArray[i].id) {\n                  found = true;\n                  break;\n              }\n          }\n          \n          if (!found)\n              availPoints[availPoints.length] = pointsArray[i];\n      }\n      dwr.util.addOptions(\"allPointsList\", availPoints, \"id\", \"name\");\n  }\n  \n  function updateScriptVarName(pointId, scriptVarName) {\n      for (var i=contextArray.length-1; i>=0; i--) {\n          if (contextArray[i].pointId == pointId)\n              contextArray[i].scriptVarName = scriptVarName;\n      }\n  }\n  \n  function validateScript() {\n      hideContextualMessages(\"pointProperties\"); <!-- Bug here, legacy placeholder of point details -->\n      hideContextualMessages(\"pointDetails\");\n      MetaEditDwr.validateScript($get(\"script\"), createContextArray(), $get(\"dataTypeId\"), $get(\"scriptEngine\"), validateScriptCB);\n  }\n  \n  function createContextArray() {\n      var context = new Array();\n");
      out.write("      for (var i=0; i<contextArray.length; i++) {\n          context[context.length] = {\n              key : contextArray[i].pointId,\n              value : contextArray[i].scriptVarName\n          };\n      }\n      return context;\n  }\n  \n  function validateScriptCB(response) {\n      showDwrMessages(response.messages);\n  }\n  \n  function updateEventChanged() {\n      display(\"updateCronPatternRow\", $get(\"updateEvent\") == ");
      out.print( MetaPointLocatorVO.UPDATE_EVENT_CRON );
      out.write(");\n  }\n//@ sourceURL=editMeta_ajaxLoaded.js\n</script>\n\n");
      if (_jspx_meth_tag_dataSourceAttrs_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      //  tag:pointList
      org.apache.jsp.tag.web.pointList_tag _jspx_th_tag_pointList_0 = new org.apache.jsp.tag.web.pointList_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_pointList_0        );
      }
      _jspx_th_tag_pointList_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_pointList_0.setPointHelpId("metaPP");
      _jspx_th_tag_pointList_0.setJspBody(new editMeta_jspHelper( 1, _jspx_page_context, _jspx_th_tag_pointList_0, null));
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userPoints}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("dp");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n        pointsArray[pointsArray.length] = {\n            id : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dp.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", \n            name : '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:quotEncode(dp.extendedName)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("',\n            fancyName: '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:quotEncode(dp.extendedName)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("',\n            type : '");
          if (_jspx_meth_m2m2_translate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("',\n        };\n      ");
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

  private boolean _jspx_meth_m2m2_translate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_0 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_message_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_m2m2_translate_0.setMessage((com.serotonin.m2m2.i18n.TranslatableMessage) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dp.dataTypeMessage}", com.serotonin.m2m2.i18n.TranslatableMessage.class, (PageContext)_jspx_page_context, null));
    _jspx_th_m2m2_translate_0.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_0 = _jspx_th_m2m2_translate_0.doStartTag();
    if (_jspx_th_m2m2_translate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_message_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_0);
      return true;
    }
    _jspx_tagPool_m2m2_translate_message_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_0);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_1 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_1.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_1.setParent(null);
    _jspx_th_m2m2_translate_1.setKey("dsEdit.meta.generate");
    _jspx_th_m2m2_translate_1.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_1 = _jspx_th_m2m2_translate_1.doStartTag();
    if (_jspx_th_m2m2_translate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_1);
      return true;
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_1);
    return false;
  }

  private boolean _jspx_meth_tag_dataSourceAttrs_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dataSourceAttrs
    org.apache.jsp.tag.web.dataSourceAttrs_tag _jspx_th_tag_dataSourceAttrs_0 = new org.apache.jsp.tag.web.dataSourceAttrs_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dataSourceAttrs_0      );
    }
    _jspx_th_tag_dataSourceAttrs_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_dataSourceAttrs_0.setDescriptionKey("dsEdit.meta.desc");
    _jspx_th_tag_dataSourceAttrs_0.setHelpId("metaDS");
    _jspx_th_tag_dataSourceAttrs_0.setJspBody(new editMeta_jspHelper( 0, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null));
    _jspx_th_tag_dataSourceAttrs_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("dsEdit.pointDataType");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_tag_dataTypeOptions_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dataTypeOptions
    org.apache.jsp.tag.web.dataTypeOptions_tag _jspx_th_tag_dataTypeOptions_0 = new org.apache.jsp.tag.web.dataTypeOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dataTypeOptions_0      );
    }
    _jspx_th_tag_dataTypeOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_dataTypeOptions_0.setParent(_jspx_parent);
    _jspx_th_tag_dataTypeOptions_0.setId("dataTypeId");
    _jspx_th_tag_dataTypeOptions_0.setExcludeImage(new Boolean(true));
    _jspx_th_tag_dataTypeOptions_0.doTag();
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
    _jspx_th_fmt_message_1.setKey("dsEdit.settable");
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
    _jspx_th_fmt_message_2.setKey("dsEdit.meta.scriptContext");
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
    _jspx_th_fmt_message_3.setKey("dsEdit.meta.noPoints");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_4.setKey("dsEdit.meta.pointName");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_5.setKey("dsEdit.pointDataType");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_6.setKey("dsEdit.meta.var");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_7.setKey("dsEdit.meta.script");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_parent);
    _jspx_th_tag_img_0.setPng("accept");
    _jspx_th_tag_img_0.setOnclick("validateScript();");
    _jspx_th_tag_img_0.setTitle("common.validate");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_8.setKey("dsEdit.meta.event");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_9.setKey("dsEdit.meta.event.context");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_10.setKey("dsEdit.meta.event.minute");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_11.setKey("dsEdit.meta.event.hour");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_12.setKey("dsEdit.meta.event.day");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_13.setKey("dsEdit.meta.event.week");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_14.setKey("dsEdit.meta.event.month");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_15.setKey("dsEdit.meta.event.year");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_16.setKey("dsEdit.meta.event.cron");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_17.setKey("dsEdit.meta.event.cron");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_tag_help_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setParent(_jspx_parent);
    _jspx_th_tag_help_0.setId("cronPatterns");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_18.setKey("dsEdit.meta.delay");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private class editMeta_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public editMeta_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write('\n');
      return false;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\">");
      if (_jspx_meth_tag_dataTypeOptions_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n  \n  ");
      out.write("\n  \n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\"><input type=\"checkbox\" id=\"settable\"/></td>\n  </tr>\n  \n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\">\n      <div id=\"pointLookup\"></div>\n      \n      <table cellspacing=\"1\" id=\"contextContainer\">\n        <tbody id=\"contextTableEmpty\" style=\"display:none;\">\n          <tr><th colspan=\"4\">");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th></tr>\n        </tbody>\n        <tbody id=\"contextTableHeaders\" style=\"display:none;\">\n          <tr class=\"smRowHeader\">\n            <td>");
      if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td>");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td>");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            <td></td>\n          </tr>\n        </tbody>\n        <tbody id=\"contextTable\"></tbody>\n      </table>\n    </td>\n  </tr>\n  \n  <tr>\n    <td class=\"formLabelRequired\">\n      ");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n    </td>\n    <td class=\"formField\"><textarea id=\"script\" rows=\"10\" cols=\"50\"/></textarea></td>\n  </tr>\n  \n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\">\n      <select id=\"updateEvent\" onchange=\"updateEventChanged()\">\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_0.setValue( MetaPointLocatorVO.UPDATE_EVENT_CONTEXT_UPDATE );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_1.setValue( Common.TimePeriods.MINUTES );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_2.setPageContext(_jspx_page_context);
      _jspx_th_c_out_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_2.setValue( Common.TimePeriods.HOURS );
      int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
      if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_3.setPageContext(_jspx_page_context);
      _jspx_th_c_out_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_3.setValue( Common.TimePeriods.DAYS );
      int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
      if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_4.setPageContext(_jspx_page_context);
      _jspx_th_c_out_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_4.setValue( Common.TimePeriods.WEEKS );
      int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
      if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_5.setPageContext(_jspx_page_context);
      _jspx_th_c_out_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_5.setValue( Common.TimePeriods.MONTHS );
      int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
      if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_6.setPageContext(_jspx_page_context);
      _jspx_th_c_out_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_6.setValue( Common.TimePeriods.YEARS );
      int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
      if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_7.setPageContext(_jspx_page_context);
      _jspx_th_c_out_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_7.setValue( MetaPointLocatorVO.UPDATE_EVENT_CRON );
      int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
      if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n      </select>\n    </td>\n  </tr>\n  \n  <tr id=\"updateCronPatternRow\">\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\"><input id=\"updateCronPattern\" type=\"text\"/> ");
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n  </tr>\n  \n  <tr>\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td class=\"formField\"><input id=\"executionDelaySeconds\" type=\"text\" class=\"formShort\"/></td>\n  </tr>\n");
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
