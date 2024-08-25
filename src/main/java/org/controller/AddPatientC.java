

package org.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.service.ReceptionistService;
import Hospital.model.*;

/**
 * Servlet implementation class AddPatientC
 */
@WebServlet("/AddPatientC")
public class AddPatientC extends HttpServlet {
	
	ReceptionistService rs=new ReceptionistService();
	
	private static final long serialVersionUID = 1L;
       
  
    public AddPatientC() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PatientModel pm=new PatientModel();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String pname=request.getParameter("pname");
		String contact=request.getParameter("pcontact");
		String dieses=request.getParameter("dieses");
		
		
		Date d2=(Date.valueOf(request.getParameter("pdate")));
	
		
		pm.setPname(pname);
		pm.setContact(contact);
		pm.setDiesease(dieses);
		pm.setRegistrationDate(d2);
		
		
		int value=rs.addPatient(pm);
		
		if(value==1)
		{
			RequestDispatcher rs=request.getRequestDispatcher("ViewPatient.jsp");
			rs.include(request, response);
		}else
		{
			RequestDispatcher rs=request.getRequestDispatcher("AddPatient.jsp");
			rs.include(request, response);
			
		}
		

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
