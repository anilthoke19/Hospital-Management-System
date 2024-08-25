package Hospital.repository;
import java.sql.*;
import java.util.*;
public class DBConfig {
	 protected Connection c;
	    protected PreparedStatement ps;
	    protected ResultSet rs;
	    public DBConfig()
	    {
	    	try
	    	{
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalproject","root","root");
	    	}
	    	catch(Exception ex)
	    	{
	    		System.out.println("error is "+ex);  
	    	}
	    }

}
