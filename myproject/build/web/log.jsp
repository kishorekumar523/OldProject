<%@ page language="java" %>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
    <head> 
        <title>st1</title> 
            <body> 
                <%!
 String n1;
 String n2;
 
%>
               
                <% 
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
       session.setAttribute("username", n1);
       //String username = (String)session.getAttribute("username");
       %> <script type="text/javascript">
       window.open('login1.jsp','_self',false);
       </script>
<%
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


    %>
            </body>
</head>
</html> 

                