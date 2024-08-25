package Hospital.model;

public class ReceptionistModel {

	private int recpId;
	private String recpName;
    private  String recpContact;
    private String  userName;
	private String Recptpassword;
    
	public int getrecpId() {
		return recpId;
	}

	public void setrecpId(int recpId) {
		this.recpId = recpId;
	}

	public String getrecpName() {
		return recpName;
	}

	public void setrecpName(String recpName) {
		this.recpName = recpName;
	}

	public String getrecpContact() {
		return recpContact;
	}

	public void setrecpContact(String recpContact) {
		this.recpContact = recpContact;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		userName = username;
	}

	public String getRecptpassword() {
		return Recptpassword;
	}

	public void setRecptpassword(String recptpassword) {
		Recptpassword = recptpassword;
	}
	
	

	public ReceptionistModel() {
		
		
	}

	

	public ReceptionistModel(int recpId, String recpName, String recpContact, String recptName, String recptpassword) {
		super();
		this.recpId = recpId;
		this.recpName = recpName;
		this.recpContact = recpContact;
		userName = recptName;
		Recptpassword = recptpassword;
	}
	
	
	
	
	
	
	
}
