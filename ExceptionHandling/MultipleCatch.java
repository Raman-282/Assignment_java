package ExceptionHandling;

public class MultipleCatch {
	 public static void main(String ar[]) {
		 
	        int array[] = { 1, 2, 3, 4 };
	 
	        try {
	 
	            System.out.println(array[6]);
	        }
	 
	        catch (ArithmeticException e) {
	 
	            System.out.println("Sorry technical ...check after sometime" + e);
	        }
	        
	        catch (ArrayIndexOutOfBoundsException e) {
	 
	            System.out.println("Sorry ..check after sometime" + e);
	        }
	 
	        catch (ClassCastException e) {
	 
	            System.out.println("Sorry technical issue...check after sometime" + e);
	        }
	 
	    
	 
	    }}


