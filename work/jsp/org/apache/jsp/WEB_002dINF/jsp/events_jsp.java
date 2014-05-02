package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.Common;
import com.serotonin.m2m2.vo.UserComment;
import com.serotonin.m2m2.rt.event.type.EventType;
import com.serotonin.m2m2.web.dwr.EventsDwr;
import com.serotonin.m2m2.module.ModuleRegistry;
import com.serotonin.m2m2.module.EventTypeDefinition;
import com.serotonin.m2m2.vo.UserComment;

public final class events_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(15);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/jsp/include/userComment.jsp");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/dateRange.tag");
    _jspx_dependants.add("/WEB-INF/tags/monthOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/dayOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/hourOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/minuteOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/secondOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n\n\n\n\n\n\n");
      out.write("\n\n\n");
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_page_0        );
      }
      _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_page_0.setDwr("EventsDwr");
      _jspx_th_tag_page_0.setJspBody(new events_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null));
      _jspx_th_tag_page_0.doTag();
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("notes.enterComment");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
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
    _jspx_th_fmt_message_1.setKey("notes.by");
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
    _jspx_th_fmt_message_2.setKey("notes.addNote");
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
    _jspx_th_fmt_message_3.setKey("notes.save");
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
    _jspx_th_fmt_message_4.setKey("notes.cancel");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
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
    _jspx_th_tag_img_0.setPng("comment");
    _jspx_th_tag_img_0.setTitle("notes.note");
    _jspx_th_tag_img_0.doTag();
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
    _jspx_th_fmt_message_5.setKey("notes.timeByUsername");
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
    _jspx_th_fmt_message_6.setKey("events.search.searching");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_parent);
    _jspx_th_tag_img_1.setPng("flag_white");
    _jspx_th_tag_img_1.setTitle("events.alarms");
    _jspx_th_tag_img_1.doTag();
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
    _jspx_th_fmt_message_7.setKey("events.pending");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
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
    _jspx_th_fmt_message_8.setKey("events.acknowledgeAll");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_parent);
    _jspx_th_tag_img_2.setPng("tick");
    _jspx_th_tag_img_2.setOnclick("MiscDwr.acknowledgeAllPendingEvents()");
    _jspx_th_tag_img_2.setTitle("events.acknowledgeAll");
    _jspx_th_tag_img_2.doTag();
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
    _jspx_th_fmt_message_9.setKey("events.silenceAll");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_parent);
    _jspx_th_tag_img_3.setPng("sound_mute");
    _jspx_th_tag_img_3.setOnclick("silenceAll()");
    _jspx_th_tag_img_3.setTitle("events.silenceAll");
    _jspx_th_tag_img_3.doTag();
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
    _jspx_th_fmt_message_10.setKey("events.emptyList");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_tag_img_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_4 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_4      );
    }
    _jspx_th_tag_img_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_4.setParent(_jspx_parent);
    _jspx_th_tag_img_4.setPng("hourglass");
    _jspx_th_tag_img_4.doTag();
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
    _jspx_th_fmt_message_11.setKey("events.search");
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
    _jspx_th_fmt_message_12.setKey("events.id");
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
    _jspx_th_fmt_message_13.setKey("events.search.type");
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
    _jspx_th_fmt_message_14.setKey("common.all");
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
    _jspx_th_fmt_message_15.setKey("eventHandlers.pointEventDetector");
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
    _jspx_th_fmt_message_16.setKey("eventHandlers.dataSourceEvents");
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
    _jspx_th_fmt_message_17.setKey("eventHandlers.publisherEvents");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
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
    _jspx_th_fmt_message_18.setKey("eventHandlers.systemEvents");
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
    _jspx_th_fmt_message_19.setKey("eventHandlers.auditEvents");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_message_20.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventTypeDef.descriptionKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_fmt_message_21.setKey("common.status");
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
    _jspx_th_fmt_message_22.setKey("common.all");
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
    _jspx_th_fmt_message_23.setKey("common.active");
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
    _jspx_th_fmt_message_24.setKey("event.rtn.rtn");
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
    _jspx_th_fmt_message_25.setKey("common.nortn");
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
    _jspx_th_fmt_message_26.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_0 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_0      );
    }
    _jspx_th_tag_alarmLevelOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_0.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_0.setId("alarmLevel");
    _jspx_th_tag_alarmLevelOptions_0.setAllOption(new Boolean(true));
    _jspx_th_tag_alarmLevelOptions_0.doTag();
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
    _jspx_th_fmt_message_27.setKey("events.search.keywords");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_28.setKey("events.search.dateRange");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_29.setKey("events.search.dateRange.none");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_30.setKey("events.search.dateRange.relative");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_31.setKey("events.search.dateRange.specific");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_32.setKey("events.search.previous");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
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
    _jspx_th_tag_timePeriods_0.setId("prevPeriodType");
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_33.setKey("events.search.past");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_1 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_1      );
    }
    _jspx_th_tag_timePeriods_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_1.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_1.setId("pastPeriodType");
    _jspx_th_tag_timePeriods_1.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_dateRange_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dateRange
    org.apache.jsp.tag.web.dateRange_tag _jspx_th_tag_dateRange_0 = new org.apache.jsp.tag.web.dateRange_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dateRange_0      );
    }
    _jspx_th_tag_dateRange_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_dateRange_0.setParent(_jspx_parent);
    _jspx_th_tag_dateRange_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_34.setKey("events.search.search");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private class events_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public events_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n  ");
      out.write('\n');
      out.write('\n');
      out.write("\n\n<script type=\"text/javascript\">\n  dojo.require(\"dijit.Dialog\");\n  \n  var commentTypeId;\n  var commentReferenceId;\n  var saveCommentCallback;\n  \n  /**\n   * Open a comment dialog and allow a user defined callback\n  **/\n  function openCommentDialog(typeId, referenceId,callback) {\n      commentTypeId = typeId;\n      commentReferenceId = referenceId;\n      \n      if(typeof(callback) == 'function')\n    \t  saveCommentCallback = callback;\n      else\n    \t  saveCommentCallback = saveCommentCB;\n      \n      $set(\"commentText\", \"\");\n      dijit.byId(\"CommentDialog\").show();\n      $(\"commentText\").focus();\n  }\n  \n  function saveComment() {\n      var comment = $get(\"commentText\");\n      MiscDwr.addUserComment(commentTypeId, commentReferenceId, comment, saveCommentCallback);\n  }\n  \n  function saveCommentCB(comment) {\n      if (!comment)\n          alert(\"");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n      else {\n          closeCommentDialog();\n          \n          // Add a row for the comment by cloning the template.\n         \n          var commentsNode;\n          if (commentTypeId == ");
      out.print( UserComment.TYPE_EVENT );
      out.write(")\n              commentsNode = $(\"eventComments\"+ commentReferenceId);\n          else if (commentTypeId == ");
      out.print( UserComment.TYPE_POINT );
      out.write(")\n              commentsNode = $(\"pointComments\"+ commentReferenceId);\n          //Since we are now using this outside of the old format\n          if(commentsNode != null){\n        \t  var content = $(\"comment_TEMPLATE_\").cloneNode(true);\n              updateTemplateNode(content, comment.ts);\n\t          commentsNode.appendChild(content);\n\t          $(\"comment\"+ comment.ts +\"UserTime\").innerHTML = comment.prettyTime +\" ");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(" \"+ comment.username;\n\t          $(\"comment\"+ comment.ts +\"Text\").innerHTML = comment.comment;\n          }\n      }\n  }\n  \n  function closeCommentDialog() {\n      dijit.byId(\"CommentDialog\").hide();\n  }\n</script>\n<style type=\"text/css\">\n  .dijitDialog {\n      background : #eee;\n      border : 1px solid #999;\n      -moz-border-radius : 5px;\n      padding : 4px;\n  }\n  .dijitDialogTitleBar { display: none; }\n  #eventsTable .row td { vertical-align: top; }\n  #eventsTable .rowAlt td { vertical-align: top; }\n</style>\n\n<div dojoType=\"dijit.Dialog\" id=\"CommentDialog\" bgColor=\"white\" bgOpacity=\"0.5\" toggle=\"fade\" toggleDuration=\"250\">\n  <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\n  <table>\n    <tr>\n      <td><textarea rows=\"8\" cols=\"50\" id=\"commentText\"></textarea></td>\n    </tr>\n    <tr>\n      <td align=\"center\">\n        <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"saveComment();\"/>\n        <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"closeCommentDialog();\"/>\n      </td>\n    </tr>\n  </table>\n</div>\n\n<table style=\"display:none;\">\n  <tr id=\"comment_TEMPLATE_\">\n    <td valign=\"top\" width=\"16\">");
      if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n    <td valign=\"top\">\n      <span id=\"comment_TEMPLATE_UserTime\" class=\"copyTitle\">");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span><br/>\n      <span id=\"comment_TEMPLATE_Text\"></span>\n    </td>\n  </tr>\n</table>");
      out.write("\n  <style>\n    .incrementControl { width: 2em; }\n  </style>\n  <script type=\"text/javascript\">\n\n  dojo.require(\"dijit.Calendar\");\n    \n    // Tell the log poll that we're interested in monitoring pending alarms.\n    mango.longPoll.pollRequest.pendingAlarms = true;\n  \n    dojo.ready(function() {\n        // Wrapping setDateRange in a function appears to prevent the calendar from staying exposed.\n        EventsDwr.getDateRangeDefaults(");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_0.setPageContext(_jspx_page_context);
      _jspx_th_c_out_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_0.setValue( Common.TimePeriods.DAYS );
      int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
      if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      out.write(", 1, function(data) { setDateRange(data); });\n        \n        var x = dijit.byId(\"datePicker\");\n        x.goToToday();\n        x.onChange = jumpToDateClicked;\n        hide(\"datePickerDiv\");\n    });\n    \n    function updatePendingAlarmsContent(content) {\n        hide(\"hourglass\");\n        \n        $set(\"pendingAlarms\", content);\n        if (content) {\n            show(\"ackAllDiv\");\n            hide(\"noAlarms\");\n        }\n        else {\n            $set(\"pendingAlarms\", \"\");\n            hide(\"ackAllDiv\");\n            show(\"noAlarms\");\n        }\n    }\n    \n    function doSearch(page, date) {\n        setDisabled(\"searchBtn\", true);\n        $set(\"searchMessage\", \"");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\n        EventsDwr.search($get(\"eventId\"), $get(\"eventType\"), $get(\"eventStatus\"), $get(\"alarmLevel\"),\n                $get(\"keywords\"), $get(\"dateRangeType\"), $get(\"relativeType\"), $get(\"prevPeriodCount\"), \n                $get(\"prevPeriodType\"), $get(\"pastPeriodCount\"), $get(\"pastPeriodType\"), $get(\"fromNone\"), \n                $get(\"fromYear\"), $get(\"fromMonth\"), $get(\"fromDay\"), $get(\"fromHour\"), $get(\"fromMinute\"), \n                $get(\"fromSecond\"), $get(\"toNone\"), $get(\"toYear\"), $get(\"toMonth\"), $get(\"toDay\"), $get(\"toHour\"), \n                $get(\"toMinute\"), $get(\"toSecond\"), page, date, function(results) {\n            $set(\"searchResults\", results.data.content);\n            setDisabled(\"searchBtn\", false);\n            $set(\"searchMessage\", results.data.resultCount);\n        });\n    }\n\n    function jumpToDate(parent) {\n        var div = $(\"datePickerDiv\");\n        show(div);\n        var bounds = getAbsoluteNodeBounds(parent);\n        div.style.top = bounds.y +\"px\";\n        div.style.left = bounds.x +\"px\";\n");
      out.write("    }\n\n    var dptimeout = null;\n    function expireDatePicker() {\n        dptimeout = setTimeout(function() { hide(\"datePickerDiv\"); }, 500);\n    }\n\n    function cancelDatePickerExpiry() {\n        if (dptimeout) {\n            clearTimeout(dptimeout);\n            dptimeout = null;\n        }\n    }\n\n    function jumpToDateClicked(date) {\n        var div = $(\"datePickerDiv\");\n        if (isShowing(div)) {\n            hide(div);\n            doSearch(0, date);\n        }\n    }\n\n    function newSearch() {\n        var x = dijit.byId(\"datePicker\");\n        x.goToToday();\n        doSearch(0);\n    }\n    \n    function silenceAll() {\n        MiscDwr.silenceAll(function(result) {\n            var silenced = result.data.silenced;\n            for (var i=0; i<silenced.length; i++)\n                setSilenced(silenced[i], true);\n        });\n    }\n    \n    function updateDateRangeFields() {\n        var dateRangeType = $get(\"dateRangeType\");\n        if (dateRangeType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_1.setPageContext(_jspx_page_context);
      _jspx_th_c_out_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_1.setValue( EventsDwr.DATE_RANGE_TYPE_RELATIVE );
      int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
      if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      out.write(") {\n            show(\"dateRangeRelative\");\n            hide(\"dateRangeSpecific\");\n            \n            var relativeType = $get(\"relativeType\");\n            if (relativeType == 1) {\n                setDisabled(\"prevPeriodCount\", false);\n                setDisabled(\"prevPeriodType\", false);\n                setDisabled(\"pastPeriodCount\", true);\n                setDisabled(\"pastPeriodType\", true);\n            }\n            else {\n                setDisabled(\"prevPeriodCount\", true);\n                setDisabled(\"prevPeriodType\", true);\n                setDisabled(\"pastPeriodCount\", false);\n                setDisabled(\"pastPeriodType\", false);\n            }\n        }\n        else if (dateRangeType == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_2.setPageContext(_jspx_page_context);
      _jspx_th_c_out_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_2.setValue( EventsDwr.DATE_RANGE_TYPE_SPECIFIC );
      int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
      if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      out.write(") {\n            hide(\"dateRangeRelative\");\n            show(\"dateRangeSpecific\");\n            updateDateRange();\n        }\n        else {\n            hide(\"dateRangeRelative\");\n            hide(\"dateRangeSpecific\");\n        }\n    }\n    \n    function exportEvents() {\n        startImageFader($(\"exportEventsImg\"));\n        EventsDwr.exportEvents($get(\"eventId\"), $get(\"eventSourceType\"), $get(\"eventStatus\"), $get(\"alarmLevel\"),\n                $get(\"keywords\"), $get(\"dateRangeType\"), $get(\"relativeType\"), $get(\"prevPeriodCount\"), \n                $get(\"prevPeriodType\"), $get(\"pastPeriodCount\"), $get(\"pastPeriodType\"), $get(\"fromNone\"), \n                $get(\"fromYear\"), $get(\"fromMonth\"), $get(\"fromDay\"), $get(\"fromHour\"), $get(\"fromMinute\"), \n                $get(\"fromSecond\"), $get(\"toNone\"), $get(\"toYear\"), $get(\"toMonth\"), $get(\"toDay\"), $get(\"toHour\"), \n                $get(\"toMinute\"), $get(\"toSecond\"), function(data) {\n            stopImageFader($(\"exportEventsImg\"));\n            window.location = \"eventExport/eventData.csv\";\n");
      out.write("        });\n    }\n  </script>\n  \n  <div class=\"borderDiv marB\" style=\"float:left;\">\n    <div class=\"smallTitle titlePadding\" style=\"float:left;\">\n      ");
      if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n      ");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n    </div>\n    <div id=\"ackAllDiv\" class=\"titlePadding\" style=\"display:none;float:right;\">\n      ");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n      ");
      if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("&nbsp;\n      ");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\n      ");
      if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("<br/>\n    </div>\n    <div id=\"pendingAlarms\" style=\"clear:both;\"></div>\n    <div id=\"noAlarms\" style=\"display:none;padding:6px;text-align:center;\">\n      <b>");
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</b>\n    </div>\n    <div id=\"hourglass\" style=\"padding:6px;text-align:center;\">");
      if (_jspx_meth_tag_img_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</div>\n  </div>\n  \n  <div class=\"borderDiv\" style=\"clear:left;float:left;\">\n    <div class=\"smallTitle titlePadding\">");
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</div>\n    <div>\n      <table>\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"eventId\" type=\"text\"></td>\n        </tr>\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <select id=\"eventType\">\n              <option value=\"\">");
      if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_3.setPageContext(_jspx_page_context);
      _jspx_th_c_out_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_3.setValue( EventType.EventTypeNames.DATA_POINT );
      int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
      if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_4.setPageContext(_jspx_page_context);
      _jspx_th_c_out_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_4.setValue( EventType.EventTypeNames.DATA_SOURCE );
      int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
      if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_5.setPageContext(_jspx_page_context);
      _jspx_th_c_out_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_5.setValue( EventType.EventTypeNames.PUBLISHER );
      int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
      if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_6.setPageContext(_jspx_page_context);
      _jspx_th_c_out_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_6.setValue( EventType.EventTypeNames.SYSTEM );
      int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
      if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_7.setPageContext(_jspx_page_context);
      _jspx_th_c_out_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_7.setValue( EventType.EventTypeNames.AUDIT );
      int _jspx_eval_c_out_7 = _jspx_th_c_out_7.doStartTag();
      if (_jspx_th_c_out_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_7);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              \n              ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_forEach_0.setItems( ModuleRegistry.getDefinitions(EventTypeDefinition.class) );
      _jspx_th_c_forEach_0.setVar("eventTypeDef");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n                <option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventTypeDef.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</option>\n              ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n            </select>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <select id=\"eventStatus\">\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_8.setPageContext(_jspx_page_context);
      _jspx_th_c_out_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_8.setValue( EventsDwr.STATUS_ALL );
      int _jspx_eval_c_out_8 = _jspx_th_c_out_8.doStartTag();
      if (_jspx_th_c_out_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_8);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_9 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_9.setPageContext(_jspx_page_context);
      _jspx_th_c_out_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_9.setValue( EventsDwr.STATUS_ACTIVE );
      int _jspx_eval_c_out_9 = _jspx_th_c_out_9.doStartTag();
      if (_jspx_th_c_out_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_9);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_10 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_10.setPageContext(_jspx_page_context);
      _jspx_th_c_out_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_10.setValue( EventsDwr.STATUS_RTN );
      int _jspx_eval_c_out_10 = _jspx_th_c_out_10.doStartTag();
      if (_jspx_th_c_out_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_10);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n              <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_11 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_11.setPageContext(_jspx_page_context);
      _jspx_th_c_out_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_11.setValue( EventsDwr.STATUS_NORTN );
      int _jspx_eval_c_out_11 = _jspx_th_c_out_11.doStartTag();
      if (_jspx_th_c_out_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_11);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n            </select>\n          </td>\n        </tr>\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">");
      if (_jspx_meth_tag_alarmLevelOptions_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n        </tr>\n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\"><input id=\"keywords\" type=\"text\"/></td>\n        </tr>\n        \n        <tr>\n          <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n          <td class=\"formField\">\n            <table>\n              <tr><td>\n                 <select id=\"dateRangeType\" onchange=\"updateDateRangeFields()\">\n                   <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_12 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_12.setPageContext(_jspx_page_context);
      _jspx_th_c_out_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_12.setValue( EventsDwr.DATE_RANGE_TYPE_NONE );
      int _jspx_eval_c_out_12 = _jspx_th_c_out_12.doStartTag();
      if (_jspx_th_c_out_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_12);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                   <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_13 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_13.setPageContext(_jspx_page_context);
      _jspx_th_c_out_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_13.setValue( EventsDwr.DATE_RANGE_TYPE_RELATIVE );
      int _jspx_eval_c_out_13 = _jspx_th_c_out_13.doStartTag();
      if (_jspx_th_c_out_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_13);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                   <option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_14 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_14.setPageContext(_jspx_page_context);
      _jspx_th_c_out_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_14.setValue( EventsDwr.DATE_RANGE_TYPE_SPECIFIC );
      int _jspx_eval_c_out_14 = _jspx_th_c_out_14.doStartTag();
      if (_jspx_th_c_out_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_14);
      out.write('"');
      out.write('>');
      if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\n                 </select>\n              </td></tr>\n              <tr>\n                <td style=\"padding-left:40px;\">\n                  <table id=\"dateRangeRelative\" style=\"display: none;\">\n                    <tr>\n                      <td valign=\"top\"><input type=\"radio\" name=\"relativeType\" onchange=\"updateDateRangeFields()\"\n                              id=\"relprev\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_15 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_15.setPageContext(_jspx_page_context);
      _jspx_th_c_out_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_15.setValue( EventsDwr.RELATIVE_DATE_TYPE_PREVIOUS );
      int _jspx_eval_c_out_15 = _jspx_th_c_out_15.doStartTag();
      if (_jspx_th_c_out_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_15);
      out.write("\" \n                              checked=\"checked\"/><label for=\"relprev\">");
      if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</label></td>\n                      <td valign=\"top\">\n                        <input type=\"text\" id=\"prevPeriodCount\" class=\"formVeryShort\"/>\n                        ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("<br/>\n                        <span class=\"formError\" id=\"previousPeriodCountError\"></span>\n                      </td>\n                    </tr>\n                    <tr>\n                      <td valign=\"top\"><input type=\"radio\" name=\"relativeType\" onchange=\"updateDateRangeFields()\"\n                              id=\"relpast\" value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_16 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_out_16.setPageContext(_jspx_page_context);
      _jspx_th_c_out_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_out_16.setValue( EventsDwr.RELATIVE_DATE_TYPE_PAST );
      int _jspx_eval_c_out_16 = _jspx_th_c_out_16.doStartTag();
      if (_jspx_th_c_out_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_16);
      out.write("\"/><label \n                              for=\"relpast\">");
      if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</label></td>\n                      <td valign=\"top\">\n                        <input type=\"text\" id=\"pastPeriodCount\" class=\"formVeryShort\"/>\n                        ");
      if (_jspx_meth_tag_timePeriods_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("<br/>\n                        <span class=\"formError\" id=\"pastPeriodCountError\"></span>\n                      </td>\n                    </tr>\n                  </table>\n                  \n                  <div id=\"dateRangeSpecific\" style=\"display: none;\">");
      if (_jspx_meth_tag_dateRange_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</div>\n                </td>\n              </tr>\n            </table>\n          </td>\n        </tr>\n        \n        <tr>\n          <td colspan=\"2\" align=\"center\">\n            <input id=\"searchBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"newSearch()\"/>\n            <span id=\"searchMessage\" class=\"formError\"></span>\n          </td>\n        </tr>\n      </table>\n    </div>\n    <div id=\"searchResults\"></div>\n  </div>\n  <div id=\"datePickerDiv\" style=\"position:absolute; top:0px; left:0px;\" onmouseover=\"cancelDatePickerExpiry()\" onmouseout=\"expireDatePicker()\">\n    <div id=\"datePicker\" dojoType=\"dijit.Calendar\" dayWidth=\"narrow\" lang=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lang}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\n  </div>\n");
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
