package com.nt.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mainservlet
 */
@WebServlet("/mainservlet")
public class mainservlet extends HttpServlet {
	
   

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter pw =	response.getWriter();
	response.setContentType("text/Html");
	String search = request.getParameter("ss");
	String engine = request.getParameter("engine");
	String url=null;
	if(engine.equalsIgnoreCase("google")) {
		url="https://www.google.com/search?q="+search;
	}
	else if(engine.equalsIgnoreCase("bing")) {
		url="https://www.bing.com/search?q="+search;
	}
	else{
		url="https://www.yahoo.com/search?p="+search;
	}
	
	System.out.println(" before res.sendredirect()");
	pw.println("<br> Hello </br>");
	response.sendRedirect(url);
	
	
	RequestDispatcher rd = request.getRequestDispatcher("/abc.html");
	rd.forward(request, response);
	pw.println("<br> Hii how are you ");
	System.out.println(" after response.redirect()");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
