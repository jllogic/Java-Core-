package DataStructuresAndAlgorithms;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array not dynamic once you create it you cannot change(increase,decrease) its size
	    //it is 0 based so up to 6 here, 7 will get you indexoutofbounds
		//stored as one contiguous block in memory 
		//Every element occupies the same amount of space in memory
		// x- starting memory address of array, y size of each element in array, 
		// i memory address of ith element. expression: x + i * y
		// the time to retrieve the element will be the same no matter where it is in the array
		//with memory address starting at 12 with 4 bytes of size
		// to get memory address of element
		// 12 + 0 * 4 = 12
		// 12 + 1 * 4 = 16 cont.
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
				
		//if we needed to get the element 7 without knowing which index it is we would
		//big o when we know the index is O(1) constant when we dont know it is O(n) linear
		//if requires a loop linear ir not constant
				int index = -1;
				for(int i = 0; i < intArray.length; i++) {
					if(intArray[i] == 7) {
						index = i;
						break;
					}
				}
				
				System.out.println("index = " + index);
	}

}
