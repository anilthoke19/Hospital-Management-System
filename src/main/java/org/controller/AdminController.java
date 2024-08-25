package org.controller;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Hospital.service.AdminService;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AdminController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
			String adminName=request.getParameter("ausername");
			String apassword=request.getParameter("apassword");
			
			
			out.println(adminName);
			out.println(apassword);
			
			HttpSession session=request.getSession();
		
			AdminService as=new AdminService();
			int v2=as.Adminverified(adminName, apassword);
			session.setAttribute("adminS", v2);
			session.invalidate();

		String v=request.getParameter("s");
			if(v2>0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("AdminHandle.jsp");
				rd.forward(request, response);
				
			}else
			{
				out.println("Admin not addded try  again");
				RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
				rd.forward(request, response);
			}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doGet(request, response);
	}

}
