package ExceptionHandling;

public class Throws {
	  static void validate(int age) throws ArithmeticException {
		  
	        if (age < 18) {
	            throw new ArithmeticException(" not valid");
	        }
	 
	    }
	 
	    public static void main(String ar[]) {
	 
	        try {
	            validate(12);  //caller
	            System.out.println("  not handled");
	        } catch (ArithmeticException e) {
	 
	            System.out.println("  handled  here");
	        }
	    }
	 
}
