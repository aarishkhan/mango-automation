package org.apache.jsp.modules.modbusPublisher.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.infiniteautomation.modbus.pub.vo.ModbusIpPublisherVO;
import com.serotonin.modbus4j.code.RegisterRange;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.m2m2.DataTypes;

public final class editModbusIpPublisher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(5);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/m2m2.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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

      out.write("\n\n\n\n\n\n");
      out.write("\n\n<script type=\"text/javascript\">\n  dojo.require(\"dojo.store.Memory\");\n  dojo.require(\"dijit.form.FilteringSelect\");\n  dojo.require(\"dijit.form.ComboBox\");\n  \n  var registerTypes = {data: [\n           {name: '");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("', id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(null);
      _jspx_th_c_out_0.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write("},\n           {name: '");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("', id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(null);
      _jspx_th_c_out_1.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write("},\n           {name: '");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("', id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_2.setPageContext(_jspx_page_context);
      _jspx_th_c_out_2.setParent(null);
      _jspx_th_c_out_2.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
      if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      out.write("},\n           {name: '");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("', id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_3.setPageContext(_jspx_page_context);
      _jspx_th_c_out_3.setParent(null);
      _jspx_th_c_out_3.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
      if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      out.write("},\n           \n       ]};\n  var modbusDataTypes = { data :[\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_4.setPageContext(_jspx_page_context);
      _jspx_th_c_out_4.setParent(null);
      _jspx_th_c_out_4.setValue( DataType.BINARY );
      int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
      if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_5.setPageContext(_jspx_page_context);
      _jspx_th_c_out_5.setParent(null);
      _jspx_th_c_out_5.setValue( DataType.TWO_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
      if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_6.setPageContext(_jspx_page_context);
      _jspx_th_c_out_6.setParent(null);
      _jspx_th_c_out_6.setValue( DataType.TWO_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
      if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_7.setPageContext(_jspx_page_context);
      _jspx_th_c_out_7.setParent(null);
      _jspx_th_c_out_7.setValue( DataType.TWO_BYTE_BCD );
      int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
      if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_8.setPageContext(_jspx_page_context);
      _jspx_th_c_out_8.setParent(null);
      _jspx_th_c_out_8.setValue( DataType.FOUR_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
      if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_9.setPageContext(_jspx_page_context);
      _jspx_th_c_out_9.setParent(null);
      _jspx_th_c_out_9.setValue( DataType.FOUR_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
      if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_10.setPageContext(_jspx_page_context);
      _jspx_th_c_out_10.setParent(null);
      _jspx_th_c_out_10.setValue( DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
      if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_11.setPageContext(_jspx_page_context);
      _jspx_th_c_out_11.setParent(null);
      _jspx_th_c_out_11.setValue( DataType.FOUR_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
      if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_12.setPageContext(_jspx_page_context);
      _jspx_th_c_out_12.setParent(null);
      _jspx_th_c_out_12.setValue( DataType.FOUR_BYTE_FLOAT );
      int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
      if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_13.setPageContext(_jspx_page_context);
      _jspx_th_c_out_13.setParent(null);
      _jspx_th_c_out_13.setValue( DataType.FOUR_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
      if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_14.setPageContext(_jspx_page_context);
      _jspx_th_c_out_14.setParent(null);
      _jspx_th_c_out_14.setValue( DataType.FOUR_BYTE_BCD );
      int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
      if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_15.setPageContext(_jspx_page_context);
      _jspx_th_c_out_15.setParent(null);
      _jspx_th_c_out_15.setValue( DataType.FOUR_BYTE_BCD_SWAPPED );
      int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
      if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_16.setPageContext(_jspx_page_context);
      _jspx_th_c_out_16.setParent(null);
      _jspx_th_c_out_16.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED );
      int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
      if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_16(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_17 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_17.setPageContext(_jspx_page_context);
      _jspx_th_c_out_17.setParent(null);
      _jspx_th_c_out_17.setValue( DataType.EIGHT_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_17 = _jspx_th_c_out_17.doStartTag();
      if (_jspx_th_c_out_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_17);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_17(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_18 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_18.setPageContext(_jspx_page_context);
      _jspx_th_c_out_18.setParent(null);
      _jspx_th_c_out_18.setValue( DataType.EIGHT_BYTE_INT_UNSIGNED_SWAPPED );
      int _jspx_eval_c_out_18 = _jspx_th_c_out_18.doStartTag();
      if (_jspx_th_c_out_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_18);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_19 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_19.setPageContext(_jspx_page_context);
      _jspx_th_c_out_19.setParent(null);
      _jspx_th_c_out_19.setValue( DataType.EIGHT_BYTE_INT_SIGNED_SWAPPED );
      int _jspx_eval_c_out_19 = _jspx_th_c_out_19.doStartTag();
      if (_jspx_th_c_out_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_19);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_20 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_20.setPageContext(_jspx_page_context);
      _jspx_th_c_out_20.setParent(null);
      _jspx_th_c_out_20.setValue( DataType.EIGHT_BYTE_FLOAT );
      int _jspx_eval_c_out_20 = _jspx_th_c_out_20.doStartTag();
      if (_jspx_th_c_out_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_20);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_21 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_21.setPageContext(_jspx_page_context);
      _jspx_th_c_out_21.setParent(null);
      _jspx_th_c_out_21.setValue( DataType.EIGHT_BYTE_FLOAT_SWAPPED );
      int _jspx_eval_c_out_21 = _jspx_th_c_out_21.doStartTag();
      if (_jspx_th_c_out_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_21);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_21(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_22 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_22.setPageContext(_jspx_page_context);
      _jspx_th_c_out_22.setParent(null);
      _jspx_th_c_out_22.setValue( DataType.CHAR );
      int _jspx_eval_c_out_22 = _jspx_th_c_out_22.doStartTag();
      if (_jspx_th_c_out_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_22);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_22(_jspx_page_context))
        return;
      out.write("'},\n                                 {id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_23 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_23.setPageContext(_jspx_page_context);
      _jspx_th_c_out_23.setParent(null);
      _jspx_th_c_out_23.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_23 = _jspx_th_c_out_23.doStartTag();
      if (_jspx_th_c_out_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_23);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_23(_jspx_page_context))
        return;
      out.write("'}\n\n                                 ]};  \n\n  var allPoints = [];  \n  var selectedPoints = [];  \n  var pointLookupText = \"\"; //For selection to remain in the filter\n\n  dojo.ready(function() { \n      ModbusPublisherDwr.initSender(function(response) {\n          dojo.forEach(response.data.allPoints, function(item) {\n              allPoints.push({\n                  id: item.id, \n                  name: item.extendedName, \n                  enabled: item.enabled, \n                  dataTypeString: item.dataTypeString,\n                  fancyName: item.extendedName,\n                  dataTypeId: item.pointLocator.dataTypeId\n              });\n          });\n          \n          dojo.forEach(response.data.publisher.points, function(item) {\n              addToSelectedArray(item.dataPointId, item.registerType, item.offset, item.registerCount, item.readOnly);\n          });\n          refreshSelectedPoints();\n          \n          // Create the lookup\n          new dijit.form.ComboBox({\n              store: new dojo.store.Memory({ data: allPoints }),\n");
      out.write("              labelAttr: \"fancyName\",\n              labelType: \"html\",\n              searchAttr: \"name\",\n              autoComplete: false,\n              style: \"width: 254px;\",\n              queryExpr: \"*${0}*\",\n              highlightMatch: \"all\",\n              required: false,\n              onChange: function(point) {\n                  if (this.item) {\n                      selectPoint(this.item.id);\n                      this.loadAndOpenDropDown();\n                      this.set('displayedValue',pointLookupText);\n                      if(typeof(this._startSearch) == 'function')\n                          this._startSearch(pointLookupText); //Dangerous because could change, but works!\n                  }\n              },\n              onKeyUp: function(event){\n                  pointLookupText = this.get('displayedValue');\n              }\n          }, \"pointLookup\");        \n      });\n  });\n  \n  function selectPoint(pointId) {\n      if (!containsPoint(pointId)) {\n          addToSelectedArray(pointId,0,0,0,true);\n");
      out.write("          refreshSelectedPoints();\n      }\n  }\n  \n  function containsPoint(pointId) {\n      return getElement(selectedPoints, pointId, \"id\") != null;\n  }\n  \n  function addToSelectedArray(pointId, registerType, offset, registerCount, readOnly) {\n      var data = getElement(allPoints, pointId);\n      \n      if (data) {\n          if(!checkRegisterType(registerType,data.dataTypeId)){\n        \t    alert('");
      if (_jspx_meth_fmt_message_24(_jspx_page_context))
        return;
      out.write("'); \n        \t    return;\n          }\n    \t  \n          var modbusDataTypeId;\n          switch(data.dataTypeId){\n              case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_24 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_24.setPageContext(_jspx_page_context);
      _jspx_th_c_out_24.setParent(null);
      _jspx_th_c_out_24.setValue( DataTypes.NUMERIC );
      int _jspx_eval_c_out_24 = _jspx_th_c_out_24.doStartTag();
      if (_jspx_th_c_out_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_24);
      out.write(":\n                  modbusDataTypeId = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_25 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_25.setPageContext(_jspx_page_context);
      _jspx_th_c_out_25.setParent(null);
      _jspx_th_c_out_25.setValue( DataType.EIGHT_BYTE_FLOAT );
      int _jspx_eval_c_out_25 = _jspx_th_c_out_25.doStartTag();
      if (_jspx_th_c_out_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_25);
      out.write(";\n                  if(registerCount == 0)\n                \t  registerCount = 4;\n              break;\n              case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_26 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_26.setPageContext(_jspx_page_context);
      _jspx_th_c_out_26.setParent(null);
      _jspx_th_c_out_26.setValue( DataTypes.BINARY );
      int _jspx_eval_c_out_26 = _jspx_th_c_out_26.doStartTag();
      if (_jspx_th_c_out_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_26);
      out.write(":\n            \t  modbusDataTypeId = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_27 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_27.setPageContext(_jspx_page_context);
      _jspx_th_c_out_27.setParent(null);
      _jspx_th_c_out_27.setValue( DataType.BINARY );
      int _jspx_eval_c_out_27 = _jspx_th_c_out_27.doStartTag();
      if (_jspx_th_c_out_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_27);
      out.write(";\n                  if(registerCount == 0)\n                      registerCount = 1;\n              break;\n              case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_28 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_28.setPageContext(_jspx_page_context);
      _jspx_th_c_out_28.setParent(null);
      _jspx_th_c_out_28.setValue( DataTypes.MULTISTATE );
      int _jspx_eval_c_out_28 = _jspx_th_c_out_28.doStartTag();
      if (_jspx_th_c_out_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_28);
      out.write(":\n                  modbusDataTypeId = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_29 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_29.setPageContext(_jspx_page_context);
      _jspx_th_c_out_29.setParent(null);
      _jspx_th_c_out_29.setValue( DataType.EIGHT_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_29 = _jspx_th_c_out_29.doStartTag();
      if (_jspx_th_c_out_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_29);
      out.write(";\n                  if(registerCount == 0)\n                      registerCount = 4;\n              break;\n              case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_30 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_30.setPageContext(_jspx_page_context);
      _jspx_th_c_out_30.setParent(null);
      _jspx_th_c_out_30.setValue( DataTypes.ALPHANUMERIC );
      int _jspx_eval_c_out_30 = _jspx_th_c_out_30.doStartTag();
      if (_jspx_th_c_out_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_30);
      out.write(":\n            \t  modbusDataTypeId = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_31 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_31.setPageContext(_jspx_page_context);
      _jspx_th_c_out_31.setParent(null);
      _jspx_th_c_out_31.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_31 = _jspx_th_c_out_31.doStartTag();
      if (_jspx_th_c_out_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_31);
      out.write(";\n                  if(registerCount == 0)\n                      registerCount = 8;\n              break;\n              default:\n            \t  alert('Unsupported Data Type');\n                  return;\n          }\n    \t  \n          data.fancyName = \"<span class='disabled'>\"+ data.name +\"</span>\";\n          \n          // Missing names imply that the point was deleted, so ignore.\n          selectedPoints[selectedPoints.length] = {\n              id : pointId,\n              pointName : data.name,\n              enabled : data.enabled,\n              dataTypeString : data.dataTypeString,\n              registerType : registerType,\n              modbusDataType: modbusDataTypeId,\n              offset : offset,\n              registerCount: registerCount,\n              readOnly: readOnly\n          };\n      }\n  }\n  \n  /**\n   * Check for valid register type for data type\n   */\n  function checkRegisterType(registerType,dataTypeId){\n\t  \n\t  if((registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_32 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_32.setPageContext(_jspx_page_context);
      _jspx_th_c_out_32.setParent(null);
      _jspx_th_c_out_32.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_32 = _jspx_th_c_out_32.doStartTag();
      if (_jspx_th_c_out_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_32);
      out.write(")||(registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_33 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_33.setPageContext(_jspx_page_context);
      _jspx_th_c_out_33.setParent(null);
      _jspx_th_c_out_33.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_33 = _jspx_th_c_out_33.doStartTag();
      if (_jspx_th_c_out_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_33);
      out.write(")){\n\t\t  //DataType Can only Be Binary\n\t\t  if(dataTypeId != ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_34 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_34.setPageContext(_jspx_page_context);
      _jspx_th_c_out_34.setParent(null);
      _jspx_th_c_out_34.setValue( DataTypes.BINARY );
      int _jspx_eval_c_out_34 = _jspx_th_c_out_34.doStartTag();
      if (_jspx_th_c_out_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_34);
      out.write(")\n\t\t\t  return false;\n\t\t  else\n\t\t\t  return true;\n\t  }else{\n\t\t  return true;\n\t  }\n\t  \n\t  \n  }\n  \n  /**\n   *  Is this register Type read only?\n   */\n  function isReadOnlyType(registerType){\n\t  if((registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_35 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_35.setPageContext(_jspx_page_context);
      _jspx_th_c_out_35.setParent(null);
      _jspx_th_c_out_35.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_35 = _jspx_th_c_out_35.doStartTag();
      if (_jspx_th_c_out_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_35);
      out.write(")\n\t\t\t  || (registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_36 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_36.setPageContext(_jspx_page_context);
      _jspx_th_c_out_36.setParent(null);
      _jspx_th_c_out_36.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_36 = _jspx_th_c_out_36.doStartTag();
      if (_jspx_th_c_out_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_36);
      out.write("))\n\t\t  return true;\n\t  else\n\t\t  return false;\n\t  \n  }\n  \n  function removeFromSelectedPoints(pointId) {\n      removeElement(selectedPoints, pointId);\n      refreshSelectedPoints();\n      \n      var data = getElement(allPoints, pointId);\n      if (data)\n          data.fancyName = data.name;\n  }\n  \n  function refreshSelectedPoints() {\n      dwr.util.removeAllRows(\"selectedPoints\");\n      if (selectedPoints.length == 0)\n          show(\"selectedPointsEmpty\");\n      else {\n          hide(\"selectedPointsEmpty\");\n          dwr.util.addRows(\"selectedPoints\", selectedPoints,\n              [\n                  function(data) { return data.pointName; },\n                  function(data) { return \"<img src='images/\"+ (data.enabled ? \"brick_go\" : \"brick_stop\") +\".png'/>\"; },\n                  function(data) { return data.dataTypeString; },\n                  function(data) { \n                \t  return null;\n                  },\n                  function(data) { \n                \t  return \"<input type='number' value='\" + data.offset + \"' onchange='updateOffset(\" + data.id +  \", this.value)' class='formShort'/>\"; \n");
      out.write("                  },\n                  function(data) {\n                \t  if(data.modbusDataType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_37 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_37.setPageContext(_jspx_page_context);
      _jspx_th_c_out_37.setParent(null);
      _jspx_th_c_out_37.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_37 = _jspx_th_c_out_37.doStartTag();
      if (_jspx_th_c_out_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_37);
      out.write(")\n                \t\t  return \"<input id='registerCountInput\" + data.id + \"' type='number' value='\" + data.registerCount + \"' onchange='updateRegisterCount(\" + data.id +  \", this.value)' class='formShort'/>\";\n                \t  else\n                \t\t  return \"<input id='registerCountInput\" + data.id + \"' type='number' value='\" + data.registerCount + \"' onchange='updateRegisterCount(\" + data.id +  \", this.value)' class='formShort' disabled />\";\n                  },\n                  function(data){\n                \t  var cantRead = isReadOnlyType(data.registerType);\n                \t  if(data.readOnly){\n                \t\t if(cantRead)\n                \t\t   return \"<input id='readOnlyChkbx\" + data.id + \"' type='checkbox' disabled checked onchange='updateReadOnly(\"+ data.id + \", this.checked)' class='formShort' />\";\n                \t\t else\n                \t\t\t return \"<input id='readOnlyChkbx\" + data.id + \"' type='checkbox' checked onchange='updateReadOnly(\"+ data.id + \", this.checked)' class='formShort' />\";\n                \t  }else\n");
      out.write("                \t\t  return \"<input type='checkbox' onchange='updateReadOnly(\" + data.id + \", this.checked)' class='formShort' />\";\n                  },\n                  function(data){\n                \t  return null;\n                  },\n                  function(data) { \n                          return \"<img src='images/bullet_delete.png' class='ptr' \"+\n                                  \"onclick='removeFromSelectedPoints(\"+ data.id +\")'/>\";\n                  }\n              ],\n              {\n                  rowCreator: function(options) {\n                      var tr = document.createElement(\"tr\");\n                      tr.className = \"row\"+ (options.rowIndex % 2 == 0 ? \"\" : \"Alt\");\n                      return tr;\n                  },\n                  cellCreator: function(options) {\n                      var td = document.createElement(\"td\");\n                      if (options.cellNum == 1 || options.cellNum == 3)\n                          td.align = \"center\";\n                      \n                      //Create the drop down for the cell\n");
      out.write("                      if (options.cellNum == 3){\n                    \t  \n                    \t  var myDiv = document.createElement(\"div\");\n                    \t  td.appendChild(myDiv);\n                    \t  \n                    \t  var fsId = \"dropDown_\" + options.rowData.id;\n                    \t  \n                    \t  var fs = dijit.byId(fsId);\n                    \t  if(!fs){\n\t                    \t // Create the lookup\n\t                    \t var regTypeStore = new dojo.store.Memory();\n\t                    \t var newRegisterRange;\n\t                    \t //Add Compatible Register Types\n\t                    \t switch(options.rowData.modbusDataType){\n\t                    \t \n\t                         case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_38 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_38.setPageContext(_jspx_page_context);
      _jspx_th_c_out_38.setParent(null);
      _jspx_th_c_out_38.setValue( DataType.BINARY );
      int _jspx_eval_c_out_38 = _jspx_th_c_out_38.doStartTag();
      if (_jspx_th_c_out_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_38);
      out.write(":\n                                 //Add Statuses\n                                 regTypeStore.put({id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_39 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_39.setPageContext(_jspx_page_context);
      _jspx_th_c_out_39.setParent(null);
      _jspx_th_c_out_39.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_39 = _jspx_th_c_out_39.doStartTag();
      if (_jspx_th_c_out_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_39);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_25(_jspx_page_context))
        return;
      out.write("'});\n                                 regTypeStore.put({id:");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_40 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_40.setPageContext(_jspx_page_context);
      _jspx_th_c_out_40.setParent(null);
      _jspx_th_c_out_40.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_40 = _jspx_th_c_out_40.doStartTag();
      if (_jspx_th_c_out_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_40);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_26(_jspx_page_context))
        return;
      out.write("'});\n                                 //Set Default Register Range\n                                 if((options.rowData.registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_41 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_41.setPageContext(_jspx_page_context);
      _jspx_th_c_out_41.setParent(null);
      _jspx_th_c_out_41.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_41 = _jspx_th_c_out_41.doStartTag();
      if (_jspx_th_c_out_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_41);
      out.write(")||(options.rowData.registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_42 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_42.setPageContext(_jspx_page_context);
      _jspx_th_c_out_42.setParent(null);
      _jspx_th_c_out_42.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_42 = _jspx_th_c_out_42.doStartTag();
      if (_jspx_th_c_out_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_42);
      out.write(")){\n                                     newRegisterRange = options.rowData.registerType;    \n                                 }else{\n                                     newRegisterRange = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_43 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_43.setPageContext(_jspx_page_context);
      _jspx_th_c_out_43.setParent(null);
      _jspx_th_c_out_43.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_43 = _jspx_th_c_out_43.doStartTag();
      if (_jspx_th_c_out_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_43);
      out.write(";\n                                     updateRegisterRange(options.rowData.id,newRegisterRange);\n                                 }\n\t                         break;\n\t\n\t                         case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_44 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_44.setPageContext(_jspx_page_context);
      _jspx_th_c_out_44.setParent(null);
      _jspx_th_c_out_44.setValue( DataType.EIGHT_BYTE_FLOAT );
      int _jspx_eval_c_out_44 = _jspx_th_c_out_44.doStartTag();
      if (_jspx_th_c_out_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_44);
      out.write(":\n\t                         case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_45 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_45.setPageContext(_jspx_page_context);
      _jspx_th_c_out_45.setParent(null);
      _jspx_th_c_out_45.setValue( DataType.EIGHT_BYTE_INT_SIGNED );
      int _jspx_eval_c_out_45 = _jspx_th_c_out_45.doStartTag();
      if (_jspx_th_c_out_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_45);
      out.write(":\n\t                         case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_46 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_46.setPageContext(_jspx_page_context);
      _jspx_th_c_out_46.setParent(null);
      _jspx_th_c_out_46.setValue( DataType.VARCHAR );
      int _jspx_eval_c_out_46 = _jspx_th_c_out_46.doStartTag();
      if (_jspx_th_c_out_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_46);
      out.write(":\n\t                              regTypeStore.put({id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_47 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_47.setPageContext(_jspx_page_context);
      _jspx_th_c_out_47.setParent(null);
      _jspx_th_c_out_47.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_47 = _jspx_th_c_out_47.doStartTag();
      if (_jspx_th_c_out_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_47);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_27(_jspx_page_context))
        return;
      out.write("' });\n\t                              regTypeStore.put({id: ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_48 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_48.setPageContext(_jspx_page_context);
      _jspx_th_c_out_48.setParent(null);
      _jspx_th_c_out_48.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_48 = _jspx_th_c_out_48.doStartTag();
      if (_jspx_th_c_out_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_48);
      out.write(", name: '");
      if (_jspx_meth_fmt_message_28(_jspx_page_context))
        return;
      out.write("'});\n\t                              \n\t                              if((options.rowData.registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_49 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_49.setPageContext(_jspx_page_context);
      _jspx_th_c_out_49.setParent(null);
      _jspx_th_c_out_49.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_49 = _jspx_th_c_out_49.doStartTag();
      if (_jspx_th_c_out_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_49);
      out.write(")||(options.rowData.registerType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_50 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_50.setPageContext(_jspx_page_context);
      _jspx_th_c_out_50.setParent(null);
      _jspx_th_c_out_50.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_50 = _jspx_th_c_out_50.doStartTag();
      if (_jspx_th_c_out_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_50);
      out.write(")){\n\t                                     newRegisterRange = options.rowData.registerType;  \n\n\t                              }else{\n                                      newRegisterRange = ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_51 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_51.setPageContext(_jspx_page_context);
      _jspx_th_c_out_51.setParent(null);
      _jspx_th_c_out_51.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_51 = _jspx_th_c_out_51.doStartTag();
      if (_jspx_th_c_out_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_51);
      out.write(";\n                                      updateRegisterRange(options.rowData.id,newRegisterRange);\n\t                              }\n\t                         break;\n\t                    \t }\n\t                    \t \n\t                         fs = new dijit.form.FilteringSelect({\n\t                              store: regTypeStore,\n\t                              id: fsId,\n\t                              value: newRegisterRange,\n\t                              labelAttr: \"name\",\n\t                              labelType: \"html\",\n\t                              searchAttr: \"name\",\n\t                              autoComplete: false,\n\t                              //style: \"width: 150px;\",\n\t                              queryExpr: \"*${0}*\",\n\t                              highlightMatch: \"all\",\n\t                              required: false,\n\t                              onChange: function(type) {\n\t                                  if (this.item) {\n\t                                      if(!updateRegisterRange(\"\" + options.rowData.id,this.item.id))\n");
      out.write("\t                                    \t  this.set('value',this._lastValueReported);\n\t                                  }\n\t                              }\n\t                          });\n                    \t  }//Didn't have to create it\n                    \t  fs.placeAt(myDiv);\n                    \t  fs.startup();\n                      }\n                      \n                    //Create the drop down for the cell\n                      if (options.cellNum == 7){\n                          \n                          var myDiv = document.createElement(\"div\");\n                          td.appendChild(myDiv);\n                          \n                          var fsId = \"modbusDataType_\" + options.rowData.id;\n                          var fs = dijit.byId(fsId);\n                          if(!fs){\n\t                         // Create the lookup\n\t                            fs = new dijit.form.FilteringSelect({\n\t                              store: new dojo.store.Memory(modbusDataTypes),\n\t                              id: fsId,\n");
      out.write("\t                              value: options.rowData.modbusDataType,\n\t                              labelAttr: \"name\",\n\t                              labelType: \"html\",\n\t                              searchAttr: \"name\",\n\t                              autoComplete: false,\n\t                              //style: \"width: 150px;\",\n\t                              queryExpr: \"*${0}*\",\n\t                              highlightMatch: \"all\",\n\t                              disabled: true,\n\t                              required: false,\n\t                              onChange: function(type) {\n\t                                  if (this.item) {\n\t                                      updateModbusDataType(\"\" + options.rowData.id,this.item.id);\n\t                                  }\n\t                              }\n\t                          });\n                          }//Didn't have to create it\n                          fs.placeAt(myDiv);\n                          fs.startup();\n                      }\n                      \n");
      out.write("                      return td;\n                  } \n              });\n      }\n  }\n  \n  function savePublisherImpl(name, xid, enabled, cacheWarningSize, cacheDiscardSize, changesOnly, sendSnapshot,\n          snapshotSendPeriods, snapshotSendPeriodType) {\n      // Clear messages.\n      hide(\"portMsg\");\n      hide(\"slaveIdMsg\");\n      hide(\"encapsulatedMsg\");\n      hide(\"pointsMsg\");\n      \n      var points = new Array();\n      for (var i=0; i<selectedPoints.length; i++)\n          points[points.length] = {\n    \t\t  dataPointId: selectedPoints[i].id,\n    \t\t  registerType: selectedPoints[i].registerType,\n    \t\t  offset: selectedPoints[i].offset,\n    \t\t  dataTypeString: selectedPoints[i].dataTypeString,\n    \t\t  modbusDataType: selectedPoints[i].modbusDataType,\n    \t\t  registerCount: selectedPoints[i].registerCount,\n    \t\t  readOnly: selectedPoints[i].readOnly\n    \t  };\n      \n      ModbusPublisherDwr.savePersistentSender(name, xid, enabled, points, $get(\"slaveId\"), $get(\"port\"), $get(\"encapsulated\"), cacheWarningSize, cacheDiscardSize,\n");
      out.write("              changesOnly, sendSnapshot, snapshotSendPeriods, snapshotSendPeriodType, savePublisherCB);\n  }\n  \n  function getRtStatus() {\n      setDisabled(\"getStatusBtn\", true);\n      PersistentPublisherDwr.getPersistentSenderStatus(function(response) {\n          dwr.util.removeAllOptions(\"statusResults\");\n          dwr.util.addOptions(\"statusResults\", response.messages, \"genericMessage\");\n          setDisabled(\"getStatusBtn\", false);\n      });\n  }\n  \n  function startSync() {\n      setDisabled(\"startSyncBtn\", true);\n      PersistentPublisherDwr.startPersistentSync(function(response) {\n          dwr.util.removeAllOptions(\"statusResults\");\n          dwr.util.addOptions(\"statusResults\", response.messages, \"genericMessage\");\n          setDisabled(\"startSyncBtn\", false);\n      });\n  }\n  \n  \n  function updateOffset(pointId, offset) {\n      updateElement(selectedPoints, pointId, \"offset\", offset);\n  }\n\n  function updateReadOnly(pointId, readOnly) {\n      updateElement(selectedPoints, pointId, \"readOnly\", readOnly);\n");
      out.write("  }\n  \n  function updateRegisterCount(pointId, count){\n      updateElement(selectedPoints, pointId, \"registerCount\", count);\n  }\n  \n  /**\n   * Update the Register Range only if its compatible and return true,\n   * if not return false.\n   */\n  function updateRegisterRange(pointId, type) {\n\t  var pointData = getElement(allPoints, pointId);\n\t  \n\t  //If Updating the range we must also update the read only option \n\t  var chkbx = dojo.byId(\"readOnlyChkbx\" + pointId);\n\t  if(chkbx){\n\t\t  switch(type){\n\t\t    case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_52 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_52.setPageContext(_jspx_page_context);
      _jspx_th_c_out_52.setParent(null);
      _jspx_th_c_out_52.setValue( RegisterRange.INPUT_STATUS );
      int _jspx_eval_c_out_52 = _jspx_th_c_out_52.doStartTag();
      if (_jspx_th_c_out_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_52);
      out.write(":\n\t\t    case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_53 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_53.setPageContext(_jspx_page_context);
      _jspx_th_c_out_53.setParent(null);
      _jspx_th_c_out_53.setValue( RegisterRange.INPUT_REGISTER );
      int _jspx_eval_c_out_53 = _jspx_th_c_out_53.doStartTag();
      if (_jspx_th_c_out_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_53);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_53);
      out.write(":\n\t\t           chkbx.checked = true;\n\t\t           chkbx.disabled = 'disabled';\n\t\t\tbreak;\n\t\t    case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_54 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_54.setPageContext(_jspx_page_context);
      _jspx_th_c_out_54.setParent(null);
      _jspx_th_c_out_54.setValue( RegisterRange.COIL_STATUS );
      int _jspx_eval_c_out_54 = _jspx_th_c_out_54.doStartTag();
      if (_jspx_th_c_out_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_54);
      out.write(":\n\t        case ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_55 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_55.setPageContext(_jspx_page_context);
      _jspx_th_c_out_55.setParent(null);
      _jspx_th_c_out_55.setValue( RegisterRange.HOLDING_REGISTER );
      int _jspx_eval_c_out_55 = _jspx_th_c_out_55.doStartTag();
      if (_jspx_th_c_out_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_55);
        return;
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_55);
      out.write(":\n\t            chkbx.removeAttribute(\"disabled\");\n\t        break;\n\t\t  }\n\t  }\n\t  \n\t  if(checkRegisterType(type, pointData.dataTypeId)){\n\t\t    updateElement(selectedPoints, pointId, \"registerType\", type);\n\t\t    return true;\n\t  }else{\n\t\t  return false;\n\t  }\n  }\n  \n  function updateModbusDataType(pointId, type) {\n      updateElement(selectedPoints, pointId, \"modbusDataType\", type);\n  }\n  \n</script>\n<table cellpadding=\"0\" cellspacing=\"0\" style=\"float:left;\">\n  <tr>\n    <td valign=\"top\">\n      <div class=\"borderDiv marR marB\">\n        <table>\n          <tr>\n            <td colspan=\"2\" class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_29(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_help_0(_jspx_page_context))
        return;
      out.write("</td>\n          </tr>\n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_30(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <input type=\"number\" id=\"port\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.port}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\n              <div id=\"portMsg\" class=\"formError\" style=\"display:none;\"></div>\n            </td>\n          </tr>          \n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_31(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              <input type=\"number\" id=\"slaveId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.slaveId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\n              <div id=\"slaveIdMsg\" class=\"formError\" style=\"display:none;\"></div>\n            </td>\n          </tr>\n          <tr>\n            <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_32(_jspx_page_context))
        return;
      out.write("</td>\n            <td class=\"formField\">\n              ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n              <div id=\"encapsulatedMsg\" class=\"formError\" style=\"display:none;\"></div>\n            </td>\n          </tr>\n        </table>\n      </div>\n    </td>\n  </tr>\n</table>\n\n<table cellpadding=\"0\" cellspacing=\"0\"><tr><td>\n  <div class=\"borderDiv\">\n    <table width=\"100%\">\n      <tr>\n        <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_33(_jspx_page_context))
        return;
      out.write("</td>\n        <td align=\"right\"><div id=\"pointLookup\"></div></td>\n      </tr>\n    </table>\n    \n    <table cellspacing=\"1\" cellpadding=\"0\">\n      <tr class=\"rowHeader\">\n        <td>");
      if (_jspx_meth_fmt_message_34(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_35(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_36(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_37(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_38(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_39(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_40(_jspx_page_context))
        return;
      out.write("</td>\n        <td>");
      if (_jspx_meth_fmt_message_41(_jspx_page_context))
        return;
      out.write("</td>\n        <td></td>\n      </tr>\n      <tbody id=\"selectedPointsEmpty\" style=\"display:none;\"><tr><td colspan=\"5\">");
      if (_jspx_meth_fmt_message_42(_jspx_page_context))
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
    _jspx_th_fmt_message_0.setKey("modbus.publisher.pointType.coil");
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
    _jspx_th_fmt_message_1.setKey("modbus.publisher.pointType.input");
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
    _jspx_th_fmt_message_2.setKey("modbus.publisher.pointType.holdingRegister");
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
    _jspx_th_fmt_message_3.setKey("modbus.publisher.pointType.inputRegister");
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
    _jspx_th_fmt_message_4.setKey("dsEdit.modbus.modbusDataType.binary");
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
    _jspx_th_fmt_message_5.setKey("dsEdit.modbus.modbusDataType.2bUnsigned");
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
    _jspx_th_fmt_message_6.setKey("dsEdit.modbus.modbusDataType.2bSigned");
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
    _jspx_th_fmt_message_7.setKey("dsEdit.modbus.modbusDataType.2bBcd");
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
    _jspx_th_fmt_message_8.setKey("dsEdit.modbus.modbusDataType.4bUnsigned");
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
    _jspx_th_fmt_message_9.setKey("dsEdit.modbus.modbusDataType.4bSigned");
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
    _jspx_th_fmt_message_10.setKey("dsEdit.modbus.modbusDataType.4bUnsignedSwapped");
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
    _jspx_th_fmt_message_11.setKey("dsEdit.modbus.modbusDataType.4bSignedSwapped");
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
    _jspx_th_fmt_message_12.setKey("dsEdit.modbus.modbusDataType.4bFloat");
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
    _jspx_th_fmt_message_13.setKey("dsEdit.modbus.modbusDataType.4bFloatSwapped");
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
    _jspx_th_fmt_message_14.setKey("dsEdit.modbus.modbusDataType.4bBcd");
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
    _jspx_th_fmt_message_15.setKey("dsEdit.modbus.modbusDataType.4bBcdSwapped");
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
    _jspx_th_fmt_message_16.setKey("dsEdit.modbus.modbusDataType.8bUnsigned");
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
    _jspx_th_fmt_message_17.setKey("dsEdit.modbus.modbusDataType.8bSigned");
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
    _jspx_th_fmt_message_18.setKey("dsEdit.modbus.modbusDataType.8bUnsignedSwapped");
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
    _jspx_th_fmt_message_19.setKey("dsEdit.modbus.modbusDataType.8bSignedSwapped");
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
    _jspx_th_fmt_message_20.setKey("dsEdit.modbus.modbusDataType.8bFloat");
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
    _jspx_th_fmt_message_21.setKey("dsEdit.modbus.modbusDataType.8bFloatSwapped");
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
    _jspx_th_fmt_message_22.setKey("dsEdit.modbus.modbusDataType.char");
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
    _jspx_th_fmt_message_23.setKey("dsEdit.modbus.modbusDataType.varchar");
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
    _jspx_th_fmt_message_24.setKey("modbus.publisher.incompatibleRegisterType");
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
    _jspx_th_fmt_message_25.setKey("modbus.publisher.pointType.coil");
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
    _jspx_th_fmt_message_26.setKey("modbus.publisher.pointType.input");
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
    _jspx_th_fmt_message_27.setKey("modbus.publisher.pointType.holdingRegister");
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
    _jspx_th_fmt_message_28.setKey("modbus.publisher.pointType.inputRegister");
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
    _jspx_th_fmt_message_29.setKey("modbus.publisher.properties");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
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
    _jspx_th_tag_help_0.setId("modbusIpPublishing");
    _jspx_th_tag_help_0.doTag();
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
    _jspx_th_fmt_message_30.setKey("dsEdit.modbusIp.port");
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
    _jspx_th_fmt_message_31.setKey("dsEdit.modbus.slaveId");
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
    _jspx_th_fmt_message_32.setKey("dsEdit.modbusIp.encapsulated");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n              ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.encapsulated == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                    <input type=\"checkbox\" id=\"encapsulated\" checked=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${publisher.encapsulated}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"formShort\"/>\n                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n                    <input type=\"checkbox\" id=\"encapsulated\" class=\"formShort\"/>\n                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
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
    _jspx_th_fmt_message_33.setKey("publisherEdit.points");
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
    _jspx_th_fmt_message_34.setKey("publisherEdit.point.name");
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
    _jspx_th_fmt_message_35.setKey("publisherEdit.point.status");
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
    _jspx_th_fmt_message_36.setKey("publisherEdit.point.type");
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
    _jspx_th_fmt_message_37.setKey("dsEdit.modbus.registerRange");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
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
    _jspx_th_fmt_message_38.setKey("dsEdit.modbus.offset");
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
    _jspx_th_fmt_message_39.setKey("dsEdit.modbus.registerCount");
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
    _jspx_th_fmt_message_40.setKey("publisherEdit.modbus.readOnly");
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
    _jspx_th_fmt_message_41.setKey("dsEdit.modbus.modbusDataType");
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
    _jspx_th_fmt_message_42.setKey("publisherEdit.noPoints");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }
}
