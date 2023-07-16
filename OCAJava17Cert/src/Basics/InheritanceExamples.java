package Basics;

//Below are the different types of inheritance which are supported by Java.
//Single Inheritance
//Multilevel Inheritance
//Hierarchical Inheritance
//Multiple Inheritance
//Hybrid Inheritance
//Multilevel Inheritance
class one {
    public void print_geek()
    {
        System.out.println("Geeks1");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}
  
class three extends two {
    public void print_geek()
    {
        System.out.println("Geeks3");
    }
}
  
public class InheritanceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		three g = new three();
        g.print_geek();
        g.print_for();
        g.print_geek();
	}

}
