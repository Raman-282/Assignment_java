package com.tut;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHttpServlet
 */
@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHttpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("Text/html");
		
		PrintWriter out = response.getWriter();// io package
		
		out.print("<html>");
		out.print("<body bgcolor='Blue'");
		
		String name="Raman";
		
		out.print("<h1>,My name is</h1>"+name);
		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
		
		
	}

}
