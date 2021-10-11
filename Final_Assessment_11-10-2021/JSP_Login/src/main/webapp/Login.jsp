<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
        <h1>Login Form</h1>
<form action="http://localhost:8080/JSPLoginRegister/controller.jsp" method="get">
<table border="1" cellspacing="5">

<th><label>Email:<sup style="color:red;">*</sup></label></th>
<td><input type="email" placeholder="Enter email id" size="30" name="id"  required>
</tr>   
<tr>
<th><label>Password:<sup style="color:red;">*</sup></label></th>
<td><input type="password" placeholder="Enter password" size="30" name="pass" required></td>
</tr>

</table>
<button name="check" value="Login" >Login</button>
</form>

<a href="Register.jsp">Register</a>
</center>

</body>
</html>