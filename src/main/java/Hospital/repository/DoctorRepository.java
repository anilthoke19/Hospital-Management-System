

package Hospital.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Hospital.model.DoctorModel;
import Hospital.model.PatientModel;

public class DoctorRepository extends DBConfig{
	List<DoctorModel> list=new ArrayList<DoctorModel>();
	
	
	public boolean isVerifyDoctor(String user ,String pass) {
		
		try {
		ps=c.prepareStatement("select*from doctor");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			
			if(user.equals(rs.getString("username"))&&pass.equals(rs.getString("password")))
			{
				return true;
			}else
			{
				return false;
			}
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	return false;
		
		
	}
	
	public int getDoctorIdByPid(int pid)
	{
		int did=0;
		try {
			ps=c.prepareStatement("select did from doctorpatientjoin where pid=?");
			ps.setInt(1, pid);
			rs=ps.executeQuery();
			if(rs.next())
			{
			   did=rs.getInt("did");
			}
			return did;
			
		} catch (Exception e) {
			
			System.out.println("Error is "+e);
			return 0;
		}
		
		
		
		
		
	
	}
	

	  
	  
	  
	  // catogery and allocate room in one method 
	  public boolean isAddPatientCategory(int Pid,String type,int roomNo)
		{
			try
			{
				ps=c.prepareStatement("update patient set category=? where pid=?");
				ps.setString(1, type);
				ps.setInt(2, Pid);
				int value=ps.executeUpdate();
				if(value!=0) {
					
					ps=c.prepareStatement("insert into  PatientRoomJoin values(?,?)");
					ps.setInt(1, Pid);
					ps.setInt(2, roomNo);
					
					value=ps.executeUpdate();
					if(value>0)
					{
						//System.out.println("Patient id"+Pid+" added in Room no"+roomNo);
						return true;
					}else
					{
						return false;
					}
					
					
				}
				else {
					return false;
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error is "+ex);
				return false;
			}
			
			
		}
	  
	  // doctor wise patient
	 public  List<PatientModel> isGetDoctorWisePatient(String name)
		{
		 //System.out.println("nm is "+name);
		 List <PatientModel> li=new ArrayList();
		 try {
			ps=c.prepareStatement("select  p.pid,p.pname,p.Diesease,p.contact ,p.admitDate from patient p inner join doctorpatientjoin dp on dp.pid=p.pid  inner join doctor d on d.did=dp.did where d. username=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
			   PatientModel pm=new PatientModel();
			   
			   pm.setPid(rs.getInt("pid"));
			   pm.setPname(rs.getString("pname"));
			   pm.setDiesease(rs.getString("Diesease"));
			   pm.setContact(rs.getString("contact"));
			   pm.setRegistrationDate(rs.getDate("admitDate"));
				li.add(pm);
			}
			return li.size()>0?li:null;
			
		 }catch(Exception e)
		 {
			 System.out.println(e+"in doctor repo patientwise");
			 return null;
		 }
			
		}
	  
	  
//	  public int getDoctorFees(int did)
//	  {
//		  try
//		  {
//			  ps=c.prepareStatement("select fees from doctor where ");
//		  }
//		  catch(Exception ex)
//		  {
//			  System.out.println("Exception is "+ex);
//			  return 1;
//		  }
//		return did;
//	  }
	  
	  
//	  
	  
   
   
   
   
   
}
