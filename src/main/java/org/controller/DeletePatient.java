package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.service.ReceptionistService;

/**
 * Servlet implementation class DeletePatient
 */
@WebServlet("/DeletePatient")
public class DeletePatient extends HttpServlet {
	
	ReceptionistService rs=new ReceptionistService();
	private static final long serialVersionUID = 1L;
       
  
    public DeletePatient() {
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int pid=Integer.parseInt (request.getParameter("pUser"));
		
	int value=rs.deletePatient(pid);
	
	if(value==1)
	{
		RequestDispatcher rq=request.getRequestDispatcher("ViewPatient.jsp");
		rq.include(request, response);
		
	}else
	{
		out.println("<h1> Patient not deleted </h1>");
	}
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
