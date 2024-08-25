package Hospital.service;

import java.util.List;

import Hospital.model.DoctorModel;
import Hospital.model.PatientModel;
import Hospital.model.ReceptionistModel;
import Hospital.repository.AdminRepository;
import Hospital.repository.DoctorRepository;


public class AdminService {
	AdminRepository ar=new AdminRepository();


	
//	public int AddAdmin(String name,String password)
//	{
//		return lr.isAddAdminRegister(name,password)?1:-1;
//	}
//	
	public int Adminverified(String username,String password)
	{
		
	   return ar.isAdminverified(username,password);
	   
	   
	
	}
	
	
	public int addDoctor(DoctorModel d)
	{
			
	return ar.isAddDoctor(d)?1:-1;
	

	}
	
	public List<DoctorModel> viewAllDoctor()
	{
		List<DoctorModel> list=ar.viewAllDoctor();
	    return list!=null?list:null;
	}
	
	public int deleteDoctor(int id)
	{
		
		return ar.isDeleteDoctor(id)?1:-1;
	}
	
	
	
	
	
   public int addReceptionist(ReceptionistModel rm)
   {
	   
	   return ar.isAddReceptionist(rm)?1:-1;
   }
   AdminRepository arr=new AdminRepository();

   
   public List<ReceptionistModel>viewAllReceptionist()
   {
	   
	   return arr.viewAllReceptionist();
   }
   
   
   public int deleteReceptionist(int id)
	{
		
		return ar.isDeleteReceptionist(id)?1:-1;
	}
   
   public int UpdateReceptionist(ReceptionistModel mm,int rid) {
	   
	   return ar.UpdateReceptionist(mm,rid); 
   }
   
   
	
	public List<PatientModel> SearchByNamePatient(String name)
	{
		List<PatientModel> plist=ar.SearchByNamePatient(name);
	    return plist!=null?plist:null;
	}
	
   
   
   
//   public int loginByReceptionist(String username,String pass2) {
//	   
//	  return  ar.isloginByReceptionist(username,pass2)?1:-1;
//	   
//   }
	
	

}
