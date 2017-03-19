package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String n1,n2,n3,n4,n5,n6,n7,n8,n9;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html> \r\n");
      out.write("    <head> \r\n");
      out.write("        <title>reg form</title> \r\n");
      out.write("            <body> \r\n");
      out.write("                ");
      out.write('\r');
      out.write('\n');

n1=request.getParameter("name");
n2=request.getParameter("sex");
n3=request.getParameter("uname");
n4=request.getParameter("pword");
n5=request.getParameter("email");
n6=request.getParameter("mno");
n7=request.getParameter("nation");
n8=request.getParameter("state");
n9=request.getParameter("city");
Connection connection = null; 
                
               try
                { 
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
                
                
                Statement stmt = connection.createStatement();
                
                String query2="insert into register values('"+n1+"','"+n2+"','"+n3+"','"+n4+"','"+n5+"','"+n6+"','"+n7+"','"+n8+"','"+n9+"')";
                stmt.executeUpdate(query2);
                               

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.open(\"reg1.html\",\"_self\",false);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

                               }
       
                               
                             

   catch(Exception ex)
  {
       out.println("Exception : " + ex.getMessage() + "");
  }

finally
                        { 
    if(connection != null) 
{ 
    try { 
       
        connection.close(); 
    } 
    catch (Exception ignored)
            {

} 
    }
       }


    
      out.write("\r\n");
      out.write("            </body>\r\n");
      out.write("</head>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
