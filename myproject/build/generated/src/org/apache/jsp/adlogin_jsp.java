package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>login form</title></head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    img{float:right}\n");
      out.write("</style>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"styles1.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<head>\n");
      out.write("<body bgcolor=\"#999999\">\n");
      out.write("    <h1><font color=\"maroon\"><marquee>Login Here</marquee></font></h1>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function validate()\n");
      out.write("{\n");
      out.write("var x1=document.getElementById(\"uname\");\n");
      out.write(" if(x1.value==\"\")\n");
      out.write("     {\n");
      out.write("     alert(\"enter the user name\");\n");
      out.write("     x1.focus();\n");
      out.write("      return false;\n");
      out.write("     }\n");
      out.write("     var x2=document.getElementById(\"pword\");\n");
      out.write(" if(x2.value==\"\")\n");
      out.write("     {\n");
      out.write("     alert(\"enter the password\");\n");
      out.write("     x2.focus();\n");
      out.write("      return false;\n");
      out.write("     }\n");
      out.write("     else\n");
      out.write("         return true;\n");
      out.write("}\n");
      out.write("     \n");
      out.write("</script>\n");
      out.write("<div id=\"buttons\">\n");
      out.write("         <ul>\n");
      out.write("         <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("         <li><a href=\"register.jsp\">REGISTER</a></li>\n");
      out.write("         <li><a href=\"login.jsp\">USER LOGIN </a></li>\n");
      out.write("         <li><a href=\"adlogin.jsp\">ADMIN LOGIN</a></li>\n");
      out.write("        <!--<li><a href=\"books.jsp\">BOOKS</a></li>-->\n");
      out.write("         <li><a href=\"about.html\">ABOUT US</a></li>\n");
      out.write("         <li><a href=\"contact.html\">CONTACT US</a></li>\n");
      out.write("         </ul>\n");
      out.write("</div>\n");
      out.write("<form name=\"login\" onsubmit=\"return validate()\" action=\"adlog.jsp\">\n");
      out.write("   <h3>username<input type=\"text\" name=\"uname\" length=\"50\" id=\"uname\"/></h3>\n");
      out.write("   <h3>password<input type=\"password\" name=\"pword\" id=\"pword\"/></h3>\n");
      out.write("   <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"submit\" value=\"submit\"/></p>\n");
      out.write("</body>\n");
      out.write("</html>");
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
