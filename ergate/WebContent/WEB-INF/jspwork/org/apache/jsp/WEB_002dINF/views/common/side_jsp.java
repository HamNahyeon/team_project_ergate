/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-06-29 11:59:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class side_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1624587274382L));
    _jspx_dependants.put("jar:file:/C:/workspace/0_semiproject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ergate/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>관리자 메인 페이지</title>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        @font-face {\r\n");
      out.write("    font-family: 'MaplestoryOTFBold';\r\n");
      out.write("    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_20-04@2.1/MaplestoryOTFBold.woff') format('woff');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("		html,body{\r\n");
      out.write("		height : 100%;\r\n");
      out.write("		box-sizing: border-box;\r\n");
      out.write("		}\r\n");
      out.write("        #main-side{\r\n");
      out.write("        	float : left;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            width: 180px;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #menu {\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            float: left;\r\n");
      out.write("            background-color: rgb(166  , 206, 231);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .cursor {\r\n");
      out.write("            color: white;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-family: 'MaplestoryOTFBold';\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .ul{\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("        ul{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("        li{\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("        .font{\r\n");
      out.write("            font-size: 25px;\r\n");
      out.write("        }\r\n");
      out.write("        .admin{\r\n");
      out.write("            color : white\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("       #menu-area{\r\n");
      out.write("           height: 80%;\r\n");
      out.write("       }\r\n");
      out.write("       #logout-area{\r\n");
      out.write("           height: 20%;\r\n");
      out.write("       }\r\n");
      out.write("       a{\r\n");
      out.write("       text-decoration: none;}\r\n");
      out.write("       .menu-menu-color{\r\n");
      out.write("               color: white;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-family: 'MaplestoryOTFBold';\r\n");
      out.write("       }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"main-side\">\r\n");
      out.write("        <div id=\"menu\" >\r\n");
      out.write("            <div id=\"menu-area\">\r\n");
      out.write("            <div><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/KakaoTalk_20210607_142908187.png\" alt=\"\" width=\"50%\" style=\"margin-left: 45px;\"></div>\r\n");
      out.write("            <div style=\"text-align: center; font-size: 20px; font-family: 'MaplestoryOTFBold';\">일개미</div>\r\n");
      out.write("            <hr color=\"white\" size=\"2px\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"post-admin\" class=\"admin font cursor\">▶ 기업</div>\r\n");
      out.write("            <div class=\"ul cursor\">\r\n");
      out.write("                <ul class=\"second\">\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/ComBoardAll?type=2\">-게시판 전체조회</a></li>\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/ComBoardB?type=2\">-게시판 블라인드</a></li>\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/ComMemberAll?type=2\">-회원 전체 조회</a></li>\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/ComMemberDel?type=2\">-회원 삭제</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"mem-admin\" class=\"admin font cursor\">▶ 회원</div>\r\n");
      out.write("            <div class=\"ul cursor\">\r\n");
      out.write("                <ul class=\"second\">\r\n");
      out.write("                   <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/freBoardAll?type=1\">-게시판 전체조회</a></li>\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/freBoardB?type=1\">-게시판 블라인드</a></li>\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/freMemberAll?type=1\">-회원 전체 조회</a></li>\r\n");
      out.write("                    <li ><a class=\"menu-menu-color\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/freMemberDel?type=1\">-회원 삭제</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"inquiry\" class=\"font cursor\" style=\"margin-bottom: 20px;\"><a class=\"menu-menu-color\" herf=\"\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/qusetions\"></a>▶ 문의 사항</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"logout-area\">\r\n");
      out.write("            <div style=\"text-align: center;\"><a href=\"\" style=\"text-decoration: none;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/img/external-link-297789_640.png\" width=\"50px\"></a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("     \r\n");
      out.write("        $('.admin').on(\"click\", function () {\r\n");
      out.write("            if ($(this).next().css(\"display\") == \"none\") {\r\n");
      out.write("                $(this).siblings(\".ul\").slideUp();\r\n");
      out.write("                $(this).next().slideDown();\r\n");
      out.write("            } else {\r\n");
      out.write("                $(this).next().slideUp();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write(" \r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/common/side.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/common/side.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/common/side.jsp(6,0) '${pageContext.servletContext.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.servletContext.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/common/side.jsp(6,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setScope("application");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
