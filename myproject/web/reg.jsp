


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
String n1,n2,n3,n4,n5,n6,n7,n8,n9;
%>
<%
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
                               
%>
<script type="text/javascript">
window.open("reg1.html","_self",false);
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

