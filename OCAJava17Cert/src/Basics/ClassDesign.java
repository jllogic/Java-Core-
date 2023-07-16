package Basics;

import java.math.BigDecimal;

public class ClassDesign {
	
	//OverLoad methods
	
	/* Two or more methods within the same class that have identical names
	 * Must have different number or different types or different order of parameters
	 * 
	 *  Will not compile if only differs by parameter name or return type
	 *  
	 *  
	 */
	
	/*
	 * Immutable Objects
	 * present read-only data
	 * 
	 * cannot be modified after object construction
	 * instance variables are initialized immediately or via constructors
	 * no setter methods
	 * they are thread safe 
	 * Many JDK classes are designed this way:Primitive Wrappers,Local Date TIme and String 
	 *
	 */
	private String readOnlyText = "Some read only text";
	
	//Immutable and constant
	/*
	 * constants assign once and cannot be changed with final
	 * keyword, can have final parameter, cannot create setters
	 * instance variables which are final must be initialized immediatly or initialed with 
	 * instance initializer or constructor.
	 * Instance initializer ran every-time you create instance of class
	 * There was static initializer which is fired once when class is loaded to memory.
	 * 
	 */
	private String name;
	private BigDecimal price;
	private BigDecimal discount;
	private BigDecimal tax;
	private final String constantVar;
	
	{
		constantVar = "hello";
	}
	{
	System.out.println("What up");
	}
	/*
	 * Constructor can invoke another to reuse its logic.
	 * Syntax: this(<other constructor parameters>);
	 * Must be first line of code in invoking constructor.
	 * Must match type
	 * A cycle (loop) of constructor invocations is not allowed meaning you
	 * cannot call back to the initial calling constructor 
	 * no arg constructor not added when you have constructor
	 */
	public ClassDesign() {
		
	}
	public ClassDesign(String name, double price ) {
		//will execute all of next constructor
		this(name);
		this.price = BigDecimal.valueOf(price);
	}
	
	public ClassDesign(String name) {
		
		this.name = name;
		System.out.println("Hello Joel");
		this.price = BigDecimal.ONE;
	}
	
	public void setPrice(double price) {
		this.price = BigDecimal.valueOf(price);
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	//can only be initialized via instance variable or constructor to be immutable
	public String getReadOnlyText(String text) {
		return readOnlyText;
	}
	
	/*
	 * Varargs feature
	 * 
	 * enables a variable number of arguments of the same type
	 * avoids creating too many overloaded versions of the same method
	 * vararg parameter is treated as an array, with length constant indicating 
	 * a number of values.
	 * int index starting a zero is used to access array elements.
	 * 
	 * in case where there are other parameters vararg must be defined last
	 * instead of [] you can use ... in main method
	 */

	public void setFiscalDetails(double... values) {
		switch(values.length) {
		case 3:
			tax = BigDecimal.valueOf(values[2]);
		case 2:
			discount = BigDecimal.valueOf(values[1]);
		case 1:
			price = BigDecimal.valueOf(values[0]);
		}
	}
	
	/*
	 * Constructor
	 * A Constructor is a special method that initializes the object:
	 * is invoked using the new operator
	 * must be named after class and must not have a return type or be defined a void
	 * usually public, may have parameters and can be overloaded like any other method
	 * A default constructor with no parameters is implicitly added to the class, only
	 * if no other constructors were added.
	 * You may explicitly add the no-arg constructor as yet another overloaded version
	 * of constructor if you want to be able to instantiate your class with or without 
	 * providing constructor arguments.
	 * 
	 */
	
	//Go Over Encapsulation
	/*
	 * Instance variables usually private so they are not visible to other classes
	 * To access use less restrictive modifiers like public,default,protected.
	 * Allows you to control access to info,validate data, or modify data format.
	 * There are private methods which can be invoked only from other methods of same 
	 * class
	 */
	
	/*
	 * Memory Allocation 
	 * Stack holds primitives and object references
	 * Heap holds objects and classes, is a shared memory area
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassDesign design = new ClassDesign("Joel", 1.99);
		System.out.println(design.name + design.price);
		
		//String is Immutable
		double v1 = 1.99;
		String str1 = "king";
		String str2 = "Queen";
		//testObject(str1);
		System.out.println(str1);
		BigDecimal dec = new BigDecimal(1.8);
		ClassDesign d = new ClassDesign();
		d.price = dec;
		System.out.println("this is d price before method " + d.getPrice());
		testObject(d);
		System.out.println("this is d price after method " + d.getPrice());
		
		
	}
	
	public static void testObject(ClassDesign str3) {
		str3.setPrice(1.9);
		
	}

}

//Enum values are public static and final.

 enum Condition{
	 // constructor restricts any other type of enum, overload for other types
	Hot("Very Hot"),
	Warm("Just right"),
	Cold("Cold warm it up");
	 
	 private String caution;
	 
	 //The Enum instances are calling the private constructor
	 
	 private Condition(String caution) {
		 this.caution = caution;
	 }
	 
	 public String getCaution() {
		 return caution;
	 }
}
