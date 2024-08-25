package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Hospital.service.AdminService;
import Hospital.service.DoctorServices;
import Hospital.service.OneLoginServices;


@WebServlet("/OneLogincontoller")
public class OneLogincontoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OneLogincontoller() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
			String adminName=request.getParameter("ausername");
			String apassword=request.getParameter("apassword");
			
			
		
			

			OneLoginServices os=new OneLoginServices();
			int v2=os.OneLoignPage(adminName, apassword);
			

		String v=request.getParameter("s");
			if(v2==1)
			{
				RequestDispatcher rd=request.getRequestDispatcher("AdminHandle.jsp");
				rd.forward(request, response);
				
			}
		else if(v2==2)
			{
				HttpSession s=request.getSession(true);
				s.setAttribute("uname",adminName);
				s.setAttribute("pass",apassword);
				RequestDispatcher rd=request.getRequestDispatcher("DoctorHandle.jsp");
				rd.forward(request, response);
				
			}
		
		else if(v2==3)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("ReceptionistHandle.jsp");
			rd.forward(request, response);
		}else
		{
			RequestDispatcher rd=request.getRequestDispatcher("LandingPage.jsp");
			rd.forward(request, response);	
			
		}
		
		
		
		
		
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
