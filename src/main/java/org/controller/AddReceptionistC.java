package org.controller;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.model.DoctorModel;
import Hospital.model.ReceptionistModel;
import Hospital.service.AdminService;


@WebServlet("/AddReceptionistC")
public class AddReceptionistC extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	AdminService as=new AdminService();
    public AddReceptionistC() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int rId=Integer.parseInt(request.getParameter("rid"));
		String rname=request.getParameter("rname");
		String rcontact=request.getParameter("rContact");
		String rusername=request.getParameter("rusername");
		String rpassword=request.getParameter("rpassword");
        
		
		System.out.println(rcontact+" in add receptionist");
 
ReceptionistModel rm=new ReceptionistModel(rId,rname,rcontact,rusername,rpassword);
		int value=as.addReceptionist(rm);
		
		if(value==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewReceptionist.jsp");
			rd.forward(request, response);
			
		}else
		{
			out.println("doctor not added");
			RequestDispatcher rd=request.getRequestDispatcher("AddReceptionist.jsp");
			rd.forward(request, response);
		}

		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
