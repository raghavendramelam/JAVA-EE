package com.raghava.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class   Servlet1
 */
@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	//	req.setAttribute("arg1", "raghava");
		
	PrintWriter pw =	res.getWriter();	
	
	res.setContentType("text/html");
	
	pw.println("<br> Servlet Attribute of servlet3 passing attribute"+req.getAttribute("arg1"));
	
	// read and display  the session attribute values
         HttpSession ss =	req.getSession();	
	pw.println("<br> Session Attributes of servlet 3 "+ss.getAttribute("arg2"));
	
	// read and display the Application Atributes 
	ServletContext sc = getServletContext();
	
	pw.println("<br> Session Attributes of servlet 3 "+sc.getAttribute("arg2"));
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
