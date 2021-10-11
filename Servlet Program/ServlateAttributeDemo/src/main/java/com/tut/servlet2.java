package com.tut;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		int product=num1*num2;
		
		int sum=(int) request.getAttribute("sum");
		System.out.println("sum is: "+sum);
		System.out.println("Product is: "+product);
		
		
	}
	
	
	

}
