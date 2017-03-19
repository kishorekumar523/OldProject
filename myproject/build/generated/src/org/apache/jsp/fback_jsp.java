package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"styles1.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("  p.kitty{font-size:24;float: right}  \n");
      out.write("</style>\n");
      out.write("<body bgcolor=\"#999999\">\n");
      out.write(" <h1><font color=\"maroon\"><marquee>Login Here</marquee></font></h1>\n");
      out.write("<div id=\"buttons\">\n");
      out.write("         <ul>\n");
      out.write("         <li><a href=\"takeexams.jsp\">TAKE AN EXAM</a></li>\n");
      out.write("         <li><a href=\"fback.jsp\">FEED BACK</a></li>\n");
      out.write("         <li><a href=\"logout.jsp\">LOG OUT</a></li>\n");
      out.write("         </ul>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" <p class=\"kitty\">User name</br>");
      out.print(session.getAttribute("username"));
      out.write("</p>\n");
      out.write("<form action=\"fback1.jsp\">\n");
      out.write("     <p>name:<input type=\"text\" length=\"50\" value=\"\" name=\"name\" id=\"name\"/></p>\n");
      out.write("       <p>mobile number:<input type=\"number\" length=\"50\" value=\"\" name=\"mno\" id=\"mn\"/></p>\n");
      out.write("       <p>email:<input type=\"email\" length=\"50\" value=\"\" name=\"email\" id=\"email\"/></p>\n");
      out.write("    <p>Enter Your Feedback</p>\n");
      out.write("    <p><textarea name=\"fb\" rows=\"10\" cols=\"40\"></textarea></p>\n");
      out.write("    <p><input type=\"submit\" length=\"50\" value=\"submit\" name=\"submit\"/></p>\n");
      out.write("</form>\n");
      out.write(" <image src=\"image17.jpg\"  align=\"center\" height=\"450\" width=\"1000\"/>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
