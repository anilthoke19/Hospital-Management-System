package Hospital.service;

import Hospital.repository.OneLoginRepository;

public class OneLoginServices {

	public int OneLoignPage(String username,String password)
	{
		OneLoginRepository or=new OneLoginRepository();
		
		return or.oneLoginPage(username, password);
		
	}
	
	
}
