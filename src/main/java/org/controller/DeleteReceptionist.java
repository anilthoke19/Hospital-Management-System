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


@WebServlet("/DeleteReceptionist")
public class DeleteReceptionist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AdminService as=new AdminService();
    
    public DeleteReceptionist() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	

		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int rid=Integer.parseInt(request.getParameter("rUser"));
		
		int value=as.deleteReceptionist(rid);
		
		if(value==1)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("ViewReceptionist.jsp");
			rd.include(request, response);
			
		}else 
		{
			
			
			
			RequestDispatcher rd=request.getRequestDispatcher("ViewReceptionist.jsp");
			rd.include(request, response);
		}
		
		
		
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
