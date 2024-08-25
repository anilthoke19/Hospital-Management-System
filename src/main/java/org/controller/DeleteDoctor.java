package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.service.AdminService;

/**
 * Servlet implementation class DeleteDoctor
 */
@WebServlet("/DeleteDoctor")
public class DeleteDoctor extends HttpServlet {
	AdminService ar=new AdminService();
	private static final long serialVersionUID = 1L;
  
    public DeleteDoctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int Did=Integer.parseInt(request.getParameter("dUser"));
		
		int value=ar.deleteDoctor(Did);
		
		if(value==1)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("ViewDoctor.jsp");
			rd.include(request, response);
			
		}else 
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewDoctor.jsp");
			rd.include(request, response);
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
