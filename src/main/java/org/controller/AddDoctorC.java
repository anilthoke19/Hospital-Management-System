package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.model.DoctorModel;
import Hospital.service.AdminService;
import Hospital.service.DoctorServices;

/**
 * Servlet implementation class AddDoctorC
 */
@WebServlet("/AddDoctorC")
public class AddDoctorC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminService as=new AdminService();
       
   
    public AddDoctorC() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String DoctorName=request.getParameter("dname");
		String Dspecilisation=request.getParameter("specilisation");
		int Dfees=Integer.parseInt (request.getParameter("fees"));
		String Dcontact=request.getParameter("contact");
		String Dusername=request.getParameter("username");
		String Dpassword=request.getParameter("password");

out.println("at add doctor");

		 DoctorModel d3=new DoctorModel(DoctorName,Dspecilisation,Dfees,Dcontact,Dusername,Dpassword);
		int value=as.addDoctor(d3);
		
		if(value==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("ViewDoctor.jsp");
			rd.forward(request, response);
		}else
		{
			out.println("doctor not added");
			RequestDispatcher rd=request.getRequestDispatcher("AddDoc.jsp");
			rd.forward(request, response);
		}

		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
