package ArraysAndLopps;
import java.util.Arrays;

public class ArraysAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array not dynamic once you create it you cannot change(increase,decrease) its size
		//it is 0 based so up to 6 here, 7 will get you indexoutofbounds
		int[] intArray = new int[7];
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		
		String[] values = new String[5];
		Arrays.fill(values, 2, 4, "aaa");
		int x = Arrays.binarySearch(values, "aaa");
		System.out.println(x);
		
		String[] names1 = {"Mary","April","Jerry","Michael"};
		String[] names2 = {"Mary","April","John","Michael"};
		boolean isTheSame = Arrays.equals(names1, names2);
		System.out.println(isTheSame);
		System.out.println(names1==names2);
		
		//Loops
		
		//While
		int i = 0;
		
		while(i<10) {
			//logic
			i++;
		}
		
		//do-while
		int j = 0;
		do {
			//logic
			j++;
			
		}while(j<10);

		
		//For loop
		for(int k=0; k<=10; k++) {
			//logic
		}
		
//		while(someMethod) {
//			//logic
//		}
		
		int[] values1 = {1,2,3};
		System.out.println("This is values length " + values1.length);
	
		StringBuilder txt = new StringBuilder();
		
		//with classical for loop you can have additional logic
		for(int  g = 0; g < values1.length; g++) {
			int value = values1[g];
			txt.append(value);
		}
		
		for(int value: values1) {
			txt.append(value);
		}
		
		//adds array elements within array
		int sum = 0;
		for (int f = 0; f < values.length; sum += f++);
		
		
		char[][] game = {{'O','X','X'},
				         {'X', 'X','O'},
				         {'O', ' ' ,'O'}};
		
		StringBuilder txt1 = new StringBuilder();
		
		//Length is the row length
		System.out.println("Game length is " + game.length);
		for(int p = 0; p<game.length; p++) {
			int y = 0;
			while(y < game[p].length) {
				txt1.append(game[p][y]);
				y++;
			}
			txt1.append('\n');
		}
		
		for(char[] row : game) {
			for(char value : row) {
				txt1.append(value);
			}
			
			txt1.append('\n');
		}
		
		System.out.println(txt1);
	}
}