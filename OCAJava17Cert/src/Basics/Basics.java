package Basics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Basics {
	/*
	 * Multi- Line comment
	 * 
	 * */
	
	// single line comment
	
	
	/* Java is case sensitive
	 *  * Java source code is written as plain text .java files
	 * Source code is compiled into byte-code .class files for JVM
	 * Compiler comes with JDK
	 * javac HelloWorld.java
	 * JVM executes your application by translating Java byte-code
	 * instructions to platform specific code
	 * JVM fictional machine that translates to platform specific OS Linux,Apple,Windows
	 * java HelloWorld
	 * Java programs well isolated from environment so they embedded it using JVM 
	 * to online DB etc. 3rd party software can be used easily because of JVM as well
	 * 
	 * information,attribute,field
	 * behavior, method, operation, procedure
	 * 
	 * JavaEE requires classes in packages
	 * Bytecode does not use import statements they use fully qualified names 
	 * public- Visible to any other class
	 * protected - Visible to classes that are in the same package or to subclasses
	 * default- Visible only to classes in the same package
	 * private- Visible only within the same class
	 * 
	 * JVM entry point
	 * public static void main(String[] args){
	 * } 
	 * 
	 * java.lang automatically included no import statements
	 * javac -cp /project/classes -d /project/classes /project/sources/demos/Whatever.java
	 * 
	 * -cp points to locations of other classes that may be required to compile your code.
	 * -d points to a path to store compilation result.
	 * 
	 * learn how to get javadoc
	 * javadoc -d <documentation path>
	 *         -sourcepath <source code path>
	 *         -subpackages <name of root package>
	 * 	 */

	/**
	 * JavaDoc 
	 * The {@code Whatever} class represents ya boy learning 
	 */
	/*Pillar 1: Abstraction
	 * In Java, abstraction is achieved by interfaces and abstract classes.
	 *  We can achieve 100% abstraction using interfaces.
     * The abstract method contains only method declaration but not implementation.
     * Pillar 2: Encapsulation
     * It is defined as the wrapping up of data under a single unit. It is the mechanism
     *  that binds together the code and the data it manipulates. Another way to think about
     *   encapsulation is that it is a protective shield that prevents the data from being 
     *   accessed by the code outside this shield. 
     *   Pillar 3: Inheritance 
     * Inheritance is an important pillar of OOP (Object Oriented Programming). It is the 
     * mechanism in Java by which one class is allowed to inherit the features (fields and 
     * methods) of another class. We are achieving inheritance by using extends keyword. 
     * Inheritance is also known as “is-a” relationship.
	 */
	public static void concat1(String strg)
    {
		strg = strg + "forgeeks";
    }
	// Method 2
    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append("forgeeks");
    }
 
    // Method 3
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s3)
    {
        s3.append("forgeeks");
    }
 
	
 public static void main(String[] args) {
	 //Why doesnt string change like before??
	 String strg = "Geeks";
	 concat1(strg);
	 System.out.println("String: " + strg);
     StringBuilder s2 = new StringBuilder("Geeks");
     concat2(s2);
     System.out.println("StringBuilder: " + s2);
     
     StringBuffer s3 = new StringBuffer("Geeks");
     
     // Calling above defined method
     concat3(s3);

     // s3 is changed
     System.out.println("StringBuffer: " + s3);
     
     
     
	//Whole numbers
	//_ for readability
	byte theByte = -128;
	short theShort = 32_000;
	int theInt = 787_838_334;
	long theLong = 78_783_833_432L;
	
	//decimal numbers
	float pi = 3.14F;
	double doublePi = 3.1415;
	
	//character
	char nameInitial = 'J';
	//true false
	boolean isAdult = true;

	int a = 10;
	int b = a;
	a = 100;
	
	System.out.println("a = " + a + " - b " + b);
	
	String c = "Hello World";
	String d = c;
	c = "Whats up Dude";
	
	System.out.println("c = " + c + " - d " + d);
	String code = "code";
	String name = new String("AmigosCode");
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.charAt(0));
	//new keyword can equal literal string if equal
	System.out.println(code.equals(name));
	
	
	boolean isAdults = false;
	boolean isStudent = true;
	
	// both must be true to get true
	System.out.println(isAdults && isStudent);
	//one must be true to get true
	System.out.println(isAdults || isStudent);
	
	int age = 35;
	
	//ternary operator
	String message = age >= 18 ? "Hooray I am an adult" : "I am not an adult";
	System.out.println(message);
	
	if(age >= 18) {
		System.out.println("I am an adult");
	}else if (age >= 16 && age < 18) {
		System.out.println("I am almost an adult");
	}else {
		System.out.println("I am not an adult");
	}
	
	String gender = "Male";
	switch(gender) {
	case "Male" :
		System.out.println("I am a Male");
		break;
	case "Female" :
		System.out.println("I am a Female");
		break;
	default : 
		System.out.println("Unknown");
	}
	//default 0 for int
	int [] numbers = new int[3];
	
	numbers[0] = 0;
	numbers[1] = 1;
	numbers[2] = 2;
	System.out.println(Arrays.toString(numbers));
	
	String [] names = {"Trinity","Elvis"};
	//enhanced for loop does not give access to index like for loop does
	
	for(int number : numbers) {
		System.out.println(number + " I am int" );
	}
	
	//break and continue
	for(int number : numbers) {
		if(number == 1) {
			break;
		}
		System.out.println(number + " Up to 1");
		
		System.out.println(number + " I am int" );
	}
	
	for(int number : numbers) {
		if(number == 1) {
			continue;
		}
		System.out.println(number + " I skip 1");
		
		System.out.println(number + " I am int" );
	}
	//another way
	
	Arrays.stream(numbers).forEach(System.out::println);
	Arrays.stream(names).forEach(System.out::println);
	
	//another way of declaring array
	int [] numbersNext = {0,1,2,100,10};
	System.out.println(Arrays.toString(numbersNext));
	System.out.println(numbersNext[3]);
	System.out.println(numbersNext.length);
	
	for (int i = 0; i < numbersNext.length; i++) {
		System.out.println(numbersNext[i]);
	}
	
	//reverse order
	for (int i = numbersNext.length - 1; i >= 0; i--) {
		System.out.println(numbersNext[i]);
	}
	
	
	//default false for boolean
	boolean [] numbersBoo = new boolean[2];
	System.out.println(Arrays.toString(numbersBoo));
	//deafult null for string
	String [] numbersStr = new String[2];
	System.out.println(Arrays.toString(numbersStr));
	
	String [] names2 = {"Ali", "Maria"};
	System.out.println(Arrays.toString(names2));
	//to get last element
	System.out.println(names2[names2.length-1]);
	
	int number = 3;
	number += 5;
	System.out.println(number);
	
	number -= 3;
	System.out.println(number);
	
	int count = 0;
	
	// while always needs to be true to run
	while( count <= 10) {
		System.out.println("count " + count);
		count ++;
	}
	
	int counter = 21;
	do {
		System.out.println(counter);
		counter ++;
	}
	while(counter <= 20);
	
	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("What is your name? ");
