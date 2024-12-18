/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.96
 * Generated at: 2024-10-27 16:28:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bank_dto.Bank;
import bank_dto.User;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("bank_dto.Bank");
    _jspx_imports_classes.add("bank_dto.User");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Bank Webpage</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("    font-family: 'Segoe UI', sans-serif;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    min-height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    background-color: #2c3e50;\r\n");
      out.write("    padding: 15px 30px;\r\n");
      out.write("    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-left .username {\r\n");
      out.write("    color: #ecf0f1;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-center {\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: flex-end;\r\n");
      out.write("    padding: 0 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-bar {\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    border: 1px solid #bdc3c7;\r\n");
      out.write("    border-radius: 5px; /* Reduced border radius */\r\n");
      out.write("    outline: none;\r\n");
      out.write("    transform: translateX(1.8vw);\r\n");
      out.write("    transition: border-color 0.3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-bar:focus {\r\n");
      out.write("    border-color: #3498db;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-right {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: flex-end;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    margin-left: 25px;\r\n");
      out.write("}\r\n");
      out.write(".main-button, .submenu-button {\r\n");
      out.write("    background-color: rgba(167, 139, 250, 1);\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 10px 20px; /* Adjusted padding for consistency */\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    border-radius: 5px; /* Reduced border radius */\r\n");
      out.write("    transition: background-color 0.3s, transform 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-button:hover, .submenu-button:hover {\r\n");
      out.write("    background-color: rgba(141, 113, 230, 1);\r\n");
      out.write("    transform: scale(1.05);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content, .submenu-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    min-width: 200px;\r\n");
      out.write("    box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    transform: translate(-3vw,0.3vh);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content span {\r\n");
      out.write("    color: #2c3e50;\r\n");
      out.write("    padding: 10px 15px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-submenu {\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-submenu .submenu-content {\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 200px;\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    padding: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content .submenu-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    border-top: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content span:hover + .submenu-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-submenu:hover .submenu-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit-button {\r\n");
      out.write("    background-color: rgba(167, 139, 250, 1);\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin: 10px 30%;\r\n");
      out.write("    border-radius: 5px; /* Reduced border radius */\r\n");
      out.write("    transition: background-color 0.3s, transform 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".submit-button:hover {\r\n");
      out.write("    background-color: rgba(141, 113, 230, 1);\r\n");
      out.write("    transform: scale(1.05);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content {\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 50px 30px;\r\n");
      out.write("    background-size: 100% 80vh;\r\n");
      out.write("    background-position: 0px 0vh;\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    background-image: url(bankin.jpg);\r\n");
      out.write("    background-size: 103vw 94vh;\r\n");
      out.write("    background-position:-1.5vw 0vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content h1 {\r\n");
      out.write("    color: #34495e;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content p {\r\n");
      out.write("    color: #7f8c8d;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("    line-height: 1.6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".create-account-button {\r\n");
      out.write("    background-color: rgba(167, 139, 250, 1);\r\n");
      out.write("    color: white;\r\n");
      out.write("    border: none;\r\n");
      out.write("    padding: 15px 30px;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    border-radius: 5px; /* Reduced border radius */\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s, transform 0.2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".create-account-button:hover {\r\n");
      out.write("    background-color: rgba(141, 113, 230, 1);\r\n");
      out.write("    transform: scale(1.05);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("    background-color: #2c3e50;\r\n");
      out.write("    color: #ecf0f1;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 15px 0;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write(".submenu-button\r\n");
      out.write("{   \r\n");
      out.write("    width: 90%;\r\n");
      out.write("    display: inline;\r\n");
      out.write("    margin: 4% 6% ;\r\n");
      out.write("}\r\n");
      out.write("#trans\r\n");
      out.write("{\r\n");
      out.write("    transform: translateX(-28.8vw);\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("#trans:hover\r\n");
      out.write("{\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("#transaction:hover+#trans\r\n");
      out.write("{\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("#search\r\n");
      out.write("{\r\n");
      out.write("    margin-left: 1vw;\r\n");
      out.write("    background-color:skyblue;\r\n");
      out.write("    border-radius:25px;\r\n");
      out.write("    color:black;\r\n");
      out.write("    transform: translateX(1.5vw);\r\n");
      out.write("}\r\n");
      out.write("a\r\n");
      out.write("{\r\n");
      out.write("	text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#password\r\n");
      out.write("{\r\n");
      out.write("    margin: 7% 5%;\r\n");
      out.write("    padding: 4% 2.5%;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    border: 0.5px solid gray;\r\n");
      out.write("    outline: 0.5px solid gray;\r\n");
      out.write("}\r\n");
      out.write("#balance\r\n");
      out.write("{\r\n");
      out.write("transform:translateX(-7vw);\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"navbar\">\r\n");
      out.write("        ");
User user=(User)session.getAttribute("user");
	    String name=user.getName();
      out.write("\r\n");
      out.write("        <div class=\"navbar-left\">\r\n");
      out.write("            <span class=\"username\">WELCOME, ");
      out.print(name);
      out.write("</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-center\">\r\n");
      out.write("            <input type=\"text\" class=\"search-bar\" placeholder=\"Search...\">\r\n");
      out.write("            <button class=\"main-button\" id=\"search\">Search</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"navbar-right\">\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"main-button\">Menu</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"Profile.jsp\"><button class=\"submenu-button\">Profile</button></a>\r\n");
      out.write("                    <a href=\"Update.jsp\"><button class=\"submenu-button\">Update</button></a>\r\n");
      out.write("                    <a href=\"Delete.jsp\"><button class=\"submenu-button\">Delete</button></a>\r\n");
      out.write("                    <a href=\"index.jsp\"><button class=\"submenu-button\">Logout</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"main-button\">Account</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"accountdetails.jsp\"><button class=\"submenu-button\">Account Details</button></a>\r\n");
      out.write("                    <div class=\"dropdown-submenu\">\r\n");
      out.write("                        <button id=\"transaction\" class=\"submenu-button\">tranaction</button>\r\n");
      out.write("                        <div id=\"trans\" class=\"submenu-content\">\r\n");
      out.write("                            <a href=\"selftransfer.jsp\"><button class=\"submenu-button\">To Self Account</button></a>\r\n");
      out.write("                            <a href=\"Transaction.jsp\"><button class=\"submenu-button\">To Other Accounts</button></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"history\"><button class=\"submenu-button\">History</button></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"main-button\">Balance</button>\r\n");
      out.write("                <div id=\"balance\" class=\"dropdown-content\">\r\n");
      out.write("                    ");
String pass= ((User)session.getAttribute("user")).getPassword();
                    Bank bank=(Bank)session.getAttribute("bank");
                    int balance=bank.getBalance();
                    long account=bank.getAccountnumber();
                    if(account>0)
                    {
      out.write("\r\n");
      out.write("                    <input type=\"password\" id=\"password\" placeholder=\"Enter Password\"/>\r\n");
      out.write("                    <h2 id=\"bal\" style=\"display:none;\">₹ ");
      out.print(balance);
      out.write(". INR</h2>\r\n");
      out.write("                    <button class=\"submit-button\" id=\"sub\" onclick=\"fun1('");
      out.print(pass);
      out.write("')\">Submit</button>\r\n");
      out.write("                    ");
}
                    else
                    {
                        out.println("<h3 style='padding:4%'>no account to fetch balance from</h3>");
                    }
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <h1>Welcome to Our Banking Service</h1>\r\n");
      out.write("        <p>Your reliable partner for all your banking needs.</p>\r\n");
      out.write("        ");
String status= (String)session.getAttribute("status");
		if(status!="created")
		{
		
      out.write("\r\n");
      out.write("        <a href=\"bankaccount.jsp\"><button class=\"create-account-button\">Create Account</button></a>\r\n");
      out.write("        ");
 }
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <p>Contact Details: Email - naresh@gmail.com | Phone - +83338 *****</p>\r\n");
      out.write("    </div>\r\n");
      out.write("<script>\r\n");
      out.write("	function fun1(pass)\r\n");
      out.write("	{\r\n");
      out.write("		var password=document.getElementById(\"password\");\r\n");
      out.write("		var sub=document.getElementById(\"sub\");\r\n");
      out.write("		var bal=document.getElementById(\"bal\");\r\n");
      out.write("		if(pass===password.value)\r\n");
      out.write("		{\r\n");
      out.write("			password.style.display=\"none\";\r\n");
      out.write("			bal.style.display=\"block\";\r\n");
      out.write("			sub.style.display=\"none\";\r\n");
      out.write("		}\r\n");
      out.write("		else\r\n");
      out.write("		{\r\n");
      out.write("			password.value=\"\";\r\n");
      out.write("			password.setAttribute(\"placeholder\",\"invalid password\");\r\n");
      out.write("			password.style.border=\"1px solid red\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
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
