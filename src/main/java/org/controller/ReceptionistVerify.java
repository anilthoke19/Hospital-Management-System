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


@WebServlet("/ReceptionistVerify")
public class ReceptionistVerify extends HttpServlet {
	ReceptionistService rs=new ReceptionistService();
	private static final long serialVersionUID = 1L;
   
    public ReceptionistVerify() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String ruser=request.getParameter("ruser");
		String rpass=request.getParameter("rpass");
		
		int value=rs.VerifyReceptionist(ruser, rpass);
		
		if(value==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("ReceptionistHandle.jsp");
			rd.include(request, response);
			
		}
		else
		{
		
			out.print("Enter coorect password");
			RequestDispatcher rd=request.getRequestDispatcher("ReceptionistLogin.jsp");
					rd.include(request, response);	
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
