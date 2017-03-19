package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


 String n1;
 String n2;
 

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html> \n");
      out.write("    <head> \n");
      out.write("        <title>st1</title> \n");
      out.write("            <body> \n");
      out.write("                ");
      out.write("\n");
      out.write("               \n");
      out.write("                ");
 
   n1=request.getParameter("uname");
   n2=request.getParameter("pword");
                Connection connection = null;
 try
                { 
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
                
                
                Statement stmt = connection.createStatement(); 
                String query ="select username from register where password='"+n2+"'";
			// Updating Table
                ResultSet rs = stmt.executeQuery(query);
                        rs.next();
if((rs.getString("username")).equals(n1))
      {
               
       
      out.write(" <script type=\"text/javascript\">\n");
      out.write("       window.open('login1.html','_self',false);\n");
      out.write("       </script>\n");

       }
                        else
                                                       {
                            out.println("sorry");
                            
                        }
              
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


    
      out.write("\n");
      out.write("            </body>\n");
      out.write("</head>\n");
      out.write("</html> \n");
      out.write("\n");
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
