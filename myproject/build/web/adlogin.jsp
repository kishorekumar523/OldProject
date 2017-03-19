<html>
<head>
<title>login form</title></head>
<style type="text/css">
    img{float:right}
</style>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />
<head>
<body bgcolor="#999999">
    <h1><font color="maroon"><marquee>Login Here</marquee></font></h1>
<script type="text/javascript">
    function validate()
{
var x1=document.getElementById("uname");
 if(x1.value=="")
     {
     alert("enter the user name");
     x1.focus();
      return false;
     }
     var x2=document.getElementById("pword");
 if(x2.value=="")
     {
     alert("enter the password");
     x2.focus();
      return false;
     }
     else
         return true;
}
     
</script>
<div id="buttons">
         <ul>
         <li><a href="home.jsp">HOME</a></li>
         <li><a href="register.jsp">REGISTER</a></li>
         <li><a href="login.jsp">USER LOGIN </a></li>
         <li><a href="adlogin.jsp">ADMIN LOGIN</a></li>
        <!--<li><a href="books.jsp">BOOKS</a></li>-->
         <li><a href="about.html">ABOUT US</a></li>
         <li><a href="contact.html">CONTACT US</a></li>
         </ul>
</div>
<form name="login" onsubmit="return validate()" action="adlog.jsp">
   <h3>username<input type="text" name="uname" length="50" id="uname"/></h3>
   <h3>password<input type="password" name="pword" id="pword"/></h3>
   <p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="submit"/></p>
</body>
</html>