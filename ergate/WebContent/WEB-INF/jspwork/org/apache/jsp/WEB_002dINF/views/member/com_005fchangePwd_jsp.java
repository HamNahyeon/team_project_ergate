/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-06-29 11:38:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class com_005fchangePwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>기업 비밀번호 변경</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        input[type=\"number\"]::-webkit-outer-spin-button,\r\n");
      out.write("        input[type=\"number\"]::-webkit-inner-spin-button {\r\n");
      out.write("            -webkit-appearance: none;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            background-color: #e1e1e1;\r\n");
      out.write("            color: black;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            border: 2px solid rgb(107, 140, 172);\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            background-color: #e1e1e1;\r\n");
      out.write("            border: 2px solid rgb(107, 140, 172);\r\n");
      out.write("            color: black;\r\n");
      out.write("            box-shadow: 0 12px 16px 0 rgba(0, 0, 0, 0.24), 0 17px 50px 0 rgba(0, 0, 0, 0.19);\r\n");
      out.write("        }\r\n");
      out.write("        .container{\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            height: 400px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row my-5\">\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sideMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-sm-8\">\r\n");
      out.write("                <h4 class=\"mb-3\">비밀 번호 변경</h4>\r\n");
      out.write("                <br>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <form class=\"validation-form\" method=\"POST\" action=\"com_changePwd\" onsubmit=\"return pwdValidate();\">\r\n");
      out.write("                    <!-- 현재 비밀번호 -->\r\n");
      out.write("                    <div class=\"row mb-3 form-row\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <label for=\"pwd1\">현재 비밀번호</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"currentPwd\" name=\"currentPwd\" maxlength=\"20\"\r\n");
      out.write("                                placeholder=\"현재 비밀번호를 입력하세요\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- 변경 비밀번호 -->\r\n");
      out.write("                    <div class=\"row mb-3 form-row\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <label for=\"pwd1\">변경 비밀번호</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"newPwd1\" name=\"newPwd1\" maxlength=\"20\"\r\n");
      out.write("                                placeholder=\"변경 비밀번호를 입력하세요\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- 변경 비밀번호 확인 -->\r\n");
      out.write("                    <div class=\"row mb-3 form-row\">\r\n");
      out.write("                        <div class=\"col-md-3\">\r\n");
      out.write("                            <label for=\"pwd2\">변경 비밀번호 확인</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"newPwd2\" name=\"newPwd2\" maxlength=\"20\" placeholder=\"비밀번호 확인\"\r\n");
      out.write("                                required>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("                            <span id=\"checkPwd2\">&nbsp;</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("        <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">변경하기</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		function pwdValidate(){\r\n");
      out.write("			\r\n");
      out.write("		    const regExp = /^[a-zA-Z0-9#\\-\\_]{6,20}$/;\r\n");
      out.write("		\r\n");
      out.write("		    const newPwd1 = $(\"#newPwd1\").val().trim();\r\n");
      out.write("		    const newPwd2 = $(\"#newPwd2\").val().trim();\r\n");
      out.write("		    \r\n");
      out.write("		    \r\n");
      out.write("		    // 새 비밀번호가 유효하지 않거나 새 비밀번호와 새 비밀번호 확인이 같지않은 경우 true\r\n");
      out.write("		    if (!regExp.test(newPwd1) || (!newPwd1 == newPwd2)) {\r\n");
      out.write("				\r\n");
      out.write("		    	swal({\r\n");
      out.write("		    		\"icon\" : \"error\",\r\n");
      out.write("		    		\"title\" : \"비밀번호가 유효하지않습니다.\"\r\n");
      out.write("		    	});\r\n");
      out.write("		    	return false;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
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
}
