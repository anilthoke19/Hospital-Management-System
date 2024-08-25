package Hospital.model;

public class DoctorModel {
   private int did;
   private String dname;
   private String contact;
   private int fees;
   private String specialization;
   private String username;
   private String password;
   public DoctorModel()
   {
	   
   }
public DoctorModel(String dname, String specialization,int fees,String contact,String username,String password) {
	
	this.dname = dname;
	this.contact = contact;
	this.fees = fees;
	this.specialization = specialization;
	this.username=username;
	this.password=password;
}

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}


}
