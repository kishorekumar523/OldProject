package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><title>Home</title></head>\r\n");
      out.write("<body bgcolor=\"#999999\">\r\n");
      out.write("<h1 align=\"center\"><font color=\"maroon\"><marquee>EXAM MANIA </marquee></font></h1>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"styles1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<div id=\"buttons\">\r\n");
      out.write("         <ul>\r\n");
      out.write("         <li><a href=\"home.jsp\">HOME</a></li>\r\n");
      out.write("         <li><a href=\"register.jsp\">REGISTER</a></li>\r\n");
      out.write("         <li><a href=\"login.jsp\">USER LOGIN </a></li>\r\n");
      out.write("         <li><a href=\"adlogin.jsp\">ADMIN LOGIN</a></li>\r\n");
      out.write("        <!--<li><a href=\"books.jsp\">BOOKS</a></li>-->\r\n");
      out.write("         <li><a href=\"about.html\">ABOUT US</a></li>\r\n");
      out.write("         <li><a href=\"contact.html\">CONTACT US</a></li>\r\n");
      out.write("         </ul>\r\n");
      out.write("</div>\r\n");
      out.write(" <image src=\"image7.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image6.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image5.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image11.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image8.jpg\"  align=\"left\"height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image1.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image13.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image14.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image15.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
      out.write(" <image src=\"image16.jpg\" align=\"left\" height=\"250\" width=\"250\"/>\r\n");
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
