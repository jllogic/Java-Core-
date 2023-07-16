package InheritanceAndRecord;

import java.time.LocalDate;

public class Product {
	/*
	 * Also called Inheritance Under Control: Sealed classes
	 * Sealed classes or interfaces can only be extended or implemented by permitted classes or interfaces
	 * Permits Used to specify which classes or interfaces are allowed to extend or implement
	 * Non-sealed: no restriction on any classes or interfaces for extension
	 * final: class cannot be extended
	 * 
	 * Any class that is sealed muse define permits, any permitted class or interface must either be sealed
	 * and permit, final or non-sealed.
	 * 
	 * Any class not using any of above will behave as usual
	 */
	/*
	 * Variable that is final becomes a CONSTANT and cannot be reassigned
	 * Cannot override final methods 
	 * Cannot extend final classes
	 */
	
	/* 
	 * Go over overriding toString and equals = hashcode must equal, and hashcode = generates object identity as an int value
	 * java.security.MessageDigest
	 * == compares references in stack
	 */
	
	/*
	 * Go over FactoryPattern
	 */
	
	/* Records meant to be data carrier,are final,can be local
	 * accessors,constructor, and also overrides toString,equals,Hashcode.
	 * 
	 */
	
	record Point(int x, int y) {}
	
	private LocalDate useBefore;
	private String brandName;
	private int healthMeter;
	private int calories;

	public Product(String brandName) {
		this.brandName = brandName;
	}
	
	public Product(int calories,String brandName, int healthmeter, LocalDate useBefore) {
		this.calories = calories;
		this.brandName = brandName;
		this.healthMeter = healthMeter;
		this.useBefore = useBefore;
	}
	
	
	public LocalDate getuseBefore(){
		return useBefore;
	}

	public LocalDate getUseBefore() {
		return useBefore;
	}

	public void setUseBefore(LocalDate useBefore) {
		this.useBefore = useBefore;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getHealthMeter() {
		return healthMeter;
	}

	public void setHealthMeter(int healthMeter) {
		this.healthMeter = healthMeter;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int numberInventory() {
		return 1;
	}
	

}
