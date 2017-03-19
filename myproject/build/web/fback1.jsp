


<%@ page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
    <head> 
        <title>reg form</title> 
            <body> 
                <%!
String n1,n2,n3,n4;
%>
<%
n1=request.getParameter("name");
n2=request.getParameter("mno");
n3=request.getParameter("email");
n4=request.getParameter("fb");
  Connection connection = null; 
                
               try
                { 
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
                
                
                Statement stmt = connection.createStatement();
                
                String query2="insert into fback values('"+n1+"','"+n2+"','"+n3+"','"+n4+"')";
                stmt.executeUpdate(query2);
                               
%>
<script type="text/javascript">
window.open("fbk2.jsp","_self",false);
</script>

<%
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
</head>
</html>

