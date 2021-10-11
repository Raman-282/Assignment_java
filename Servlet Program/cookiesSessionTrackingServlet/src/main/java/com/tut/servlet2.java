package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		 //getting cookies
		Cookie c[]=request.getCookies();
		
		Boolean f=false;
		String name="";
		
		if(c==null) {
			out.println("Go to home page and save your name");
			return;
		}
		else {
			for(Cookie cookie:c) {
				String tname=cookie.getName();
				if(tname.equals("user_name")) {
					f=true;
					name=cookie.getValue();
 				}
			}
		}
		
		if(f) {
			out.println("Hello "+name+ " , Welcome To Our Website");
		}
		out.println("  Welcome Back");
	}

	

}
