package org.apache.jsp.WEB_002dINF.snippet.view.dataPoint;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class textRenderer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n<div>\n  <table>\n    <tr><td colspan=\"3\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"textRendererSelect\" />\n      </td>\n    </tr>\n    \n    <tbody id=\"suffixRow\">\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n            <input id=\"useUnitAsSuffix\" data-dojo-type=\"dijit/form/CheckBox\" type=\"checkbox\" />\n            <label for=\"useUnitAsSuffix\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</label>\n        </td>\n      </tr>\n      <tr>\n        <td></td>\n        <td class=\"formField\"><input id=\"suffix\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"formatRow\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"format\" type=\"text\"/>\n          <div id=\"datetimeFormatHelpDiv\">");
      if (_jspx_meth_tag_help_1(_jspx_page_context))
        return;
      out.write("</div>\n        </td>\n      </tr>\n     </tbody>\n    <tbody id=\"conversionExponentRow\">\n       <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"conversionExponent\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    \n      <tbody id=\"binaryValuesRow\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <table cellspacing=\"0\" cellpadding=\"0\">\n            <tr>\n              <td valign=\"top\"><input id=\"zeroLabel\" type=\"text\"/></td>\n              <td width=\"10\"></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"zeroColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerBinaryZeroColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n            </tr>\n          </table>\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <table cellspacing=\"0\" cellpadding=\"0\">\n            <tr>\n              <td valign=\"top\"><input id=\"oneLabel\" type=\"text\"/></td>\n              <td width=\"10\"></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"oneColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerBinaryOneColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n            </tr>\n          </table>\n        </td>\n      </tr>\n    </tbody>\n    <tbody id=\"multistateValuesRow\" style=\"display:none;\">\n      <tr>\n        <td colspan=\"2\">\n          <table>\n            <tr>\n              <th>");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("</th>\n              <td></td>\n            </tr>\n            <tr>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererMultistateKey\" value=\"\" class=\"formVeryShort\"/></td>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererMultistateText\" value=\"\" class=\"formShort\"/></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererMultistateColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerMultistateColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n              <td valign=\"top\">\n                ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            <tbody id=\"textRendererMultistateTable\"></tbody>\n          </table>\n        </td>\n      </tr>\n    </tbody>  \n    \n    \n    \n    <!--  I think we can delete this -->\n    <tbody id=\"textRendererAnalog\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"textRendererAnalogFormat\" type=\"text\"/>\n          ");
      if (_jspx_meth_tag_help_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"textRendererAnalogSuffix\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    \n\n    <tbody id=\"textRendererNone\" style=\"display:none;\">\n    </tbody>\n    <tbody id=\"textRendererPlain\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_16(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"textRendererPlainSuffix\" type=\"text\"/></td>\n      </tr>\n    </tbody>\n    <tbody id=\"rangeValuesRow\" style=\"display:none;\">\n      <tr>\n        <td colspan=\"2\">\n          <table id=\"rangeValues\"> <!-- For contextual field -->\n            <tr>\n              <th>");
      if (_jspx_meth_fmt_message_17(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("</th>\n              <th>");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("</th>\n              <td></td>\n            </tr>\n            <tr>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeFrom\" value=\"\" class=\"formVeryShort\"/></td>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeTo\" value=\"\" class=\"formVeryShort\"/></td>\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeText\" value=\"\"/></td>\n              <td valign=\"top\" align=\"center\">\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererRangeColour\"></div>\n                <a href=\"#\" onclick=\"textRendererEditor.handlerRangeColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_21(_jspx_page_context))
        return;
      out.write(")</a>\n              </td>\n              <td valign=\"top\">\n                ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("\n              </td>\n            </tr>\n            <tbody id=\"textRendererRangeTable\"></tbody>\n          </table>\n        </td>\n      </tr>\n    </tbody>\n    <tbody id=\"textRendererTime\" style=\"display:none;\">\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_22(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"textRendererTimeFormat\" type=\"text\"/>\n          ");
      if (_jspx_meth_tag_help_3(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_23(_jspx_page_context))
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
      if (_jspx_meth_fmt_message_24(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          for (var i=this.multistateValues.length-1; i>=0; i--) {\n              if (this.multistateValues[i].key == theNumericKey) {\n                  alert(\"");
      if (_jspx_meth_fmt_message_25(_jspx_page_context))
        return;
      out.write(" \"+ theNumericKey);\n                  return false;\n              }\n          }\n          \n          var theValue = new this.MultistateValue();\n          theValue.key = theNumericKey;\n          if (text)\n              theValue.text = text;\n          else\n              theValue.text = $get(\"textRendererMultistateText\");\n          if (colour)\n              theValue.colour = colour;\n          else\n              theValue.colour = dijit.byId(\"textRendererMultistateColour\").selectedColour;\n          this.multistateValues[this.multistateValues.length] = theValue;\n          this.sortMultistateValues();\n          this.refreshMultistateList();\n          $set(\"textRendererMultistateKey\", theNumericKey+1);\n          \n          return false;\n      };\n      \n      this.removeMultistateValue = function(theValue) {\n          for (var i=this.multistateValues.length-1; i>=0; i--) {\n              if (this.multistateValues[i].key == theValue)\n                  this.multistateValues.splice(i, 1);\n          }\n          this.refreshMultistateList();\n");
      out.write("          return false;\n      };\n      \n      this.sortMultistateValues = function() {\n          this.multistateValues.sort( function(a,b) { return a.key-b.key; } );\n      };\n      \n      this.refreshMultistateList = function() {\n          dwr.util.removeAllRows(\"textRendererMultistateTable\");\n          dwr.util.addRows(\"textRendererMultistateTable\", this.multistateValues, [\n                  function(data) { return data.key; },\n                  function(data) { \n                      if (data.colour)\n                          return \"<span style='color:\"+ data.colour +\"'>\"+ data.text +\"</span>\";\n                      return data.text;\n                  },\n                  function(data) {\n                      return \"<a href='#' onclick='return textRendererEditor.removeMultistateValue(\"+ data.key +\n                             \");'><img src='images/bullet_delete.png' width='16' height='16' \"+\n                             \"title='");
      if (_jspx_meth_fmt_message_26(_jspx_page_context))
        return;
      out.write("'/><\\/a>\";\n                  }\n                  ], null);\n      };\n      \n      /*\n       * Set the range values from the vo's list\n       */\n      this.setRangeValues = function(list){\n          //Clear the list\n          this.rangeValues = new Array();\n          this.refreshRangeList();\n          for(var i=0; i<list.length; i++){\n              this.addRangeValue(list[i].from,list[i].to,list[i].text,list[i].colour);\n          }\n\n      }\n      \n      \n      //\n      // Range list manipulation\n      this.addRangeValue = function(theFrom, theTo, text, colour) {\n          if (typeof theFrom === 'undefined')\n              theFrom = parseFloat($get(\"textRendererRangeFrom\"));\n          if (isNaN(theFrom)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_27(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          \n          if (typeof theTo === 'undefined')\n              theTo = parseFloat($get(\"textRendererRangeTo\"));\n          if (isNaN(theTo)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_28(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          \n          if (isNaN(theTo >= theFrom)) {\n              alert(\"");
      if (_jspx_meth_fmt_message_29(_jspx_page_context))
        return;
      out.write("\");\n              return false;\n          }\n          \n          for (var i=0; i<this.rangeValues.length; i++) {\n              if (this.rangeValues[i].from == theFrom && this.rangeValues[i].to == theTo) {\n                  alert(\"");
      if (_jspx_meth_fmt_message_30(_jspx_page_context))
        return;
      out.write(" \"+ theFrom +\" - \"+ theTo);\n                  return false;\n              }\n          }\n          \n          var theValue = new this.RangeValue();\n          theValue.from = theFrom;\n          theValue.to = theTo;\n          if (text)\n              theValue.text = text;\n          else\n              theValue.text = $get(\"textRendererRangeText\");\n          if (colour)\n              theValue.colour = colour;\n          else\n              theValue.colour = dijit.byId(\"textRendererRangeColour\").selectedColour;\n          this.rangeValues[this.rangeValues.length] = theValue;\n          this.sortRangeValues();\n          this.refreshRangeList();\n          $set(\"textRendererRangeFrom\", theTo);\n          $set(\"textRendererRangeTo\", theTo + (theTo - theFrom));\n          return false;\n      };\n      \n      this.removeRangeValue = function(theFrom, theTo) {\n          for (var i=this.rangeValues.length-1; i>=0; i--) {\n              if (this.rangeValues[i].from == theFrom && this.rangeValues[i].to == theTo)\n                  this.rangeValues.splice(i, 1);\n");
      out.write("          }\n          this.refreshRangeList();\n          return false;\n      };\n      \n      this.sortRangeValues = function() {\n          this.rangeValues.sort( function(a,b) {\n              if (a.from == b.from)\n                  return a.to-b.to;\n              return a.from-b.from;\n          });\n      };\n      \n      this.refreshRangeList = function() {\n          dwr.util.removeAllRows(\"textRendererRangeTable\");\n          dwr.util.addRows(\"textRendererRangeTable\", this.rangeValues, [\n                  function(data) { return data.from; },\n                  function(data) { return data.to; },\n                  function(data) { \n                      if (data.colour)\n                          return \"<span style='color:\"+ data.colour +\"'>\"+ data.text +\"</span>\";\n                      return data.text;\n                  },\n                  function(data) {\n                      return \"<a href='#' onclick='return textRendererEditor.removeRangeValue(\"+\n                             data.from +\",\"+ data.to +\");'><img src='images/bullet_delete.png' width='16' \"+\n");
      out.write("                             \"height='16' title='");
      if (_jspx_meth_fmt_message_31(_jspx_page_context))
        return;
      out.write("'/><\\/a>\";\n                  }\n                  ], null);\n      };\n      \n      //\n      // Color handling\n      this.handlerRangeColour = function(colour) {\n          dijit.byId(\"textRendererRangeColour\").selectedColour = colour;\n          $(\"textRendererRangeText\").style.color = colour;\n      };\n      this.handlerMultistateColour = function(colour) {\n          dijit.byId(\"textRendererMultistateColour\").selectedColour = colour;\n          $(\"textRendererMultistateText\").style.color = colour;\n      };\n      this.handlerBinaryZeroColour = function(colour) {\n          dijit.byId(\"zeroColour\").selectedColour = colour;\n          $(\"zeroLabel\").style.color = colour;\n      };\n      this.handlerBinaryOneColour = function(colour) {\n          dijit.byId(\"oneColour\").selectedColour = colour;\n          $(\"oneLabel\").style.color = colour;\n      };\n  }\n  var textRendererEditor = new TextRendererEditor();\n  \n  \n  \n</script>");
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
    _jspx_th_fmt_message_0.setKey("pointEdit.text.props");
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
    _jspx_th_tag_help_0.setId("textRenderers");
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
    _jspx_th_fmt_message_1.setKey("pointEdit.text.type");
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
    _jspx_th_fmt_message_2.setKey("pointEdit.text.suffix");
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
    _jspx_th_fmt_message_3.setKey("pointEdit.props.useUnitAsSuffix");
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
    _jspx_th_fmt_message_4.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_tag_help_1.setId("datetimeFormats");
    _jspx_th_tag_help_1.doTag();
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
    _jspx_th_fmt_message_5.setKey("pointEdit.text.conversionExponent");
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
    _jspx_th_fmt_message_6.setKey("pointEdit.text.zero");
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
    _jspx_th_fmt_message_7.setKey("pointEdit.text.default");
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
    _jspx_th_fmt_message_8.setKey("pointEdit.text.one");
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
    _jspx_th_fmt_message_9.setKey("pointEdit.text.default");
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
    _jspx_th_fmt_message_10.setKey("pointEdit.text.key");
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
    _jspx_th_fmt_message_11.setKey("pointEdit.text.text");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
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
    _jspx_th_fmt_message_12.setKey("pointEdit.text.colour");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(null);
    _jspx_th_fmt_message_13.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
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

  private boolean _jspx_meth_fmt_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(null);
    _jspx_th_fmt_message_14.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
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
    _jspx_th_tag_help_2.setId("numberFormats");
    _jspx_th_tag_help_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(null);
    _jspx_th_fmt_message_15.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(null);
    _jspx_th_fmt_message_16.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(null);
    _jspx_th_fmt_message_17.setKey("pointEdit.text.from");
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
    _jspx_th_fmt_message_18.setKey("pointEdit.text.to");
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
    _jspx_th_fmt_message_19.setKey("pointEdit.text.text");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
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
    _jspx_th_fmt_message_20.setKey("pointEdit.text.colour");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent(null);
    _jspx_th_fmt_message_21.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
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

  private boolean _jspx_meth_fmt_message_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent(null);
    _jspx_th_fmt_message_22.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
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
    _jspx_th_tag_help_3.setId("datetimeFormats");
    _jspx_th_tag_help_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent(null);
    _jspx_th_fmt_message_23.setKey("pointEdit.text.conversionExponent");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent(null);
    _jspx_th_fmt_message_24.setKey("pointEdit.text.errorParsingKey");
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
    _jspx_th_fmt_message_25.setKey("pointEdit.text.listContainsKey");
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
    _jspx_th_fmt_message_26.setKey("common.delete");
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
    _jspx_th_fmt_message_27.setKey("pointEdit.text.errorParsingFrom");
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
    _jspx_th_fmt_message_28.setKey("pointEdit.text.errorParsingTo");
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
    _jspx_th_fmt_message_29.setKey("pointEdit.text.toGreaterThanFrom");
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
    _jspx_th_fmt_message_30.setKey("pointEdit.text.listContainsRange");
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
    _jspx_th_fmt_message_31.setKey("common.delete");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }
}
