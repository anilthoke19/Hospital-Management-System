package Hospital.model;

public class Medicine {

	private String name;
	private int price ;
	private int mid;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	
	
	public Medicine(String name, int price, int mid) {
		super();
		this.name = name;
		this.price = price;
		this.mid = mid;
	}
	
	
	
	
	
}
