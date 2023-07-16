package Basics;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TextDateTimeNumericObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//will be sent to string pool all 3 point to same Hello in Pool called internment 
		String a = "Hello";
		String b = a;
		String c = "Hello";
		
		//true
		System.out.println("Does a.equals b " + a.equals(b));
		//false
		System.out.println("Does a == b " + (a==b));
		System.out.println("Does a == c " + (a==c));
		
		if(a==c) {
			System.out.println("Inside if statment so true");
		}else {
			System.out.println("false");
		}

		//new keyword disables String interning, d and e point to different Hello
		//frowned upon (new keyword)
		char[] text = {'H','e','l','l','o'};
		String d = new String (text);
	    String e = new String("Hello");
	    //provoking intern creates pool both f and g point to same hello now
	    String f = d.intern();
	    String g = e.intern();
	    
	    //variable h and i point to same string in pool
	    String h = " people ";
	    h = h.trim();
	    System.out.println(h);
	    h = h.concat("hi");
	    System.out.println(h);
	    String i = "peoplehi";
	    System.out.println(i);
	    String j = i.toUpperCase();
	    System.out.println(j);
	    //false java case sensitive
	    boolean k = j.contains("h");
	    System.out.println(k);
	    // read left to right
	    String s = "";
	    // s is 2u
	    s = 1+1+"u";
	    //s is u11
	    s = "u" + 1 + 1;
	    //s is u2
	    s="u" + (1+1);
	    
	    
	    String var = "HelloWorld";
	    //var1 is "Hello", begin index is inclusive, end index 5 is not inclusive
	    String var1 = var.substring(0,5);
	    int indx = var.indexOf('o'); //indx is 4
	    int indx1 = var.indexOf('o', 5); //indx1 is 6
	    //indx2 is -1, if not found indexOf method returns -1
	    int indx2 = var.indexOf('a');
	    //10
	    int count = var.length();
	    // StringIndexOutOfBoundsException
	    //char char1 = var.charAt(10);
	    char char1 = 'A';
	    //StringBuilder Mutable, default capacity 16, no gaurentee of synchornization
	    //if using multiple threads StringBuffer shoul dbe used so only one thread 
	    //can access StringBuffer at once
	    // some methods like String: substring, indexOf,charAt
	    //extra Methods append,insert,delete, reverse
	    // ways to initialize
	    StringBuilder stringA = new StringBuilder();
	    StringBuilder stringB = new StringBuilder("text");
	    //capacity 100
	    StringBuilder stringC = new StringBuilder(100);
	    System.out.println(stringC.capacity());
//	    with append, you just add a new entry at the end of the list. 
//	    With insert(position, new_entry) you can create a new entry exactly in the position 
//	    you want
	    //tea
	    stringA.append("tea");
	    ////teas
	    stringA.append('s');
	    //teams
	    stringA.insert(3, 'm');
	    //tes like substring lower inclusive, upper not
	    stringA.delete(2, 4);
	    //set
	    stringA.reverse();
	    //3
	    int length = stringA.length();
	    //16
	    int capacity = stringA.capacity();
	    //// StringIndexOutOfBoundsException, sequence of characters must be continuous
	    //stringA.insert(4, 's');
	    
	    
	    //Wrapper Classes
	    /*
	     * Construct wrapper object out of primitive or string using valueOf()methods
	     * Extract primitive values out of wrapper using xxxValue() Methods
	     * autoboxing, unboxing
	     * Create wrapper or string using parseXXX() methods
	     * You may convert a primitive to a string using String.valueOf() method
	     * Wrapper classes provide constants, such as min and max values for every type/
	     */
	    int var2 = 42;
	    Integer var3 = Integer.valueOf(var2);
	    int var4 = var3.intValue();
	    //auto-boxing
	    var3 = var2;
	    //unboxing
	    var4 = var3;
	    
	    String var5 = "12.25";
	    Character ch = Character.valueOf(char1);
	    Float var6 = Float.valueOf(var5);
	    float var7 = Float.parseFloat(var5);
	    String var8 = String.valueOf(var2);
	    System.out.println(Short.MIN_VALUE);
	    System.out.println(Short.MAX_VALUE);
	 
	    //go over bigDecimal part 2
	    //String bigDecimal, DateTime Immutable
	    //Local Date Time Objects Immutable
	    LocalDateTime current = LocalDateTime.now();
	    LocalDateTime different = current.withMinute(14).withDayOfMonth(3).plusHours(12);
	    int year = current.getYear();
	    boolean before = current.isBefore(different);
	    
	    LocalDate lDate = LocalDate.now();
	    LocalTime lTime = LocalTime.now();
	    //year,month,day
	    LocalDate date = LocalDate.of(2019, Month.APRIL,1);
	    //hour,minute
	    LocalTime someTime = LocalTime.of(10, 6);
	    //year,month,day,hour,minute
	    LocalDateTime otherDateTime = LocalDateTime.of(2019,Month.MARCH,3,10,2);
	    LocalDateTime someDateTime = date.atTime(someTime);
	    LocalDate whatDate = someDateTime.toLocalDate();
	    //Instants,Durations, and Periods
	    //Also Immutable
	    //watch over
	    System.out.println(whatDate);
	    LocalDate today = LocalDate.now();
	    LocalDate foolsDay = LocalDate.of(2019, Month.APRIL,1);
	    Instant timeStamp = Instant.now();
	    int nanoSecondsFromNow = timeStamp.getNano();
	    Period howLong = Period.between(foolsDay,today);
	    Duration twoHours = Duration.ofHours(2);
	    long seconds = twoHours.minusMinutes(15).getSeconds();
	    int days = howLong.getDays();
	    
	    ZoneId london = ZoneId.of("Europe/London");
	    ZoneId la = ZoneId.of("America/Los_Angeles");
	    LocalDateTime dateTime = LocalDateTime.of(2019,Month.MARCH,3,10,2);
	    ZonedDateTime londonTime = ZonedDateTime.of(dateTime, london);
	    ZonedDateTime laTime = londonTime.withZoneSameInstant(la);
	    
	    
	    		}

}
