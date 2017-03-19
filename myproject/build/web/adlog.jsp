<%@ page language="java" %>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
    <head> 
        <title>admin</title> 
            <body> 
                <%!
 String n1;
 String n2;
 
%>
               
                <% 
   n1=request.getParameter("uname");
   n2=request.getParameter("pword");
               
if("kishore".equals(n1))
      {
       
       %> <script type="text/javascript">
       window.open('adlogin1.jsp','_self',false);
       </script>
<%
       }
                        else
                                                      {
                            out.println("sorry");
                            
             
    %>
            </body>
</head>
</html> 

                