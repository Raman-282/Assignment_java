package constructors;

public class Assignment1 {
	//Zero Argument constructor
	Assignment1() {
		System.out.println("Login homepage");
	}
	//Constructor with parameter
	Assignment1(int customerid,String name){
		System.out.println("customerid : "+customerid+"\nCustomer Name: "+name);
	}
	//Overloading
	Assignment1(int cost,int tax,int gst){
		System.out.println("Total Money: "+(cost+tax+gst));
	}
	public static void main(String args[]) {
		Assignment1 assignment=new Assignment1();
		Assignment1 assignment1=new Assignment1(001,"Shyam");
		Assignment1 assignment2=new Assignment1(500,100,50);
	}

}
