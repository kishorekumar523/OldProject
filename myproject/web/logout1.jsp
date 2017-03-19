
<%@ page language="java" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
    <head> 
        <title>reg form</title> </head>
            <body> 
                <%!
String n1;
%>
<%
   n1=request.getParameter("ckb");
   
  if(("confirm").equals(n1))
       {
    %>
    <script type="text/javascript">
window.open('logout2.jsp','_self',false);
</script>
<%
 }
   else
             {
       out.println("please conform to exit");
   }
%>              
            </body>
</html>

   