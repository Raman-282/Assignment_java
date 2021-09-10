package ExceptionHandling;

public class NestedCatch {
	 public static void main(String ar[]) {
		 
	        int a = 9;
	        int b = 0;
	 
	        int array[] = { 1, 2, 3, 4 };
	 
	        try {// outer try
	 
	            try { // inner try
	 
	                int c = a / b;
	                
	            }
	 
	            catch (ArithmeticException e) { // inner catch block
	 
	                System.out.println("Sorry technical issue..check after sometime" + e);
	            }
	 
	            try {  //inner
	 
	                System.out.println(array[6]);
	            }
	 
	            catch (ArrayIndexOutOfBoundsException e) { //inner catch
	 
	                System.out.println("Sorry technical issue..check after sometime" + e);
	            }
	 
	        }
	 
	        catch (ArithmeticException e) {  //outer catch
	 
	            System.out.println("Sorry technical issue..check after sometime" + e);
	        }
	 
	    }

}
