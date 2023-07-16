package NestedLambda;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outer = new OuterClass();
		outer.heyThere();
		
		//When innerclass not static
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.whatsUp();
		
		
		//When Static
		OuterClass.InnerClass2 inner2 = new OuterClass.InnerClass2();
		inner2.whatsUp();
	}

}