//	String userName = scanner.nextLine();
//	
//	System.out.println("What is your age? ");
//	int userAge = scanner.nextInt();
//	
//	int year = LocalDate.now().minusYears(userAge).getYear();
//	System.out.println("Your name is " + userName + " you were born in the year " +
//	year + " and your age is " + userAge);
	
	char[] letters = {'A', 'A', 'B','C','D','D','D'};
	int count1 = countOccurrences(letters);
	System.out.println(count1);
	//String class and all Wrapper classes are Immutable
	String s1 = "java";
	s1.concat(" rules");
	// does not reassign
	System.out.println(s1);
	s1 = s1.concat(" rules (created reference reassignment");
	System.out.println(s1);
	
	//insert is like length starts at 1
	//delete is like index starts at 0
	//Stringbuffer- compared to String
	//Mutable,efficient,Thread safe meaning multiple threads cannot access simultaneously
	//String objects are not thread-safe, which means that you need to use synchronization 
	//if you want to access a String object from multiple threads.
	//multiple modifications to a string, or if you need to access a string from multiple
	//threads, using StringBuffer can be more efficient and safer
	//Constructor initial capacity of 16
	StringBuffer sb = new StringBuffer();
	StringBuffer sb1 = new StringBuffer("Hello World");
	//constructor: capacity 10
	StringBuffer sb2 = new StringBuffer(10);
    sb2.append("Hello");
    sb2.append(" ");
    sb2.append("world");
    sb2.insert(6, "yall ");
    sb2.deleteCharAt(0);
    //sb.reverse();
    String message1 = sb2.toString();
    System.out.println(message1);
    
    
    //**All Implemented Interfaces of StringBuffer class: Serializable, Appendable, CharSequence.
 }
 
 		public static int countOccurrences(char[] letters) {
 			System.out.println("method countOccurrences was invoked");
 			return 0;
 		}
}
