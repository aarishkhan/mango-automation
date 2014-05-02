package org.apache.jsp.modules.dnp3.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.org.scadabr.dnp3.vo.Dnp3PointLocatorVO;
import br.org.scadabr.dnp3.vo.Dnp3SerialDataSourceVO;
import br.org.scadabr.dnp3.vo.Dnp3IpDataSourceVO;

public final class editDnp3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(12);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/m2m2.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/modules/dnp3/web/editDnp3Serial.jsp");
    _jspx_dependants.add("/modules/dnp3/web/editDnp3Ip.jsp");
    _jspx_dependants.add("/WEB-INF/tags/dataSourceAttrs.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/dsEvents.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/pointList.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_sst_select_value_id.release();
    _jspx_tagPool_sst_option.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n<script type=\"text/javascript\">\r\n  function appendPointListColumnFunctions(pointListColumnHeaders, pointListColumnFunctions) {\r\n      pointListColumnHeaders[pointListColumnHeaders.length] = \"");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("\";\r\n      pointListColumnFunctions[pointListColumnFunctions.length] = function(p) { return p.pointLocator.index; };\r\n  }\r\n  \r\n  function changeDataType() {\r\n      if(isSettablePointSelected()) {\r\n          var typeSelected = document.getElementById(\"datatype\").selectedIndex;\r\n          show(\"divWrittable\");\r\n          hide(\"divBinWrittable\");\r\n          if(typeSelected == 1) {\r\n            show(\"divBinWrittable\");\r\n          }\r\n      } else {\r\n          hide(\"divWrittable\");\r\n          hide(\"divBinWrittable\");\r\n      }\r\n  }\r\n  \r\n  function isSettablePointSelected() {\r\n      var typeSelected = document.getElementById(\"datatype\").selectedIndex;\r\n      if(typeSelected == 1 || typeSelected == 3) {\r\n          return true;\r\n      } else {\r\n          return false;\r\n      }\r\n  }\r\n  \r\n  function initImpl() {\r\n  }\r\n  \r\n  function editPointCBImpl(locator) {\r\n      $set(\"index\", locator.index);\r\n      $set(\"datatype\", locator.dnp3DataType);\r\n      if(currentPoint.id != -1) {\r\n          document.getElementById(\"addMany\").checked = false;\r\n");
      out.write("          document.getElementById(\"minIndex\").disabled = true;\r\n          document.getElementById(\"maxIndex\").disabled = true;\r\n          document.getElementById(\"index\").disabled = false;\r\n          document.getElementById(\"name\").disabled = false;\r\n          document.getElementById(\"xid\").disabled = false;\r\n          document.getElementById(\"addMany\").disabled = true;\r\n      } else {\r\n          document.getElementById(\"addMany\").disabled = false;\r\n      }\r\n      changeDataType();\r\n      if(isSettablePointSelected()) {\r\n          $set(\"operateMode\", locator.operateMode);\r\n          $set(\"controlCommand\", locator.controlCommand);\r\n          $set(\"timeOn\", locator.timeOn);\r\n          $set(\"timeOff\", locator.timeOff);\r\n      }\r\n  }\r\n\r\n  function savePointImpl(locator) {\r\n      delete locator.dataTypeId;\r\n      delete locator.relinquishable;\r\n      \r\n      var checkValue = dwr.util.getValue(\"addMany\");\r\n      var name = \"\";\r\n      locator.settable = false;\r\n      locator.dnp3DataType = $get(\"datatype\");\r\n      if(isSettablePointSelected()) {\r\n");
      out.write("            locator.settable = true;\r\n            locator.operateMode = $get(\"operateMode\");\r\n            locator.controlCommand = $get(\"controlCommand\");\r\n            locator.timeOn = $get(\"timeOn\");\r\n            locator.timeOff = $get(\"timeOff\");\r\n      } \r\n      if(checkValue == false) {\r\n          locator.index = $get(\"index\");\r\n          \r\n          DnpEditDwr.saveDnp3PointLocator(currentPoint.id, $get(\"xid\"), $get(\"name\"), locator, savePointCB);\r\n      } else {\r\n          var names = new Array($get(\"maxIndex\") - $get(\"minIndex\"));\r\n          var index = new Array($get(\"maxIndex\") - $get(\"minIndex\"));\r\n          var locators = new Array($get(\"maxIndex\") - $get(\"minIndex\"));\r\n          qntPoints = $get(\"maxIndex\") - $get(\"minIndex\");\r\n          for(var i = 0; i <= qntPoints; i++) {\r\n              index[i] = parseInt($get(\"minIndex\")) + i;\r\n              locators[i] = locator;\r\n              if ($get(\"datatype\") == 01) {\r\n                    names[i] = (\"");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("\" + \" \" + (parseInt($get(\"minIndex\")) + i));\r\n             }  else if ($get(\"datatype\") == 0x10) {\r\n                    names[i] = (\"");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("\" + \" \" + (parseInt($get(\"minIndex\")) + i));\r\n             }  else if ($get(\"datatype\") == 0x30) {\r\n                    names[i] = (\"");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("\" + \" \" + (parseInt($get(\"minIndex\")) + i));\r\n             }  else if ($get(\"datatype\") == 0x40) {\r\n                    names[i] = (\"");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write("\" + \" \" + (parseInt($get(\"minIndex\")) + i));\r\n             }  else if ($get(\"datatype\") == 0x20) {\r\n                    names[i] = (\"");
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("\" + \" \" + (parseInt($get(\"minIndex\")) + i));\r\n             }\r\n          }\r\n          DnpEditDwr.saveMultipleDnp3PointLocator(names, index, locators, savePointCB);\r\n      }\r\n  }\r\n\r\n  function changeAddMany() {\r\n      var checkValue = dwr.util.getValue(\"addMany\");\r\n      if(checkValue == false) {\r\n          document.getElementById(\"minIndex\").disabled = true;\r\n          document.getElementById(\"maxIndex\").disabled = true;\r\n          document.getElementById(\"index\").disabled = false;\r\n          document.getElementById(\"name\").disabled = false;\r\n          document.getElementById(\"xid\").disabled = false;\r\n      } else {\r\n          document.getElementById(\"minIndex\").disabled = false;\r\n          document.getElementById(\"maxIndex\").disabled = false;\r\n          document.getElementById(\"index\").disabled = true;\r\n          document.getElementById(\"name\").disabled = true;\r\n          document.getElementById(\"xid\").disabled = true;\r\n      }\r\n  }\r\n  \r\n  //\r\n  // List manipulation.\r\n  function addListValue(prefix) {\r\n      var theValue = $get(prefix);\r\n");
      out.write("      var theNumber = parseInt(theValue);\r\n      if (isNaN(theNumber)) {\r\n          alert(\"");
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("\");\r\n          return false;\r\n      }\r\n      var arr = currentPoint.pointLocator[prefix +\"Change\"].values;\r\n      for (var i=arr.length-1; i>=0; i--) {\r\n          if (arr[i] == theNumber) {\r\n              alert(\"");
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write(" \"+ theNumber);\r\n              return false;\r\n          }\r\n      }\r\n      arr[arr.length] = theNumber;\r\n      arr.sort( function(a,b) { return a-b; } );\r\n      refreshValueList(prefix, arr);\r\n      $set(prefix, theNumber + 1);\r\n      return false;\r\n  }\r\n  \r\n  function removeListValue(theValue, prefix) {\r\n      var arr = currentPoint.pointLocator[prefix +\"Change\"].values;\r\n      for (var i=arr.length-1; i>=0; i--) {\r\n          if (arr[i] == theValue)\r\n              arr.splice(i, 1);\r\n      }\r\n      refreshValueList(prefix, arr);\r\n      return false;\r\n  }\r\n  \r\n  function refreshValueList(prefix, arr) {\r\n      dwr.util.removeAllRows(prefix +\"Values\");\r\n      dwr.util.addRows(prefix +\"Values\", arr, [\r\n              function(data) { return data; },\r\n              function(data) {\r\n                  return writeImage(null, null, \"bullet_delete\", \"");
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("\",\r\n                          \"removeListValue(\"+ data +\", '\"+ prefix +\"');\");\r\n              }\r\n              ]);\r\n      var startDD = $(prefix +\"Change.startValue\");\r\n      var currentStart = startDD.value;\r\n      dwr.util.removeAllOptions(startDD);\r\n      dwr.util.addOptions(startDD, arr);\r\n      startDD.value = currentStart;\r\n  }\r\n</script>\r\n\r\n");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n\r\n");
      if (_jspx_meth_tag_dataSourceAttrs_0(_jspx_page_context))
        return;
      out.write("\r\n  \r\n");
      //  tag:pointList
      org.apache.jsp.tag.web.pointList_tag _jspx_th_tag_pointList_0 = new org.apache.jsp.tag.web.pointList_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_pointList_0        );
      }
      _jspx_th_tag_pointList_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_pointList_0.setPointHelpId("dnp3PP");
      _jspx_th_tag_pointList_0.setJspBody(new editDnp3_jspHelper( 1, _jspx_page_context, _jspx_th_tag_pointList_0, null));
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("dsEdit.dnp3.index");
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
    _jspx_th_fmt_message_1.setKey("dsEdit.dnp3.binaryInput");
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
    _jspx_th_fmt_message_2.setKey("dsEdit.dnp3.binaryOutput");
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
    _jspx_th_fmt_message_3.setKey("dsEdit.dnp3.analogInput");
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
    _jspx_th_fmt_message_4.setKey("dsEdit.dnp3.analogOutput");
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
    _jspx_th_fmt_message_5.setKey("dsEdit.dnp3.runningCounter");
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
    _jspx_th_fmt_message_6.setKey("dsEdit.virtual.errorParsingValue");
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
    _jspx_th_fmt_message_7.setKey("dsEdit.virtual.invalidValue");
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
    _jspx_th_fmt_message_8.setKey("common.delete");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
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
        out.write("\r\n  ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'DNP3_SERIAL'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n    ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n  ");
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

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_0.setVar("dsKey");
    _jspx_th_c_set_0.setValue(new String("dsEdit.dnp3.descSerial"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_1.setVar("dsHelpId");
    _jspx_th_c_set_1.setValue(new String("dnp3SerialDS"));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'DNP3_IP'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n    ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_2.setVar("dsKey");
    _jspx_th_c_set_2.setValue(new String("dsEdit.dnp3.descIp"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_3.setVar("dsHelpId");
    _jspx_th_c_set_3.setValue(new String("dnp3IpDS"));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_3);
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
    _jspx_th_tag_dataSourceAttrs_0.setDescriptionKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dsKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_dataSourceAttrs_0.setHelpId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dsHelpId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_dataSourceAttrs_0.setJspBody(new editDnp3_jspHelper( 0, _jspx_page_context, _jspx_th_tag_dataSourceAttrs_0, null));
    _jspx_th_tag_dataSourceAttrs_0.doTag();
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
    _jspx_th_fmt_message_9.setKey("dsEdit.dnp3.sourceAddress");
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
    _jspx_th_fmt_message_10.setKey("dsEdit.dnp3.slaveAddress");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n      ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n  ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'DNP3_SERIAL'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n      ");
        out.write("\r\n\r\n\r\n<script type=\"text/javascript\">\r\nfunction saveDataSourceImpl(basic) {\r\n    DnpEditDwr.saveDNP3SerialDataSource(basic,\r\n          $get(\"sourceAddress\"), $get(\"slaveAddress\"), $get(\"commPortId\"), $get(\"baudRate\"), \r\n          $get(\"staticPollPeriods\"), $get(\"rbePollPeriods\"),\r\n          $get(\"rbePeriodType\"), $get(\"timeout\"), $get(\"retries\"), saveDataSourceCB);\r\n}\r\n</script>\r\n\r\n<tr>\r\n  <td class=\"formLabelRequired\">");
        if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("</td>\r\n  <td class=\"formField\"><input id=\"commPortId\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.commPortId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\r\n</tr>\r\n\r\n<tr>\r\n  <td class=\"formLabelRequired\">");
        if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("</td>\r\n  <td class=\"formField\">\r\n    ");
        if (_jspx_meth_sst_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n  </td>\r\n</tr>");
        out.write("\r\n    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_fmt_message_11.setKey("dsEdit.dnp3Serial.commPortId");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_fmt_message_12.setKey("dsEdit.dnp3Serial.baud");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_sst_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_sst_select_0.setId("baudRate");
    _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.baudRate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
    if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        if (_jspx_meth_sst_option_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
          return true;
        out.write("\r\n    ");
        int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_select_value_id.reuse(_jspx_th_sst_select_0);
    return false;
  }

  private boolean _jspx_meth_sst_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_0.doInitBody();
      }
      do {
        out.write("110");
        int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_0);
    return false;
  }

  private boolean _jspx_meth_sst_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
    if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_1.doInitBody();
      }
      do {
        out.write("300");
        int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_1);
    return false;
  }

  private boolean _jspx_meth_sst_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
    if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_2.doInitBody();
      }
      do {
        out.write("1200");
        int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_2);
    return false;
  }

  private boolean _jspx_meth_sst_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
    if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_3.doInitBody();
      }
      do {
        out.write("2400");
        int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_3);
    return false;
  }

  private boolean _jspx_meth_sst_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
    if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_4.doInitBody();
      }
      do {
        out.write("4800");
        int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_4);
    return false;
  }

  private boolean _jspx_meth_sst_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
    if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_5.doInitBody();
      }
      do {
        out.write("9600");
        int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_5);
    return false;
  }

  private boolean _jspx_meth_sst_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
    if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_6.doInitBody();
      }
      do {
        out.write("19200");
        int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_6);
    return false;
  }

  private boolean _jspx_meth_sst_option_7(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_7 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_7.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_7 = _jspx_th_sst_option_7.doStartTag();
    if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_7.doInitBody();
      }
      do {
        out.write("38400");
        int evalDoAfterBody = _jspx_th_sst_option_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_7);
    return false;
  }

  private boolean _jspx_meth_sst_option_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_8 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_8.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_8 = _jspx_th_sst_option_8.doStartTag();
    if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_8.doInitBody();
      }
      do {
        out.write("57600");
        int evalDoAfterBody = _jspx_th_sst_option_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_8);
    return false;
  }

  private boolean _jspx_meth_sst_option_9(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_9 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_9.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_9 = _jspx_th_sst_option_9.doStartTag();
    if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_9.doInitBody();
      }
      do {
        out.write("115200");
        int evalDoAfterBody = _jspx_th_sst_option_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_9);
    return false;
  }

  private boolean _jspx_meth_sst_option_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_10 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_10.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_10 = _jspx_th_sst_option_10.doStartTag();
    if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_10.doInitBody();
      }
      do {
        out.write("230400");
        int evalDoAfterBody = _jspx_th_sst_option_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_10);
    return false;
  }

  private boolean _jspx_meth_sst_option_11(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_11 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_11.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_11 = _jspx_th_sst_option_11.doStartTag();
    if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_11.doInitBody();
      }
      do {
        out.write("460800");
        int evalDoAfterBody = _jspx_th_sst_option_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_11);
    return false;
  }

  private boolean _jspx_meth_sst_option_12(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_12 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_12.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    int _jspx_eval_sst_option_12 = _jspx_th_sst_option_12.doStartTag();
    if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_12.doInitBody();
      }
      do {
        out.write("921600");
        int evalDoAfterBody = _jspx_th_sst_option_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option.reuse(_jspx_th_sst_option_12);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.definition.dataSourceTypeName == 'DNP3_IP'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n      ");
        out.write("\r\n\r\n\r\n<script type=\"text/javascript\">\r\n  \r\nfunction saveDataSourceImpl(basic) {\r\n    DnpEditDwr.saveDNP3IpDataSource(basic,\r\n          $get(\"sourceAddress\"), $get(\"slaveAddress\"), $get(\"host\"), $get(\"port\"), \r\n          $get(\"staticPollPeriods\"), $get(\"rbePollPeriods\"),\r\n          $get(\"rbePeriodType\"), $get(\"timeout\"), $get(\"retries\"), saveDataSourceCB);\r\n}\r\n</script>\r\n\r\n<tr>\r\n  <td class=\"formLabelRequired\">");
        if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("</td>\r\n  <td class=\"formField\"><input id=\"host\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.host}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\r\n</tr>\r\n\r\n<tr>\r\n  <td class=\"formLabelRequired\">");
        if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("</td>\r\n  <td class=\"formField\"><input id=\"port\" type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.port}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>\r\n</tr>\r\n");
        out.write("\r\n    ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_message_13.setKey("dsEdit.dnp3Ip.host");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_fmt_message_14.setKey("dsEdit.dnp3Ip.port");
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
    _jspx_th_fmt_message_15.setKey("dsEdit.dnp3.retries");
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
    _jspx_th_fmt_message_16.setKey("dsEdit.dnp3.timeout");
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
    _jspx_th_fmt_message_17.setKey("dsEdit.dnp3.rbePeriod");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_0 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_0      );
    }
    _jspx_th_tag_timePeriods_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_0.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_0.setId("rbePeriodType");
    _jspx_th_tag_timePeriods_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.rbePeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_0.setMs(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
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
    _jspx_th_fmt_message_18.setKey("dsEdit.dnp3.staticPeriod");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_19.setKey("dsEdit.dnp3.addMany");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_20.setKey("dsEdit.dnp3.minIndex");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_21.setKey("dsEdit.dnp3.maxIndex");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_22.setKey("dsEdit.dnp3.index");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_23.setKey("dsEdit.dnp3.dataType");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_24.setKey("dsEdit.dnp3.operateMode");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_25.setKey("dsEdit.dnp3.controlCommand");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_26.setKey("dsEdit.dnp3.timeOn");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_27.setKey("dsEdit.dnp3.timeOff");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private class editDnp3_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public editDnp3_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"sourceAddress\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.sourceAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"slaveAddress\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.slaveAddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n  </tr>\r\n  \r\n  ");
      if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n    <td class=\"formField\"><input type=\"text\" id=\"retries\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.retries}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n    <td class=\"formField\"><input type=\"text\" id=\"timeout\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.timeout}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n    <td class=\"formField\">\r\n      <input type=\"text\" id=\"rbePollPeriods\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.rbePollPeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\" />\r\n      ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n    <td class=\"formField\">\r\n      <input type=\"text\" id=\"staticPollPeriods\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.staticPollPeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\" />\r\n    </td>\r\n  </tr>\r\n");
      return false;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\"><input type=\"checkbox\" id=\"addMany\" onchange=\"changeAddMany();\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"minIndex\" disabled=\"disabled\" type=\"text\" value=\"\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"maxIndex\" disabled=\"disabled\" type=\"text\" value=\"\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"index\" type=\"text\" value=\"0\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\">\r\n      <select id=\"datatype\" onchange=\"changeDataType();\">\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_0.setValue( Dnp3PointLocatorVO.BINARY_INPUT );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write("\">BINARY INPUT</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_1.setValue( Dnp3PointLocatorVO.BINARY_OUTPUT );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write("\">BINARY OUTPUT</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_2.setPageContext(_jspx_page_context);
      _jspx_th_c_out_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_2.setValue( Dnp3PointLocatorVO.ANALOG_INPUT );
      int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
      if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      out.write("\">ANALOG INPUT</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_3.setPageContext(_jspx_page_context);
      _jspx_th_c_out_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_3.setValue( Dnp3PointLocatorVO.ANALOG_OUTPUT );
      int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
      if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      out.write("\">ANALOG OUTPUT</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_4.setPageContext(_jspx_page_context);
      _jspx_th_c_out_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_4.setValue( Dnp3PointLocatorVO.RUNNING_COUNTER );
      int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
      if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      out.write("\">RUNNING COUNTER</option>\r\n      </select>\r\n    </td>\r\n  </tr>\r\n  <tbody id=\"divWrittable\" style=\"display: none;\">\r\n   <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\">\r\n      <select id=\"operateMode\">\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_5.setPageContext(_jspx_page_context);
      _jspx_th_c_out_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_5.setValue( Dnp3PointLocatorVO.SBO );
      int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
      if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      out.write("\">Select Before Operate</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_6.setPageContext(_jspx_page_context);
      _jspx_th_c_out_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_6.setValue( Dnp3PointLocatorVO.DIRECT );
      int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
      if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      out.write("\">Direct Operate</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_7.setPageContext(_jspx_page_context);
      _jspx_th_c_out_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_7.setValue( Dnp3PointLocatorVO.DIRECT_NO_ACK );
      int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
      if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      out.write("\">Direct Operate No Ack</option>\r\n      </select>\r\n    </td>\r\n  </tr>\r\n  </tbody>\r\n  <tbody id=\"divBinWrittable\" style=\"display: none;\">\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\">\r\n      <select id=\"controlCommand\">\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_8.setPageContext(_jspx_page_context);
      _jspx_th_c_out_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_8.setValue( Dnp3PointLocatorVO.CLOSE_TRIP );
      int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
      if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      out.write("\">Close/Trip</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_9.setPageContext(_jspx_page_context);
      _jspx_th_c_out_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_9.setValue( Dnp3PointLocatorVO.PULSE );
      int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
      if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      out.write("\">Pulse ON/OFF</option>\r\n        <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_10.setPageContext(_jspx_page_context);
      _jspx_th_c_out_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_10.setValue( Dnp3PointLocatorVO.LATCH );
      int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
      if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      out.write("\">Latch ON/OFF</option>\r\n      </select>\r\n    </td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"timeOn\" type=\"text\" value=\"0\"/></td>\r\n  </tr>\r\n  <tr>\r\n    <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    <td class=\"formField\"><input id=\"timeOff\" type=\"text\" value=\"0\"/></td>\r\n  </tr>\r\n  </tbody>\r\n");
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
