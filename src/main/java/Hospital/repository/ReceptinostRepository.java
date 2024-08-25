package Hospital.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Hospital.model.PatientModel;

public class ReceptinostRepository extends DBConfig {
	
	DoctorRepoJSP dr=new DoctorRepoJSP();
	
	// used in addpatient 
	public boolean isVerifyReceptionist(String ruser,String rPassword)
	{
		try {
		ps=c.prepareStatement("select*from receptionist");
		
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			if(ruser.equalsIgnoreCase(rs.getNString(3))&&rPassword.equalsIgnoreCase(rs.getString(4)))
			{
				return true;
				
			}else
			{
				return false;
			}
			
		}
		
		}catch(Exception ex)
		{
			System.out.println(ex);
			
		}
		return false;
		
	}
	
	
	// used in add patient 
	public int getPatientid(String name)
	{
		int value=0;
		try
		{
			ps=c.prepareStatement("select pid from patient where pname=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			if(rs.next())
			{
				value=rs.getInt(1);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return value++;
	}
	
	
	
	
	public boolean isAddPatient(PatientModel p)
	{
		
		try {
			ps=c.prepareStatement("insert into patient values('0',?,?,?,?,'OPD')");
			ps.setString(1, p.getPname());
			ps.setString(2, p.getDiesease());
			ps.setDate(3, p.getRegistrationDate());
			ps.setString(4, p.getContact());
 
			
			int value=ps.executeUpdate();
				
			   if(value!=-1)
			   {
				   // for insert in doctorPatient join
				   int pid=this.getPatientid(p.getPname());
				   System.out.println(p.getDiesease()+" desiese ");
				   int did=dr.getDidbyDiesese(p.getDiesease());
				   System.out.println("pid id "+pid+"did is "+did);
				  ps=c.prepareStatement("insert into  doctorpatientjoin values(?,?)");
				  ps.setInt(1, did);
				  ps.setInt(2, pid);
				  int r=ps.executeUpdate();
			   
			   if(r!=-1)
			  return true;
			   else 
				   return
						   false;
		   }
			
			
		} catch (SQLException e) {
			
			System.out.println(e);
			return false;
		}
		return false;
		
	}
	
	
	
	public List<PatientModel> viewAllPatient() 
	  {
		 
		List <PatientModel> list=new ArrayList<PatientModel>();
	  try {
		ps=c.prepareStatement("select *from patient"); 
	  rs=ps.executeQuery();
	  while(rs.next())
	  {
		 PatientModel d=new PatientModel();

		  d.setPid(rs.getInt(1));
		  d.setPname(rs.getString(2));
		  d.setDiesease(rs.getString(3));
	d.setRegistrationDate(rs.getDate(4));
		  d.setContact(rs.getString(5));
		  list.add(d);
	  }
	  return list.size()>0?list:null;
	  }
	  catch (Exception e) {
			System.out.println("Error is "+e);
			return null;
		}
		  
	 
	  }
	
	
public boolean 	isdeletePatient(int pid)
{
	
	try {
	ps=c.prepareStatement("delete from patient where pid=?");
	ps.setInt(1, pid);
	
	int value=ps.executeUpdate();
	
	return value==1?true:false;
	
	
	
	}catch(Exception ex){
		System.out.println("Exception at "+ex);
		return false;
	}
	
}
	
	

















}
