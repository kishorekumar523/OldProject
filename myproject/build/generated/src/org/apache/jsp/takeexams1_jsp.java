package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class takeexams1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


 String n1,n2;

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html> \r\n");
      out.write("    <head> \r\n");
      out.write("        <title>clanguage</title> </head>\r\n");
      out.write("            <body> \r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      ");

   n1=request.getParameter("subject");
   n2="k";
   Connection connection=null;
           try
               { 
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
                
                
                Statement stmt = connection.createStatement();
                
                String query1="insert into subject values('"+n2+"','"+n1+"')";
                stmt.executeUpdate(query1);
   
             if(("c language").equals(n1))
             {
 
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("window.open('clanguage.jsp','_self',false);\r\n");
      out.write("</script>\r\n");

             }
 if(("c++ language").equals(n1))
       {
    
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.open('cpplanguage.jsp','_self',false);\r\n");
      out.write("</script>\r\n");
      out.write(" ");
 
   }
             if(("java").equals(n1))
             {
  
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("window.open('java.jsp','_self',false);\r\n");
      out.write("</script>\r\n");
      out.write(" ");
 
  }
             if(("oracle").equals(n1))
             {
  
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("window.open('oracle.jsp','_self',false);\r\n");
      out.write("</script>\r\n");
      out.write(" ");
 
   }
             if(("world wide web").equals(n1))
             {
  
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("window.open('www.jsp','_self',false);\r\n");
      out.write("</script>\r\n");
      out.write(" ");
 
   }
             if(("operating systems").equals(n1))
             {
  
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("window.open('os.jsp','_self',false);\r\n");
      out.write("</script>\r\n");
      out.write("    ");

       }
                        else
                                                       {
                            out.println("Please Select the Option");
                            
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
            {

} 
    }
       }
           
      out.write("\r\n");
      out.write("            </body>\r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");
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
