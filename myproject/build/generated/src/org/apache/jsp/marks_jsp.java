package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class marks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int j=0;
                String cl;
                        
 
int i=0; 

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
      out.write("    <head>\r\n");
      out.write("        <title>st1</title> \r\n");
      out.write("            <body> \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("               \r\n");
      out.write("                ");

                     
   
                Connection connection = null;
      try
                   {
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
                
                
                Statement stmt = connection.createStatement(); 
                String query = "select * from clanguage";
                
			// Updating Table
                ResultSet rs = stmt.executeQuery(query);
                        //rs.next();
            
      out.write("                    \r\n");
      out.write("                                   \r\n");
      out.write("     ");
      out.write('\r');
      out.write('\n');

       while(rs.next())
        {
           
           i++;
          cl=request.getParameter("k"+i);
          out.println(request.getParameter("k"+i));
       if(rs.getString(7).trim().equalsIgnoreCase(cl))
       j++;
    }
out.println(j);

      out.write("           \r\n");

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
            { // ignore }

}
    }
       }


    
      out.write("\r\n");
      out.write("            </body>\r\n");
      out.write("</head>\r\n");
      out.write("</html> \r\n");
      out.write("\r\n");
      out.write("                ");
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
