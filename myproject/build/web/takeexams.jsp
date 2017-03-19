<html>
<head>
<title>login form</title></head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />
<style type="text/css">
  p.kitty{font-size:24;float: right}  
</style>
<body bgcolor="#999999">
 <h1><font color="maroon"><marquee>Select The Exam</marquee></font></h1>
<div id="buttons">
         <ul>
         <li><a href="takeexams.jsp">TAKE AN EXAM</a></li>
         <li><a href="fback.jsp">FEED BACK</a></li>
         <li><a href="logout.jsp">LOG OUT</a></li>
         </ul>
</div>
 <p class="kitty"">User name</br><%=session.getAttribute("username")%></p>
 <image src="image18.jpg"  align="right" height="400" width="800"/>
 <form name="examsub" action="takeexams1.jsp" onsubmit="return validate()">
<input type="radio" name="subject" value="c language"/>C Language</br></br>
<input type="radio" name="subject" value="c++ language"/>C++ Language</br></br>
<input type="radio" name="subject" value="java"/>Java</br></br>
<input type="radio" name="subject" value="oracle"/>Oracle</br></br>
<input type="radio" name="subject" value="world wide web"/>World Wide Web</br></br>
<input type="radio" name="subject" value="operating systems"/>Operating Systems</br></br>
<input type="submit" length="50" value="next" name="submit"/><input type="reset" length="50" value="reset" name="reset"/>
 </form>
</body>
</html>
