package org.apache.jsp.modules.graphicalViews.web.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class graphicRendererEditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_convert_obj_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_convert_obj_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sst_convert_obj_nobody.release();
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
      out.write("\n<div id=\"graphicRendererEditorPopup\" style=\"display:none;left:0px;top:0px;\" class=\"windowDiv\">\n  <table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n    <table width=\"100%\">\n      <tr>\n        <td>\n          ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n          <span class=\"copyTitle\" id=\"graphicsComponentName\"></span>\n        </td>\n        <td align=\"right\">\n          ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("&nbsp;\n          ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n    </table>\n    \n    <table>\n      <tbody id=\"graphicRenderer_analogGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererAnalogMin\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererAnalogMax\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererAnalogDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererAnalogImageSet\" onchange=\"graphicRendererEditor.updateSampleImageSet(this)\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n            </select><br/>\n            <img id=\"graphicRendererAnalogImageSetSample\"/>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_binaryGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererBinaryDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererBinaryImageSet\" onchange=\"graphicRendererEditor.displayBinaryImages($get(this));\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n            </select>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <div id=\"graphicRendererBinaryImageSetZero\" style=\"width:200px; overflow:auto; white-space:nowrap;\"></div>\n            <input type=\"hidden\" id=\"graphicRendererBinaryImageSetZeroMsg\"/>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <div id=\"graphicRendererBinaryImageSetOne\" style=\"width:200px; overflow:auto; white-space:nowrap;\"></div>\n            <input type=\"hidden\" id=\"graphicRendererBinaryImageSetOneMsg\"/>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_dynamicGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererDynamicMin\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererDynamicMax\" type=\"text\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererDynamicDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererDynamicImage\" onchange=\"graphicRendererEditor.updateSampleDynamicImage(this)\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n            </select><br/>\n            <img id=\"graphicRendererDynamicImageSample\"/>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_multistateGraphic\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererMultistateDisplayText\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("</td>\n          <td>\n            <select id=\"graphicRendererMultistateImageSet\" onchange=\"graphicRendererEditor.displayMultistateImages($get(this));\">\n              <option value=\"\"></option>\n              ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n            </select>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_17(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\" id=\"graphicRendererMultistateImageSetList\">\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_script\" style=\"display:none;\">\n        <tr>\n          <td colspan=\"2\">\n            <span class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("</span><br/>\n            <span class=\"formField\"><textarea id=\"graphicRendererScriptScript\" rows=\"10\" cols=\"50\"></textarea></span>\n          </td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_simpleImage\" style=\"display:none;\">\n        <tr><td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("</td></tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_simple\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererSimpleDisplayPointName\" type=\"checkbox\"/></td>\n        </tr>\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_21(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererSimpleStyleAttribute\" type=\"text\"/></td>\n        </tr>\n      </tbody>\n      \n      <tbody id=\"graphicRenderer_thumbnailImage\" style=\"display:none;\">\n        <tr>\n          <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_22(_jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"graphicRendererThumbnailScalePercent\" type=\"text\"/></td>\n        </tr>\n      </tbody>\n    </table>\n  </td></tr></table>\n  \n  <script type=\"text/javascript\">\n    // Script requires\n    //  - Drag and Drop library for locating objects and positioning the window.\n    //  - DWR utils for using $() prototype.\n    //  - common.js\n    function GraphicRendererEditor() {\n        this.currentImageSetId = null;\n        this.zeroImage = -1;\n        this.oneImage = -1;\n        this.componentId = null;\n        this.typeName = null;\n        this.imageSets = ");
      if (_jspx_meth_sst_convert_0(_jspx_page_context))
        return;
      out.write(";\n        this.dynamicImages = ");
      if (_jspx_meth_sst_convert_1(_jspx_page_context))
        return;
      out.write(";\n        \n        this.open = function(compId) {\n            graphicRendererEditor.currentImageSetId = null;\n            graphicRendererEditor.zeroImage = -1;\n            graphicRendererEditor.oneImage = -1;\n        \n            graphicRendererEditor.componentId = compId;\n            \n            // Set the renderers for the data type of this point view.\n            GraphicalViewDwr.getViewComponent(compId, graphicRendererEditor.setViewComponent);\n            \n            positionEditor(compId, \"graphicRendererEditorPopup\");\n        };\n        \n        this.setViewComponent = function(comp) {\n            graphicRendererEditor.typeName = comp.typeName;\n            $set(\"graphicsComponentName\", comp.displayName);\n            \n            // Clear the form data.\n            $set(\"graphicRendererBinaryDisplayText\");\n            $set(\"graphicRendererBinaryImageSet\");\n            $set(\"graphicRendererMultistateDisplayText\");\n            $set(\"graphicRendererMultistateImageSet\");\n            $set(\"graphicRendererAnalogMin\");\n");
      out.write("            $set(\"graphicRendererAnalogMax\");\n            $set(\"graphicRendererAnalogDisplayText\");\n            $set(\"graphicRendererAnalogImageSet\");\n            $set(\"graphicRendererThumbnailScalePercent\");\n            $set(\"graphicRendererDynamicMin\");\n            $set(\"graphicRendererDynamicMax\");\n            $set(\"graphicRendererDynamicDisplayText\");\n            $set(\"graphicRendererDynamicImage\");\n            $set(\"graphicRendererScriptScript\");\n            $set(\"graphicRendererSimpleDisplayPointName\");\n            $set(\"graphicRendererSimpleStyleAttribute\");\n            graphicRendererEditor.displayBinaryImages(null);\n            graphicRendererEditor.displayMultistateImages(null);\n            \n            // Update the data in the form.\n            if (comp.typeName == \"analogGraphic\") {\n                $set(\"graphicRendererAnalogMin\", comp.min);\n                $set(\"graphicRendererAnalogMax\", comp.max);\n                $set(\"graphicRendererAnalogDisplayText\", comp.displayText);\n                $set(\"graphicRendererAnalogImageSet\", comp.imageSetId);\n");
      out.write("                graphicRendererEditor.updateSampleImageSet($(\"graphicRendererAnalogImageSet\"));\n            }\n            else if (comp.typeName == \"binaryGraphic\") {\n                $set(\"graphicRendererBinaryDisplayText\", comp.displayText);\n                $set(\"graphicRendererBinaryImageSet\", comp.imageSetId);\n                graphicRendererEditor.displayBinaryImages(comp.imageSetId);\n                graphicRendererEditor.setZeroImage(comp.zeroImage);\n                graphicRendererEditor.setOneImage(comp.oneImage);\n            }\n            else if (comp.typeName == \"dynamicGraphic\") {\n                $set(\"graphicRendererDynamicMin\", comp.min);\n                $set(\"graphicRendererDynamicMax\", comp.max);\n                $set(\"graphicRendererDynamicDisplayText\", comp.displayText);\n                $set(\"graphicRendererDynamicImage\", comp.dynamicImageId);\n            }\n            else if (comp.typeName == \"multistateGraphic\") {\n                $set(\"graphicRendererMultistateDisplayText\", comp.displayText);\n");
      out.write("                $set(\"graphicRendererMultistateImageSet\", comp.imageSetId);\n                graphicRendererEditor.displayMultistateImages(comp.imageSetId);\n                var imageStates = comp.imageStateList;\n                \n                var i=0;\n                while ($(\"graphicRendererMultistateState\"+ i))\n                    $set(\"graphicRendererMultistateState\"+ (i++), \"\");\n                for (var i=0; i<imageStates.length; i++)\n                    $set(\"graphicRendererMultistateState\"+ imageStates[i].key, imageStates[i].value);\n                $set(\"graphicRendererMultistateDefault\", comp.defaultImage);\n            }\n            else if (comp.typeName == \"script\")\n                $set(\"graphicRendererScriptScript\", comp.script);\n            else if (comp.typeName == \"simple\") {\n                $set(\"graphicRendererSimpleDisplayPointName\", comp.displayPointName);\n                $set(\"graphicRendererSimpleStyleAttribute\", comp.styleAttribute);\n            } else if (comp.typeName == \"thumbnailImage\")\n");
      out.write("                $set(\"graphicRendererThumbnailScalePercent\", comp.scalePercent);\n            \n            show(\"graphicRenderer_\"+ comp.typeName);\n            show(\"graphicRendererEditorPopup\");\n        };\n    \n        this.close = function() {\n            hide(\"graphicRendererEditorPopup\");\n            hideContextualMessages(\"graphicRendererEditorPopup\");\n            if (graphicRendererEditor.typeName)\n                hide(\"graphicRenderer_\"+ graphicRendererEditor.typeName);\n        };\n        \n        this.save = function() {\n            hideContextualMessages(\"graphicRendererEditorPopup\");\n            \n            if (graphicRendererEditor.typeName == \"analogGraphic\")\n                GraphicalViewDwr.saveAnalogGraphicComponent(graphicRendererEditor.componentId, $get(\"graphicRendererAnalogMin\"),\n                        $get(\"graphicRendererAnalogMax\"), $get(\"graphicRendererAnalogDisplayText\"),\n                        $get(\"graphicRendererAnalogImageSet\"), graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"binaryGraphic\")\n");
      out.write("                GraphicalViewDwr.saveBinaryGraphicComponent(graphicRendererEditor.componentId, graphicRendererEditor.zeroImage,\n                        graphicRendererEditor.oneImage, $get(\"graphicRendererBinaryDisplayText\"),\n                        $get(\"graphicRendererBinaryImageSet\"), graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"dynamicGraphic\")\n                GraphicalViewDwr.saveDynamicGraphicComponent(graphicRendererEditor.componentId,\n                        $get(\"graphicRendererDynamicMin\"), $get(\"graphicRendererDynamicMax\"),\n                        $get(\"graphicRendererDynamicDisplayText\"), $get(\"graphicRendererDynamicImage\"),\n                        graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"multistateGraphic\") {\n                var imageSet = $get(\"graphicRendererMultistateImageSet\");\n                var i = 0, j;\n                var imageStates = new Array();\n                if (imageSet) {\n                    while ($(\"graphicRendererMultistateState\"+ i)) {\n");
      out.write("                        text = $get(\"graphicRendererMultistateState\"+ i);\n                        if (text.trim() != \"\")\n                            imageStates[imageStates.length] = {key: i, value: text};\n                        i++;\n                    }\n                }\n                \n                GraphicalViewDwr.saveMultistateGraphicComponent(graphicRendererEditor.componentId, imageStates,\n                        $get(\"graphicRendererMultistateDefault\"), $get(\"graphicRendererMultistateDisplayText\"),\n                        imageSet, graphicRendererEditor.saveCB);\n            }\n            else if (graphicRendererEditor.typeName == \"script\")\n                GraphicalViewDwr.saveScriptComponent(graphicRendererEditor.componentId, $get(\"graphicRendererScriptScript\"),\n                        graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"simple\")\n                GraphicalViewDwr.saveSimplePointComponent(graphicRendererEditor.componentId,\n                        $get(\"graphicRendererSimpleDisplayPointName\"), \n");
      out.write("                        $get(\"graphicRendererSimpleStyleAttribute\"), graphicRendererEditor.saveCB);\n            else if (graphicRendererEditor.typeName == \"thumbnailImage\")\n                GraphicalViewDwr.saveThumbnailComponent(graphicRendererEditor.componentId,\n                        $get(\"graphicRendererThumbnailScalePercent\"), graphicRendererEditor.saveCB);\n            else\n                graphicRendererEditor.close();\n        };\n        \n        this.saveCB = function(response) {\n            if (response.hasMessages)\n                showDwrMessages(response.messages);\n            else {\n                graphicRendererEditor.close();\n                MiscDwr.notifyLongPoll(mango.longPoll.pollSessionId);\n            }\n        };\n        \n        this.displayBinaryImages = function(imageSetId) {\n            graphicRendererEditor.setZeroImage(-1);\n            graphicRendererEditor.setOneImage(-1);\n            graphicRendererEditor.currentImageSetId = imageSetId;\n            \n            var imageSet = graphicRendererEditor.findImageSet(imageSetId);\n");
      out.write("            if (imageSet) {\n                $set(\"graphicRendererBinaryImageSetZero\", graphicRendererEditor.createImageList(imageSet, \"Zero\"));\n                $set(\"graphicRendererBinaryImageSetOne\", graphicRendererEditor.createImageList(imageSet, \"One\"));\n            }\n            else {\n                $set(\"graphicRendererBinaryImageSetZero\");\n                $set(\"graphicRendererBinaryImageSetOne\");\n            }\n        };\n        \n        this.createImageList = function(imageSet, type) {\n            var html = \"\";\n            for (var i=0; i<imageSet.imageFilenames.length; i++) {\n                html += \"<a\\\n                  href='javascript:void(0)' onclick='graphicRendererEditor.set\"+ type +\"Image(\"+ i +\")'><img\\\n                    id='graphicRendererBinaryImageSet\"+ type + i +\"' src='\"+ imageSet.imageFilenames[i] +\"'\\\n                    style='display:inline;'/></a>&nbsp;\";\n            }\n            return html;\n        };\n        \n        this.displayMultistateImages = function(imageSetId) {\n            var imageSet = graphicRendererEditor.findImageSet(imageSetId);\n");
      out.write("            var graphicImg = '");
      if (_jspx_meth_tag_img_3(_jspx_page_context))
        return;
      out.write("';\n            if (imageSet) {\n                var html = \"\\\n                    <table>\\\n                      <tr>\\\n                        <th>");
      if (_jspx_meth_fmt_message_23(_jspx_page_context))
        return;
      out.write("</th>\\\n                        <th>");
      if (_jspx_meth_fmt_message_24(_jspx_page_context))
        return;
      out.write("</th>\\\n                        <th>");
      if (_jspx_meth_fmt_message_25(_jspx_page_context))
        return;
      out.write("</th>\\\n                      </tr>\";\n\n                for (var i=0; i<imageSet.imageFilenames.length; i++) {\n                    html += \"\\\n                        <tr>\\\n                          <td align='center'>\\\n                            <div onmouseover='show(\\\"graphicRendererMultistateImageSet\"+ i +\"\\\");'\\\n                                    onmouseout='hide(\\\"graphicRendererMultistateImageSet\"+ i +\"\\\");'\\\n                                    style='position:relative;display:inline;'>\"+ graphicImg +\"<div \\\n                                    id='graphicRendererMultistateImageSet\"+ i +\"' class='imageDiv'\\\n                                    style='display:none;top:18px;'><img src='\"+ imageSet.imageFilenames[i] +\"'/></div></div>\\\n                          </td>\\\n                          <td><input id='graphicRendererMultistateState\"+ i +\"' type='text' class='formShort'/></td>\\\n                          <td align='center'><input type='radio' name='graphicRendererMultistateDefault' value='\"+ i +\"'/></td>\\\n");
      out.write("                        </tr>\";\n                }\n                \n                html += \"</table>\";\n                \n                $set(\"graphicRendererMultistateImageSetList\", html);\n            }\n            else\n                $set(\"graphicRendererMultistateImageSetList\");\n        };\n        \n        this.setZeroImage = function(imageId) {\n            var image;\n            if (graphicRendererEditor.zeroImage != -1 && graphicRendererEditor.currentImageSetId)\n                dojo.removeClass(\"graphicRendererBinaryImageSetZero\"+ graphicRendererEditor.zeroImage, \"selectedImage\");\n            graphicRendererEditor.zeroImage = imageId;\n            if (graphicRendererEditor.zeroImage != -1 && graphicRendererEditor.currentImageSetId)\n                dojo.addClass(\"graphicRendererBinaryImageSetZero\"+ graphicRendererEditor.zeroImage, \"selectedImage\");\n        };\n        this.setOneImage = function(imageId) {\n            var image;\n            if (graphicRendererEditor.oneImage != -1 && graphicRendererEditor.currentImageSetId)\n");
      out.write("                dojo.removeClass(\"graphicRendererBinaryImageSetOne\"+ graphicRendererEditor.oneImage, \"selectedImage\");\n            graphicRendererEditor.oneImage = imageId;\n            if (graphicRendererEditor.oneImage != -1 && graphicRendererEditor.currentImageSetId)\n                dojo.addClass(\"graphicRendererBinaryImageSetOne\"+ graphicRendererEditor.oneImage, \"selectedImage\");\n        };\n        \n        this.updateSampleImageSet = function(selectComp) {\n            var img = $(selectComp.id +\"Sample\");\n            var imageSet = graphicRendererEditor.findImageSet($get(selectComp));\n            if (imageSet) {\n                img.src = imageSet.imageFilenames[0];\n                show(img);\n            }\n            else\n                hide(img);\n        };\n        \n        this.updateSampleDynamicImage = function(selectComp) {\n            var img = $(selectComp.id +\"Sample\");\n            var dynamicImage = graphicRendererEditor.findDynamicImage($get(selectComp));\n            if (dynamicImage) {\n                img.src = dynamicImage.imageFilename;\n");
      out.write("                show(img);\n            }\n            else\n                hide(img);\n        };\n        \n        this.findImageSet = function(id) {\n            for (var i=0; i<graphicRendererEditor.imageSets.length; i++) {\n                if (graphicRendererEditor.imageSets[i].id == id)\n                    return graphicRendererEditor.imageSets[i];\n            }\n            return null;\n        };\n        \n        this.findDynamicImage = function(id) {\n            for (var i=0; i<graphicRendererEditor.dynamicImages.length; i++) {\n                if (graphicRendererEditor.dynamicImages[i].id == id)\n                    return graphicRendererEditor.dynamicImages[i];\n            }\n            return null;\n        };\n    }\n    var graphicRendererEditor = new GraphicRendererEditor();\n  </script>\n</div>");
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
    _jspx_th_tag_img_0.setPng("graphic");
    _jspx_th_tag_img_0.setTitle("viewEdit.graphic.editor");
    _jspx_th_tag_img_0.setStyle("display:inline;");
    _jspx_th_tag_img_0.doTag();
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
    _jspx_th_tag_img_1.setPng("save");
    _jspx_th_tag_img_1.setOnclick("graphicRendererEditor.save()");
    _jspx_th_tag_img_1.setTitle("common.save");
    _jspx_th_tag_img_1.setStyle("display:inline;");
    _jspx_th_tag_img_1.doTag();
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
    _jspx_th_tag_img_2.setPng("cross");
    _jspx_th_tag_img_2.setOnclick("graphicRendererEditor.close()");
    _jspx_th_tag_img_2.setTitle("common.close");
    _jspx_th_tag_img_2.setStyle("display:inline;");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("viewEdit.graphic.min");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_fmt_message_1.setKey("viewEdit.graphic.max");
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
    _jspx_th_fmt_message_2.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_3.setKey("viewEdit.graphic.imageSet");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("imageSet");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(")</option>\n              ");
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

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_message_4.setKey("viewEdit.graphic.images");
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
    _jspx_th_fmt_message_5.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_6.setKey("viewEdit.graphic.imageSet");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("imageSet");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write(")</option>\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_fmt_message_7.setKey("viewEdit.graphic.images");
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
    _jspx_th_fmt_message_8.setKey("viewEdit.graphic.zero");
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
    _jspx_th_fmt_message_9.setKey("viewEdit.graphic.one");
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
    _jspx_th_fmt_message_10.setKey("viewEdit.graphic.min");
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
    _jspx_th_fmt_message_11.setKey("viewEdit.graphic.max");
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
    _jspx_th_fmt_message_12.setKey("viewEdit.graphic.displayText");
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
    _jspx_th_fmt_message_13.setKey("viewEdit.graphic.dynamicImage");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("dynamicImage");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImage.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
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
    _jspx_th_fmt_message_14.setKey("viewEdit.graphic.displayText");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
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
    _jspx_th_fmt_message_15.setKey("viewEdit.graphic.imageSet");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("imageSet");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSet.imageCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write(")</option>\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_fmt_message_16.setKey("viewEdit.graphic.images");
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
    _jspx_th_fmt_message_17.setKey("viewEdit.graphic.state");
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
    _jspx_th_fmt_message_18.setKey("viewEdit.graphic.script");
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
    _jspx_th_fmt_message_19.setKey("viewEdit.graphic.noConfig");
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
    _jspx_th_fmt_message_20.setKey("viewEdit.graphic.displayPointName");
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
    _jspx_th_fmt_message_21.setKey("viewEdit.graphic.styleAttribute");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
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
    _jspx_th_fmt_message_22.setKey("viewEdit.graphic.scale");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_sst_convert_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_0 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_0.setParent(null);
    _jspx_th_sst_convert_0.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${imageSets}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_convert_0 = _jspx_th_sst_convert_0.doStartTag();
    if (_jspx_th_sst_convert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
      return true;
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_0);
    return false;
  }

  private boolean _jspx_meth_sst_convert_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:convert
    com.serotonin.web.taglib.DwrConvertTag _jspx_th_sst_convert_1 = (com.serotonin.web.taglib.DwrConvertTag) _jspx_tagPool_sst_convert_obj_nobody.get(com.serotonin.web.taglib.DwrConvertTag.class);
    _jspx_th_sst_convert_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_convert_1.setParent(null);
    _jspx_th_sst_convert_1.setObj((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dynamicImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_convert_1 = _jspx_th_sst_convert_1.doStartTag();
    if (_jspx_th_sst_convert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_1);
      return true;
    }
    _jspx_tagPool_sst_convert_obj_nobody.reuse(_jspx_th_sst_convert_1);
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
    _jspx_th_tag_img_3.setPng("graphic");
    _jspx_th_tag_img_3.setTitle("viewEdit.graphic.imageSample");
    _jspx_th_tag_img_3.setStyle("display:inline;");
    _jspx_th_tag_img_3.doTag();
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
    _jspx_th_fmt_message_23.setKey("viewEdit.graphic.image");
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
    _jspx_th_fmt_message_24.setKey("viewEdit.graphic.stateList");
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
    _jspx_th_fmt_message_25.setKey("viewEdit.graphic.default");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }
}
