<html>
<head><title>register form</title></head>
<style type="text/css">
    td{font-size: 15pt;}
</style>
<body bgcolor="#999999">
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="styles1.css" rel="stylesheet" type="text/css" />

<h1 align="center"><font color="maroon"><marquee>Register Here</marquee></font></h1>
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
<script type="text/javascript">
function validate()
{
var x1=document.getElementById("name");
 if(x1.value=="")
     {
     alert("enter the name");
     x1.focus();
      return false;
     }
 var x2=document.getElementById("uname");
 if(x2.value=="")
     {
     alert("enter the username");
      x2.focus();
      return false;
     }
 var x3=document.getElementById("pword");
 if(x3.value=="")
     {
     alert("enter the password");
      x3.focus();
      return false;
     }
    var x4=document.getElementById("email");
    if(x4.value=="")
     {
     alert("enter the email");
      x4.focus();
      return false;
     }
     var x5=document.getElementById("mn");
     if(x5.value=="")
      {
     alert("enter the mobile no");
     x5.focus();
     return false;
     }
     
 else
     return true;
}
</script>

</br><form name="regform" action="reg.jsp" onsubmit="return validate()">
    <table>
     
    <tr><td>name *</td><td><input type="text" maxlength="30" value="" name="name" id="name"/></td></tr>
    <tr><td>gender *</td><td><input type="radio" name="sex" value="male" checked/>MALE<input type="radio" name="sex" value="female"/>FEMALE</tr>
    <tr><td>user name *</td><td><input type="text" maxlength="10" value="" name="uname" id="uname"/></td></tr>
    <tr><td>password *</td><td><input type="password"   maxlength="10" value="" name="pword" id="pword"/></td></tr>
    <tr><td>email *</td><td><input type="email" length="50" value="" name="email" id="email"/></td></tr>
    <tr><td>mobile number *</td><td><input type="text" maxlength="10" value="" name="mno" pattern="[0-9]{1,10}" id="mn"/></td></tr>
    <tr><td>nation</td><td><input type="text" maxlength="20" value="" name="nation"/></td></tr>
    <tr><td>state</td><td><input type="text" maxlength="20" value="" name="state"/></td></tr>
    <tr><td>city</td><td><input type="text" maxlength="20" value="" name="city"/></td></tr>
    <tr><td><input type="submit"  value="submit" name="submit"/></td>
    <td><input type="reset"  value="reset" name="reset"/></td>
    <td><input type="button"  value="cancel" name="cancel"/></td></tr>
    </table>
</form>
</body>
</html>

                    