<html>
<head>
<title>Feedback</title></head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />
<style type="text/css">
  p.kitty{font-size:24;float: right}  
</style>
<body bgcolor="#999999">
 <h1><font color="maroon"><marquee>Feed Back</marquee></font></h1>
<div id="buttons">
         <ul>
         <li><a href="takeexams.jsp">TAKE AN EXAM</a></li>
         <li><a href="fback.jsp">FEED BACK</a></li>
         <li><a href="logout.jsp">LOG OUT</a></li>
         </ul>
</div>
 
 <p class="kitty">User name</br><%=session.getAttribute("username")%></p>
 <image src="image17.jpg"  align="right" height="400" width="500"/>
<form action="fback1.jsp">
     <p>name:<input type="text" length="50" value="" name="name" id="name"/></p>
       <p>mobile number:<input type="number" length="50" value="" name="mno" id="mn"/></p>
       <p>email:<input type="email" length="50" value="" name="email" id="email"/></p>
    <p>Enter Your Feedback</p>
    <p><textarea name="fb" rows="10" cols="40"></textarea></p>
    <p><input type="submit" length="50" value="submit" name="submit"/></p>
</form>

</body>
</html>
