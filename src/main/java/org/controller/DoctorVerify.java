package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.service.DoctorServices;

/**
 * Servlet implementation class DoctorVerify
 */
@WebServlet("/DoctorVerify")
public class DoctorVerify extends HttpServlet {
	DoctorServices ds=new DoctorServices();
	private static final long serialVersionUID = 1L;
       
   
    public DoctorVerify() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String duser=request.getParameter("duser");
		String dpass=request.getParameter("dpass");
		
		int value=ds.verifyDoctor(duser, dpass);
		
		if(value==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("DoctorHandle.jsp");
			rd.include(request, response);
			
		}else
		{
			RequestDispatcher rd=request.getRequestDispatcher("DoctorLogin.jsp");
			rd.include(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
