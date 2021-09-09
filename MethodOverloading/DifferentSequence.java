package MethodOverloading;

public class DifferentSequence {
	public void show(int num1,double num2) {
		System.out.println(+num1 +" and "+num2);
	}
	public void show(double num1,int num2) {
		System.out.println(+num1+" and "+num2);
	}
	public static void main(String args[]) {
		DifferentSequence differentSeqOfParameter=new DifferentSequence();
		differentSeqOfParameter.show(2,3.0);
		differentSeqOfParameter.show(5.0,4);
	}

}

