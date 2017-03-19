<%@ page language="java" %>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
<head>
<title>st1</title> </head>
<style type="text/css">
  p.kitty{font-size:24;float: right}  
</style>
<body bgcolor="#999999">
 <p class="kitty">User name</br><%=session.getAttribute("username")%></p>
                
<% 
   Connection connection = null;
   try
      { 
       Class.forName("oracle.jdbc.driver.OracleDriver");
       connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
       Statement stmt = connection.createStatement(); 
       String query = "select * from oracle";
       ResultSet rs = stmt.executeQuery(query);
                        
%>
<form name="c" action="oraclemarks.jsp">           
 <%!  int i=0;
 %>
 <%
      while(rs.next())
      {
        i++;
 %>
<table>
<tr>
       <%out.println(i+". ");%><%=rs.getString(2)%></br>
</tr>
<tr>
<input type="radio" name="k<%=i%>" value="<%=rs.getString(3)%>"/><%=rs.getString(3)%></br>
<input type="radio" name="k<%=i%>" value="<%=rs.getString(4)%>"/><%=rs.getString(4)%></br>
<input type="radio" name="k<%=i%>" value="<%=rs.getString(5)%>"/><%=rs.getString(5)%></br>
<input type="radio" name="k<%=i%>" value="<%=rs.getString(6)%>"/><%=rs.getString(6)%></br>
</tr>
</table></br>              
<%
  }
 %>
<input type="submit" value="Submit" name="submit"/>
</form>
 <%
                
i=0;
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


    %>
            </body>

</html> 

                