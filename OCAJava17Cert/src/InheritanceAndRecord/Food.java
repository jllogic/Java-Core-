package InheritanceAndRecord;

public class Food extends Product {
	
	private String name;
	

	public void eat() {
		
		super.getCalories();
		System.out.println("eating.. you ate " + super.getCalories() + " calories!");
	}
	
	public Food(String name) {
		//because Super has a constructor must call it in first line
		super(name);
		this.name = name;
	}
	
	
	
	//go over pattern matching

	@Override
	public int numberInventory() {
		// TODO Auto-generated method stub
		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Multiple Inheritance not allowed
		 */
		Object test1 = new Food("Hersheys");
		//only methods from Object class
		test1.toString();
		//Only methods from Product Class, and Object Class
		Product test2 = new Food("Kelloggs Cereal");
		test2.setCalories(200);
		//Only methods from Food Class, Product Class, and Object Class
		Food test3 = new Food("Toast Crunch");
		Food test4 = new Food("Toast Crunch");
		/*
		 * Called Pattern Matching:
		 * The java instanceof operator is used to test whether the 
		 * object is an instance of the specified type (class or subclass or interface).
		 */
		//if test3 instance of Food
		if(test3 instanceof Food) {
			test3.toString();
		test3.setCalories(300);
		test3.eat();
		System.out.println(test3.name);
		
		}
		
		//if test3 subclass of Product
		if(test3 instanceof Product) {
			Product x3 = test3;
			
			x3.setCalories(250);
			//pass by value
		System.out.println("x3 calories" + x3.getCalories());
		System.out.println("test3 calories" + test3.getCalories());
		System.out.println("Inventory" + x3.numberInventory());
		}
		//Food Overriden inventory, name sent via constructor
		Product x4 = new Food("Barry's");
		System.out.println("Name " + x4.getBrandName() + " Inventory " + x4.numberInventory());
		
		int x = 5;
		int y = 5;
		
		System.out.println("Does x primitive have same reference as y primitive " + (x==y));
		//System.out.println("Does x primitive have same reference as y primitive " + (x.equals(y));
		//result false
		System.out.println("Does test3 object have same reference as test4 object " + (test3==test4));
		//This is why you have to override equals result false
		System.out.println("Does test3 object have same value as test4 object " + (test3.equals(test4)));

		
	}

}
