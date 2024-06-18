package com.raghava.advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class   Servlet1
 */
@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	//	req.setAttribute("arg1", "raghava");
		
	PrintWriter pw = 	res.getWriter();
		
		RequestDispatcher rd = req.getRequestDispatcher("/s3");
		rd.forward(req, res);
		
		 HttpSession ss =	req.getSession();	
			pw.println("<br> Session Attributes of servlet 2 "+ss.getAttribute("arg2"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
