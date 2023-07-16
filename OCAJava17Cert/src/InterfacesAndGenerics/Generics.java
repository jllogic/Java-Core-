package InterfacesAndGenerics;

public class Generics <T> {
	
	//Generics do not work with primitives
	
	T print;
	
	public Generics(T value) {
		this.print = value;
	}
	
	public T getValue() {
		return print; 
	}
	
	public void print() {
		System.out.println(print);
	}
	
	public static void main(String[] args) {
		Generics<Integer> g = new Generics<>(9);
		g.print();
		Generics<Double> g1 = new Generics<>(11.21);
		g1.print();
	}

}
