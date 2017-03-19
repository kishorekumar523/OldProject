package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class takeexams_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("<title>login form</title></head>\r\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"styles1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  p.kitty{font-size:24;float: right}  \r\n");
      out.write("</style>\r\n");
      out.write("<body bgcolor=\"#999999\">\r\n");
      out.write(" <h1><font color=\"maroon\"><marquee>Select The Exam</marquee></font></h1>\r\n");
      out.write("<div id=\"buttons\">\r\n");
      out.write("         <ul>\r\n");
      out.write("         <li><a href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("         <li><a href=\"books.jsp\">BOOKS</a></li>\r\n");
      out.write("         <li><a href=\"takeexams.jsp\">TAKE AN EXAM</a></li>\r\n");
      out.write("         <li><a href=\"about.html\">ABOUT US</a></li>\r\n");
      out.write("         <li><a href=\"contact.html\">CONTACT US</a></li>\r\n");
      out.write("         <li><a href=\"logout.jsp\">LOG OUT</a></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("</div>\r\n");
      out.write(" <p class=\"kitty\"\">User name</br>");
      out.print(session.getAttribute("username"));
      out.write("</p>\r\n");
      out.write(" \r\n");
      out.write(" <form name=\"examsub\" action=\"takeexams1.jsp\" onsubmit=\"return validate()\">\r\n");
      out.write("<input type=\"radio\" name=\"subject\" value=\"c language\"/>C Language</br></br>\r\n");
      out.write("<input type=\"radio\" name=\"subject\" value=\"c++ language\"/>C++ Language</br></br>\r\n");
      out.write("<input type=\"radio\" name=\"subject\" value=\"java\"/>Java</br></br>\r\n");
      out.write("<input type=\"radio\" name=\"subject\" value=\"oracle\"/>Oracle</br></br>\r\n");
      out.write("<input type=\"radio\" name=\"subject\" value=\"world wide web\"/>World Wide Web</br></br>\r\n");
      out.write("<input type=\"radio\" name=\"subject\" value=\"operating systems\"/>Operating Systems</br></br>\r\n");
      out.write("<input type=\"submit\" length=\"50\" value=\"next\" name=\"submit\"/><input type=\"reset\" length=\"50\" value=\"reset\" name=\"reset\"/>\r\n");
      out.write(" </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
