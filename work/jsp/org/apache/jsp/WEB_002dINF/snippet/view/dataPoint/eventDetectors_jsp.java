package org.apache.jsp.WEB_002dINF.snippet.view.dataPoint;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.vo.event.PointEventDetectorVO;

public final class eventDetectors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(6);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
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
      out.write("\n\n<div>\n  <table>\n    <tr><td colspan=\"2\">\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</span>\n      ");
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("\n    </td></tr>\n    \n    <tr>\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</td>\n      <td class=\"formField\">\n        <input id=\"eventDetectorSelect\"></input>\n        ");
      if (_jspx_meth_tag_img_0(_jspx_page_context))
        return;
      out.write("\n      </td>\n    </tr>\n    \n    <tr><td colspan=\"2\">\n      <div id=\"emptyListMessage\" style=\"color:#888888;padding:10px;text-align:center;\">\n        ");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("\n      </div>\n    </td></tr>\n   \n  </table>\n  <table id=\"eventDetectorTable\"></table>\n  \n  <table style=\"display:none;\">\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_1(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_0(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_0(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_3(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_1(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_4(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_16(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_1(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_5(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_17(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_21(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_2(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_6(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_22(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <select id=\"eventDetector_TEMPLATE_State\">\n            <option value=\"false\">");
      if (_jspx_meth_fmt_message_23(_jspx_page_context))
        return;
      out.write("</option>\n            <option value=\"true\">");
      if (_jspx_meth_fmt_message_24(_jspx_page_context))
        return;
      out.write("</option>\n          </select>\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_25(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_2(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_7(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_26(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_27(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_28(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_29(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_30(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_3(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_8(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_31(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_32(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_3(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_9(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_33(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_34(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_35(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_36(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_37(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_4(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_10(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_11(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_38(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_39(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_40(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_41(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_42(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_5(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_12(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_43(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_ChangeCount\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_44(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_4(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_13(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_45(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_46(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_47(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_48(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_49(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_6(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_14(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_50(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_5(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_15(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_51(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_52(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_53(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_54(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_55(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_7(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_16(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_56(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_6(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_17(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_57(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_58(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_59(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_60(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_61(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_8(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_18(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_62(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_63(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_7(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_REGEX_STATE );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_19(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_64(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_65(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_66(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_67(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_68(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_9(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_20(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_69(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_70(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_8(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_21(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_71(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_72(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_73(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_74(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_75(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_10(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_22(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_76(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_77(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Weight\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_78(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_9(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\n    </tbody>\n    \n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write("\">\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\n      <tr>\n        <td class=\"formLabelRequired\">\n          ");
      if (_jspx_meth_tag_img_23(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_fmt_message_79(_jspx_page_context))
        return;
      out.write("\n        </td>\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_80(_jspx_page_context))
        return;
      out.write("</td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_81(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_82(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_83(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_11(_jspx_page_context))
        return;
      out.write("\n          ");
      if (_jspx_meth_tag_img_24(_jspx_page_context))
        return;
      out.write("\n        </td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_84(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_85(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Weight\" type=\"text\" class=\"formShort\"/></td>\n      </tr>\n      <tr>\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_86(_jspx_page_context))
        return;
      out.write("</td>\n        <td class=\"formField\">\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\n          ");
      if (_jspx_meth_tag_timePeriods_10(_jspx_page_context))
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
      if (_jspx_meth_fmt_message_87(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_88(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_89(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateHighLimitDetector(pedId, xid, alias, limit, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_90(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_91(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_92(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateLowLimitDetector(pedId, xid, alias, limit, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write(") {\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_93(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_94(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateBinaryStateDetector(pedId, xid, alias, state, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write(") {\n                  var state = parseInt($get(\"eventDetector\"+ pedId +\"State\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(state))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_95(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_96(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_97(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateMultistateStateDetector(pedId, xid, alias, state, duration, durationType,\n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write(") {\n                  saveCBCount++;\n                  DataPointEditDwr.updatePointChangeDetector(pedId, xid, alias, alarmLevel, saveCB);\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write(") {\n                  var count = parseInt($get(\"eventDetector\"+ pedId +\"ChangeCount\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(count))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_98(_jspx_page_context))
        return;
      out.write("\";\n                  else if (count < 2)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_99(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_100(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 1)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_101(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateStateChangeCountDetector(pedId, xid, alias, count, duration, durationType, \n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write(") {\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_102(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 1)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_103(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateNoChangeDetector(pedId, xid, alias, duration, durationType, alarmLevel,\n                              saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write(") {\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_104(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 1)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_105(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateNoUpdateDetector(pedId, xid, alias, duration, durationType, alarmLevel,\n                              saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write(") {\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (state && state.length > 128)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_106(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_107(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_108(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateAlphanumericStateDetector(pedId, xid, alias, state, duration, durationType, \n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_REGEX_STATE );
      out.write(") {\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (state && state.length > 128)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_109(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_110(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_111(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateAlphanumericRegexStateDetector(pedId, xid, alias, state, duration, durationType, \n                              alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var weight = parseFloat($get(\"eventDetector\"+ pedId +\"Weight\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_112(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(weight))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_113(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_114(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_115(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updatePositiveCusumDetector(pedId, xid, alias, limit, weight, duration,\n                              durationType, alarmLevel, saveCB);\n                  }\n              }\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write(") {\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\n                  var weight = parseFloat($get(\"eventDetector\"+ pedId +\"Weight\"));\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\n                  \n                  if (isNaN(limit))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_116(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(weight))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_117(_jspx_page_context))
        return;
      out.write("\";\n                  else if (isNaN(duration))\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_118(_jspx_page_context))
        return;
      out.write("\";\n                  else if (duration < 0)\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_119(_jspx_page_context))
        return;
      out.write("\";\n                  else {\n                      saveCBCount++;\n                      DataPointEditDwr.updateNegativeCusumDetector(pedId, xid, alias, limit, weight, duration,\n                              durationType, alarmLevel, saveCB);\n                  }\n              }\n              \n              if (errorMessage != null) {\n                  runSaveCallback = false;\n                  $(\"eventDetector\"+ pedId +\"ErrorMessage\").innerHTML = errorMessage;\n              }\n              else\n                  $(\"eventDetector\"+ pedId +\"ErrorMessage\").innerHTML = \"\";\n          }\n          dwr.engine.endBatch();\n      \n          // If no save calls were made, continue by calling the callback.\n          if (runSaveCallback && saveCBCount == 0)\n              callback();\n      };\n      \n      function saveCB() {\n          if (--saveCBCount == 0) {\n              // We're done with the callbacks. If there were no errors, call the callback.\n              if (runSaveCallback)\n                  saveCallback();\n          }\n");
      out.write("      }\n  }\n  var pointEventDetectorEditor = new PointEventDetectorEditor();\n  \n</script>");
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
    _jspx_th_fmt_message_0.setKey("pointEdit.detectors.eventDetectors");
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
    _jspx_th_tag_help_0.setId("eventDetectors");
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
    _jspx_th_fmt_message_1.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
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
    _jspx_th_tag_img_0.setOnclick("pointEventDetectorEditor.addEventDetector();");
    _jspx_th_tag_img_0.doTag();
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
    _jspx_th_fmt_message_2.setKey("pointEdit.detectors.empty");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
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
    _jspx_th_tag_img_1.setPng("delete");
    _jspx_th_tag_img_1.setTitle("common.delete");
    _jspx_th_tag_img_1.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_1.doTag();
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
    _jspx_th_fmt_message_3.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_4.setKey("pointEdit.detectors.highLimitDet");
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
    _jspx_th_fmt_message_5.setKey("common.xid");
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
    _jspx_th_fmt_message_6.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_7.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
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
    _jspx_th_tag_img_2.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_2.setPng("flag_green");
    _jspx_th_tag_img_2.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_2.setStyle("display:none;");
    _jspx_th_tag_img_2.doTag();
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
    _jspx_th_fmt_message_8.setKey("pointEdit.detectors.highLimit");
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
    _jspx_th_fmt_message_9.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
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
    _jspx_th_tag_timePeriods_0.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
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

  private boolean _jspx_meth_fmt_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(null);
    _jspx_th_fmt_message_10.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_11.setKey("pointEdit.detectors.lowLimitDet");
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
    _jspx_th_fmt_message_12.setKey("common.xid");
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
    _jspx_th_fmt_message_13.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
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
    _jspx_th_fmt_message_14.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
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

  private boolean _jspx_meth_fmt_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(null);
    _jspx_th_fmt_message_15.setKey("pointEdit.detectors.lowLimit");
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
    _jspx_th_fmt_message_16.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
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
    _jspx_th_tag_timePeriods_1.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_1.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_1.doTag();
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

  private boolean _jspx_meth_fmt_message_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(null);
    _jspx_th_fmt_message_17.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_18.setKey("pointEdit.detectors.stateDet");
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
    _jspx_th_fmt_message_19.setKey("common.xid");
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
    _jspx_th_fmt_message_20.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_21.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
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

  private boolean _jspx_meth_fmt_message_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent(null);
    _jspx_th_fmt_message_22.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
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
    _jspx_th_fmt_message_23.setKey("pointEdit.detectors.zero");
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
    _jspx_th_fmt_message_24.setKey("pointEdit.detectors.one");
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
    _jspx_th_fmt_message_25.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
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
    _jspx_th_tag_timePeriods_2.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_2.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_2.doTag();
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

  private boolean _jspx_meth_fmt_message_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent(null);
    _jspx_th_fmt_message_26.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_27.setKey("pointEdit.detectors.stateDet");
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
    _jspx_th_fmt_message_28.setKey("common.xid");
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
    _jspx_th_fmt_message_29.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_30.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
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

  private boolean _jspx_meth_fmt_message_31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent(null);
    _jspx_th_fmt_message_31.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
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
    _jspx_th_fmt_message_32.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
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
    _jspx_th_tag_timePeriods_3.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_3.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_3.doTag();
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

  private boolean _jspx_meth_fmt_message_33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent(null);
    _jspx_th_fmt_message_33.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_34.setKey("pointEdit.detectors.changeDet");
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
    _jspx_th_fmt_message_35.setKey("common.xid");
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
    _jspx_th_fmt_message_36.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
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
    _jspx_th_fmt_message_37.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
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

  private boolean _jspx_meth_fmt_message_38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent(null);
    _jspx_th_fmt_message_38.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_39.setKey("pointEdit.detectors.changeCounter");
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
    _jspx_th_fmt_message_40.setKey("common.xid");
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
    _jspx_th_fmt_message_41.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_42.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
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

  private boolean _jspx_meth_fmt_message_43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent(null);
    _jspx_th_fmt_message_43.setKey("pointEdit.detectors.changeCount");
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
    _jspx_th_fmt_message_44.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
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

  private boolean _jspx_meth_fmt_message_45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent(null);
    _jspx_th_fmt_message_45.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_46.setKey("pointEdit.detectors.noChange");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
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
    _jspx_th_fmt_message_47.setKey("common.xid");
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
    _jspx_th_fmt_message_48.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_49.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_49 = _jspx_th_fmt_message_49.doStartTag();
    if (_jspx_th_fmt_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
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

  private boolean _jspx_meth_fmt_message_50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_50.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_50.setParent(null);
    _jspx_th_fmt_message_50.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_50 = _jspx_th_fmt_message_50.doStartTag();
    if (_jspx_th_fmt_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
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

  private boolean _jspx_meth_fmt_message_51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_51 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_51.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_51.setParent(null);
    _jspx_th_fmt_message_51.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_52.setKey("pointEdit.detectors.noUpdate");
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
    _jspx_th_fmt_message_53.setKey("common.xid");
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
    _jspx_th_fmt_message_54.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_55.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_55 = _jspx_th_fmt_message_55.doStartTag();
    if (_jspx_th_fmt_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
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

  private boolean _jspx_meth_fmt_message_56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_56 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_56.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_56.setParent(null);
    _jspx_th_fmt_message_56.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_56 = _jspx_th_fmt_message_56.doStartTag();
    if (_jspx_th_fmt_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
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

  private boolean _jspx_meth_fmt_message_57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_57 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_57.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_57.setParent(null);
    _jspx_th_fmt_message_57.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_58.setKey("pointEdit.detectors.stateDet");
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
    _jspx_th_fmt_message_59.setKey("common.xid");
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
    _jspx_th_fmt_message_60.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_61.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_61 = _jspx_th_fmt_message_61.doStartTag();
    if (_jspx_th_fmt_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
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

  private boolean _jspx_meth_fmt_message_62(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_62 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_62.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_62.setParent(null);
    _jspx_th_fmt_message_62.setKey("pointEdit.detectors.state");
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
    _jspx_th_fmt_message_63.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_63 = _jspx_th_fmt_message_63.doStartTag();
    if (_jspx_th_fmt_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
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

  private boolean _jspx_meth_fmt_message_64(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_64 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_64.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_64.setParent(null);
    _jspx_th_fmt_message_64.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_64 = _jspx_th_fmt_message_64.doStartTag();
    if (_jspx_th_fmt_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
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
    _jspx_th_fmt_message_65.setKey("pointEdit.detectors.stateDet");
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
    _jspx_th_fmt_message_66.setKey("common.xid");
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
    _jspx_th_fmt_message_67.setKey("pointEdit.detectors.alias");
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
    _jspx_th_fmt_message_68.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_68 = _jspx_th_fmt_message_68.doStartTag();
    if (_jspx_th_fmt_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
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

  private boolean _jspx_meth_fmt_message_69(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_69 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_69.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_69.setParent(null);
    _jspx_th_fmt_message_69.setKey("pointEdit.detectors.regexState");
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
    _jspx_th_fmt_message_70.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_70 = _jspx_th_fmt_message_70.doStartTag();
    if (_jspx_th_fmt_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
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

  private boolean _jspx_meth_fmt_message_71(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_71 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_71.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_71.setParent(null);
    _jspx_th_fmt_message_71.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_72.setKey("pointEdit.detectors.posCusumDet");
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
    _jspx_th_fmt_message_73.setKey("common.xid");
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
    _jspx_th_fmt_message_74.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_74 = _jspx_th_fmt_message_74.doStartTag();
    if (_jspx_th_fmt_message_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
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
    _jspx_th_fmt_message_75.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_75 = _jspx_th_fmt_message_75.doStartTag();
    if (_jspx_th_fmt_message_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
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

  private boolean _jspx_meth_fmt_message_76(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_76 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_76.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_76.setParent(null);
    _jspx_th_fmt_message_76.setKey("pointEdit.detectors.posLimit");
    int _jspx_eval_fmt_message_76 = _jspx_th_fmt_message_76.doStartTag();
    if (_jspx_th_fmt_message_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
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
    _jspx_th_fmt_message_77.setKey("pointEdit.detectors.weight");
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
    _jspx_th_fmt_message_78.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_78 = _jspx_th_fmt_message_78.doStartTag();
    if (_jspx_th_fmt_message_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
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

  private boolean _jspx_meth_fmt_message_79(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_79 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_79.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_79.setParent(null);
    _jspx_th_fmt_message_79.setKey("pointEdit.detectors.type");
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
    _jspx_th_fmt_message_80.setKey("pointEdit.detectors.negCusumDet");
    int _jspx_eval_fmt_message_80 = _jspx_th_fmt_message_80.doStartTag();
    if (_jspx_th_fmt_message_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
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
    _jspx_th_fmt_message_81.setKey("common.xid");
    int _jspx_eval_fmt_message_81 = _jspx_th_fmt_message_81.doStartTag();
    if (_jspx_th_fmt_message_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
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
    _jspx_th_fmt_message_82.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_82 = _jspx_th_fmt_message_82.doStartTag();
    if (_jspx_th_fmt_message_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
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
    _jspx_th_fmt_message_83.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_83 = _jspx_th_fmt_message_83.doStartTag();
    if (_jspx_th_fmt_message_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
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

  private boolean _jspx_meth_fmt_message_84(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_84 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_84.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_84.setParent(null);
    _jspx_th_fmt_message_84.setKey("pointEdit.detectors.negLimit");
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
    _jspx_th_fmt_message_85.setKey("pointEdit.detectors.weight");
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
    _jspx_th_fmt_message_86.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_86 = _jspx_th_fmt_message_86.doStartTag();
    if (_jspx_th_fmt_message_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
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

  private boolean _jspx_meth_fmt_message_87(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_87 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_87.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_87.setParent(null);
    _jspx_th_fmt_message_87.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_87 = _jspx_th_fmt_message_87.doStartTag();
    if (_jspx_th_fmt_message_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
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
    _jspx_th_fmt_message_88.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_89.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_89 = _jspx_th_fmt_message_89.doStartTag();
    if (_jspx_th_fmt_message_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
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
    _jspx_th_fmt_message_90.setKey("pointEdit.detectors.errorParsingLimit");
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
    _jspx_th_fmt_message_91.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_92.setKey("pointEdit.detectors.invalidDuration");
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
    _jspx_th_fmt_message_93.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_94.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_94 = _jspx_th_fmt_message_94.doStartTag();
    if (_jspx_th_fmt_message_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
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
    _jspx_th_fmt_message_95.setKey("pointEdit.detectors.errorParsingState");
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
    _jspx_th_fmt_message_96.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_96 = _jspx_th_fmt_message_96.doStartTag();
    if (_jspx_th_fmt_message_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
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
    _jspx_th_fmt_message_97.setKey("pointEdit.detectors.invalidDuration");
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
    _jspx_th_fmt_message_98.setKey("pointEdit.detectors.errorParsingChangeCount");
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
    _jspx_th_fmt_message_99.setKey("pointEdit.detectors.invalidChangeCount");
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
    _jspx_th_fmt_message_100.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_101.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_101 = _jspx_th_fmt_message_101.doStartTag();
    if (_jspx_th_fmt_message_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
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
    _jspx_th_fmt_message_102.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_103.setKey("pointEdit.detectors.invalidDuration");
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
    _jspx_th_fmt_message_104.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_105.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_105 = _jspx_th_fmt_message_105.doStartTag();
    if (_jspx_th_fmt_message_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
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
    _jspx_th_fmt_message_106.setKey("pointEdit.detectors.invalidState");
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
    _jspx_th_fmt_message_107.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_108.setKey("pointEdit.detectors.invalidDuration");
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
    _jspx_th_fmt_message_109.setKey("pointEdit.detectors.invalidState");
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
    _jspx_th_fmt_message_110.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_110 = _jspx_th_fmt_message_110.doStartTag();
    if (_jspx_th_fmt_message_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
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
    _jspx_th_fmt_message_111.setKey("pointEdit.detectors.invalidDuration");
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
    _jspx_th_fmt_message_112.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_112 = _jspx_th_fmt_message_112.doStartTag();
    if (_jspx_th_fmt_message_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
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
    _jspx_th_fmt_message_113.setKey("pointEdit.detectors.errorParsingWeight");
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
    _jspx_th_fmt_message_114.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_115.setKey("pointEdit.detectors.invalidDuration");
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
    _jspx_th_fmt_message_116.setKey("pointEdit.detectors.errorParsingLimit");
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
    _jspx_th_fmt_message_117.setKey("pointEdit.detectors.errorParsingWeight");
    int _jspx_eval_fmt_message_117 = _jspx_th_fmt_message_117.doStartTag();
    if (_jspx_th_fmt_message_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
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
    _jspx_th_fmt_message_118.setKey("pointEdit.detectors.errorParsingDuration");
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
    _jspx_th_fmt_message_119.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_119 = _jspx_th_fmt_message_119.doStartTag();
    if (_jspx_th_fmt_message_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
    return false;
  }
}
