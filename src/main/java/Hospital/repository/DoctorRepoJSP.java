package Hospital.repository;

public class DoctorRepoJSP extends DBConfig {
	
	

	   public int getDidbyDiesese(String diesease)
	   {
		   System.out.println(diesease);
		   int did=0;
		   try
		   {
			  ps=c.prepareStatement("select *from doctor");
			  rs=ps.executeQuery();
			  while(rs.next())
			  {
				  String specialist=rs.getString("Specialisation");
				//  System.out.println(specialist+" doctorr");
				  int index=specialist.indexOf(diesease);
				//  System.out.println(index+"index is ");
				  if(index!=-1)
				  {
					  did=rs.getInt("did");
					 // System.out.println("doctor id is doctor repository "+did);
					  break;
				  }		  
			  }
			  
		   }
		   catch(Exception ex)
		   {
			   System.out.println("Error is "+ex);
		   }
		   return did;
	   }

	 
		  

		  
		  
		
	
	
	

}
