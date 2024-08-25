package Hospital.model;

import java.sql.Date;

public class PatientModel {
   private int pid;
   private String pname;
   private String contact;
   private String diesease;
   private Date registrationDate;
   private String pCatogery;
   private String time;

 
   public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public PatientModel( String pname, String contact, String diesease, Date registrationDate,String time) {
	this.time=time;
	this.pname = pname;
	this.contact = contact;
	this.diesease = diesease;
	this.registrationDate = registrationDate;
}
public PatientModel()
   {
	   
   }
   public int getPid() {
	   
	   
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getDiesease() {
	return diesease;
}
public void setDiesease(String diesease) {
	this.diesease = diesease;
}
public Date getRegistrationDate() {
	return registrationDate;
}
public void setRegistrationDate(Date registrationDate) {
	this.registrationDate = registrationDate;
}
}
