package com.raghava.advjava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/s1url")
public class Servlet1 extends HttpServlet {
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// this is req attributes
		req.setAttribute("arg1", "raghava");
		
		// create and assign values  session attributes
	HttpSession ss	=req.getSession();
	ss.setAttribute("arg2", "raghava.melam");
	
	// create and assign value for Servlet context or Application Attributes
	ServletContext sc = getServletContext();
	sc.setAttribute("arg2", "raghavendra");
	
	
		RequestDispatcher rd = req.getRequestDispatcher("/s2");
		rd.forward(req, res);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
