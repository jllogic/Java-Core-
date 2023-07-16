package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[]args) {
		//Lookup cost of re-sizing Collections
		String p1 = "Hello";
		String p2 = "Hello There";
	
		Set<String> set1 = new HashSet<>();
		
		set1.add(p1);
		set1.add(p2);
		
		//ArrayList automatically expands when more elements added.
		List<String> list1 = new ArrayList<>();
		//Size 20
		List<String> list2 = new ArrayList<>(20);
		List<String> list3 = new ArrayList<>(set1);
		//Fixed-sized list can be created from the array using var-arg method Arrays.asList(<T>..)
		List<String> list4 = Arrays.asList(p2,p2);
		//Cannot add to list fixed size
		//list4.add("Whatsup");
		//System.out.println(list4);
		//read-only instance
		List<String> list5 = List.of(p1,p2);
		//read-only
//		System.out.println(list5);
//		list5.set(0, "hee");
//		list5.add("Whatsup");
		
		
		//List methods
		//Arraylist intial size 10
		String product1 = "Cake";
		String product2 = "Tea";
		
		List<String> menu = new ArrayList<>();
		
		menu.add(product1);
		menu.add(product2);
		System.out.println(menu);
		menu.add(2, null);
		menu.add(3, product1);
		System.out.println(menu);
		menu.add(2,product1);
		//Updating
		menu.set(2, product2);
		System.out.println(menu);
		menu.remove(0);
		//removes first occurance of product2
		menu.remove(product2);
		System.out.println(menu);
		boolean hasTea = menu.contains(product2);
		int index = menu.indexOf(product1);
		System.out.println(menu.get(index));
		//indexOutOfBounds cannot skip positions
		//menu.add(4,product2);
		
		
		//Set, HashSet
		
		//initial 16 elements
		//no order garuantee
		//no duplicates
		
		
		String product3 = "CakeSet";
		String product4 = "TeaSet";
		
		List<String> menu1 = new ArrayList<>();
		menu1.add(product3);
		menu1.add(product4);
		
		
		Set<String> menuSet1 = new HashSet<>();
		Set<String> menuSet2 = new HashSet<>(20);
		//Set<String> productSet3 = new HashSet<>(20, 0.85);
		Set<String> menuSet4 = new HashSet<>(menu1);
		//read only
		Set<String> menuSet5 = Set.of(product3,product4);
		
		menuSet4.add(product3);
		menuSet4.add(product4);
		
		System.out.println(menuSet4);
		//No duplicates, will not add
		menuSet4.add(product3);
		System.out.println(menuSet4);
		menuSet4.remove(product3);
		System.out.println(menuSet4);
		menuSet4.remove(product3);
		//Remove nothing
		System.out.println(menuSet4);
		
		//Deque
		//initial size pf 16
		//null not allowed
		
		String product5 = "CakeDeque";
		String product6 = "TeaDeque";
		
		List<String> menu2 = new ArrayList<>();
		menu1.add(product5);
		menu1.add(product6);
		
		Deque<String> dArray = new ArrayDeque<>();
		Deque<String> dArray1 = new ArrayDeque<>(20);
		Deque<String> dArray2 = new ArrayDeque<>(menu2);
		
		//offerFirst/Last inserts in first or last place
		dArray2.offerFirst(product5);
		dArray2.offerLast(product6);
		
		//pollFirst/Last gets then removes
		dArray2.pollFirst();
		
		//peek gets element
		dArray2.peekFirst();
		//null not allowed in Deque
		//dArray2.offerLast(null);
		
		
	//HashMap
		//initial 16 size
	 String product7 = "pie";
	 
	 Map<String,Integer> menu3 = new HashMap<>();
	 Map<String,Integer> menu4 = new HashMap<>(20);
	 Map<String,Integer> menu5 = new HashMap<>(menu3);
	 //Read only Map
	 Map<String,Integer> menu6 = Map.of(product7,Integer.valueOf(1));
		
	}
}