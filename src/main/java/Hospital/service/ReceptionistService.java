package Hospital.service;

import java.util.List;

import Hospital.model.PatientModel;
import Hospital.repository.ReceptinostRepository;

public class ReceptionistService {

ReceptinostRepository rr=new ReceptinostRepository();


public int VerifyReceptionist(String user,String pass)
{
	return rr.isVerifyReceptionist(user, pass)?1:-1;
	
}
	public int addPatient(PatientModel p)
	{
		
		
		return rr.isAddPatient(p)?1:-1;
	}
	
	
	public List<PatientModel> viewAllPatient()
	{
		List<PatientModel> list=rr.viewAllPatient();
	    return list!=null?list:null;
	}
	
	
	public int deletePatient(int pid)
	{
		return rr.isdeletePatient(pid)?1:-1;
		
	}

}
