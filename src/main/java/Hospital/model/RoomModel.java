package Hospital.model;

public class RoomModel {
   private int rid;
   private String type;
   private int rcost;
   private int Quentity;
   
   
   
public RoomModel() {
	
}



public RoomModel(int rid, String type, int rcost, int quentity) {
	super();
	this.rid = rid;
	this.type = type;
	this.rcost = rcost;
	Quentity = quentity;
}



public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getRcost() {
	return rcost;
}
public void setRcost(int rcost) {
	this.rcost = rcost;
}
public int getQuentity() {
	return Quentity;
}
public void setQuentity(int quentity) {
	Quentity = quentity;
}
}
