<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
/*7.	Write a JSP which does the following job: Insert the
details of the 3 or 4 users who register with the web site 10 (week9) 
by using registration form. Authenticate the user when he submits the login
form using the user name and password from the database.*/
final String username="root";
final String password="root";
final String jdbcurl="jdbc:mysql://localhost:3306/jdbcdemo";

String checkString=request.getParameter("check");
Connection connection=null;

try {
	Class.forName("com.mysql.jdbc.Driver");
	connection=DriverManager.getConnection(jdbcurl,username,password);
	System.out.println("Connected...");
	Statement statement=connection.createStatement();
	

	if(checkString.equals("Register")) {

		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String emailid=request.getParameter("emailid");
		String pass=request.getParameter("pass");
		
		String sql="insert into emp values('"+firstname+"','"+lastname+"','"+gender+"','"+emailid+"','"+pass+"')";
		int i=statement.executeUpdate(sql);
		if(i>0) {
		
		     response.sendRedirect("http://localhost:8080/ServletLoginSession/Register.html?msg=Registered Successfull y");
		}
	}
	else if(checkString.equals("Login")) {
		String emailid=request.getParameter("id");
		String pass=request.getParameter("pass");
		
		String sql="select * from emp";
		ResultSet rs=statement.executeQuery(sql);
		rs.next();
		if(rs.getString("Emailid").equals(emailid) && rs.getString("Pass").equals(pass)) {
			response.sendRedirect("http://localhost:8080/JSPLoginRegister/welcome.jsp?message=login successfully");
		}
		else {
			response.sendRedirect("http://localhost:8080/JSPLoginRegister/Login.jsp?message=Something went wrong");
		}
	}
}
catch (Exception e) {
	// TODO: handle exception
	out.print(e);
}
%>
</body>
</html>