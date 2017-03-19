package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<head><title>register form</title></head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    td{font-size: 15pt;}\r\n");
      out.write("</style>\r\n");
      out.write("<body bgcolor=\"#999999\">\r\n");
      out.write("    \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"styles1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<h1 align=\"center\"><font color=\"maroon\"><marquee>Register Here</marquee></font></h1>\r\n");
      out.write("<div id=\"buttons\">\r\n");
      out.write("         <ul>\r\n");
      out.write("         <li><a href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("         <li><a href=\"register.jsp\">REGISTER</a></li>\r\n");
      out.write("         <li><a href=\"login.jsp\">USER LOGIN </a></li>\r\n");
      out.write("       <!--  <li><a href=\"adlogin.jsp\">ADMIN LOGIN</a></li>\r\n");
      out.write("         <li><a href=\"books.jsp\">BOOKS</a></li>-->\r\n");
      out.write("         <li><a href=\"about.html\">ABOUT US</a></li>\r\n");
      out.write("         <li><a href=\"contact.html\">CONTACT US</a></li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function validate()\r\n");
      out.write("{\r\n");
      out.write("var x1=document.getElementById(\"name\");\r\n");
      out.write(" if(x1.value==\"\")\r\n");
      out.write("     {\r\n");
      out.write("     alert(\"enter the name\");\r\n");
      out.write("     x1.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("     }\r\n");
      out.write(" var x2=document.getElementById(\"uname\");\r\n");
      out.write(" if(x2.value==\"\")\r\n");
      out.write("     {\r\n");
      out.write("     alert(\"enter the username\");\r\n");
      out.write("      x2.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("     }\r\n");
      out.write(" var x3=document.getElementById(\"pword\");\r\n");
      out.write(" if(x3.value==\"\")\r\n");
      out.write("     {\r\n");
      out.write("     alert(\"enter the password\");\r\n");
      out.write("      x3.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("     }\r\n");
      out.write("    var x4=document.getElementById(\"email\");\r\n");
      out.write("    if(x4.value==\"\")\r\n");
      out.write("     {\r\n");
      out.write("     alert(\"enter the email\");\r\n");
      out.write("      x4.focus();\r\n");
      out.write("      return false;\r\n");
      out.write("     }\r\n");
      out.write("     var x5=document.getElementById(\"mn\");\r\n");
      out.write("     if(x5.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("     alert(\"enter the mobile no\");\r\n");
      out.write("     x5.focus();\r\n");
      out.write("     return false;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write(" else\r\n");
      out.write("     return true;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</br><form name=\"regform\" action=\"reg.jsp\" onsubmit=\"return validate()\">\r\n");
      out.write("    <table>\r\n");
      out.write("     \r\n");
      out.write("    <tr><td>name *</td><td><input type=\"text\" maxlength=\"30\" value=\"\" name=\"name\" id=\"name\"/></td></tr>\r\n");
      out.write("    <tr><td>gender *</td><td><input type=\"radio\" name=\"sex\" value=\"male\" checked/>MALE<input type=\"radio\" name=\"sex\" value=\"female\"/>FEMALE</tr>\r\n");
      out.write("    <tr><td>user name *</td><td><input type=\"text\" maxlength=\"10\" value=\"\" name=\"uname\" id=\"uname\"/></td></tr>\r\n");
      out.write("    <tr><td>password *</td><td><input type=\"password\"   maxlength=\"10\" value=\"\" name=\"pword\" id=\"pword\"/></td></tr>\r\n");
      out.write("    <tr><td>email *</td><td><input type=\"email\" length=\"50\" value=\"\" name=\"email\" id=\"email\"/></td></tr>\r\n");
      out.write("    <tr><td>mobile number *</td><td><input type=\"text\" maxlength=\"10\" value=\"\" name=\"mno\" pattern=\"[0-9]{1,10}\" id=\"mn\"/></td></tr>\r\n");
      out.write("    <tr><td>nation</td><td><input type=\"text\" maxlength=\"20\" value=\"\" name=\"nation\"/></td></tr>\r\n");
      out.write("    <tr><td>state</td><td><input type=\"text\" maxlength=\"20\" value=\"\" name=\"state\"/></td></tr>\r\n");
      out.write("    <tr><td>city</td><td><input type=\"text\" maxlength=\"20\" value=\"\" name=\"city\"/></td></tr>\r\n");
      out.write("    <tr><td><input type=\"submit\"  value=\"submit\" name=\"submit\"/></td></tr>\r\n");
      out.write("    <tr><td><input type=\"reset\"  value=\"reset\" name=\"reset\"/></td></tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
