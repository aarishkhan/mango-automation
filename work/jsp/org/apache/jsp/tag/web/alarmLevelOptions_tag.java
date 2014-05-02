package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.rt.event.AlarmLevels;

public final class alarmLevelOptions_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onchange_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String id;
  private java.lang.String value;
  private java.lang.String onchange;
  private java.lang.Boolean allOption;

  public java.lang.String getId() {
    return this.id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getValue() {
    return this.value;
  }

  public void setValue(java.lang.String value) {
    this.value = value;
  }

  public java.lang.String getOnchange() {
    return this.onchange;
  }

  public void setOnchange(java.lang.String onchange) {
    this.onchange = onchange;
  }

  public java.lang.Boolean getAllOption() {
    return this.allOption;
  }

  public void setAllOption(java.lang.Boolean allOption) {
    this.allOption = allOption;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_sst_select_value_onchange_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_sst_select_value_onchange_name_id.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getId() != null ) {
      _jspx_page_context.setAttribute("id", getId());
}
    if( getValue() != null ) {
      _jspx_page_context.setAttribute("value", getValue());
}
    if( getOnchange() != null ) {
      _jspx_page_context.setAttribute("onchange", getOnchange());
}
    if( getAllOption() != null ) {
      _jspx_page_context.setAttribute("allOption", getAllOption());
}

    try {
      //  sst:select
      com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_name_id.get(com.serotonin.web.taglib.SelectTag.class);
      _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
      _jspx_th_sst_select_0.setParent(null);
      _jspx_th_sst_select_0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      _jspx_th_sst_select_0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${value}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      _jspx_th_sst_select_0.setOnchange((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${onchange}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
      if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n  ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_0, _jspx_page_context))
            return;
          out.write("\n  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_1.setValue( Integer.toString(AlarmLevels.NONE) );
          int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
          if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_1.doInitBody();
            }
            do {
              //  fmt:message
              org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
              _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
              _jspx_th_fmt_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
              _jspx_th_fmt_message_1.setKey( AlarmLevels.NONE_DESCRIPTION );
              int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
              if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
                throw new SkipPageException();
              }
              _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
              int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
          out.write("\n  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_2.setValue( Integer.toString(AlarmLevels.INFORMATION) );
          int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
          if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_2.doInitBody();
            }
            do {
              //  fmt:message
              org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
              _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
              _jspx_th_fmt_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
              _jspx_th_fmt_message_2.setKey( AlarmLevels.INFORMATION_DESCRIPTION );
              int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
              if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
                throw new SkipPageException();
              }
              _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
              int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
          out.write("\n  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_3.setValue( Integer.toString(AlarmLevels.URGENT) );
          int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
          if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_3.doInitBody();
            }
            do {
              //  fmt:message
              org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
              _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
              _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_3);
              _jspx_th_fmt_message_3.setKey( AlarmLevels.URGENT_DESCRIPTION );
              int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
              if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
                throw new SkipPageException();
              }
              _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
              int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
          out.write("\n  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_4.setValue( Integer.toString(AlarmLevels.CRITICAL) );
          int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
          if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_4.doInitBody();
            }
            do {
              //  fmt:message
              org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
              _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
              _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_4);
              _jspx_th_fmt_message_4.setKey( AlarmLevels.CRITICAL_DESCRIPTION );
              int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
              if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
                throw new SkipPageException();
              }
              _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
              int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
          out.write("\n  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_5.setValue( Integer.toString(AlarmLevels.LIFE_SAFETY) );
          int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
          if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_5.doInitBody();
            }
            do {
              //  fmt:message
              org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
              _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
              _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_5);
              _jspx_th_fmt_message_5.setKey( AlarmLevels.LIFE_SAFETY_DESCRIPTION );
              int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
              if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
                throw new SkipPageException();
              }
              _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
              int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
          out.write("\n  ");
          //  sst:option
          com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
          _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
          _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
          _jspx_th_sst_option_6.setValue( Integer.toString(AlarmLevels.DO_NOT_LOG) );
          int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
          if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_sst_option_6.doInitBody();
            }
            do {
              //  fmt:message
              org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
              _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
              _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_6);
              _jspx_th_fmt_message_6.setKey( AlarmLevels.DO_NOT_LOG_DESCRIPTION );
              int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
              if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
                throw new SkipPageException();
              }
              _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
              int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
            throw new SkipPageException();
          }
          _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
          out.write("\n  \n");
          int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_0);
        throw new SkipPageException();
      }
      _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_0);
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allOption}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_sst_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sst_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_sst_option_0.setValue("-1");
    int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
    if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_0.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_0.setKey("common.all");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }
}
