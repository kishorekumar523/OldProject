
<%@ page language="java" %>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
    <head> 
        <title>clanguage</title> </head>
            <body> 
                <%!
 String n1,n2;
%>

      <%
   n1=request.getParameter("subject");
   n2=(String)session.getAttribute("username");
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
 %>
  <script type="text/javascript">
window.open('clanguage.jsp','_self',false);
</script>
<%
             }
 if(("c++ language").equals(n1))
       {
    %>
<script type="text/javascript">
window.open('cpplanguage.jsp','_self',false);
</script>
 <% 
   }
             if(("java").equals(n1))
             {
  %>
  <script type="text/javascript">
window.open('java.jsp','_self',false);
</script>
 <% 
  }
             if(("oracle").equals(n1))
             {
  %>
  <script type="text/javascript">
window.open('oracle.jsp','_self',false);
</script>
 <% 
   }
             if(("world wide web").equals(n1))
             {
  %>
  <script type="text/javascript">
window.open('www.jsp','_self',false);
</script>
 <% 
   }
             if(("operating systems").equals(n1))
             {
  %>
  <script type="text/javascript">
window.open('os.jsp','_self',false);
</script>
    <%
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
           %>
            </body>
</html>
 

                