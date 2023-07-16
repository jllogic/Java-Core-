package ComparableAndComparator;

public class Laptop implements Comparable<Laptop>{

	private String brand;
	private int ram;
	private int price;
	
	
	public Laptop(String brand, int ram, int price) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.price = price;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", brand=" + brand + ", price=" + price + "]";
	}

	
	@Override
	public int compareTo(Laptop lap2) {
		// this > lap2 +
		//this < lap2 -
		//this == lap2 0
		if(this.getRam() > lap2.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
	
}
