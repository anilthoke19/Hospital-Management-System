package Hospital.model;

import java.sql.Date;

public class BillModel {
   private int payid;
   private int roomcost;
   private int medicinecost;
   private int dfees;
   private int total;
   private int pid;
   private Date billDate;
   
   
public BillModel(int payid, int roomcost, int medicinecost, int dfees, int total, int pid) {
	this.payid = payid;
	this.roomcost = roomcost;
	this.medicinecost = medicinecost;
	this.dfees = dfees;
	this.total = total;
	this.pid = pid;
}
public BillModel() {
	
}
public int getPayid() {
	return payid;
}
public void setPayid(int payid) {
	this.payid = payid;
}
public int getRoomcost() {
	return roomcost;
}
public void setRoomcost(int roomcost) {
	this.roomcost = roomcost;
}
public int getMedicinecost() {
	return medicinecost;
}
public void setMedicinecost(int medicinecost) {
	this.medicinecost = medicinecost;
}
public int getDfees() {
	return dfees;
}
public void setDfees(int dfees) {
	this.dfees = dfees;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}

public Date getBillDate() {
	return billDate;
}
public void setBillDate(Date billDate) {
	this.billDate = billDate;
}




}
