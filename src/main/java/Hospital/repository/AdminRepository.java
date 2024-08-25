package Hospital.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Hospital.model.DoctorModel;
import Hospital.model.PatientModel;
import Hospital.model.ReceptionistModel;

public class AdminRepository extends DBConfig {
	List<DoctorModel> list=new ArrayList<DoctorModel>();

	
	
	 public boolean isAddDoctor(DoctorModel d)
	  {
		  
		  try {
			ps=c.prepareStatement("insert into doctor values('0',?,?,?,?,?,?)");
			ps.setString(1, d.getDname());
			ps.setString(2,d.getSpecialization());
			ps.setInt(3,d.getFees());
			ps.setString(4, d.getContact());
			ps.setString(5, d.getUsername());
			ps.setString(6, d.getPassword());
			
			int value=ps.executeUpdate();
			return value>0?true:false;
			
			
		} catch (SQLException e) {
			System.out.println(e);
			return false;
			
		} 
	  }	
	 
	 
	  public List<DoctorModel> viewAllDoctor() 
	  {
		  
	  try {
		ps=c.prepareStatement("select *from doctor"); 
	  rs=ps.executeQuery();
	  while(rs.next())
	  {
		  DoctorModel d=new DoctorModel();

		  d.setDid(rs.getInt(1));
		  d.setDname(rs.getString(2));
		  d.setSpecialization(rs.getString(3));
		  d.setFees(rs.getInt(4));
		  d.setContact(rs.getString(5));
		  d.setUsername(rs.getString(6));
		  d.setPassword(rs.getString(7));
		  list.add(d);
	  }
	  return list.size()>0?list:null;
	  }
	  catch (Exception e) {
			System.out.println("Error is adminRepo "+e);
			return null;
		}
		 
	  }
	  
	  
	  
	  public boolean isDeleteDoctor(int id)
	  {
		  try {
		  ps=c.prepareStatement("delete from doctor where did=?");
		  ps.setInt(1, id);
		  int value=ps.executeUpdate();
		  
		  return (value>0)?true:false;
		 
		  
		  } catch(Exception e)
		  {
			  System.out.println(e+" error at doctor delete ");
			  return false;
		  }
		  
		  
	  }
	  
	  
		public boolean isAddReceptionist(ReceptionistModel rm)
		{
			
			try {
			ps=c.prepareStatement("insert into receptionist values(?,?,?,?,?)");
			
			
			ps.setString(1, rm.getrecpName());
			ps.setString(2, rm.getrecpContact());
			ps.setString(3, rm.getUsername());
			ps.setString(4, rm.getRecptpassword());
			ps.setInt(5, rm.getrecpId());
			
			int value=ps.executeUpdate();
			return value>0?true:false;
			
			}catch(Exception e)
			{
				System.out.println(e);
				return false;
			}
			
		}
		
		


		  public List<ReceptionistModel> viewAllReceptionist() 
		  {
				List<ReceptionistModel>rlist=new ArrayList<>();

		  try {
			ps=c.prepareStatement("select *from receptionist"); 
		  rs=ps.executeQuery();
		  while(rs.next())
		  {
			  ReceptionistModel rm=new ReceptionistModel();

			  rm.setrecpName(rs.getString(1));
			  rm.setrecpContact(rs.getString(2));
			  rm.setRecptpassword(rs.getString(3));
			  rm.setUsername(rs.getString(4));
			  rm.setrecpId(rs.getInt(5));
			 
			  rlist.add(rm);
		  }
		  System.out.println("size is new "+rlist.size());
		  return rlist.size()>0?rlist:null;
		  }
		  catch (Exception e) {
				System.out.println("Error is in admi repo "+e);
				return null;
			}
			 
		  }
		
	  
		  
		  public boolean isDeleteReceptionist(int id)
		  {
			  try {
			  ps=c.prepareStatement("delete from receptionist where rid=?");
			  ps.setInt(1, id);
			  int value=ps.executeUpdate();
			  
			  return (value>0)?true:false;
			 
			  
			  } catch(Exception e)
			  {
				  System.out.println(e+" error at receptionist  delete ");
				  return false;
			  }
			  
			  
		  }
		  
		  
		 public int  UpdateReceptionist(ReceptionistModel mm,int rid2)
		 {
			 
			 

				try {
				ps=c.prepareStatement("update receptionist set rname=?,contact=?,rid=? where rid=?");
				
				
				ps.setString(1, mm.getrecpName());
				ps.setString(2, mm.getrecpContact());
				ps.setInt(3, mm.getrecpId());
				ps.setInt(4, rid2);
				
				int value=ps.executeUpdate();
				return value>0?1:0;
				
				}catch(Exception e)
				{
					System.out.println(e);
					return 0;
				}
				
			 
		 }
	 

			public int  isAdminverified(String username,String password)
			{	
				try
				{
				ps=c.prepareStatement("select *from admin");
				rs=ps.executeQuery();
				
				if(rs.next())
				{
					       if(username.equalsIgnoreCase(rs.getString(1))&& password.equalsIgnoreCase(rs.getString(2)))
							{
						      return rs.getInt(3);
							}
					        else
							{
								return -1;
							}
				}	
				}catch(Exception e)
				{
					System.out.println("in admon repo "+e);
					return -1;
				}
				return -1;
				
			}
			

public List<PatientModel> SearchByNamePatient(String name) 
  {
	 
	List <PatientModel> list=new ArrayList<PatientModel>();
  try {
	ps=c.prepareStatement("select *from patient where name like %?% "); 
	ps.setString(2, name);
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
		System.out.println("Error SBnME "+e);
		
		
		return null;
	}
	  
 
  }


			
	
}
