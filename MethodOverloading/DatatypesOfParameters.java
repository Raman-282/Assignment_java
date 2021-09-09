package MethodOverloading;

public class DatatypesOfParameters {
	public static void display(int a) {
		System.out.println("Show Integer Data");
	}
	public static void display(String a) {
		System.out.println("Show String Data");
	}
	public static void main(String args[]) {
		display(6);
		display("Vibe");
	}
}
