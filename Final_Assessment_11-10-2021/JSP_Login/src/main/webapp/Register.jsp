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
	        <h1>Registration Form</h1>
	<form action="http://localhost:8080/JSPLoginRegister/controller.jsp" method="get">
		<table border="1" cellspacing="5">
		<!--<col style="background-color:blue;"></col>-->
				<tr>
					<th><label>First Name:<sup style="color:red;">*</sup></label></th>
					<td><input type="text" placeholder="Enter first name" size="30" name="firstname" required>
				</tr> 
				<tr>
					<th><label>Second Name:<sup style="color:red;">*</sup></label></th>
					<td><input type="text" placeholder="Enter Second Name" size="30" name="lastname" required>
				</tr>
				<tr>
				    <th><label>Gender:<sup style="color:red;">*</sup></label></th>
					<td>
					<input name="gender" type="radio" value="Male">Male
					<input name="gender" type="radio" value="Female">Female
					</td>
				</tr>
				<tr>
					<th><label>Email:<sup style="color:red;">*</sup></label></th>
					<td><input type="email" placeholder="Enter email id" size="30" name="emailid" required>
				</tr>   
				<tr>
					<th><label>Password:<sup style="color:red;">*</sup></label></th>
					<td><input type="password" placeholder="Enter password" size="30" name="pass" required></td>
				</tr>
		
		</table>
		<button name="check" value="Register">Register</button>
	</form>

<a href="Login.jsp">Login</a>
</center>
</body>
</html>