package Hospital.repository;

import java.util.ArrayList;
import java.util.List;

public class MedicalRepo extends DBConfig {
	
	public List<Integer> MidByName(String mName)
	{
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		String name[]=mName.split("\n");
		
		for(int i=0;i<name.length;i++) {
		try {
			String temp=name[i];
temp=temp.trim();
			 	ps=c.prepareStatement("select*from  Medicine ");	
	
	rs=ps.executeQuery();
	while(rs.next()) {
	if(temp.equalsIgnoreCase(rs.getString(3)))
	{
		  System.out.println(name[i]);

		alist.add(rs.getInt(1));
	}
	}
		
	
		}catch(Exception e)
		{
			
			System.out.println(e +" at medical Repo");
			
		}
		
		} // for  end 
		return alist;
	}
	
	
	public int patientMedicine(ArrayList<Integer> a,int Pid)
	{
		int value=0;
		for(int i=0;i<a.size();i++)
		{
			try {
			ps=c.prepareStatement("insert into  PatientMedicine values(?,?)");
			ps.setInt(1, Pid);
			ps.setInt(2, a.get(i));
			
			 value=ps.executeUpdate();
			}catch(Exception e)
			{
				System.out.println(e);
				return -1;
			}
			
		}
		if(value>0) {
			return 1;
		}else
		{
			return -1;
		}
		
		
	}

	

}
