package Basics;

public class ClassesObjects {
	
	/*
	 * Local Variable Type Inference introduced Java 10
	 * 
	 * Infer types of local variable with initializers
	 * No need to explicitly declare local variable type
	 * if it can be inferred from the assigned value
	 *  
	 *  This feature is limited to:
	 *  local variables with initializers 
	 *  Indexes in enhanced for-loops
	 *  local variables declared in traditional for loops
	 *  
	 *  Example:
	 */
	
	public void someOperation(int param) {
		var value1 = "Hello";
		var value2 = param;
	}
	
	/*
	 * Constants
	 * assigned once and cannot be changed
	 * final keyword 
	 * instance final variables must be either 
	 * initialized immediately or via all constructors 
	 * local variables and parameters can also be marked as final.
	 * attempt to reassign final variable will result in complier error
	 */
	
	
	/* static
	 * 
	 * Class memory context also known as static context is shared by all 
	 * instances of this class
	 * Objects can access shared static context.
	 * Current Instance (this) is meaningless within the static context.
	 * SO you cannot access instance methods or variables from static 
	 * method you will get compiler error
	 * 
	 * But you can access static from non-static methods
	 * You cannot invoke a instance variable via Class name only static variable/method
	 * because it would be ambiguous 
	 */
	
     /*
      * Combining static and final
      * 
      * it provides a simple way of defining globally visible constants
      * Encapsulation (private access modifier) not required because value is read only
      * 
      */

	  public static final int MAX_EXPIRY_PERIOD = 5;
	  
	  /*
		 * Static Context
		 * 
		 * Object reference is not required (but can be used) to access static context.
		 * Static initializer(below) runs once, before any other operation(when class is loaded)
		 * Instance variables and methods are not accessible through the static context.
		 * Cannot call 
		 * Product.getName();
		 * All methods of Math class are static
		 * 
		 */
		
		static {
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Look up UML Diagrams
		//Variable usually a noun written in lowercase
		//variables typically use private access modifier to protect data within class
		//primitives default to 0, except boolean which defaults to false,Objects to null
		//instance variable because each instance will have its own instance of variables
		
		//Variables typically private, methods public
		
		//method names are typically a verb like (get or set) written in lowercase
		//Access modifiers determine where the method can be invoked
		
		/*
		 * Object Creation
		 * 
		 * You may assign an object reference (var1) to a variable of the appropriate type(Product)
		 *  that can be this class or any of its parents
		 *  
		 * You can assign the same object reference to more than on variable, this does 
		 * not duplicate the object.
		 */
		
		/*
		 * Product p1 = new Product();
		 * Product p2 = new Product();
		 * Product p1 = p2;
		 * 
		 * p2.setName("charles");
		 * 
		 *  p2 and p3 point to same object where name is charles
		 */
		
		/*
		 * No access modifiers for local variables 
		 * method parameters are local variables
		 * local variable can shadow instance variables if names coincide 
		 * use this variable to refer to instance rather than local variable
		 * local variables do not have access modifiers 
		 * Variables defined in inner blocks of code delimited by {} are not 
		 * visible outside these blocks
		 */
		
		/*
		 * Can import 
		 * import static Math.random;
		 * Then use random as such
		 * random();
		 */
		/*
		 * Factory Methods- Design Pattern that are static methods that create and return a new instance.
		 * 
		 */
	}
}
