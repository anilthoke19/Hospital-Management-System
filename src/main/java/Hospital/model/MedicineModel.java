package Hospital.model;

public class MedicineModel {
    private int mid;
    private String mname;
    private int cost;
    
    
    
    
    
	public MedicineModel() {
		
	}
	
	
	public MedicineModel(int mid, String mname, int cost) {
		this.mid = mid;
		this.mname = mname;
		this.cost = cost;
	}
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
    
}
