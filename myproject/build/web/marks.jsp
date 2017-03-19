
<%@ page language="java" %>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>

<html> 
    <head>
        <title>marks</title></head>
            <body>
                <%!
                  String cl,n1,n2;
                  
                  int j=0;
                %>
               
                <%
                   n1=(String)session.getAttribute("username");
                   n2="c language";                   
   
              Connection connection = null;
              try
                   {
                   Class.forName("oracle.jdbc.driver.OracleDriver");
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "kishore", "kishore");
                
                
                Statement stmt = connection.createStatement(); 
                String query = "select * from clanguage";
                
			// Updating Table
                ResultSet rs = stmt.executeQuery(query);
                        //rs.next();
            %>                    
                                   
     <%! 
int i=0; 
%>
<%
       while(rs.next())
        {
           
       i++;
       cl=request.getParameter("k"+i);
       if(rs.getString(7).equals(cl))
       j++;
    }
                i=0;
out.println("Your score is : "+j);
 String query1="insert into marks values('"+n1+"','"+j+"','"+n2+"')";
stmt.executeUpdate(query1);
%>           
<%
j=0;
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

                