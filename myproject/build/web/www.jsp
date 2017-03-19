<html>
<head>
    <style type="text/css">
        p.kitty{font-size:24;float: right} 
        #abc{float:right}
        </style>
<title>world wide web</title></head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />
<body bgcolor="#999999">
 <h1><font color="maroon"><marquee>WORLD WIDE WEB</marquee></font></h1>
<div id="buttons">
         <ul>
         <li><a href="takeexams.jsp">TAKE AN EXAM</a></li>
         <li><a href="fback.jsp">FEED BACK</a></li>
         <li><a href="logout.jsp">LOG OUT</a></li>
         </ul>
</div>
 <!--<a href="ref1.jsp">REFERENCE</a>-->
<p class="kitty">User name</br><%=session.getAttribute("username")%></p>
 </br><img id="abc" src="exam.jpg" height="500" width="700"/>
 </br></br></br></br></br><a href="www1.jsp">To Write an Exam </br></br> CLICK HERE</br><img src="click.jpg"/></a>
</body>
</html>