package com.tut;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet1() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("fullname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phonenumber");
		String password=request.getParameter("password");
		String course=request.getParameter("course");
		String checkbox=request.getParameter("checkbox");
		
	//use below commented program if you want to display response on the page without any database connection ----------------
	
	  /*  if(checkbox!=null) {
			if(checkbox.equals("checked")) {
				out.println("Name: "+name);
				out.println("E-mail: "+email);
				out.println("Phone: "+phone);
				out.println("Password: "+password);
				out.println("Course: "+course);
			}
			else {
				out.println("Go To Home Page and Save Your Name");
			}
		}
		else {
			out.println("Go To Home Page and Save Your Name");
		} */
		
		try {
			if(checkbox!=null) {
				if(checkbox.equals("checked")) {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_page","root","2000");
					String query="insert into register(name,email,phonenumber,Password,course) values(?,?,?,?,?)";
					PreparedStatement ps= conn.prepareStatement(query);
					
					ps.setString(1, name);
					ps.setString(2, email);
					ps.setString(3, phone);
					ps.setString(4, password);
					ps.setString(5, course);
			
					ps.executeUpdate();
					out.println("Successfully Registered");
					
					//forward response to servlet2
					RequestDispatcher rd=request.getRequestDispatcher("servlet2");
					rd.forward(request, response);
				}
				else {
					out.println("<br><h5 style=\"color:brown;\">You have not accept term & condition</h5>");
				}
			}
			else{
					out.println("<br><h5 style=\"color:brown;\">You have not accept term & condition</h5>");
					//include response 
					RequestDispatcher rd=request.getRequestDispatcher("index.html");
					rd.include(request, response);
				}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
