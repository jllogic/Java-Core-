package NestedLambda;

public class OuterClass {
	
	int number = 6;
	
	public void heyThere() {
		System.out.println("Hey There!");
		
		//Third inner class is local method class
	}
	
	public class InnerClass{
		 int innerNumber = 8;
		 
		 public void whatsUp() {
			 System.out.println("Whats up from the inner class");
			 
			 class LocalInnerClass{
				 String localInnerClassVariable = "Heres Johnny";
				 
				 public void printLocalInnerClassVariable() {
					 System.out.println(localInnerClassVariable);
				 }
			 }
			 
			 LocalInnerClass lic = new LocalInnerClass();
			 lic.printLocalInnerClassVariable();
		 }
	}
	
	public static class InnerClass2{
		 int innerNumber = 8;
		 
		 public void whatsUp() {
			 System.out.println("Whats up from the inner class");
		 }
	}

}
