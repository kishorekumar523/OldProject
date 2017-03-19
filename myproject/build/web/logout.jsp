
<html>
<head>
<title>login form</title></head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />
<head>
    <style type="text/css">
  p.kitty{font-size:24;float: right}  
</style>
<body bgcolor="#999999">
 <h1><font color="maroon"><marquee>Login Here</marquee></font></h1>
<div id="buttons">
         <ul>
         <li><a href="home.jsp">HOME</a></li>
         <li><a href="about.html">ABOUT US</a></li>
         <li><a href="contact.html">CONTACT US</a></li>
         </ul>
</div>
 <p class="kitty">User name</br><%=session.getAttribute("username")%></p>
 <%
session.invalidate();%>
 <script type="text/javascript">
      window.open('login.jsp','_self',false);
 </script>
 
<!--out.println("log out successfully");
<a href="home.jsp">Go to Home</a>
 response.sendRedirect("home.jsp");-->
 <!--form name="logout" action="logout1.jsp" method="post"/>
 <input type="checkbox" value="confirm" name="ckb"/>confirm
 <input type="submit" value="LogOut" name="submit"/>-->
</form>
</body>
</html>