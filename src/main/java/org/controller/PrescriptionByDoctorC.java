package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import Hospital.service.MedicalServ;


@WebServlet("/PrescriptionByDoctorC")
public class PrescriptionByDoctorC extends HttpServlet {
	MedicalServ ms=new MedicalServ();
	
	private static final long serialVersionUID = 1L;
  
    public PrescriptionByDoctorC() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ArrayList<Integer> ar=new ArrayList<Integer>();
		
		String medi=request.getParameter("medi");
int pid=Integer.parseInt(request.getParameter("pid"));

response.setContentType("text/html");

PrintWriter p=response.getWriter();


ar=(ArrayList<Integer>) ms.MidByName(medi);

if(ar.size()!=0)
{
	ms.patientMedicine(ar, pid);
}

p.write(ar.size()+" not eqal to zero"); // for check medicine list length






	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
