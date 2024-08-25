package Hospital.repository;

public class OneLoginRepository extends DBConfig {

	
	public int oneLoginPage(String user,String pass)
	{
		
		
		
		

		try {
		ps=c.prepareStatement("select*from admin");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			
			if(user.equals(rs.getString("username"))&&pass.equals(rs.getString("password")))
			{
				return 1;
			}
			
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
		
		
	


		try {
		ps=c.prepareStatement("select*from doctor");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			
			if(user.equals(rs.getString("username"))&&pass.equals(rs.getString("password")))
			{
				return 2;
			}
			
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
		
		
		


		try {
		ps=c.prepareStatement("select*from receptionist");
		rs=ps.executeQuery();
		
		while(rs.next())
		{
			
			if(user.equals(rs.getString("username"))&&pass.equals(rs.getString("password")))
			{
				return 3;
			}
			
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
		
		
		return 0;
		
		
		
		
		
		
	}
}
