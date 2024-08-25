package Hospital.service;
import java.util.*;
import Hospital.model.DoctorModel;
import Hospital.model.PatientModel;
import Hospital.repository.DoctorRepository;

public class DoctorServices {
	
	DoctorRepository dr=new DoctorRepository();
	

	
	
	// add patient categiry and allocate room to patient
	public int  AddPatientCategory (int Pid)
	{
	Scanner sc=new Scanner(System.in);
		//get doctor id by patient id 
		
		int did=dr.getDoctorIdByPid(Pid);
		System.out.println("doctor id is "+did);
		
		System.out.println("Patient is serious ?");
		String msg=sc.nextLine();
		if(msg.equalsIgnoreCase("yes"))
		{
		System.out.println("Patient added in IPD");	
		System.out.println("Please Enter room id for Patient");
		int RoomNo=sc.nextInt();
		
			
			return dr.isAddPatientCategory(Pid,"IPD",RoomNo)?1:-1;
		}
		else
			return 0;
			
		
	}
	
	// doctor wise patient
	public List<PatientModel> getDoctorWisePatient(String name)
	{
		List<PatientModel> li=dr.isGetDoctorWisePatient(name);
		if(li!=null) {
			return li; // if give error remove this 
			//System.out.println("In docotot services");
		}else {
		System.out.println("not error");
		}
		return li;
		
	}
	
	
	public int verifyDoctor(String user ,String pass)
	{
		
		return dr.isVerifyDoctor(user,pass)?1:-1;
		
	}
	
	
	
	

}
