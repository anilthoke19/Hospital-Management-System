package org.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Hospital.model.ReceptionistModel;
import Hospital.service.AdminService;


@WebServlet("/UpdateReceptionist")
public class UpdateReceptionist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateReceptionist() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int rid=Integer.parseInt(request.getParameter("rUser"));
		
		
		RequestDispatcher rd=request.getRequestDispatcher("HospitalManagment.jsp");
		rd.include(request, response);
		
		
		out.println("<div class='col py-3'>");
		out.println(" <form name='frm' action='' method='get'>");
		out.println("<label>Enter Receptionist Id </label>");
		out.println("<input type='text' name='rid' value='"+rid+"' placeholder='Enter Receptionist Id'><br><br>");
		out.println("<input type='text' name='mname' placeholder='Enter Receptionist name'><br><br>");
		out.println("<input type='text' name='rcontact'  placeholder='Enter Receptionist contact'><br><br>");
		out.println("<input type='submit' name='s' value='Update Receptionist' id='btn'>");
		out.println("</form>");
		out.println("</div></div></div>");
		
		
		String btn=request.getParameter("s");
		if(btn!=null)
		{
			  rid=Integer.parseInt(request.getParameter("rid"));
			 String rname=request.getParameter("rname");
			 String rcontact=request.getParameter("rcontact");

			 
			 ReceptionistModel mm=new ReceptionistModel();
			 mm.setrecpId(rid);
			 mm.setrecpName(rname);
			 mm.setrecpContact(rcontact);
			 
			 
			 AdminService ms=new AdminService();
			 int b=ms.UpdateReceptionist(mm,rid);
			 if(b==1)
			 {
				rd=request.getRequestDispatcher("ReceptionistView.jsp");
				 rd.forward(request, response);
			 }
			 else
			 {
				 rd=request.getRequestDispatcher("ReceptionistView.jsp");
				 rd.include(request, response);
				 
			 }
			
		}
		
		
	}
		
		
		
		
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
