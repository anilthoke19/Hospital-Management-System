package Hospital.model;

public class AdminLogin {
	private String  AdminName;
	private String password;
	public AdminLogin(String adminName, String password) {
		super();
		AdminName = adminName;
		this.password = password;
	}
	public AdminLogin() {
		
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
