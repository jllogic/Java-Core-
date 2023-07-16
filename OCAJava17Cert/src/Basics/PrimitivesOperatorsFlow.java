package Basics;

public class PrimitivesOperatorsFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Can declare/initialize on same line but must be same type
		
				char f = '\u0041', l = '\101';
				
				
				
				/* byte a;
				 * a has not been initialized
				 * byte b = a;
				 * 128 over range for byte -128 to 127
				 * byte c = 128;
				 * Cannot give bigger range to smaller
				 * int d = 42L;
				 * missing letter F
				 * float e = 1.2;
				 * only single quotes
				 * char f = "a"
				 * Cannot hold more then 1 char
				 *  char t = 'HI';
				 *  
				 *  cannot use string or char for boolean
				 *  boolean h = "true";
				 *  boolean i = 'false';
				 *  
				 *  only true or false
				 *  boolean j = 0;
				 *  case sensitive
				 *  boolean k = False;
			 	*/
				
				System.out.println(f);
				
				int a = 1, b = 0;
				// postfix: first assign a to b then increment a
				b = a++;
				// prefix :first increment a then assign to b
				b = ++a;
				//go over Primitives part 2,3
				
				//++ remains the type
				
				int h = 2;
				int g = 3;
				
				int k = (h>=g) ? h : g;
				
				System.out.println(k);
				
				//switch works with byte,short,int,char,String,enum
				//if no break it goes to next one
				switch (h) {
				case 5:
					g += 1;
					System.out.println(g);
					break;
				case 2:
					g +=3;
					System.out.println(g);
					break;
				default:
					g = 4;
					System.out.println(g);
				}
	}

}
