/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-10-24 17:27:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body\r\n");
      out.write("        {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            background-color: rgb(28, 34, 46);\r\n");
      out.write("        }\r\n");
      out.write("        .form {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        width: 35%;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("        gap: 10px;\r\n");
      out.write("        max-width: 350px;\r\n");
      out.write("        padding: 25px 30px;\r\n");
      out.write("        border-radius: 20px;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        background-color: rgba(17, 24, 39, 1);\r\n");
      out.write("        box-shadow: 0px 0px 10px white;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        border: 1px solid #333;\r\n");
      out.write("        margin: 2% 35%;\r\n");
      out.write("        z-index:-1;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .title {\r\n");
      out.write("        font-size: 28px;\r\n");
      out.write("        font-weight: 600;\r\n");
      out.write("        letter-spacing: -1px;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        display: inline;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        padding-left: 30px;\r\n");
      out.write("        color:rgba(167, 139, 250, 1);\r\n");
      out.write("        margin: 0px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .title::before {\r\n");
      out.write("        width: 18px;\r\n");
      out.write("        height: 18px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .title::after {\r\n");
      out.write("        width: 18px;\r\n");
      out.write("        height: 18px;\r\n");
      out.write("        animation: pulse 1s linear infinite;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .title::before,\r\n");
      out.write("        .title::after {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        content: \"\";\r\n");
      out.write("        height: 16px;\r\n");
      out.write("        width: 16px;\r\n");
      out.write("        border-radius: 50%;\r\n");
      out.write("        left: 0px;\r\n");
      out.write("        background-color:  rgba(167, 139, 250, 1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .message, \r\n");
      out.write("        .signin {\r\n");
      out.write("        font-size: 14.5px;\r\n");
      out.write("        color: rgba(255, 255, 255, 0.7);\r\n");
      out.write("        z-index:1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signin {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signin a:hover {\r\n");
      out.write("        text-decoration: underline royalblue;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .signin a {\r\n");
      out.write("        color: rgba(167, 139, 250, 1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .flex {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        gap: 6px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form label {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form label .input {\r\n");
      out.write("        background-color: transparent;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        width: 95%;\r\n");
      out.write("        font-size: auto;\r\n");
      out.write("        padding: 10px 10px 10px 10px;\r\n");
      out.write("        border: 1px solid black;\r\n");
      out.write("        outline: 1px solid  rgba(167, 139, 250, 1);\r\n");
      out.write("        border-radius: 2px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form label .input + span {\r\n");
      out.write("        color: rgba(255, 255, 255, 0.5);\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: 10px;\r\n");
      out.write("        top: 0px;\r\n");
      out.write("        font-size: 0.9em;\r\n");
      out.write("        cursor: text;\r\n");
      out.write("        transition: 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form label .input:placeholder-shown + span {\r\n");
      out.write("        top: 12.5px;\r\n");
      out.write("        font-size: 0.9em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form label .input:focus + span,\r\n");
      out.write("        .form label .input:valid + span {\r\n");
      out.write("        color: rgba(167, 139, 250, 1);\r\n");
      out.write("        top: 0px;\r\n");
      out.write("        font-size: 0.7em;\r\n");
      out.write("        font-weight: 600;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .input-group {\r\n");
      out.write("        margin-top: 0.25rem;\r\n");
      out.write("        font-size: 0.875rem;\r\n");
      out.write("        line-height: 1.25rem;\r\n");
      out.write("        }\r\n");
      out.write("        .input-group input {\r\n");
      out.write("        width: 93%;\r\n");
      out.write("        border-radius: 0.375rem;\r\n");
      out.write("        border: 1px solid rgba(55, 65, 81, 1);\r\n");
      out.write("        outline: 0;\r\n");
      out.write("        background-color: rgba(17, 24, 39, 1);\r\n");
      out.write("        padding: 2% 3%;\r\n");
      out.write("        color: rgba(243, 244, 246, 1);\r\n");
      out.write("        }\r\n");
      out.write("        .input-group label {\r\n");
      out.write("        display: block;\r\n");
      out.write("        color: rgba(156, 163, 175, 1);\r\n");
      out.write("        margin-bottom: 4px;\r\n");
      out.write("        }\r\n");
      out.write("        .input-group input:focus {\r\n");
      out.write("        border-color: rgba(167, 139, 250);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .submit {\r\n");
      out.write("        border: none;\r\n");
      out.write("        outline: none;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        border-radius: 10px;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        transform: .3s ease;\r\n");
      out.write("        background-color:  rgba(167, 139, 250, 1);\r\n");
      out.write("        position:relative;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes pulse {\r\n");
      out.write("        from {\r\n");
      out.write("            transform: scale(0.9);\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        to {\r\n");
      out.write("            transform: scale(1.8);\r\n");
      out.write("            opacity: 0;\r\n");
      out.write("        }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <form class=\"form\" action=\"register\" method=\"post\">\r\n");
      out.write("        <p class=\"title\">Register </p>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("            <label for=\"username\">Name</label>\r\n");
      out.write("            <input type=\"text\" name=\"name\" id=\"username\" placeholder=\"Enter your name\" required>\r\n");
      out.write("            <label for=\"mobile\">Mobile</label>\r\n");
      out.write("            <input type=\"number\" name=\"phone\" id=\"mobile\" placeholder=\"Enter your phone number\" required>\r\n");
      out.write("            <label for=\"email\">Email</label>\r\n");
      out.write("            <input type=\"text\" name=\"email\" id=\"email\" placeholder=\"Enter your email\" required>\r\n");
      out.write("            <label for=\"age\">Age</label>\r\n");
      out.write("            <input type=\"number\" name=\"age\" id=\"age\" placeholder=\"Enter your age\" required>\r\n");
      out.write("            <label for=\"password\">Password</label>\r\n");
      out.write("            <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Enter password\" required>\r\n");
      out.write("            <label for=\"confirm\">Password</label>\r\n");
      out.write("            <input type=\"password\" id=\"confirm\" placeholder=\"confirm password\" required>\r\n");
      out.write("            <p style=\"opacity:0;display:inline\" id=\"msg\">passwords doesnot match</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button class=\"submit\" disabled>Submit</button>\r\n");
      out.write("        ");
String msg= (String)request.getAttribute("msg");
      out.write("\r\n");
      out.write("        <p style=\"display:inline;height:1vh;width:100;margin:0px\">");
if(msg!=null)
        {
            out.println(msg);
        }
      out.write("</p>\r\n");
      out.write("        <p class=\"signin\">Already have an account ? <a href=\"index.jsp\">Signin</a> </p>\r\n");
      out.write("    </form>\r\n");
      out.write("    <script>\r\n");
      out.write("        var inputs=document.querySelectorAll(\"input\");\r\n");
      out.write("        var msg=document.getElementById(\"msg\");\r\n");
      out.write("        var confirm=inputs[5];\r\n");
      out.write("        var submit=document.querySelector(\"button\");\r\n");
      out.write("        confirm.addEventListener(\"input\",()=>\r\n");
      out.write("        {\r\n");
      out.write("            var pass= inputs[4].value;\r\n");
      out.write("            if(pass!=confirm.value)\r\n");
      out.write("            {\r\n");
      out.write("                msg.style.opacity=1;\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("            {\r\n");
      out.write("                msg.style.opacity=0;\r\n");
      out.write("                submit.removeAttribute(\"disabled\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
