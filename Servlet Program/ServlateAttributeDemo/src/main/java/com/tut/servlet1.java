package com.tut;

import java.io.IOException;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1= request.getParameter("n1");
		String n2= request.getParameter("n2");
		
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(n2);
		int s=num1+num2;
		
		request.setAttribute("sum", s);
		
		RequestDispatcher rd=request.getRequestDispatcher("servlet2");
		rd.forward(request, response);
	}

}
