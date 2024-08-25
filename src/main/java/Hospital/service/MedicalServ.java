package Hospital.service;

import java.util.ArrayList;
import java.util.List;

import Hospital.repository.MedicalRepo;

public class MedicalServ {

	MedicalRepo mr=new MedicalRepo();
	public List<Integer> MidByName(String mName)
	{
		return mr.MidByName(mName);
		
	}
	
	public int patientMedicine(ArrayList a,int Pid)
	{
	
	return mr.patientMedicine(a, Pid);	
		
	}

	
	
	
}
