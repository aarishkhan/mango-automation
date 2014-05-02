package org.apache.jsp.WEB_002dINF.snippet.view.dataPoint;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.vo.DataPointVO;
import com.serotonin.m2m2.DataTypes;
import com.serotonin.m2m2.vo.DataPointVO;
import com.serotonin.m2m2.DataTypes;
import com.serotonin.m2m2.vo.event.PointEventDetectorVO;

public final class dataPointSettings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(12);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/snippet/view/dataPoint/pointProperties.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/snippet/view/dataPoint/loggingProperties.jsp");
    _jspx_dependants.add("/WEB-INF/snippet/view/dataPoint/valuePurge.jsp");
    _jspx_dependants.add("/WEB-INF/snippet/view/dataPoint/textRenderer.jsp");
    _jspx_dependants.add("/WEB-INF/snippet/view/dataPoint/chartRenderer.jsp");
    _jspx_dependants.add("/WEB-INF/snippet/view/dataPoint/eventDetectors.jsp");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onchange_name_id;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_onchange_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_sst_select_name_id.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_sst_select_value_onchange_name_id.release();
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
      out.write("\n\n\n\n");
      out.write('\n');
      out.write('\n');
      out.write("\n\n\n<script type=\"text/javascript\">\n\n   /**\n    * Set the input values on the page using this vo\n    */\n   function setPointProperties(vo) {\n       \n      var useIntegralUnit = dijit.byId('useIntegralUnit');\n      var integralUnit = dojo.byId('integralUnit');\n      useIntegralUnit.watch('checked',function(value) {\n         if(useIntegralUnit.checked){\n             show(\"integralUnitSection\");\n         }else{\n            hide(\"integralUnitSection\"); \n         }\n      });\n      \n      \n      var useRenderedUnit = dijit.byId('useRenderedUnit');\n      var renderedUnit = dojo.byId('renderedUnit');\n      useRenderedUnit.watch('checked',function(value) {\n          if(useRenderedUnit.checked){\n              show(\"renderedUnitSection\");\n          }else{\n              hide(\"renderedUnitSection\");\n          }\n      });\n      \n          \n       //Set all necessary values\n       dojo.byId(\"unit\").value = vo.unitString;\n       dojo.byId(\"renderedUnit\").value = vo.renderedUnitString;\n       dojo.byId(\"integralUnit\").value = vo.integralUnitString;\n");
      out.write("       \n       //Not sure why the watch isn't working\n       useRenderedUnit.set('checked',vo.useRenderedUnit);\n       if(vo.useRenderedUnit)\n           show(\"renderedUnitSection\");\n       else\n           hide(\"renderedUnitSection\");\n       \n       useIntegralUnit.set('checked',vo.useIntegralUnit);\n       if(vo.useIntegralUnit)\n           show(\"integralUnitSection\");\n       else \n           hide(\"integralUnitSection\");\n\n       dojo.byId(\"chartColour\").value = vo.chartColour;\n       dojo.byId(\"plotType\").value = vo.plotType;\n       \n      if (vo.pointLocator.dataTypeId == ");
      out.print( DataTypes.NUMERIC );
      out.write("){\n          show(\"unitSection\");\n      }else {\n          $(\"plotType\").disabled = true;\n          $set(\"plotType\", ");
      out.print( DataPointVO.PlotTypes.STEP );
      out.write(");\n      }\n      \n   }\n   \n   /*\n    * Get the values and put into the vo\n    */\n   function getPointProperties(vo){\n       \n       vo.unitString = dojo.byId(\"unit\").value;\n       vo.renderedUnitString = dojo.byId(\"renderedUnit\").value;\n       vo.integralUnitString = dojo.byId(\"integralUnit\").value;\n       vo.useRenderedUnit = dijit.byId(\"useRenderedUnit\").get('checked');\n       vo.useIntegralUnit = dijit.byId(\"useIntegralUnit\").get('checked');\n\n       vo.chartColour = dojo.byId(\"chartColour\").value;\n       vo.plotType =  dojo.byId(\"plotType\").value;\n       \n       //For now \n       \n   }\n   \n   /**\n    * Helper method to validate units on demand\n    */\n   function validateUnit(unitString,messageDivId){\n\t   DataPointDwr.validateUnit(unitString,function(response){\n\t\t   if(!response.data.validUnit){\n\t\t\t   var div = $(messageDivId);\n\t\t\t   div.style.color = \"red\";\n\t\t\t   div.innerHTML = response.data.message;\n\t\t   }else{\n\t\t\t   var div = $(messageDivId);\n\t\t\t   div.style.color = \"green\";\n\t\t\t   div.innerHTML = response.data.message;\n");
      out.write("\t\t   }\n\t   });\n   }\n</script>\n\n<div >\n  <table>\n    <tr>\n      <td colspan=\"3\">\n        <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n        ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n      </td>\n    </tr>\n    \n    <tbody id=\"unitSection\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input type=\"text\" name=\"unit\" id=\"unit\" \n                onkeyup=\"validateUnit(value,'unitMessage');\" \n                oninput=\"validateUnit(value,'unitMessage');\"\n                onpaste=\"validateUnit(value,'unitMessage');\"/><div id=\"unitMessage\"></div></td>\n        </tr>\n       <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input data-dojo-type=\"dijit/form/CheckBox\" id=\"useRenderedUnit\" name=\"useRenderedUnit\" />\n        </td>\n      </tr>\n      <tr id=\"renderedUnitSection\">\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input type=\"text\" name=\"renderedUnit\" id=\"renderedUnit\" \n                onkeyup=\"validateUnit(value,'renderedUnitMessage');\" \n                oninput=\"validateUnit(value,'renderedUnitMessage');\"\n                onpaste=\"validateUnit(value,'renderedUnitMessage');\"/><div id=\"renderedUnitMessage\"></div></td>\n        </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input data-dojo-type=\"dijit/form/CheckBox\" id=\"useIntegralUnit\" name=\"useIntegralUnit\" />\n        </td>\n      </tr>\n      <tr id=\"integralUnitSection\">\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input type=\"text\" name=\"integralUnit\" id=\"integralUnit\" \n                onkeyup=\"validateUnit(value,'integralUnitMessage');\" \n                oninput=\"validateUnit(value,'integralUnitMessage');\"\n                onpaste=\"validateUnit(value,'integralUnitMessage');\"/><div id=\"integralUnitMessage\"></div></td>\n       </tr>\n        \n    </tbody>\n    \n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input type=\"text\" name=\"chartColour\" id=\"chartColour\"/></td>\n      </tr>\n\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      //  sst:select
      com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_name_id.get(com.serotonin.web.taglib.SelectTag.class);
      _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
      _jspx_th_sst_select_0.setParent(null);
      _jspx_th_sst_select_0.setName("plotType");
      _jspx_th_sst_select_0.setId("plotType");
      int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
      if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_0.setValue( Integer.toString(DataPointVO.PlotTypes.STEP) );
          int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
          if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_0.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_1.setValue( Integer.toString(DataPointVO.PlotTypes.LINE) );
          int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
          if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_1.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_1, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_2.setValue( Integer.toString(DataPointVO.PlotTypes.SPLINE) );
          int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
          if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_2.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_2, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
          out.write("\n          ");
          int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_sst_select_name_id.reuse(_jspx_th_sst_select_0);
        return;
      }
      _jspx_tagPool_sst_select_name_id.reuse(_jspx_th_sst_select_0);
      out.write("\n        </td>\n      </tr>\n  </table>\n</div>");
      out.write('\n');
      out.write('\n');
      out.write("\n\n\n\n<script type=\"text/javascript\">\n\n\n\t/**\n\t * Set the input values on the page using this vo\n\t */\n\t function setLoggingProperties(vo){\n\t\t\n\t\tdojo.byId(\"loggingType\").value = vo.loggingType;\n\t\tdojo.byId(\"intervalLoggingPeriod\").value = vo.intervalLoggingPeriod;\n        dojo.byId(\"intervalLoggingPeriodType\").value = vo.intervalLoggingPeriodType;\n        dojo.byId(\"intervalLoggingType\").value = vo.intervalLoggingType;\n        dojo.byId(\"tolerance\").value = vo.tolerance;\n        dijit.byId(\"discardExtremeValues\").set('checked',vo.discardExtremeValues);\n        dojo.byId(\"discardHighLimit\").value = vo.discardHighLimit;\n        dojo.byId(\"discardLowLimit\").value = vo.discardLowLimit;\n        dijit.byId(\"purgeOverride\").set('checked',vo.purgeOverride);\n        dojo.byId(\"purgeType\").value = vo.purgeType;\n        dojo.byId(\"purgePeriod\").value = vo.purgePeriod;\n        dojo.byId(\"defaultCacheSize\").value = vo.defaultCacheSize;\n\t\t\n\t\t if (vo.pointLocator.dataTypeId == ");
      out.print( DataTypes.NUMERIC );
      out.write("){\n\t\t\t show(\"toleranceSection\");\n\t\t     show(\"discardSection\");\n\t\t }else {\n\t        $(\"intervalLoggingType\").disabled = true;\n\t        $set(\"intervalLoggingType\", ");
      out.print( DataPointVO.IntervalLoggingTypes.INSTANT );
      out.write(");\n\t\t }\n\t\t    changeLoggingType();\n\t\t    changeDiscard();\n\t }\n\n\t\n\t/*\n\t * Get the values and put into the vo\n\t */\n\tfunction getLoggingProperties(vo){\n\t\t\n\t\tvo.loggingType = dojo.byId(\"loggingType\").value; \n        vo.intervalLoggingPeriod = dojo.byId(\"intervalLoggingPeriod\").value;         \n        vo.intervalLoggingPeriodType = dojo.byId(\"intervalLoggingPeriodType\").value;\n        vo.intervalLoggingType = dojo.byId(\"intervalLoggingType\").value;\n        vo.tolerance = dojo.byId(\"tolerance\").value;\n        vo.discardExtremeValues = dojo.byId(\"discardExtremeValues\").checked;\n        vo.discardHighLimit = dojo.byId(\"discardHighLimit\").value;\n        vo.discardLowLimit = dojo.byId(\"discardLowLimit\").value;\n        vo.purgeOverride = dojo.byId(\"purgeOverride\").checked;\n        vo.purgeType = dojo.byId(\"purgeType\").value;\n        vo.purgePeriod = dojo.byId(\"purgePeriod\").value;\n        vo.defaultCacheSize = dojo.byId(\"defaultCacheSize\").value;\n        \n        //Store the logging properties for later save by module\n        DataPointDwr.storeEditLoggingProperties(\n");
      out.write("        \t\tvo.loggingType,\n                vo.intervalLoggingPeriod,        \n                vo.intervalLoggingPeriodType,\n                vo.intervalLoggingType,\n                vo.tolerance,\n                vo.discardExtremeValues,\n                vo.discardHighLimit,\n                vo.discardLowLimit,\n                vo.purgeOverride,\n                vo.purgeType,\n                vo.purgePeriod,\n                vo.defaultCacheSize);\n        \n        \n\t}\n\n  function changeLoggingType() {\n      var loggingType = $get(\"loggingType\");\n      var tolerance = $(\"tolerance\");\n      var purgeOverride = $(\"purgeOverride\");\n      var purgePeriod = $(\"purgePeriod\");\n      var purgeType = $(\"purgeType\");\n      \n      if ($(\"toleranceSection\") && loggingType == ");
      out.print( DataPointVO.LoggingTypes.ON_CHANGE );
      out.write(")\n          // On change logging for a numeric requires a tolerance setting.\n          tolerance.disabled = false;\n      else\n          tolerance.disabled = true;\n      \n      if (loggingType == ");
      out.print( DataPointVO.LoggingTypes.NONE );
      out.write(") {\n          purgeOverride.disabled = true;\n          purgePeriod.disabled = true;\n          purgeType.disabled = true;\n      }\n      else {\n          purgeOverride.disabled = false;\n          changePurgeOverride();\n      }\n      \n      if (loggingType == ");
      out.print( DataPointVO.LoggingTypes.INTERVAL );
      out.write(")\n          show(\"intervalLoggingSection\");\n      else\n          hide(\"intervalLoggingSection\");\n  }\n  \n  function changePurgeOverride() {\n      var purgePeriod = $(\"purgePeriod\");\n      var purgeType = $(\"purgeType\");\n      if ($get(\"purgeOverride\")) {\n          purgePeriod.disabled = false;\n          purgeType.disabled = false;\n      }\n      else {\n          purgePeriod.disabled = true;\n          purgeType.disabled = true;\n      }\n  }\n  \n  function changeDiscard() {\n      var discard = $get(\"discardExtremeValues\");\n      if (discard) {\n          $(\"discardLowLimit\").disabled = false;\n          $(\"discardHighLimit\").disabled = false;\n      }\n      else {\n          $(\"discardLowLimit\").disabled = true;\n          $(\"discardHighLimit\").disabled = true;\n      }\n  }\n  \n  function clearPointCache() {\n      setDisabled(\"clearCacheBtn\", true);\n      DataPointEditDwr.clearPointCache(function() {\n          setDisabled(\"clearCacheBtn\", false);\n      });\n  }\n  \n\n</script>\n\n<div >\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_1(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      //  sst:select
      com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_1 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_name_id.get(com.serotonin.web.taglib.SelectTag.class);
      _jspx_th_sst_select_1.setPageContext(_jspx_page_context);
      _jspx_th_sst_select_1.setParent(null);
      _jspx_th_sst_select_1.setId("loggingType");
      _jspx_th_sst_select_1.setName("loggingType");
      _jspx_th_sst_select_1.setOnchange("changeLoggingType();");
      _jspx_th_sst_select_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      int _jspx_eval_sst_select_1 = _jspx_th_sst_select_1.doStartTag();
      if (_jspx_eval_sst_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
          _jspx_th_sst_option_3.setValue( Integer.toString(DataPointVO.LoggingTypes.ON_CHANGE) );
          int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
          if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_3.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_3, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
          _jspx_th_sst_option_4.setValue( Integer.toString(DataPointVO.LoggingTypes.ALL) );
          int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
          if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_4.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_4, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
          _jspx_th_sst_option_5.setValue( Integer.toString(DataPointVO.LoggingTypes.NONE) );
          int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
          if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_5.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_5, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
          _jspx_th_sst_option_6.setValue( Integer.toString(DataPointVO.LoggingTypes.INTERVAL) );
          int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
          if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_6.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_6, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
          out.write("\n            ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_7 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_7.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
          _jspx_th_sst_option_7.setValue( Integer.toString(DataPointVO.LoggingTypes.ON_TS_CHANGE) );
          int _jspx_eval_sst_option_7 = _jspx_th_sst_option_7.doStartTag();
          if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_7.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_7, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_7.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_7);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_7);
          out.write("\n          ");
          int evalDoAfterBody = _jspx_th_sst_select_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_1);
        return;
      }
      _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_1);
      out.write("\n        </td>\n      </tr>\n    \n    <tbody id=\"intervalLoggingSection\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write(" <input id=\"intervalLoggingPeriod\" type=\"text\" name=\"intervalLoggingPeriod\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      \n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            ");
      //  sst:select
      com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_2 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_name_id.get(com.serotonin.web.taglib.SelectTag.class);
      _jspx_th_sst_select_2.setPageContext(_jspx_page_context);
      _jspx_th_sst_select_2.setParent(null);
      _jspx_th_sst_select_2.setId("intervalLoggingType");
      _jspx_th_sst_select_2.setName("intervalLoggingType");
      int _jspx_eval_sst_select_2 = _jspx_th_sst_select_2.doStartTag();
      if (_jspx_eval_sst_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n              ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_8 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_8.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
          _jspx_th_sst_option_8.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.INSTANT) );
          int _jspx_eval_sst_option_8 = _jspx_th_sst_option_8.doStartTag();
          if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_8.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_8, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_8.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_8);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_8);
          out.write("\n              ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_9 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_9.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
          _jspx_th_sst_option_9.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.MAXIMUM) );
          int _jspx_eval_sst_option_9 = _jspx_th_sst_option_9.doStartTag();
          if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_9.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_9, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_9.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_9);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_9);
          out.write("\n              ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_10 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_10.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
          _jspx_th_sst_option_10.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.MINIMUM) );
          int _jspx_eval_sst_option_10 = _jspx_th_sst_option_10.doStartTag();
          if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_10.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_10, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_10.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_10);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_10);
          out.write("\n              ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_11 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_11.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
          _jspx_th_sst_option_11.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.AVERAGE) );
          int _jspx_eval_sst_option_11 = _jspx_th_sst_option_11.doStartTag();
          if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_11.doInitBody();
            }
            do {
              if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_11, _jspx_page_context))
                return;
              int evalDoAfterBody = _jspx_th_sst_option_11.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_11);
            return;
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_11);
          out.write("\n            ");
          int evalDoAfterBody = _jspx_th_sst_select_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_sst_select_name_id.reuse(_jspx_th_sst_select_2);
        return;
      }
      _jspx_tagPool_sst_select_name_id.reuse(_jspx_th_sst_select_2);
      out.write("\n          </td>\n        </tr>\n    </tbody>\n    \n    <tbody id=\"toleranceSection\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_25(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <input id=\"tolerance\" type=\"text\" name=\"tolerance\" class=\"formShort\"/>\n          </td>\n        </tr>\n    </tbody>\n      \n    <tbody id=\"discardSection\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_26(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <input data-dojo-type=\"dijit/form/CheckBox\" id=\"discardExtremeValues\" name=\"discardExtremeValues\" onclick=\"changeDiscard()\"/>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_27(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <input id=\"discardLowLimit\" type=\"text\" name=\"discardLowLimit\" class=\"formShort\"/>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_28(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <input id=\"discardHighLimit\" type=\"text\" name=\"discardHighLimit\" class=\"formShort\"/>\n          </td>\n        </tr>\n    </tbody>\n      \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_29(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <div>\n          <input data-dojo-type=\"dijit/form/CheckBox\" id=\"purgeOverride\" name=\"purgeOverride\"\n                  onclick=\"changePurgeOverride()\"/>\n          <label for=\"purgeOverride\">");
      if (_jspx_meth_fmt_message_30(_jspx_page_context))
        return;
      out.write("</label>\n        </div>\n        <div>\n          ");
      if (_jspx_meth_fmt_message_31(_jspx_page_context))
        return;
      out.write(" <input id=\"purgePeriod\" type=\"text\" name=\"purgePeriod\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_1(_jspx_page_context))
        return;
      out.write("\n        </div>\n      </td>\n    </tr>\n      \n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_32(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"defaultCacheSize\" type=\"text\" name=\"defaultCacheSize\" class=\"formShort\"/>\n          <input id=\"clearCacheBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_33(_jspx_page_context))
        return;
      out.write("\" onclick=\"clearPointCache();\"/>\n        </td>\n      </tr>\n  </table>\n</div>");
      out.write('\n');
      out.write('\n');
      out.write("\n\n<script type=\"text/javascript\">\n\n  function purgeNowAllChanged() {\n      var all = $get(\"purgeNowAll\");\n      setDisabled(\"purgeNowPeriod\", all);\n      setDisabled(\"purgeNowType\", all);\n  }\n  \n  function purgeNow() {\n      var all = $get(\"purgeNowAll\");\n      if (all && !confirm(\"");
      if (_jspx_meth_fmt_message_34(_jspx_page_context))
        return;
      out.write("\"))\n          return;\n  \n      setDisabled(\"purgeNowBtn\", true);\n      show(\"purgeNowWarn\");\n      startImageFader(\"purgeNowImg\");\n      DataPointEditDwr.purgeNow($get(\"purgeNowType\"), $get(\"purgeNowPeriod\"), all, purgeNowCB);\n  }\n  \n  function purgeNowCB(result) {\n      setDisabled(\"purgeNowBtn\", false);\n      stopImageFader(\"purgeNowImg\");\n      hide(\"purgeNowWarn\");\n      alert(\"\"+ result +\" ");
      if (_jspx_meth_fmt_message_35(_jspx_page_context))
        return;
      out.write("\");\n  }\n</script>\n\n<div>\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_36(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_2(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_37(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"purgeNowPeriod\" type=\"text\" value=\"1\" class=\"formShort\"/>\n        ");
      if (_jspx_meth_tag_timePeriods_2(_jspx_page_context))
        return;
      out.write("\n      </td>\n    </tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_38(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input data-dojo-type=\"dijit/form/CheckBox\" id=\"purgeNowAll\" onclick=\"purgeNowAllChanged()\">\n        <label for=\"purgeNowAll\">");
      if (_jspx_meth_fmt_message_39(_jspx_page_context))
        return;
      out.write("</label>\n      </td>\n    </tr>\n    \n    <tr>\n      <td colspan=\"2\" align=\"center\">\n        <input id=\"purgeNowBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_40(_jspx_page_context))
        return;
      out.write("\" onclick=\"purgeNow();\"/>\n      </td>\n    </tr>\n    \n    <tbody id=\"purgeNowWarn\" style=\"display:none\">\n      <tr>\n        <td colspan=\"2\" align=\"center\" class=\"formError\">\n          <img id=\"purgeNowImg\" src=\"images/warn.png\"/>\n          ");
      if (_jspx_meth_fmt_message_41(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </tbody>\n  </table>\n</div>");
      out.write('\n');
      out.write('\n');
      out.write("\n<div>\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_42(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_3(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_43(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"textRendererSelect\" />\n      </td>\n    </tr>\n    \n    <tbody id=\"suffixRow\">\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_44(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n            <input id=\"useUnitAsSuffix\" data-dojo-type=\"dijit/form/CheckBox\" type=\"checkbox\" />\n            <label for=\"useUnitAsSuffix\">");
      if (_jspx_meth_fmt_message_45(_jspx_page_context))
        return;
      out.write("</label>\n        </td>\n      </tr>\n      <tr>\n        <td></td>\n        <td class=\"formField\"><input id=\"suffix\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"formatRow\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_46(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"format\" type=\"text\"/>\n          <div id=\"datetimeFormatHelpDiv\">");
      if (_jspx_meth_tag_help_4(_jspx_page_context))
        return;
      out.write("</div>\n        </td>\n      </tr>\n     </tbody>\n    <tbody id=\"conversionExponentRow\">\n       <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_47(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"conversionExponent\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    \n      <tbody id=\"binaryValuesRow\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_48(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <table cellspacing=\"0\" cellpadding=\"0\">\n            <tr>\n              <td valign=\"top\"><input id=\"zeroLabel\" type=\"text\"/></td>\n              <td width=\"10\"></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"zeroColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerBinaryZeroColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_49(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n            </tr>\n          </table>\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_50(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <table cellspacing=\"0\" cellpadding=\"0\">\n            <tr>\n              <td valign=\"top\"><input id=\"oneLabel\" type=\"text\"/></td>\n              <td width=\"10\"></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"oneColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerBinaryOneColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_51(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n            </tr>\n          </table>\n        </td>\n      </tr>\n    </tbody>\n    <tbody id=\"multistateValuesRow\" style=\"display:none;\">\n      <tr>\n        <td colspan=\"2\">\n          <table>\n            <tr>\n              <th>");
      if (_jspx_meth_fmt_message_52(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_53(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_54(_jspx_page_context))
        return;
      out.write("</th>\n              <td></td>\n            </tr>\n            <tr>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererMultistateKey\" value=\"\" class=\"formVeryShort\"/></td>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererMultistateText\" value=\"\" class=\"formShort\"/></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererMultistateColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerMultistateColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_55(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n              <td valign=\"top\">\n                ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            <tbody id=\"textRendererMultistateTable\"></tbody>\n          </table>\n        </td>\n      </tr>\n    </tbody>  \n    \n    \n    \n    <!--  I think we can delete this -->\n    <tbody id=\"textRendererAnalog\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_56(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"textRendererAnalogFormat\" type=\"text\"/>\n          ");
      if (_jspx_meth_tag_help_5(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_57(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"textRendererAnalogSuffix\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    \n\n    <tbody id=\"textRendererNone\" style=\"display:none;\">\n    </tbody>\n    <tbody id=\"textRendererPlain\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_58(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"textRendererPlainSuffix\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"rangeValuesRow\" style=\"display:none;\">\n      <tr>\n        <td colspan=\"2\">\n          <table id=\"rangeValues\"> <!-- For contextual field -->\n            <tr>\n              <th>");
      if (_jspx_meth_fmt_message_59(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_60(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_61(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_62(_jspx_page_context))
        return;
      out.write("</th>\n              <td></td>\n            </tr>\n            <tr>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeFrom\" value=\"\" class=\"formVeryShort\"/></td>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeTo\" value=\"\" class=\"formVeryShort\"/></td>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeText\" value=\"\"/></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererRangeColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerRangeColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_63(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n              <td valign=\"top\">\n                ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            <tbody id=\"textRendererRangeTable\"></tbody>\n          </table>\n        </td>\n      </tr>\n    </tbody>\n    <tbody id=\"textRendererTime\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_64(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"textRendererTimeFormat\" type=\"text\"/>\n          ");
      if (_jspx_meth_tag_help_6(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_65(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"textRendererTimeConversionExponent\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n  </table>\n</div>\n\n<script type=\"text/javascript\">\n  dojo.require(\"dijit.ColorPalette\");\n  dojo.require(\"dijit.form.Select\");\n  \n  /**\n   * On Select change re-render view\n   */\n  function textRendererChanged(name,oldValue,value){\n      if (value == \"textRendererAnalog\"){\n    \t  hide(\"datetimeFormatHelpDiv\");\n          show(\"suffixRow\");\n          show(\"formatRow\");\n          hide(\"rangeValuesRow\");\n          hide(\"conversionExponentRow\");\n          hide(\"multistateValuesRow\");\n          hide(\"binaryValuesRow\");\n      }else if (value == \"textRendererBinary\"){\n    \t  hide(\"datetimeFormatHelpDiv\");\n    \t  show(\"binaryValuesRow\");\n    \t  hide(\"suffixRow\");\n          hide(\"formatRow\");\n          hide(\"rangeValuesRow\");\n          hide(\"conversionExponentRow\");\n          hide(\"multistateValuesRow\");\n      }else if (value == \"textRendererMultistate\"){\n    \t  textRendererEditor.refreshMultistateList(); //Refresh the html table\n");
      out.write("    \t  hide(\"datetimeFormatHelpDiv\");\n          hide(\"suffixRow\");\n          hide(\"formatRow\");\n          hide(\"rangeValuesRow\");\n          hide(\"conversionExponentRow\");\n          show(\"multistateValuesRow\");\n          hide(\"binaryValuesRow\");\n      }else if (value == \"textRendererNone\"){\n    \t  hide(\"datetimeFormatHelpDiv\");\n          hide(\"suffixRow\");\n          hide(\"formatRow\");\n          hide(\"rangeValuesRow\");\n          hide(\"conversionExponentRow\");\n          hide(\"multistateValuesRow\");\n          hide(\"binaryValuesRow\");\n      }else if (value == \"textRendererPlain\"){\n    \t  hide(\"datetimeFormatHelpDiv\");\n    \t  show(\"suffixRow\");\n          hide(\"formatRow\");\n          hide(\"rangeValuesRow\");\n          hide(\"conversionExponentRow\");\n          hide(\"multistateValuesRow\");\n          hide(\"binaryValuesRow\");\n      }else if (value == \"textRendererRange\"){\n    \t  textRendererEditor.refreshRangeList(); //Refresh the html table\n    \t  hide(\"datetimeFormatHelpDiv\");\n    \t  show(\"formatRow\");\n    \t  hide(\"suffixRow\");\n");
      out.write("    \t  show(\"rangeValuesRow\");\n          hide(\"conversionExponentRow\");\n          hide(\"multistateValuesRow\");\n          hide(\"binaryValuesRow\");\n      }else if (value == \"textRendererTime\"){\n    \t  show(\"datetimeFormatHelpDiv\");\n          hide(\"suffixRow\");\n          show(\"formatRow\");\n          hide(\"rangeValuesRow\");\n          show(\"conversionExponentRow\");\n          hide(\"multistateValuesRow\");\n          hide(\"binaryValuesRow\");\n      }else{\n          alert(\"Unknown text renderer: \" + vo.textRenderer.typeName);\n      }\n  }\n  \n  /*\n   * Set the page values from the current data point VO\n   */\n  function setTextRenderer(vo){\n      \n      //Clear and Setup the Chart Renderer Options\n      DataPointDwr.getTextRendererOptions(vo.pointLocator.dataTypeId,function (response){\n          var options = [];\n          for(var i=0; i<response.data.options.length; i++){\n              options.push({\n                  label: mangoMsg[response.data.options[i].nameKey],\n                  value: response.data.options[i].name,\n");
      out.write("              })\n          }\n          textRendererEditor.textRendererSelect.options = [];\n          textRendererEditor.textRendererSelect.addOption(options);\n          textRendererEditor.multistateValues = new Array(); //clear out\n          textRendererEditor.rangeValues = new Array(); //clear out\n          if(vo.textRenderer != null){\n        \t  textRendererEditor.textRendererSelect.set('value',vo.textRenderer.typeName);\n        \t  \n              if (vo.textRenderer.typeName == \"textRendererAnalog\"){\n            \t  dojo.byId(\"format\").value = vo.textRenderer.format;\n                  dojo.byId(\"suffix\").value = vo.textRenderer.suffix;\n                  dijit.byId(\"useUnitAsSuffix\").set('checked',vo.textRenderer.useUnitAsSuffix);\n              }else if (vo.textRenderer.typeName == \"textRendererBinary\"){\n            \t  dojo.byId(\"zeroLabel\").value = vo.textRenderer.zeroLabel;\n            \t  textRendererEditor.handlerBinaryZeroColour( vo.textRenderer.zeroColour);\n            \t  dojo.byId(\"oneLabel\").value = vo.textRenderer.oneLabel;\n");
      out.write("            \t  textRendererEditor.handlerBinaryOneColour(vo.textRenderer.oneColour);\n              }else if (vo.textRenderer.typeName == \"textRendererMultistate\"){\n            \t  textRendererEditor.setMultistateValues(vo.textRenderer.multistateValues);\n              }else if (vo.textRenderer.typeName == \"textRendererNone\"){\n            \t  //Nothing\n              }else if (vo.textRenderer.typeName == \"textRendererPlain\"){\n            \t  dojo.byId(\"suffix\").value = vo.textRenderer.suffix;\n            \t  dijit.byId(\"useUnitAsSuffix\").set('checked',vo.textRenderer.useUnitAsSuffix);\n              }else if (vo.textRenderer.typeName == \"textRendererRange\"){\n            \t  dojo.byId(\"format\").value = vo.textRenderer.format;\n            \t  textRendererEditor.setRangeValues(vo.textRenderer.rangeValues);\n              }else if (vo.textRenderer.typeName == \"textRendererTime\"){\n            \t  dojo.byId(\"format\").value = vo.textRenderer.format;\n            \t  dojo.byId(\"conversionExponent\").value = vo.textRenderer.conversionExponent;\n");
      out.write("              }else{\n                  alert(\"Unknown text renderer: \" + vo.textRenderer.typeName);\n              }\n          }//Not null\n      });\n  }\n\n  /*\n   * Get the values from the page and put into current data point VO\n   */\n  function getTextRenderer(vo){\n\n\t   var typeName = textRendererEditor.textRendererSelect.get('value');\n\t   \n       if (typeName == \"textRendererAnalog\"){\n     \t  vo.textRenderer = new AnalogRenderer();\n           vo.textRenderer.format = dojo.byId(\"format\").value;\n           vo.textRenderer.suffix = dojo.byId(\"suffix\").value;\n           vo.textRenderer.useUnitAsSuffix = dojo.byId(\"useUnitAsSuffix\").checked;\n       }else if (typeName == \"textRendererBinary\"){\n     \t  vo.textRenderer = new BinaryTextRenderer();\n           vo.textRenderer.zeroLabel = dojo.byId(\"zeroLabel\").value;\n           vo.textRenderer.zeroColour = dijit.byId(\"zeroColour\").selectedColour;\n           vo.textRenderer.oneLabel = dojo.byId(\"oneLabel\").value;\n           vo.textRenderer.oneColour = dijit.byId(\"oneColour\").selectedColour;\n");
      out.write("       }else if (typeName == \"textRendererMultistate\"){\n     \t  vo.textRenderer = new MultistateRenderer();\n     \t  vo.textRenderer.multistateValues = textRendererEditor.multistateValues;\n       }else if (typeName == \"textRendererNone\"){\n           vo.textRenderer = new NoneRenderer();\n       }else if (typeName == \"textRendererPlain\"){\n     \t  vo.textRenderer = new PlainRenderer();\n           vo.textRenderer.suffix = dojo.byId(\"suffix\").value;\n           vo.textRenderer.useUnitAsSuffix = dojo.byId(\"useUnitAsSuffix\").checked;\n       }else if (typeName == \"textRendererRange\"){\n     \t  vo.textRenderer = new RangeRenderer();\n           vo.textRenderer.format = dojo.byId(\"format\").value;\n           vo.textRenderer.rangeValues = textRendererEditor.rangeValues;\n       }else if (typeName == \"textRendererTime\"){\n     \t  vo.textRenderer = new TimeRenderer();\n           vo.textRenderer.format = dojo.byId(\"format\").value;\n           vo.textRenderer.conversionExponent = dojo.byId(\"conversionExponent\").value;\n       }else{\n");
      out.write("           alert(\"Unknown text renderer: \" + vo.textRenderer.typeName);\n       }\n  }\n  \n  /**\n   * Main Editing Logic\n   */\n  function TextRendererEditor() {\n\t  this.textRendererSelect;\n      var currentTextRenderer;\n      \n      this.multistateValues = new Array();\n      this.rangeValues = new Array();\n      \n      \n      this.init = function() {\n          // Colour handler events\n          dijit.byId(\"textRendererRangeColour\").onChange = this.handlerRangeColour;\n          dijit.byId(\"textRendererMultistateColour\").onChange = this.handlerMultistateColour;\n          dijit.byId(\"zeroColour\").onChange = this.handlerBinaryZeroColour;\n          dijit.byId(\"oneColour\").onChange = this.handlerBinaryOneColour;\n          \n          this.textRendererSelect = new dijit.form.Select({\n              name: 'textRendererSelect',\n          },\"textRendererSelect\");\n          \n          this.textRendererSelect.watch(\"value\",textRendererChanged);\n          \n          var useUnitAsSuffix = dijit.byId(\"useUnitAsSuffix\");\n          var suffix = dojo.byId(\"suffix\");\n");
      out.write("          useUnitAsSuffix.watch('checked',function(value){\n        \t  if(useUnitAsSuffix.checked)\n        \t\t  hide(\"suffix\");\n        \t  else\n        \t\t  show(\"suffix\");\n          });\n          \n          \n      }\n  \n      this.change = function() {\n          if (currentTextRenderer)\n              hide($(currentTextRenderer));\n          currentTextRenderer = $(\"textRendererSelect\").value\n          show($(currentTextRenderer));\n      };\n      \n      //\n      // List objects\n      this.MultistateValue = function() {\n          this.key;\n          this.text;\n          this.colour;\n      };\n      \n      this.RangeValue = function() {\n          this.from;\n          this.to;\n          this.text;\n          this.colour;\n      };\n      \n      \n      /*\n       * Create a new set of values from an existing vo's list\n       */\n      this.setMultistateValues = function(list){\n    \t  //Clear the list\n    \t  this.multistateValues = new Array();\n    \t  this.refreshMultistateList();\n    \t  for(var i=0; i<list.length; i++){\n    \t\t  this.addMultistateValue(list[i].key,list[i].text,list[i].colour);\n");
      out.write("    \t  }\n      }\n      \n      //\n      // Multistate list manipulation\n      this.addMultistateValue = function(theKey, text, colour) {\n          if (!theKey)\n              theKey = $get(\"textRendererMultistateKey\");\n          var theNumericKey = parseInt(theKey);\n          if (isNaN(theNumericKey)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_66(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          for (var i=this.multistateValues.length-1; i>=0; i--) {\n              if (this.multistateValues[i].key == theNumericKey) {\n                  alert(\"");
      if (_jspx_meth_fmt_message_67(_jspx_page_context))
        return;
      out.write(" \"+ theNumericKey);\n                  return false;\n              }\n          }\n          \n          var theValue = new this.MultistateValue();\n          theValue.key = theNumericKey;\n          if (text)\n              theValue.text = text;\n          else\n              theValue.text = $get(\"textRendererMultistateText\");\n          if (colour)\n              theValue.colour = colour;\n          else\n              theValue.colour = dijit.byId(\"textRendererMultistateColour\").selectedColour;\n          this.multistateValues[this.multistateValues.length] = theValue;\n          this.sortMultistateValues();\n          this.refreshMultistateList();\n          $set(\"textRendererMultistateKey\", theNumericKey+1);\n          \n          return false;\n      };\n      \n      this.removeMultistateValue = function(theValue) {\n          for (var i=this.multistateValues.length-1; i>=0; i--) {\n              if (this.multistateValues[i].key == theValue)\n                  this.multistateValues.splice(i, 1);\n          }\n          this.refreshMultistateList();\n");
      out.write("          return false;\n      };\n      \n      this.sortMultistateValues = function() {\n          this.multistateValues.sort( function(a,b) { return a.key-b.key; } );\n      };\n      \n      this.refreshMultistateList = function() {\n          dwr.util.removeAllRows(\"textRendererMultistateTable\");\n          dwr.util.addRows(\"textRendererMultistateTable\", this.multistateValues, [\n                  function(data) { return data.key; },\n                  function(data) { \n                      if (data.colour)\n                          return \"<span style='color:\"+ data.colour +\"'>\"+ data.text +\"</span>\";\n                      return data.text;\n                  },\n                  function(data) {\n                      return \"<a href='#' onclick='return textRendererEditor.removeMultistateValue(\"+ data.key +\n                             \");'><img src='images/bullet_delete.png' width='16' height='16' \"+\n                             \"title='");
      if (_jspx_meth_fmt_message_68(_jspx_page_context))
        return;
      out.write("'/><\\/a>\";\n                  }\n                  ], null);\n      };\n      \n      /*\n       * Set the range values from the vo's list\n       */\n      this.setRangeValues = function(list){\n          //Clear the list\n          this.rangeValues = new Array();\n          this.refreshRangeList();\n          for(var i=0; i<list.length; i++){\n              this.addRangeValue(list[i].from,list[i].to,list[i].text,list[i].colour);\n          }\n\n      }\n      \n      \n      //\n      // Range list manipulation\n      this.addRangeValue = function(theFrom, theTo, text, colour) {\n          if (typeof theFrom === 'undefined')\n              theFrom = parseFloat($get(\"textRendererRangeFrom\"));\n          if (isNaN(theFrom)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_69(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          \n          if (typeof theTo === 'undefined')\n              theTo = parseFloat($get(\"textRendererRangeTo\"));\n          if (isNaN(theTo)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_70(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          \n          if (isNaN(theTo >= theFrom)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_71(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          \n          for (var i=0; i<this.rangeValues.length; i++) {\n              if (this.rangeValues[i].from == theFrom && this.rangeValues[i].to == theTo) {\n                  alert(\"");
      if (_jspx_meth_fmt_message_72(_jspx_page_context))
        return;
      out.write(" \"+ theFrom +\" - \"+ theTo);\n                  return false;\n              }\n          }\n          \n          var theValue = new this.RangeValue();\n          theValue.from = theFrom;\n          theValue.to = theTo;\n          if (text)\n              theValue.text = text;\n          else\n              theValue.text = $get(\"textRendererRangeText\");\n          if (colour)\n              theValue.colour = colour;\n          else\n              theValue.colour = dijit.byId(\"textRendererRangeColour\").selectedColour;\n          this.rangeValues[this.rangeValues.length] = theValue;\n          this.sortRangeValues();\n          this.refreshRangeList();\n          $set(\"textRendererRangeFrom\", theTo);\n          $set(\"textRendererRangeTo\", theTo + (theTo - theFrom));\n          return false;\n      };\n      \n      this.removeRangeValue = function(theFrom, theTo) {\n          for (var i=this.rangeValues.length-1; i>=0; i--) {\n              if (this.rangeValues[i].from == theFrom && this.rangeValues[i].to == theTo)\n                  this.rangeValues.splice(i, 1);\n");
      out.write("          }\n          this.refreshRangeList();\n          return false;\n      };\n      \n      this.sortRangeValues = function() {\n          this.rangeValues.sort( function(a,b) {\n              if (a.from == b.from)\n                  return a.to-b.to;\n              return a.from-b.from;\n          });\n      };\n      \n      this.refreshRangeList = function() {\n          dwr.util.removeAllRows(\"textRendererRangeTable\");\n          dwr.util.addRows(\"textRendererRangeTable\", this.rangeValues, [\n                  function(data) { return data.from; },\n                  function(data) { return data.to; },\n                  function(data) { \n                      if (data.colour)\n                          return \"<span style='color:\"+ data.colour +\"'>\"+ data.text +\"</span>\";\n                      return data.text;\n                  },\n                  function(data) {\n                      return \"<a href='#' onclick='return textRendererEditor.removeRangeValue(\"+\n                             data.from +\",\"+ data.to +\");'><img src='images/bullet_delete.png' width='16' \"+\n");
      out.write("                             \"height='16' title='");
      if (_jspx_meth_fmt_message_73(_jspx_page_context))
        return;
      out.write("'/><\\/a>\";\n                  }\n                  ], null);\n      };\n      \n      //\n      // Color handling\n      this.handlerRangeColour = function(colour) {\n          dijit.byId(\"textRendererRangeColour\").selectedColour = colour;\n          $(\"textRendererRangeText\").style.color = colour;\n      };\n      this.handlerMultistateColour = function(colour) {\n          dijit.byId(\"textRendererMultistateColour\").selectedColour = colour;\n          $(\"textRendererMultistateText\").style.color = colour;\n      };\n      this.handlerBinaryZeroColour = function(colour) {\n          dijit.byId(\"zeroColour\").selectedColour = colour;\n          $(\"zeroLabel\").style.color = colour;\n      };\n      this.handlerBinaryOneColour = function(colour) {\n          dijit.byId(\"oneColour\").selectedColour = colour;\n          $(\"oneLabel\").style.color = colour;\n      };\n  }\n  var textRendererEditor = new TextRendererEditor();\n  \n  \n  \n</script>");
      out.write('\n');
      out.write('\n');
      out.write("\n\n<div >\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_74(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_7(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_75(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"chartRendererSelect\"></input>\n      </td>\n    </tr>\n    <tbody id=\"timePeriodRow\" style=\"display:none\">\n       <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_76(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"numberOfPeriods\" type=\"text\" class=\"formVeryShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_3(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </tbody>  \n    <tbody id=\"limitRow\" style=\"display:none\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_77(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"includeSumRow\" style=\"display:none\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_78(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"includeSum\" data-dojo-type=\"dijit/form/CheckBox\"/></td>\n      </tr>\n    </tbody>\n    \n    \n    \n    <tr>\n      <td colspan=\"2\">");
      if (_jspx_meth_fmt_message_79(_jspx_page_context))
        return;
      out.write("</td>\n    </tr>\n  </table>\n</div>\n\n<script type=\"text/javascript\">\n\ndojo.require(\"dijit.form.Select\");\ndojo.require(\"dijit.form.CheckBox\");\n\nvar chartRendererSelect = new dijit.form.Select({\n    name: 'chartRendererSelect',\n},\"chartRendererSelect\");\n\n  /*\n   * Set the page values from the current data point VO\n   */\n  function setChartRenderer(vo){\n\t  \n      //Clear and Setup the Chart Renderer Options\n      DataPointDwr.getChartRendererOptions(vo.pointLocator.dataTypeId,function (response){\n    \t  var options = [];\n    \t  for(var i=0; i<response.data.options.length; i++){\n    \t\t  options.push({\n    \t\t\t  label: mangoMsg[response.data.options[i].nameKey],\n    \t\t\t  value: response.data.options[i].name,\n    \t\t  })\n    \t  }\n    \t  chartRendererSelect.options = [];\n          chartRendererSelect.addOption(options);\n          \n          \n          if(vo.chartRenderer != null){\n              chartRendererSelect.set('value',vo.chartRenderer.typeName);\n\n              if(vo.chartRenderer.typeName == \"chartRendererTable\"){\n");
      out.write("                  $set(\"limit\", vo.chartRenderer.limit);\n              }else if(vo.chartRenderer.typeName === \"chartRendererImage\"){\n                  $set(\"numberOfPeriods\", vo.chartRenderer.numberOfPeriods);\n                  $set(\"timePeriod\", vo.chartRenderer.timePeriod);\n              }else if(vo.chartRenderer.typeName == \"chartRendererStats\"){\n                  $set(\"numberOfPeriods\", vo.chartRenderer.numberOfPeriods);\n                  $set(\"timePeriod\", vo.chartRenderer.timePeriod);\n                  dijit.byId(\"includeSum\").set(\"checked\", vo.chartRenderer.includeSum);\n              }else if(vo.chartRenderer.typeName == \"chartRendererImageFlipbook\"){\n                  $set(\"limit\", vo.chartRenderer.limit);\n              }else{\n                  dojo.debug(\"Unknown chart renderer: \" + vo.chartRenderer.typeName);\n              }\n          }//Not null\n      });\n\t  \n\n  }\n\n  \n  /*\n   * Get the values from the page and put into current data point VO\n   */\n  function getChartRenderer(vo){\n      \n      //Save all pertinent pieces\n");
      out.write("      var typeName = chartRendererSelect.get('value');\n      var renderer;\n      if (typeName == \"chartRendererNone\"){\n    \t  renderer = null;\n      }else if (typeName == \"chartRendererTable\") {\n          var limit = parseInt($get(\"limit\"));\n          if(isNaN(limit))\n        \t  limit=-1;\n          renderer = new TableChartRenderer();\n          renderer.limit = limit;\n      }\n      else if (typeName == \"chartRendererImage\") {\n          renderer = new ImageChartRenderer();\n          renderer.timePeriod = $get(\"timePeriod\");\n          renderer.numberOfPeriods = parseInt($get(\"numberOfPeriods\"));\n          if(isNaN(renderer.numberOfPeriods))\n        \t  renderer.numberOfPeriods=-1;\n      }\n      else if (typeName == \"chartRendererStats\") {\n          renderer = new StatisticsChartRenderer();\n          renderer.timePeriod = $get(\"timePeriod\");\n    \t  renderer.numberOfPeriods = parseInt($get(\"numberOfPeriods\"));\n    \t  renderer.includeSum = dijit.byId(\"includeSum\").get('checked');\n          if(isNaN(renderer.numberOfPeriods))\n");
      out.write("              renderer.numberOfPeriods=-1;\n      }\n      else if (typeName == \"chartRendererImageFlipbook\") {\n    \t  renderer = new ImageFlipbookRenderer();\n    \t  renderer.limit = parseInt($get(\"limit\"));\n    \t  if(isNaN(renderer.limit))\n    \t\t  renderer.limit=-1;\n      }\n\n      //Set the renderer\n      vo.chartRenderer = renderer;\n  }\n  \n  function ChartRendererEditor() {\n\n  \n      this.change = function(name,oldValue,value) {\n    \t  \n    \t  if(value != null){\n              if(value == \"chartRendererTable\"){\n            \t  hide(\"timePeriodRow\");\n            \t  show(\"limitRow\");\n            \t  hide(\"includeSumRow\");\n              }else if(value === \"chartRendererImage\"){\n                  show(\"timePeriodRow\");\n                  hide(\"limitRow\");\n                  hide(\"includeSumRow\");\n              }else if(value == \"chartRendererStats\"){\n                  show(\"timePeriodRow\");\n                  hide(\"limitRow\");\n                  show(\"includeSumRow\");\n              }else if(value == \"chartRendererImageFlipbook\"){\n");
      out.write("                  hide(\"timePeriodRow\");\n                  show(\"limitRow\");\n                  hide(\"includeSumRow\");\n              }else if(value == \"chartRendererNone\"){\n                  hide(\"timePeriodRow\");\n                  hide(\"limitRow\");\n                  hide(\"includeSumRow\");            \t  \n              }else{\n                  alert(\"Unknown chart renderer: \" + value);\n              }\n\n    \t  }\n    \t  \n    \t  \n      };\n      \n      chartRendererSelect.watch(\"value\",this.change);\n\n  }\n  var chartRendererEditor = new ChartRendererEditor();\n\n\n</script>");
      out.write('\n');
      out.write('\n');
      out.write("\n\n<div>\n  <table>\n    <tr><td colspan=\"2\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_80(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_8(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_81(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"eventDetectorSelect\"></input>\n        ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n      </td>\n    </tr>\n    \n    <tr><td colspan=\"2\">\n      <div id=\"emptyListMessage\" style=\"color:#888888;padding:10px;text-align:center;\">\n        ");
      if (_jspx_meth_fmt_message_82(_jspx_page_context))
        return;
      out.write("\n      </div>\n    </td></tr>\n   \n  </table>\n  <table id=\"eventDetectorTable\"></table>\n  \n  <table style=\"display:none;\">\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_3(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_83(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_84(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_85(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_86(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_87(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_0(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_4(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_88(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_89(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_4(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_5(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_90(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_91(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_92(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_93(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_94(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_1(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_6(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_95(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_96(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_5(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_7(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_97(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_98(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_99(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_100(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_101(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_2(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_8(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_102(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <select id=\"eventDetector_TEMPLATE_State\">\n            <option value=\"false\">");
      if (_jspx_meth_fmt_message_103(_jspx_page_context))
        return;
      out.write("</option>\n            <option value=\"true\">");
      if (_jspx_meth_fmt_message_104(_jspx_page_context))
        return;
      out.write("</option>\n          </select>\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_105(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_6(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_9(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_106(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_107(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_108(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_109(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_110(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_3(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_10(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_111(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_112(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_7(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_11(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_113(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_114(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_115(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_116(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_117(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_4(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_12(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_13(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_118(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_119(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_120(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_121(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_122(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_5(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_14(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_123(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_ChangeCount\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_124(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_8(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_15(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_125(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_126(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_127(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_128(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_129(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_6(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_16(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_130(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_9(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_17(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_131(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_132(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_133(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_134(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_135(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_7(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_18(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_136(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_10(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_19(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_137(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_138(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_139(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_140(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_141(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_8(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_20(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_142(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_143(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_11(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_REGEX_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_21(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_144(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_145(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_146(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_147(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_148(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_9(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_22(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_149(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_150(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_12(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_23(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_151(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_152(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_153(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_154(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_155(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_10(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_24(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_156(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_157(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Weight\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_158(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_13(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_25(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_159(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_160(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_161(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_162(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_163(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_11(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_26(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_164(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_165(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Weight\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_166(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_14(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n  </table>\n</div>\n\n<script type=\"text/javascript\">\n  dojo.require(\"dijit.form.Select\");\n  \n  function setEventDetectors(vo){\n      \n      DataPointDwr.getEventDetectorOptions(vo.pointLocator.dataTypeId,function(response){\n\n          var options = [];\n          for(var i=0; i<response.data.options.length; i++){\n              options.push({\n                  label: mangoMsg[response.data.options[i].nameKey],\n                  value: response.data.options[i].id,\n              })\n          }\n          pointEventDetectorEditor.eventDetectorSelect.options = [];\n          pointEventDetectorEditor.eventDetectorSelect.addOption(options);\n\n          //Remove all rows from the table\n          dwr.util.removeAllRows(\"eventDetectorTable\");\n          show(\"emptyListMessage\");\n          //Fill with our event detectors\n          DataPointEditDwr.getEventDetectors(pointEventDetectorEditor.initCB);\n");
      out.write("      });\n      \n  }\n  \n  \n  /*\n   * For now just use a DWR Call to fuse the saving into the current point\n   * This is messy but this page is huge\n   */\n  function getEventDetectors(vo,callback){\n      pointEventDetectorEditor.save(callback);\n  }\n  \n  \n  \n  function getPedId(node) {\n      while (!(node.pedId))\n          node = node.parentNode;\n      return node.pedId;\n  }\n\n  function PointEventDetectorEditor() {\n      var detectorCount = 0;\n      \n      this.eventDetectorSelect = new dijit.form.Select({\n          name: 'eventDetectorSelect',\n          \n      },\"eventDetectorSelect\");\n      \n      this.init = function() {\n           //Nothing for now\n          \n      }\n      \n      this.initCB = function(detectorList) {\n          if(detectorList != null)\n              for (var i=0; i<detectorList.length; i++)\n                  pointEventDetectorEditor.addEventDetectorCB(detectorList[i]);\n\n      }\n      \n      this.addEventDetector = function() {\n          var value = this.eventDetectorSelect.value;\n          \n");
      out.write("          DataPointEditDwr.addEventDetector(value, this.addEventDetectorCB);\n      }\n  \n      this.addEventDetectorCB = function(detector) {\n          detectorCount++;\n          hide(\"emptyListMessage\");\n          \n          // Create the appropriate tbody.\n          var content = $(\"detectorType\"+ detector.detectorType).cloneNode(true);\n          updateTemplateNode(content, detector.id);\n          content.id = \"eventDetector\"+ detector.id;\n          content.pedId = detector.id;\n          content.pedType = detector.detectorType;\n          $(\"eventDetectorTable\").appendChild(content);\n          \n          // Set the values in the content controls.\n          if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.binaryState ? \"true\" : \"false\");\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.multistateState);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write(") {}\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"ChangeCount\", detector.changeCount);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.alphanumericState);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_REGEX_STATE );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.alphanumericState);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\n              $set(\"eventDetector\"+ detector.id +\"Weight\", detector.weight);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write(") {\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\n              $set(\"eventDetector\"+ detector.id +\"Weight\", detector.weight);\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\n          }\n          \n          $set(\"eventDetector\"+ detector.id +\"Xid\", detector.xid);\n          $set(\"eventDetector\"+ detector.id +\"Alias\", detector.alias);\n          $set(\"eventDetector\"+ detector.id +\"AlarmLevel\", detector.alarmLevel);\n          pointEventDetectorEditor.updateAlarmLevelImage(detector.alarmLevel, detector.id);\n      }\n      \n      this.updateAlarmLevelImage = function(alarmLevel, pedId) {\n          setAlarmLevelImg(alarmLevel, $(\"eventDetector\"+ pedId +\"AlarmLevelImg\"));\n      }\n      \n      this.deleteDetector = function(pedId) {\n          DataPointEditDwr.deleteEventDetector(pedId);\n          \n          detectorCount--;\n          if (detectorCount == 0)\n              show(\"emptyListMessage\");\n");
      out.write("          \n          var content = $(\"eventDetector\"+ pedId);\n          $(\"eventDetectorTable\").removeChild(content);\n      }\n      \n      var saveCBCount;\n      var saveCallback;\n      var runSaveCallback;\n      this.save = function(callback) {\n          var edTableNodes = $(\"eventDetectorTable\").childNodes;\n          saveCBCount = 0;\n          saveCallback = callback;\n          runSaveCallback = true;\n          \n          dwr.engine.beginBatch();\n          for (var i=0; i<edTableNodes.length; i++) {\n              if (!edTableNodes[i].pedId)\n                  continue;\n              \n              // Found a detector row.\n              var pedId = edTableNodes[i].pedId;\n              var pedType = edTableNodes[i].pedType;\n              var errorMessage = null;\n              var xid = $get(\"eventDetector\"+ pedId +\"Xid\");\n              var alias = $get(\"eventDetector\"+ pedId +\"Alias\");\n              var alarmLevel = parseInt($get(\"eventDetector\"+ pedId +\"AlarmLevel\"));\n              \n              if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_167(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_168(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_169(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateHighLimitDetector(pedId, xid, alias, limit, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_170(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_171(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_172(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateLowLimitDetector(pedId, xid, alias, limit, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write(") {\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_173(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_174(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateBinaryStateDetector(pedId, xid, alias, state, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write(") {\n                  var state = parseInt($get(\"eventDetector\"+ pedId +\"State\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(state))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_175(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_176(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_177(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateMultistateStateDetector(pedId, xid, alias, state, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write(") {\n                  saveCBCount++;\n                  DataPointEditDwr.updatePointChangeDetector(pedId, xid, alias, alarmLevel, saveCB);\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write(") {\n                  var count = parseInt($get(\"eventDetector\"+ pedId +\"ChangeCount\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(count))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_178(_jspx_page_context))
        return;
      out.write("\";\n                  else if (count < 2)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_179(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_180(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 1)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_181(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateStateChangeCountDetector(pedId, xid, alias, count, duration, durationType, \n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write(") {\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_182(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 1)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_183(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateNoChangeDetector(pedId, xid, alias, duration, durationType, alarmLevel,\n                              saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write(") {\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_184(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 1)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_185(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateNoUpdateDetector(pedId, xid, alias, duration, durationType, alarmLevel,\n                              saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write(") {\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (state && state.length > 128)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_186(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_187(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_188(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateAlphanumericStateDetector(pedId, xid, alias, state, duration, durationType, \n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_REGEX_STATE );
      out.write(") {\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (state && state.length > 128)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_189(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_190(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_191(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateAlphanumericRegexStateDetector(pedId, xid, alias, state, duration, durationType, \n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var weight = parseFloat($get(\"eventDetector\"+ pedId +\"Weight\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_192(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(weight))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_193(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_194(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_195(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updatePositiveCusumDetector(pedId, xid, alias, limit, weight, duration,\n                              durationType, alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var weight = parseFloat($get(\"eventDetector\"+ pedId +\"Weight\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_196(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(weight))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_197(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_198(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_199(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateNegativeCusumDetector(pedId, xid, alias, limit, weight, duration,\n                              durationType, alarmLevel, saveCB);\n                  }\n              }\n              \n              if (errorMessage != null) {\n                  runSaveCallback = false;\n                  $(\"eventDetector\"+ pedId +\"ErrorMessage\").innerHTML = errorMessage;\n              }\n              else\n                  $(\"eventDetector\"+ pedId +\"ErrorMessage\").innerHTML = \"\";\n          }\n          dwr.engine.endBatch();\n      \n          // If no save calls were made, continue by calling the callback.\n          if (runSaveCallback && saveCBCount == 0)\n              callback();\n      };\n      \n      function saveCB() {\n          if (--saveCBCount == 0) {\n              // We're done with the callbacks. If there were no errors, call the callback.\n              if (runSaveCallback)\n                  saveCallback();\n          }\n");
      out.write("      }\n  }\n  var pointEventDetectorEditor = new PointEventDetectorEditor();\n  \n</script>");
      out.write("\n\n\n<script type=\"text/javascript\">\n    function initDataPointSettings(){\n        initPointProperties();    \t\n    };\n\n</script>");
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
    _jspx_th_fmt_message_0.setKey("pointEdit.props.props");
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
    _jspx_th_tag_help_0.setId("dataPointEditing");
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
    _jspx_th_fmt_message_1.setKey("pointEdit.props.unit");
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
    _jspx_th_fmt_message_2.setKey("pointEdit.props.useRenderedUnit");
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
    _jspx_th_fmt_message_3.setKey("pointEdit.props.renderedUnit");
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
    _jspx_th_fmt_message_4.setKey("pointEdit.props.useIntegralUnit");
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
    _jspx_th_fmt_message_5.setKey("pointEdit.props.integralUnit");
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
    _jspx_th_fmt_message_6.setKey("pointEdit.props.chartColour");
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
    _jspx_th_fmt_message_7.setKey("pointEdit.plotType");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_8.setKey("pointEdit.plotType.step");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
    _jspx_th_fmt_message_9.setKey("pointEdit.plotType.line");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
    _jspx_th_fmt_message_10.setKey("pointEdit.plotType.spline");
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
    _jspx_th_fmt_message_11.setKey("pointEdit.logging.props");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_tag_help_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_1 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_1      );
    }
    _jspx_th_tag_help_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_1.setId("pointValueLogging");
    _jspx_th_tag_help_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(null);
    _jspx_th_fmt_message_12.setKey("pointEdit.logging.type");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_3);
    _jspx_th_fmt_message_13.setKey("pointEdit.logging.type.change");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_4);
    _jspx_th_fmt_message_14.setKey("pointEdit.logging.type.all");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_5);
    _jspx_th_fmt_message_15.setKey("pointEdit.logging.type.never");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_6);
    _jspx_th_fmt_message_16.setKey("pointEdit.logging.type.interval");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_7);
    _jspx_th_fmt_message_17.setKey("pointEdit.logging.type.tsChange");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(null);
    _jspx_th_fmt_message_18.setKey("pointEdit.logging.period");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(null);
    _jspx_th_fmt_message_19.setKey("pointEdit.logging.every");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_0 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_0      );
    }
    _jspx_th_tag_timePeriods_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_0.setId("intervalLoggingPeriodType");
    _jspx_th_tag_timePeriods_0.setName("intervalLoggingPeriodType");
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(null);
    _jspx_th_fmt_message_20.setKey("pointEdit.logging.valueType");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_8);
    _jspx_th_fmt_message_21.setKey("pointEdit.logging.valueType.instant");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_9);
    _jspx_th_fmt_message_22.setKey("pointEdit.logging.valueType.maximum");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_10);
    _jspx_th_fmt_message_23.setKey("pointEdit.logging.valueType.minimum");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_11);
    _jspx_th_fmt_message_24.setKey("pointEdit.logging.valueType.average");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent(null);
    _jspx_th_fmt_message_25.setKey("pointEdit.logging.tolerance");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent(null);
    _jspx_th_fmt_message_26.setKey("pointEdit.logging.discard");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent(null);
    _jspx_th_fmt_message_27.setKey("pointEdit.logging.discardLow");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent(null);
    _jspx_th_fmt_message_28.setKey("pointEdit.logging.discardHigh");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent(null);
    _jspx_th_fmt_message_29.setKey("pointEdit.logging.purge");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent(null);
    _jspx_th_fmt_message_30.setKey("pointEdit.logging.purgeOverride");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent(null);
    _jspx_th_fmt_message_31.setKey("pointEdit.logging.after");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_1 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_1      );
    }
    _jspx_th_tag_timePeriods_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_1.setId("purgeType");
    _jspx_th_tag_timePeriods_1.setName("purgeType");
    _jspx_th_tag_timePeriods_1.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent(null);
    _jspx_th_fmt_message_32.setKey("pointEdit.logging.defaultCache");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent(null);
    _jspx_th_fmt_message_33.setKey("pointEdit.logging.clearCache");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent(null);
    _jspx_th_fmt_message_34.setKey("pointEdit.purge.confirm");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent(null);
    _jspx_th_fmt_message_35.setKey("pointEdit.purge.result");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }

  private boolean _jspx_meth_fmt_message_36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_36.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_36.setParent(null);
    _jspx_th_fmt_message_36.setKey("pointEdit.purge.purgeNow");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private boolean _jspx_meth_tag_help_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_2 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_2      );
    }
    _jspx_th_tag_help_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_2.setId("pointValueLogPurging");
    _jspx_th_tag_help_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_37.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_37.setParent(null);
    _jspx_th_fmt_message_37.setKey("pointEdit.purge.olderThan");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_2 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_2      );
    }
    _jspx_th_tag_timePeriods_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_2.setId("purgeNowType");
    _jspx_th_tag_timePeriods_2.setValue("7");
    _jspx_th_tag_timePeriods_2.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent(null);
    _jspx_th_fmt_message_38.setKey("pointEdit.purge.all");
    int _jspx_eval_fmt_message_38 = _jspx_th_fmt_message_38.doStartTag();
    if (_jspx_th_fmt_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
    return false;
  }

  private boolean _jspx_meth_fmt_message_39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_39.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_39.setParent(null);
    _jspx_th_fmt_message_39.setKey("pointEdit.purge.allData");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }

  private boolean _jspx_meth_fmt_message_40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_40.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_40.setParent(null);
    _jspx_th_fmt_message_40.setKey("pointEdit.purge.purgeNow");
    int _jspx_eval_fmt_message_40 = _jspx_th_fmt_message_40.doStartTag();
    if (_jspx_th_fmt_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
    return false;
  }

  private boolean _jspx_meth_fmt_message_41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_41.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_41.setParent(null);
    _jspx_th_fmt_message_41.setKey("pointEdit.purge.warn");
    int _jspx_eval_fmt_message_41 = _jspx_th_fmt_message_41.doStartTag();
    if (_jspx_th_fmt_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
    return false;
  }

  private boolean _jspx_meth_fmt_message_42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_42.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_42.setParent(null);
    _jspx_th_fmt_message_42.setKey("pointEdit.text.props");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }

  private boolean _jspx_meth_tag_help_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_3 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_3      );
    }
    _jspx_th_tag_help_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_3.setId("textRenderers");
    _jspx_th_tag_help_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent(null);
    _jspx_th_fmt_message_43.setKey("pointEdit.text.type");
    int _jspx_eval_fmt_message_43 = _jspx_th_fmt_message_43.doStartTag();
    if (_jspx_th_fmt_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
    return false;
  }

  private boolean _jspx_meth_fmt_message_44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_44.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_44.setParent(null);
    _jspx_th_fmt_message_44.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
    return false;
  }

  private boolean _jspx_meth_fmt_message_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent(null);
    _jspx_th_fmt_message_45.setKey("pointEdit.props.useUnitAsSuffix");
    int _jspx_eval_fmt_message_45 = _jspx_th_fmt_message_45.doStartTag();
    if (_jspx_th_fmt_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
    return false;
  }

  private boolean _jspx_meth_fmt_message_46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_46.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_46.setParent(null);
    _jspx_th_fmt_message_46.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
    return false;
  }

  private boolean _jspx_meth_tag_help_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_4 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_4      );
    }
    _jspx_th_tag_help_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_4.setId("datetimeFormats");
    _jspx_th_tag_help_4.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_47 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_47.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_47.setParent(null);
    _jspx_th_fmt_message_47.setKey("pointEdit.text.conversionExponent");
    int _jspx_eval_fmt_message_47 = _jspx_th_fmt_message_47.doStartTag();
    if (_jspx_th_fmt_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
    return false;
  }

  private boolean _jspx_meth_fmt_message_48(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_48 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_48.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_48.setParent(null);
    _jspx_th_fmt_message_48.setKey("pointEdit.text.zero");
    int _jspx_eval_fmt_message_48 = _jspx_th_fmt_message_48.doStartTag();
    if (_jspx_th_fmt_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
    return false;
  }

  private boolean _jspx_meth_fmt_message_49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_49 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_49.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_49.setParent(null);
    _jspx_th_fmt_message_49.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_49 = _jspx_th_fmt_message_49.doStartTag();
    if (_jspx_th_fmt_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
    return false;
  }

  private boolean _jspx_meth_fmt_message_50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_50.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_50.setParent(null);
    _jspx_th_fmt_message_50.setKey("pointEdit.text.one");
    int _jspx_eval_fmt_message_50 = _jspx_th_fmt_message_50.doStartTag();
    if (_jspx_th_fmt_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
    return false;
  }

  private boolean _jspx_meth_fmt_message_51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_51 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_51.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_51.setParent(null);
    _jspx_th_fmt_message_51.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_51 = _jspx_th_fmt_message_51.doStartTag();
    if (_jspx_th_fmt_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
    return false;
  }

  private boolean _jspx_meth_fmt_message_52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_52 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_52.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_52.setParent(null);
    _jspx_th_fmt_message_52.setKey("pointEdit.text.key");
    int _jspx_eval_fmt_message_52 = _jspx_th_fmt_message_52.doStartTag();
    if (_jspx_th_fmt_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
    return false;
  }

  private boolean _jspx_meth_fmt_message_53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_53 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_53.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_53.setParent(null);
    _jspx_th_fmt_message_53.setKey("pointEdit.text.text");
    int _jspx_eval_fmt_message_53 = _jspx_th_fmt_message_53.doStartTag();
    if (_jspx_th_fmt_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
    return false;
  }

  private boolean _jspx_meth_fmt_message_54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_54 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_54.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_54.setParent(null);
    _jspx_th_fmt_message_54.setKey("pointEdit.text.colour");
    int _jspx_eval_fmt_message_54 = _jspx_th_fmt_message_54.doStartTag();
    if (_jspx_th_fmt_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
    return false;
  }

  private boolean _jspx_meth_fmt_message_55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_55 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_55.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_55.setParent(null);
    _jspx_th_fmt_message_55.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_55 = _jspx_th_fmt_message_55.doStartTag();
    if (_jspx_th_fmt_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setPng("add");
    _jspx_th_tag_img_0.setTitle("common.add");
    _jspx_th_tag_img_0.setOnclick("return textRendererEditor.addMultistateValue();");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_56 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_56.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_56.setParent(null);
    _jspx_th_fmt_message_56.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_56 = _jspx_th_fmt_message_56.doStartTag();
    if (_jspx_th_fmt_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
    return false;
  }

  private boolean _jspx_meth_tag_help_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_5 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_5      );
    }
    _jspx_th_tag_help_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_5.setId("numberFormats");
    _jspx_th_tag_help_5.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_57 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_57.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_57.setParent(null);
    _jspx_th_fmt_message_57.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_57 = _jspx_th_fmt_message_57.doStartTag();
    if (_jspx_th_fmt_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
    return false;
  }

  private boolean _jspx_meth_fmt_message_58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_58 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_58.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_58.setParent(null);
    _jspx_th_fmt_message_58.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_58 = _jspx_th_fmt_message_58.doStartTag();
    if (_jspx_th_fmt_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
    return false;
  }

  private boolean _jspx_meth_fmt_message_59(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_59 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_59.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_59.setParent(null);
    _jspx_th_fmt_message_59.setKey("pointEdit.text.from");
    int _jspx_eval_fmt_message_59 = _jspx_th_fmt_message_59.doStartTag();
    if (_jspx_th_fmt_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
    return false;
  }

  private boolean _jspx_meth_fmt_message_60(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_60 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_60.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_60.setParent(null);
    _jspx_th_fmt_message_60.setKey("pointEdit.text.to");
    int _jspx_eval_fmt_message_60 = _jspx_th_fmt_message_60.doStartTag();
    if (_jspx_th_fmt_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
    return false;
  }

  private boolean _jspx_meth_fmt_message_61(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_61 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_61.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_61.setParent(null);
    _jspx_th_fmt_message_61.setKey("pointEdit.text.text");
    int _jspx_eval_fmt_message_61 = _jspx_th_fmt_message_61.doStartTag();
    if (_jspx_th_fmt_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
    return false;
  }

  private boolean _jspx_meth_fmt_message_62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_62 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_62.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_62.setParent(null);
    _jspx_th_fmt_message_62.setKey("pointEdit.text.colour");
    int _jspx_eval_fmt_message_62 = _jspx_th_fmt_message_62.doStartTag();
    if (_jspx_th_fmt_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
    return false;
  }

  private boolean _jspx_meth_fmt_message_63(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_63 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_63.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_63.setParent(null);
    _jspx_th_fmt_message_63.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_63 = _jspx_th_fmt_message_63.doStartTag();
    if (_jspx_th_fmt_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
    return false;
  }

  private boolean _jspx_meth_tag_img_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setPng("add");
    _jspx_th_tag_img_1.setTitle("common.add");
    _jspx_th_tag_img_1.setOnclick("return textRendererEditor.addRangeValue();");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_64 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_64.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_64.setParent(null);
    _jspx_th_fmt_message_64.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_64 = _jspx_th_fmt_message_64.doStartTag();
    if (_jspx_th_fmt_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
    return false;
  }

  private boolean _jspx_meth_tag_help_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_6 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_6      );
    }
    _jspx_th_tag_help_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_6.setId("datetimeFormats");
    _jspx_th_tag_help_6.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_65(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_65 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_65.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_65.setParent(null);
    _jspx_th_fmt_message_65.setKey("pointEdit.text.conversionExponent");
    int _jspx_eval_fmt_message_65 = _jspx_th_fmt_message_65.doStartTag();
    if (_jspx_th_fmt_message_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
    return false;
  }

  private boolean _jspx_meth_fmt_message_66(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_66 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_66.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_66.setParent(null);
    _jspx_th_fmt_message_66.setKey("pointEdit.text.errorParsingKey");
    int _jspx_eval_fmt_message_66 = _jspx_th_fmt_message_66.doStartTag();
    if (_jspx_th_fmt_message_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
    return false;
  }

  private boolean _jspx_meth_fmt_message_67(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_67 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_67.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_67.setParent(null);
    _jspx_th_fmt_message_67.setKey("pointEdit.text.listContainsKey");
    int _jspx_eval_fmt_message_67 = _jspx_th_fmt_message_67.doStartTag();
    if (_jspx_th_fmt_message_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
    return false;
  }

  private boolean _jspx_meth_fmt_message_68(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_68 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_68.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_68.setParent(null);
    _jspx_th_fmt_message_68.setKey("common.delete");
    int _jspx_eval_fmt_message_68 = _jspx_th_fmt_message_68.doStartTag();
    if (_jspx_th_fmt_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
    return false;
  }

  private boolean _jspx_meth_fmt_message_69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_69 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_69.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_69.setParent(null);
    _jspx_th_fmt_message_69.setKey("pointEdit.text.errorParsingFrom");
    int _jspx_eval_fmt_message_69 = _jspx_th_fmt_message_69.doStartTag();
    if (_jspx_th_fmt_message_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
    return false;
  }

  private boolean _jspx_meth_fmt_message_70(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_70 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_70.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_70.setParent(null);
    _jspx_th_fmt_message_70.setKey("pointEdit.text.errorParsingTo");
    int _jspx_eval_fmt_message_70 = _jspx_th_fmt_message_70.doStartTag();
    if (_jspx_th_fmt_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
    return false;
  }

  private boolean _jspx_meth_fmt_message_71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_71 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_71.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_71.setParent(null);
    _jspx_th_fmt_message_71.setKey("pointEdit.text.toGreaterThanFrom");
    int _jspx_eval_fmt_message_71 = _jspx_th_fmt_message_71.doStartTag();
    if (_jspx_th_fmt_message_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
    return false;
  }

  private boolean _jspx_meth_fmt_message_72(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_72 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_72.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_72.setParent(null);
    _jspx_th_fmt_message_72.setKey("pointEdit.text.listContainsRange");
    int _jspx_eval_fmt_message_72 = _jspx_th_fmt_message_72.doStartTag();
    if (_jspx_th_fmt_message_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
    return false;
  }

  private boolean _jspx_meth_fmt_message_73(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_73 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_73.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_73.setParent(null);
    _jspx_th_fmt_message_73.setKey("common.delete");
    int _jspx_eval_fmt_message_73 = _jspx_th_fmt_message_73.doStartTag();
    if (_jspx_th_fmt_message_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
    return false;
  }

  private boolean _jspx_meth_fmt_message_74(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_74 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_74.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_74.setParent(null);
    _jspx_th_fmt_message_74.setKey("pointEdit.chart.props");
    int _jspx_eval_fmt_message_74 = _jspx_th_fmt_message_74.doStartTag();
    if (_jspx_th_fmt_message_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
    return false;
  }

  private boolean _jspx_meth_tag_help_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_7 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_7      );
    }
    _jspx_th_tag_help_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_7.setId("chartRenderers");
    _jspx_th_tag_help_7.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_75(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_75 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_75.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_75.setParent(null);
    _jspx_th_fmt_message_75.setKey("pointEdit.chart.type");
    int _jspx_eval_fmt_message_75 = _jspx_th_fmt_message_75.doStartTag();
    if (_jspx_th_fmt_message_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
    return false;
  }

  private boolean _jspx_meth_fmt_message_76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_76 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_76.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_76.setParent(null);
    _jspx_th_fmt_message_76.setKey("pointEdit.chart.timePeriod");
    int _jspx_eval_fmt_message_76 = _jspx_th_fmt_message_76.doStartTag();
    if (_jspx_th_fmt_message_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_3 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_3      );
    }
    _jspx_th_tag_timePeriods_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_3.setId("timePeriod");
    _jspx_th_tag_timePeriods_3.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_77(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_77 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_77.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_77.setParent(null);
    _jspx_th_fmt_message_77.setKey("pointEdit.chart.limit");
    int _jspx_eval_fmt_message_77 = _jspx_th_fmt_message_77.doStartTag();
    if (_jspx_th_fmt_message_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
    return false;
  }

  private boolean _jspx_meth_fmt_message_78(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_78 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_78.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_78.setParent(null);
    _jspx_th_fmt_message_78.setKey("pointEdit.chart.includeSum");
    int _jspx_eval_fmt_message_78 = _jspx_th_fmt_message_78.doStartTag();
    if (_jspx_th_fmt_message_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
    return false;
  }

  private boolean _jspx_meth_fmt_message_79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_79 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_79.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_79.setParent(null);
    _jspx_th_fmt_message_79.setKey("pointEdit.chart.note");
    int _jspx_eval_fmt_message_79 = _jspx_th_fmt_message_79.doStartTag();
    if (_jspx_th_fmt_message_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
    return false;
  }

  private boolean _jspx_meth_fmt_message_80(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_80 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_80.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_80.setParent(null);
    _jspx_th_fmt_message_80.setKey("pointEdit.detectors.eventDetectors");
    int _jspx_eval_fmt_message_80 = _jspx_th_fmt_message_80.doStartTag();
    if (_jspx_th_fmt_message_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
    return false;
  }

  private boolean _jspx_meth_tag_help_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_8 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_8      );
    }
    _jspx_th_tag_help_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_8.setId("eventDetectors");
    _jspx_th_tag_help_8.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_81(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_81 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_81.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_81.setParent(null);
    _jspx_th_fmt_message_81.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_81 = _jspx_th_fmt_message_81.doStartTag();
    if (_jspx_th_fmt_message_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
    return false;
  }

  private boolean _jspx_meth_tag_img_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setPng("add");
    _jspx_th_tag_img_2.setTitle("common.add");
    _jspx_th_tag_img_2.setOnclick("pointEventDetectorEditor.addEventDetector();");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_82(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_82 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_82.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_82.setParent(null);
    _jspx_th_fmt_message_82.setKey("pointEdit.detectors.empty");
    int _jspx_eval_fmt_message_82 = _jspx_th_fmt_message_82.doStartTag();
    if (_jspx_th_fmt_message_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setPng("delete");
    _jspx_th_tag_img_3.setTitle("common.delete");
    _jspx_th_tag_img_3.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_83(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_83 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_83.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_83.setParent(null);
    _jspx_th_fmt_message_83.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_83 = _jspx_th_fmt_message_83.doStartTag();
    if (_jspx_th_fmt_message_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
    return false;
  }

  private boolean _jspx_meth_fmt_message_84(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_84 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_84.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_84.setParent(null);
    _jspx_th_fmt_message_84.setKey("pointEdit.detectors.highLimitDet");
    int _jspx_eval_fmt_message_84 = _jspx_th_fmt_message_84.doStartTag();
    if (_jspx_th_fmt_message_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
    return false;
  }

  private boolean _jspx_meth_fmt_message_85(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_85 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_85.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_85.setParent(null);
    _jspx_th_fmt_message_85.setKey("common.xid");
    int _jspx_eval_fmt_message_85 = _jspx_th_fmt_message_85.doStartTag();
    if (_jspx_th_fmt_message_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
    return false;
  }

  private boolean _jspx_meth_fmt_message_86(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_86 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_86.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_86.setParent(null);
    _jspx_th_fmt_message_86.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_86 = _jspx_th_fmt_message_86.doStartTag();
    if (_jspx_th_fmt_message_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
    return false;
  }

  private boolean _jspx_meth_fmt_message_87(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_87 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_87.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_87.setParent(null);
    _jspx_th_fmt_message_87.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_87 = _jspx_th_fmt_message_87.doStartTag();
    if (_jspx_th_fmt_message_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_0 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_0      );
    }
    _jspx_th_tag_alarmLevelOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_0.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_0.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_4 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_4      );
    }
    _jspx_th_tag_img_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_4.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_4.setPng("flag_green");
    _jspx_th_tag_img_4.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_4.setStyle("display:none;");
    _jspx_th_tag_img_4.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_88(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_88 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_88.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_88.setParent(null);
    _jspx_th_fmt_message_88.setKey("pointEdit.detectors.highLimit");
    int _jspx_eval_fmt_message_88 = _jspx_th_fmt_message_88.doStartTag();
    if (_jspx_th_fmt_message_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
    return false;
  }

  private boolean _jspx_meth_fmt_message_89(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_89 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_89.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_89.setParent(null);
    _jspx_th_fmt_message_89.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_89 = _jspx_th_fmt_message_89.doStartTag();
    if (_jspx_th_fmt_message_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_4 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_4      );
    }
    _jspx_th_tag_timePeriods_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_4.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_4.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_5 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_5      );
    }
    _jspx_th_tag_img_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_5.setPng("delete");
    _jspx_th_tag_img_5.setTitle("common.delete");
    _jspx_th_tag_img_5.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_5.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_90(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_90 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_90.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_90.setParent(null);
    _jspx_th_fmt_message_90.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_90 = _jspx_th_fmt_message_90.doStartTag();
    if (_jspx_th_fmt_message_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
    return false;
  }

  private boolean _jspx_meth_fmt_message_91(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_91 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_91.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_91.setParent(null);
    _jspx_th_fmt_message_91.setKey("pointEdit.detectors.lowLimitDet");
    int _jspx_eval_fmt_message_91 = _jspx_th_fmt_message_91.doStartTag();
    if (_jspx_th_fmt_message_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
    return false;
  }

  private boolean _jspx_meth_fmt_message_92(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_92 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_92.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_92.setParent(null);
    _jspx_th_fmt_message_92.setKey("common.xid");
    int _jspx_eval_fmt_message_92 = _jspx_th_fmt_message_92.doStartTag();
    if (_jspx_th_fmt_message_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
    return false;
  }

  private boolean _jspx_meth_fmt_message_93(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_93 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_93.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_93.setParent(null);
    _jspx_th_fmt_message_93.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_93 = _jspx_th_fmt_message_93.doStartTag();
    if (_jspx_th_fmt_message_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
    return false;
  }

  private boolean _jspx_meth_fmt_message_94(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_94 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_94.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_94.setParent(null);
    _jspx_th_fmt_message_94.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_94 = _jspx_th_fmt_message_94.doStartTag();
    if (_jspx_th_fmt_message_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_1 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_1      );
    }
    _jspx_th_tag_alarmLevelOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_1.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_1.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_6 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_6      );
    }
    _jspx_th_tag_img_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_6.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_6.setPng("flag_green");
    _jspx_th_tag_img_6.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_6.setStyle("display:none;");
    _jspx_th_tag_img_6.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_95(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_95 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_95.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_95.setParent(null);
    _jspx_th_fmt_message_95.setKey("pointEdit.detectors.lowLimit");
    int _jspx_eval_fmt_message_95 = _jspx_th_fmt_message_95.doStartTag();
    if (_jspx_th_fmt_message_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
    return false;
  }

  private boolean _jspx_meth_fmt_message_96(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_96 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_96.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_96.setParent(null);
    _jspx_th_fmt_message_96.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_96 = _jspx_th_fmt_message_96.doStartTag();
    if (_jspx_th_fmt_message_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_5 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_5      );
    }
    _jspx_th_tag_timePeriods_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_5.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_5.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_5.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_5.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_5.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_5.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_7 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_7      );
    }
    _jspx_th_tag_img_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_7.setPng("delete");
    _jspx_th_tag_img_7.setTitle("common.delete");
    _jspx_th_tag_img_7.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_7.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_97(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_97 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_97.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_97.setParent(null);
    _jspx_th_fmt_message_97.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_97 = _jspx_th_fmt_message_97.doStartTag();
    if (_jspx_th_fmt_message_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
    return false;
  }

  private boolean _jspx_meth_fmt_message_98(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_98 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_98.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_98.setParent(null);
    _jspx_th_fmt_message_98.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_98 = _jspx_th_fmt_message_98.doStartTag();
    if (_jspx_th_fmt_message_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
    return false;
  }

  private boolean _jspx_meth_fmt_message_99(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_99 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_99.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_99.setParent(null);
    _jspx_th_fmt_message_99.setKey("common.xid");
    int _jspx_eval_fmt_message_99 = _jspx_th_fmt_message_99.doStartTag();
    if (_jspx_th_fmt_message_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
    return false;
  }

  private boolean _jspx_meth_fmt_message_100(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_100 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_100.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_100.setParent(null);
    _jspx_th_fmt_message_100.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_100 = _jspx_th_fmt_message_100.doStartTag();
    if (_jspx_th_fmt_message_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
    return false;
  }

  private boolean _jspx_meth_fmt_message_101(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_101 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_101.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_101.setParent(null);
    _jspx_th_fmt_message_101.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_101 = _jspx_th_fmt_message_101.doStartTag();
    if (_jspx_th_fmt_message_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_2 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_2      );
    }
    _jspx_th_tag_alarmLevelOptions_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_2.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_2.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_2.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_8 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_8      );
    }
    _jspx_th_tag_img_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_8.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_8.setPng("flag_green");
    _jspx_th_tag_img_8.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_8.setStyle("display:none;");
    _jspx_th_tag_img_8.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_102(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_102 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_102.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_102.setParent(null);
    _jspx_th_fmt_message_102.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_102 = _jspx_th_fmt_message_102.doStartTag();
    if (_jspx_th_fmt_message_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
    return false;
  }

  private boolean _jspx_meth_fmt_message_103(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_103 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_103.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_103.setParent(null);
    _jspx_th_fmt_message_103.setKey("pointEdit.detectors.zero");
    int _jspx_eval_fmt_message_103 = _jspx_th_fmt_message_103.doStartTag();
    if (_jspx_th_fmt_message_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
    return false;
  }

  private boolean _jspx_meth_fmt_message_104(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_104 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_104.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_104.setParent(null);
    _jspx_th_fmt_message_104.setKey("pointEdit.detectors.one");
    int _jspx_eval_fmt_message_104 = _jspx_th_fmt_message_104.doStartTag();
    if (_jspx_th_fmt_message_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
    return false;
  }

  private boolean _jspx_meth_fmt_message_105(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_105 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_105.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_105.setParent(null);
    _jspx_th_fmt_message_105.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_105 = _jspx_th_fmt_message_105.doStartTag();
    if (_jspx_th_fmt_message_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_6 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_6      );
    }
    _jspx_th_tag_timePeriods_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_6.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_6.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_6.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_6.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_6.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_6.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_9 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_9      );
    }
    _jspx_th_tag_img_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_9.setPng("delete");
    _jspx_th_tag_img_9.setTitle("common.delete");
    _jspx_th_tag_img_9.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_9.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_106(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_106 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_106.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_106.setParent(null);
    _jspx_th_fmt_message_106.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_106 = _jspx_th_fmt_message_106.doStartTag();
    if (_jspx_th_fmt_message_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
    return false;
  }

  private boolean _jspx_meth_fmt_message_107(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_107 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_107.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_107.setParent(null);
    _jspx_th_fmt_message_107.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_107 = _jspx_th_fmt_message_107.doStartTag();
    if (_jspx_th_fmt_message_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
    return false;
  }

  private boolean _jspx_meth_fmt_message_108(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_108 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_108.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_108.setParent(null);
    _jspx_th_fmt_message_108.setKey("common.xid");
    int _jspx_eval_fmt_message_108 = _jspx_th_fmt_message_108.doStartTag();
    if (_jspx_th_fmt_message_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
    return false;
  }

  private boolean _jspx_meth_fmt_message_109(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_109 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_109.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_109.setParent(null);
    _jspx_th_fmt_message_109.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_109 = _jspx_th_fmt_message_109.doStartTag();
    if (_jspx_th_fmt_message_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
    return false;
  }

  private boolean _jspx_meth_fmt_message_110(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_110 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_110.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_110.setParent(null);
    _jspx_th_fmt_message_110.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_110 = _jspx_th_fmt_message_110.doStartTag();
    if (_jspx_th_fmt_message_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_3 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_3      );
    }
    _jspx_th_tag_alarmLevelOptions_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_3.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_3.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_10 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_10      );
    }
    _jspx_th_tag_img_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_10.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_10.setPng("flag_green");
    _jspx_th_tag_img_10.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_10.setStyle("display:none;");
    _jspx_th_tag_img_10.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_111(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_111 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_111.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_111.setParent(null);
    _jspx_th_fmt_message_111.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_111 = _jspx_th_fmt_message_111.doStartTag();
    if (_jspx_th_fmt_message_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
    return false;
  }

  private boolean _jspx_meth_fmt_message_112(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_112 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_112.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_112.setParent(null);
    _jspx_th_fmt_message_112.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_112 = _jspx_th_fmt_message_112.doStartTag();
    if (_jspx_th_fmt_message_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_7 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_7      );
    }
    _jspx_th_tag_timePeriods_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_7.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_7.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_7.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_7.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_7.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_7.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_11 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_11      );
    }
    _jspx_th_tag_img_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_11.setPng("delete");
    _jspx_th_tag_img_11.setTitle("common.delete");
    _jspx_th_tag_img_11.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_11.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_113(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_113 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_113.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_113.setParent(null);
    _jspx_th_fmt_message_113.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_113 = _jspx_th_fmt_message_113.doStartTag();
    if (_jspx_th_fmt_message_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
    return false;
  }

  private boolean _jspx_meth_fmt_message_114(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_114 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_114.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_114.setParent(null);
    _jspx_th_fmt_message_114.setKey("pointEdit.detectors.changeDet");
    int _jspx_eval_fmt_message_114 = _jspx_th_fmt_message_114.doStartTag();
    if (_jspx_th_fmt_message_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
    return false;
  }

  private boolean _jspx_meth_fmt_message_115(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_115 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_115.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_115.setParent(null);
    _jspx_th_fmt_message_115.setKey("common.xid");
    int _jspx_eval_fmt_message_115 = _jspx_th_fmt_message_115.doStartTag();
    if (_jspx_th_fmt_message_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
    return false;
  }

  private boolean _jspx_meth_fmt_message_116(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_116 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_116.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_116.setParent(null);
    _jspx_th_fmt_message_116.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_116 = _jspx_th_fmt_message_116.doStartTag();
    if (_jspx_th_fmt_message_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
    return false;
  }

  private boolean _jspx_meth_fmt_message_117(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_117 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_117.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_117.setParent(null);
    _jspx_th_fmt_message_117.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_117 = _jspx_th_fmt_message_117.doStartTag();
    if (_jspx_th_fmt_message_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_4 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_4      );
    }
    _jspx_th_tag_alarmLevelOptions_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_4.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_4.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_12 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_12      );
    }
    _jspx_th_tag_img_12.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_12.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_12.setPng("flag_green");
    _jspx_th_tag_img_12.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_12.setStyle("display:none;");
    _jspx_th_tag_img_12.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_13 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_13      );
    }
    _jspx_th_tag_img_13.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_13.setPng("delete");
    _jspx_th_tag_img_13.setTitle("common.delete");
    _jspx_th_tag_img_13.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_13.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_118(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_118 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_118.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_118.setParent(null);
    _jspx_th_fmt_message_118.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_118 = _jspx_th_fmt_message_118.doStartTag();
    if (_jspx_th_fmt_message_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
    return false;
  }

  private boolean _jspx_meth_fmt_message_119(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_119 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_119.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_119.setParent(null);
    _jspx_th_fmt_message_119.setKey("pointEdit.detectors.changeCounter");
    int _jspx_eval_fmt_message_119 = _jspx_th_fmt_message_119.doStartTag();
    if (_jspx_th_fmt_message_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
    return false;
  }

  private boolean _jspx_meth_fmt_message_120(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_120 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_120.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_120.setParent(null);
    _jspx_th_fmt_message_120.setKey("common.xid");
    int _jspx_eval_fmt_message_120 = _jspx_th_fmt_message_120.doStartTag();
    if (_jspx_th_fmt_message_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
    return false;
  }

  private boolean _jspx_meth_fmt_message_121(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_121 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_121.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_121.setParent(null);
    _jspx_th_fmt_message_121.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_121 = _jspx_th_fmt_message_121.doStartTag();
    if (_jspx_th_fmt_message_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
    return false;
  }

  private boolean _jspx_meth_fmt_message_122(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_122 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_122.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_122.setParent(null);
    _jspx_th_fmt_message_122.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_122 = _jspx_th_fmt_message_122.doStartTag();
    if (_jspx_th_fmt_message_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_5 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_5      );
    }
    _jspx_th_tag_alarmLevelOptions_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_5.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_5.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_5.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_14 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_14      );
    }
    _jspx_th_tag_img_14.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_14.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_14.setPng("flag_green");
    _jspx_th_tag_img_14.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_14.setStyle("display:none;");
    _jspx_th_tag_img_14.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_123(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_123 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_123.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_123.setParent(null);
    _jspx_th_fmt_message_123.setKey("pointEdit.detectors.changeCount");
    int _jspx_eval_fmt_message_123 = _jspx_th_fmt_message_123.doStartTag();
    if (_jspx_th_fmt_message_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
    return false;
  }

  private boolean _jspx_meth_fmt_message_124(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_124 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_124.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_124.setParent(null);
    _jspx_th_fmt_message_124.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_124 = _jspx_th_fmt_message_124.doStartTag();
    if (_jspx_th_fmt_message_124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_8 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_8      );
    }
    _jspx_th_tag_timePeriods_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_8.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_8.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_8.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_8.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_8.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_8.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_15 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_15      );
    }
    _jspx_th_tag_img_15.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_15.setPng("delete");
    _jspx_th_tag_img_15.setTitle("common.delete");
    _jspx_th_tag_img_15.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_15.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_125(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_125 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_125.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_125.setParent(null);
    _jspx_th_fmt_message_125.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_125 = _jspx_th_fmt_message_125.doStartTag();
    if (_jspx_th_fmt_message_125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
    return false;
  }

  private boolean _jspx_meth_fmt_message_126(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_126 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_126.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_126.setParent(null);
    _jspx_th_fmt_message_126.setKey("pointEdit.detectors.noChange");
    int _jspx_eval_fmt_message_126 = _jspx_th_fmt_message_126.doStartTag();
    if (_jspx_th_fmt_message_126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
    return false;
  }

  private boolean _jspx_meth_fmt_message_127(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_127 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_127.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_127.setParent(null);
    _jspx_th_fmt_message_127.setKey("common.xid");
    int _jspx_eval_fmt_message_127 = _jspx_th_fmt_message_127.doStartTag();
    if (_jspx_th_fmt_message_127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
    return false;
  }

  private boolean _jspx_meth_fmt_message_128(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_128 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_128.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_128.setParent(null);
    _jspx_th_fmt_message_128.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_128 = _jspx_th_fmt_message_128.doStartTag();
    if (_jspx_th_fmt_message_128.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_128);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_128);
    return false;
  }

  private boolean _jspx_meth_fmt_message_129(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_129 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_129.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_129.setParent(null);
    _jspx_th_fmt_message_129.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_129 = _jspx_th_fmt_message_129.doStartTag();
    if (_jspx_th_fmt_message_129.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_129);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_129);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_6 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_6      );
    }
    _jspx_th_tag_alarmLevelOptions_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_6.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_6.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_6.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_16 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_16      );
    }
    _jspx_th_tag_img_16.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_16.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_16.setPng("flag_green");
    _jspx_th_tag_img_16.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_16.setStyle("display:none;");
    _jspx_th_tag_img_16.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_130(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_130 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_130.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_130.setParent(null);
    _jspx_th_fmt_message_130.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_130 = _jspx_th_fmt_message_130.doStartTag();
    if (_jspx_th_fmt_message_130.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_130);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_130);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_9 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_9      );
    }
    _jspx_th_tag_timePeriods_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_9.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_9.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_9.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_9.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_9.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_9.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_17 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_17      );
    }
    _jspx_th_tag_img_17.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_17.setPng("delete");
    _jspx_th_tag_img_17.setTitle("common.delete");
    _jspx_th_tag_img_17.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_17.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_131(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_131 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_131.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_131.setParent(null);
    _jspx_th_fmt_message_131.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_131 = _jspx_th_fmt_message_131.doStartTag();
    if (_jspx_th_fmt_message_131.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_131);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_131);
    return false;
  }

  private boolean _jspx_meth_fmt_message_132(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_132 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_132.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_132.setParent(null);
    _jspx_th_fmt_message_132.setKey("pointEdit.detectors.noUpdate");
    int _jspx_eval_fmt_message_132 = _jspx_th_fmt_message_132.doStartTag();
    if (_jspx_th_fmt_message_132.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_132);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_132);
    return false;
  }

  private boolean _jspx_meth_fmt_message_133(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_133 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_133.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_133.setParent(null);
    _jspx_th_fmt_message_133.setKey("common.xid");
    int _jspx_eval_fmt_message_133 = _jspx_th_fmt_message_133.doStartTag();
    if (_jspx_th_fmt_message_133.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_133);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_133);
    return false;
  }

  private boolean _jspx_meth_fmt_message_134(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_134 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_134.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_134.setParent(null);
    _jspx_th_fmt_message_134.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_134 = _jspx_th_fmt_message_134.doStartTag();
    if (_jspx_th_fmt_message_134.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_134);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_134);
    return false;
  }

  private boolean _jspx_meth_fmt_message_135(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_135 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_135.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_135.setParent(null);
    _jspx_th_fmt_message_135.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_135 = _jspx_th_fmt_message_135.doStartTag();
    if (_jspx_th_fmt_message_135.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_135);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_135);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_7 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_7      );
    }
    _jspx_th_tag_alarmLevelOptions_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_7.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_7.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_7.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_18 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_18      );
    }
    _jspx_th_tag_img_18.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_18.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_18.setPng("flag_green");
    _jspx_th_tag_img_18.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_18.setStyle("display:none;");
    _jspx_th_tag_img_18.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_136(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_136 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_136.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_136.setParent(null);
    _jspx_th_fmt_message_136.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_136 = _jspx_th_fmt_message_136.doStartTag();
    if (_jspx_th_fmt_message_136.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_136);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_136);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_10 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_10      );
    }
    _jspx_th_tag_timePeriods_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_10.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_10.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_10.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_10.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_10.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_10.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_19 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_19      );
    }
    _jspx_th_tag_img_19.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_19.setPng("delete");
    _jspx_th_tag_img_19.setTitle("common.delete");
    _jspx_th_tag_img_19.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_19.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_137(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_137 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_137.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_137.setParent(null);
    _jspx_th_fmt_message_137.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_137 = _jspx_th_fmt_message_137.doStartTag();
    if (_jspx_th_fmt_message_137.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_137);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_137);
    return false;
  }

  private boolean _jspx_meth_fmt_message_138(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_138 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_138.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_138.setParent(null);
    _jspx_th_fmt_message_138.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_138 = _jspx_th_fmt_message_138.doStartTag();
    if (_jspx_th_fmt_message_138.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_138);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_138);
    return false;
  }

  private boolean _jspx_meth_fmt_message_139(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_139 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_139.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_139.setParent(null);
    _jspx_th_fmt_message_139.setKey("common.xid");
    int _jspx_eval_fmt_message_139 = _jspx_th_fmt_message_139.doStartTag();
    if (_jspx_th_fmt_message_139.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_139);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_139);
    return false;
  }

  private boolean _jspx_meth_fmt_message_140(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_140 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_140.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_140.setParent(null);
    _jspx_th_fmt_message_140.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_140 = _jspx_th_fmt_message_140.doStartTag();
    if (_jspx_th_fmt_message_140.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_140);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_140);
    return false;
  }

  private boolean _jspx_meth_fmt_message_141(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_141 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_141.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_141.setParent(null);
    _jspx_th_fmt_message_141.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_141 = _jspx_th_fmt_message_141.doStartTag();
    if (_jspx_th_fmt_message_141.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_141);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_141);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_8 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_8      );
    }
    _jspx_th_tag_alarmLevelOptions_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_8.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_8.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_8.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_20 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_20      );
    }
    _jspx_th_tag_img_20.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_20.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_20.setPng("flag_green");
    _jspx_th_tag_img_20.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_20.setStyle("display:none;");
    _jspx_th_tag_img_20.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_142(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_142 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_142.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_142.setParent(null);
    _jspx_th_fmt_message_142.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_142 = _jspx_th_fmt_message_142.doStartTag();
    if (_jspx_th_fmt_message_142.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_142);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_142);
    return false;
  }

  private boolean _jspx_meth_fmt_message_143(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_143 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_143.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_143.setParent(null);
    _jspx_th_fmt_message_143.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_143 = _jspx_th_fmt_message_143.doStartTag();
    if (_jspx_th_fmt_message_143.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_143);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_143);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_11 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_11      );
    }
    _jspx_th_tag_timePeriods_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_11.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_11.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_11.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_11.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_11.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_11.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_21 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_21      );
    }
    _jspx_th_tag_img_21.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_21.setPng("delete");
    _jspx_th_tag_img_21.setTitle("common.delete");
    _jspx_th_tag_img_21.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_21.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_144(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_144 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_144.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_144.setParent(null);
    _jspx_th_fmt_message_144.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_144 = _jspx_th_fmt_message_144.doStartTag();
    if (_jspx_th_fmt_message_144.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_144);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_144);
    return false;
  }

  private boolean _jspx_meth_fmt_message_145(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_145 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_145.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_145.setParent(null);
    _jspx_th_fmt_message_145.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_145 = _jspx_th_fmt_message_145.doStartTag();
    if (_jspx_th_fmt_message_145.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_145);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_145);
    return false;
  }

  private boolean _jspx_meth_fmt_message_146(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_146 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_146.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_146.setParent(null);
    _jspx_th_fmt_message_146.setKey("common.xid");
    int _jspx_eval_fmt_message_146 = _jspx_th_fmt_message_146.doStartTag();
    if (_jspx_th_fmt_message_146.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_146);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_146);
    return false;
  }

  private boolean _jspx_meth_fmt_message_147(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_147 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_147.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_147.setParent(null);
    _jspx_th_fmt_message_147.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_147 = _jspx_th_fmt_message_147.doStartTag();
    if (_jspx_th_fmt_message_147.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_147);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_147);
    return false;
  }

  private boolean _jspx_meth_fmt_message_148(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_148 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_148.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_148.setParent(null);
    _jspx_th_fmt_message_148.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_148 = _jspx_th_fmt_message_148.doStartTag();
    if (_jspx_th_fmt_message_148.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_148);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_148);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_9 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_9      );
    }
    _jspx_th_tag_alarmLevelOptions_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_9.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_9.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_9.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_22 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_22      );
    }
    _jspx_th_tag_img_22.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_22.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_22.setPng("flag_green");
    _jspx_th_tag_img_22.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_22.setStyle("display:none;");
    _jspx_th_tag_img_22.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_149(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_149 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_149.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_149.setParent(null);
    _jspx_th_fmt_message_149.setKey("pointEdit.detectors.regexState");
    int _jspx_eval_fmt_message_149 = _jspx_th_fmt_message_149.doStartTag();
    if (_jspx_th_fmt_message_149.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_149);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_149);
    return false;
  }

  private boolean _jspx_meth_fmt_message_150(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_150 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_150.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_150.setParent(null);
    _jspx_th_fmt_message_150.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_150 = _jspx_th_fmt_message_150.doStartTag();
    if (_jspx_th_fmt_message_150.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_150);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_150);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_12 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_12      );
    }
    _jspx_th_tag_timePeriods_12.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_12.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_12.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_12.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_12.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_12.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_12.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_23 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_23      );
    }
    _jspx_th_tag_img_23.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_23.setPng("delete");
    _jspx_th_tag_img_23.setTitle("common.delete");
    _jspx_th_tag_img_23.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_23.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_151(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_151 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_151.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_151.setParent(null);
    _jspx_th_fmt_message_151.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_151 = _jspx_th_fmt_message_151.doStartTag();
    if (_jspx_th_fmt_message_151.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_151);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_151);
    return false;
  }

  private boolean _jspx_meth_fmt_message_152(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_152 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_152.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_152.setParent(null);
    _jspx_th_fmt_message_152.setKey("pointEdit.detectors.posCusumDet");
    int _jspx_eval_fmt_message_152 = _jspx_th_fmt_message_152.doStartTag();
    if (_jspx_th_fmt_message_152.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_152);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_152);
    return false;
  }

  private boolean _jspx_meth_fmt_message_153(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_153 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_153.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_153.setParent(null);
    _jspx_th_fmt_message_153.setKey("common.xid");
    int _jspx_eval_fmt_message_153 = _jspx_th_fmt_message_153.doStartTag();
    if (_jspx_th_fmt_message_153.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_153);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_153);
    return false;
  }

  private boolean _jspx_meth_fmt_message_154(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_154 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_154.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_154.setParent(null);
    _jspx_th_fmt_message_154.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_154 = _jspx_th_fmt_message_154.doStartTag();
    if (_jspx_th_fmt_message_154.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_154);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_154);
    return false;
  }

  private boolean _jspx_meth_fmt_message_155(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_155 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_155.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_155.setParent(null);
    _jspx_th_fmt_message_155.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_155 = _jspx_th_fmt_message_155.doStartTag();
    if (_jspx_th_fmt_message_155.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_155);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_155);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_10 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_10      );
    }
    _jspx_th_tag_alarmLevelOptions_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_10.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_10.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_10.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_24 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_24      );
    }
    _jspx_th_tag_img_24.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_24.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_24.setPng("flag_green");
    _jspx_th_tag_img_24.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_24.setStyle("display:none;");
    _jspx_th_tag_img_24.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_156(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_156 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_156.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_156.setParent(null);
    _jspx_th_fmt_message_156.setKey("pointEdit.detectors.posLimit");
    int _jspx_eval_fmt_message_156 = _jspx_th_fmt_message_156.doStartTag();
    if (_jspx_th_fmt_message_156.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_156);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_156);
    return false;
  }

  private boolean _jspx_meth_fmt_message_157(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_157 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_157.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_157.setParent(null);
    _jspx_th_fmt_message_157.setKey("pointEdit.detectors.weight");
    int _jspx_eval_fmt_message_157 = _jspx_th_fmt_message_157.doStartTag();
    if (_jspx_th_fmt_message_157.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_157);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_157);
    return false;
  }

  private boolean _jspx_meth_fmt_message_158(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_158 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_158.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_158.setParent(null);
    _jspx_th_fmt_message_158.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_158 = _jspx_th_fmt_message_158.doStartTag();
    if (_jspx_th_fmt_message_158.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_158);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_158);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_13 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_13      );
    }
    _jspx_th_tag_timePeriods_13.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_13.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_13.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_13.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_13.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_13.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_13.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_25 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_25      );
    }
    _jspx_th_tag_img_25.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_25.setPng("delete");
    _jspx_th_tag_img_25.setTitle("common.delete");
    _jspx_th_tag_img_25.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_25.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_159(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_159 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_159.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_159.setParent(null);
    _jspx_th_fmt_message_159.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_159 = _jspx_th_fmt_message_159.doStartTag();
    if (_jspx_th_fmt_message_159.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_159);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_159);
    return false;
  }

  private boolean _jspx_meth_fmt_message_160(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_160 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_160.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_160.setParent(null);
    _jspx_th_fmt_message_160.setKey("pointEdit.detectors.negCusumDet");
    int _jspx_eval_fmt_message_160 = _jspx_th_fmt_message_160.doStartTag();
    if (_jspx_th_fmt_message_160.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_160);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_160);
    return false;
  }

  private boolean _jspx_meth_fmt_message_161(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_161 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_161.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_161.setParent(null);
    _jspx_th_fmt_message_161.setKey("common.xid");
    int _jspx_eval_fmt_message_161 = _jspx_th_fmt_message_161.doStartTag();
    if (_jspx_th_fmt_message_161.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_161);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_161);
    return false;
  }

  private boolean _jspx_meth_fmt_message_162(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_162 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_162.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_162.setParent(null);
    _jspx_th_fmt_message_162.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_162 = _jspx_th_fmt_message_162.doStartTag();
    if (_jspx_th_fmt_message_162.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_162);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_162);
    return false;
  }

  private boolean _jspx_meth_fmt_message_163(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_163 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_163.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_163.setParent(null);
    _jspx_th_fmt_message_163.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_163 = _jspx_th_fmt_message_163.doStartTag();
    if (_jspx_th_fmt_message_163.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_163);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_163);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_11 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_11      );
    }
    _jspx_th_tag_alarmLevelOptions_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_11.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_11.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_11.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_26 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_26      );
    }
    _jspx_th_tag_img_26.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_26.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_26.setPng("flag_green");
    _jspx_th_tag_img_26.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_26.setStyle("display:none;");
    _jspx_th_tag_img_26.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_164(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_164 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_164.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_164.setParent(null);
    _jspx_th_fmt_message_164.setKey("pointEdit.detectors.negLimit");
    int _jspx_eval_fmt_message_164 = _jspx_th_fmt_message_164.doStartTag();
    if (_jspx_th_fmt_message_164.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_164);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_164);
    return false;
  }

  private boolean _jspx_meth_fmt_message_165(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_165 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_165.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_165.setParent(null);
    _jspx_th_fmt_message_165.setKey("pointEdit.detectors.weight");
    int _jspx_eval_fmt_message_165 = _jspx_th_fmt_message_165.doStartTag();
    if (_jspx_th_fmt_message_165.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_165);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_165);
    return false;
  }

  private boolean _jspx_meth_fmt_message_166(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_166 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_166.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_166.setParent(null);
    _jspx_th_fmt_message_166.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_166 = _jspx_th_fmt_message_166.doStartTag();
    if (_jspx_th_fmt_message_166.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_166);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_166);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_14 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_14      );
    }
    _jspx_th_tag_timePeriods_14.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_14.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_14.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_14.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_14.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_14.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_14.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_167(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_167 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_167.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_167.setParent(null);
    _jspx_th_fmt_message_167.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_167 = _jspx_th_fmt_message_167.doStartTag();
    if (_jspx_th_fmt_message_167.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_167);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_167);
    return false;
  }

  private boolean _jspx_meth_fmt_message_168(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_168 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_168.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_168.setParent(null);
    _jspx_th_fmt_message_168.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_168 = _jspx_th_fmt_message_168.doStartTag();
    if (_jspx_th_fmt_message_168.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_168);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_168);
    return false;
  }

  private boolean _jspx_meth_fmt_message_169(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_169 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_169.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_169.setParent(null);
    _jspx_th_fmt_message_169.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_169 = _jspx_th_fmt_message_169.doStartTag();
    if (_jspx_th_fmt_message_169.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_169);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_169);
    return false;
  }

  private boolean _jspx_meth_fmt_message_170(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_170 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_170.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_170.setParent(null);
    _jspx_th_fmt_message_170.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_170 = _jspx_th_fmt_message_170.doStartTag();
    if (_jspx_th_fmt_message_170.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_170);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_170);
    return false;
  }

  private boolean _jspx_meth_fmt_message_171(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_171 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_171.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_171.setParent(null);
    _jspx_th_fmt_message_171.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_171 = _jspx_th_fmt_message_171.doStartTag();
    if (_jspx_th_fmt_message_171.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_171);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_171);
    return false;
  }

  private boolean _jspx_meth_fmt_message_172(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_172 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_172.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_172.setParent(null);
    _jspx_th_fmt_message_172.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_172 = _jspx_th_fmt_message_172.doStartTag();
    if (_jspx_th_fmt_message_172.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_172);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_172);
    return false;
  }

  private boolean _jspx_meth_fmt_message_173(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_173 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_173.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_173.setParent(null);
    _jspx_th_fmt_message_173.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_173 = _jspx_th_fmt_message_173.doStartTag();
    if (_jspx_th_fmt_message_173.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_173);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_173);
    return false;
  }

  private boolean _jspx_meth_fmt_message_174(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_174 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_174.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_174.setParent(null);
    _jspx_th_fmt_message_174.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_174 = _jspx_th_fmt_message_174.doStartTag();
    if (_jspx_th_fmt_message_174.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_174);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_174);
    return false;
  }

  private boolean _jspx_meth_fmt_message_175(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_175 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_175.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_175.setParent(null);
    _jspx_th_fmt_message_175.setKey("pointEdit.detectors.errorParsingState");
    int _jspx_eval_fmt_message_175 = _jspx_th_fmt_message_175.doStartTag();
    if (_jspx_th_fmt_message_175.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_175);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_175);
    return false;
  }

  private boolean _jspx_meth_fmt_message_176(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_176 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_176.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_176.setParent(null);
    _jspx_th_fmt_message_176.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_176 = _jspx_th_fmt_message_176.doStartTag();
    if (_jspx_th_fmt_message_176.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_176);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_176);
    return false;
  }

  private boolean _jspx_meth_fmt_message_177(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_177 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_177.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_177.setParent(null);
    _jspx_th_fmt_message_177.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_177 = _jspx_th_fmt_message_177.doStartTag();
    if (_jspx_th_fmt_message_177.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_177);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_177);
    return false;
  }

  private boolean _jspx_meth_fmt_message_178(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_178 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_178.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_178.setParent(null);
    _jspx_th_fmt_message_178.setKey("pointEdit.detectors.errorParsingChangeCount");
    int _jspx_eval_fmt_message_178 = _jspx_th_fmt_message_178.doStartTag();
    if (_jspx_th_fmt_message_178.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_178);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_178);
    return false;
  }

  private boolean _jspx_meth_fmt_message_179(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_179 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_179.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_179.setParent(null);
    _jspx_th_fmt_message_179.setKey("pointEdit.detectors.invalidChangeCount");
    int _jspx_eval_fmt_message_179 = _jspx_th_fmt_message_179.doStartTag();
    if (_jspx_th_fmt_message_179.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_179);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_179);
    return false;
  }

  private boolean _jspx_meth_fmt_message_180(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_180 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_180.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_180.setParent(null);
    _jspx_th_fmt_message_180.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_180 = _jspx_th_fmt_message_180.doStartTag();
    if (_jspx_th_fmt_message_180.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_180);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_180);
    return false;
  }

  private boolean _jspx_meth_fmt_message_181(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_181 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_181.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_181.setParent(null);
    _jspx_th_fmt_message_181.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_181 = _jspx_th_fmt_message_181.doStartTag();
    if (_jspx_th_fmt_message_181.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_181);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_181);
    return false;
  }

  private boolean _jspx_meth_fmt_message_182(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_182 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_182.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_182.setParent(null);
    _jspx_th_fmt_message_182.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_182 = _jspx_th_fmt_message_182.doStartTag();
    if (_jspx_th_fmt_message_182.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_182);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_182);
    return false;
  }

  private boolean _jspx_meth_fmt_message_183(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_183 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_183.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_183.setParent(null);
    _jspx_th_fmt_message_183.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_183 = _jspx_th_fmt_message_183.doStartTag();
    if (_jspx_th_fmt_message_183.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_183);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_183);
    return false;
  }

  private boolean _jspx_meth_fmt_message_184(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_184 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_184.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_184.setParent(null);
    _jspx_th_fmt_message_184.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_184 = _jspx_th_fmt_message_184.doStartTag();
    if (_jspx_th_fmt_message_184.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_184);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_184);
    return false;
  }

  private boolean _jspx_meth_fmt_message_185(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_185 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_185.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_185.setParent(null);
    _jspx_th_fmt_message_185.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_185 = _jspx_th_fmt_message_185.doStartTag();
    if (_jspx_th_fmt_message_185.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_185);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_185);
    return false;
  }

  private boolean _jspx_meth_fmt_message_186(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_186 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_186.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_186.setParent(null);
    _jspx_th_fmt_message_186.setKey("pointEdit.detectors.invalidState");
    int _jspx_eval_fmt_message_186 = _jspx_th_fmt_message_186.doStartTag();
    if (_jspx_th_fmt_message_186.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_186);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_186);
    return false;
  }

  private boolean _jspx_meth_fmt_message_187(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_187 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_187.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_187.setParent(null);
    _jspx_th_fmt_message_187.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_187 = _jspx_th_fmt_message_187.doStartTag();
    if (_jspx_th_fmt_message_187.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_187);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_187);
    return false;
  }

  private boolean _jspx_meth_fmt_message_188(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_188 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_188.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_188.setParent(null);
    _jspx_th_fmt_message_188.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_188 = _jspx_th_fmt_message_188.doStartTag();
    if (_jspx_th_fmt_message_188.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_188);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_188);
    return false;
  }

  private boolean _jspx_meth_fmt_message_189(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_189 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_189.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_189.setParent(null);
    _jspx_th_fmt_message_189.setKey("pointEdit.detectors.invalidState");
    int _jspx_eval_fmt_message_189 = _jspx_th_fmt_message_189.doStartTag();
    if (_jspx_th_fmt_message_189.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_189);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_189);
    return false;
  }

  private boolean _jspx_meth_fmt_message_190(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_190 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_190.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_190.setParent(null);
    _jspx_th_fmt_message_190.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_190 = _jspx_th_fmt_message_190.doStartTag();
    if (_jspx_th_fmt_message_190.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_190);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_190);
    return false;
  }

  private boolean _jspx_meth_fmt_message_191(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_191 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_191.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_191.setParent(null);
    _jspx_th_fmt_message_191.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_191 = _jspx_th_fmt_message_191.doStartTag();
    if (_jspx_th_fmt_message_191.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_191);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_191);
    return false;
  }

  private boolean _jspx_meth_fmt_message_192(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_192 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_192.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_192.setParent(null);
    _jspx_th_fmt_message_192.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_192 = _jspx_th_fmt_message_192.doStartTag();
    if (_jspx_th_fmt_message_192.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_192);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_192);
    return false;
  }

  private boolean _jspx_meth_fmt_message_193(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_193 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_193.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_193.setParent(null);
    _jspx_th_fmt_message_193.setKey("pointEdit.detectors.errorParsingWeight");
    int _jspx_eval_fmt_message_193 = _jspx_th_fmt_message_193.doStartTag();
    if (_jspx_th_fmt_message_193.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_193);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_193);
    return false;
  }

  private boolean _jspx_meth_fmt_message_194(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_194 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_194.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_194.setParent(null);
    _jspx_th_fmt_message_194.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_194 = _jspx_th_fmt_message_194.doStartTag();
    if (_jspx_th_fmt_message_194.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_194);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_194);
    return false;
  }

  private boolean _jspx_meth_fmt_message_195(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_195 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_195.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_195.setParent(null);
    _jspx_th_fmt_message_195.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_195 = _jspx_th_fmt_message_195.doStartTag();
    if (_jspx_th_fmt_message_195.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_195);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_195);
    return false;
  }

  private boolean _jspx_meth_fmt_message_196(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_196 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_196.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_196.setParent(null);
    _jspx_th_fmt_message_196.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_196 = _jspx_th_fmt_message_196.doStartTag();
    if (_jspx_th_fmt_message_196.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_196);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_196);
    return false;
  }

  private boolean _jspx_meth_fmt_message_197(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_197 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_197.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_197.setParent(null);
    _jspx_th_fmt_message_197.setKey("pointEdit.detectors.errorParsingWeight");
    int _jspx_eval_fmt_message_197 = _jspx_th_fmt_message_197.doStartTag();
    if (_jspx_th_fmt_message_197.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_197);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_197);
    return false;
  }

  private boolean _jspx_meth_fmt_message_198(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_198 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_198.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_198.setParent(null);
    _jspx_th_fmt_message_198.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_198 = _jspx_th_fmt_message_198.doStartTag();
    if (_jspx_th_fmt_message_198.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_198);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_198);
    return false;
  }

  private boolean _jspx_meth_fmt_message_199(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_199 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_199.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_199.setParent(null);
    _jspx_th_fmt_message_199.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_199 = _jspx_th_fmt_message_199.doStartTag();
    if (_jspx_th_fmt_message_199.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_199);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_199);
    return false;
  }
}
