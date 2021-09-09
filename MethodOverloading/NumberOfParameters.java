package MethodOverloading;

public class NumberOfParameters {
	public static void display(int a){
		System.out.println("Arguments: "+a);
	}
	public static void display(int a , int b) {
		System.out.println("Arguments: " + a + "and" + b);
	}
	public static void main(String args[]) {
		display(2);
		display(2,8);
		
	}
		
	}


