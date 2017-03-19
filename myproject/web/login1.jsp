<html>
<head>
<title>login form</title></head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />
<style type="text/css">
  p.kitty{font-size:24;float: right}  
</style>
<body bgcolor="#999999">
    <h1 align="center"><font color="maroon">EXAM MANIA</font></h1>
<div id="buttons">
         <ul>
         <li><a href="takeexams.jsp">TAKE AN EXAM</a></li>
         <li><a href="fback.jsp">FEED BACK</a></li>
         <li><a href="logout.jsp">LOG OUT</a></li>
         </ul>
</div>
 <p class="kitty">User name</br><%=session.getAttribute("username")%></p>
 <image src="image1.jpg"  align="center" height="450" width="1000"/>
 </body>
</html>
