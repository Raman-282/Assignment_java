package ExceptionHandling;

public class  Exception {
	public static void main(String ar[]) {

	      int a = 9;
	      int b = 0;

	      try {

	          int c = a / b;
	          //System.out.println(c);
	         
	      }

	      catch (ArithmeticException e) {

	          System.out.println("Sorry technical issue...check after sometime" + e);
	      }

	  }
}
