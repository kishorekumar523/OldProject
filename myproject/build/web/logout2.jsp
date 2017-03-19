<%-- 
    Document   : logout2
    Created on : May 5, 2013, 1:16:11 PM
    Author     : kishorekumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#999999">
       <%=session.getAttribute("username")%>  Logged out Successfully
        <a href="home.jsp">Back To Home</a>
    </body>
</html>
