package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Laptop> laptop = new ArrayList<>();
		laptop.add(new Laptop("Acer",22,750));
		laptop.add(new Laptop("Apple",25,1200));
		laptop.add(new Laptop("HP",23,400));
		
		Collections.sort(laptop);
		
		for(Laptop l : laptop) {
			System.out.println(l);
		}
		
		//Comparator if we were given code and cannot implement Comparable
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				
				// this > lap2 +
				//this < lap2 -
				//this == lap2 0
				if(l1.getPrice() > l2.getPrice()) {
					return 1;
				}else
					return -1;
			}
		};
		
		Collections.sort(laptop, com);
		
		for(Laptop l : laptop) {
			System.out.println(l);
		}
	}

}
