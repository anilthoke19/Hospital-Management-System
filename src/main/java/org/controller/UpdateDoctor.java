package org.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.model.DoctorModel;

/**
 * Servlet implementation class UpdateDoctor
 */
@WebServlet("/UpdateDoctor")
public class UpdateDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public int did;
	   public  String dname,contact,fees,specialization,username,password;
	  
	
	
    public UpdateDoctor() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		
		
		
		
		
		
		did=Integer.parseInt (request.getParameter("did"));
		dname=request.getParameter("dname");
		contact=request.getParameter("dcontact");
		fees=request.getParameter("dfees");
		specialization=request.getParameter("dspecialization");
		
	
	DoctorModel dm=new DoctorModel();
	dm.setDid(did);
	dm.setDname(dname);
	dm.setContact(contact);
	dm.setFees(did);
	dm.setSpecialization(specialization);
	
	
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
