package ExceptionHandling;

public class ArrayIndexOutOfBound {
	public static void main(String ar[]) {
		 
        int array[] = { 1, 2, 3 };
 
        try {
 
            System.out.println(array[5]);
        }
 
        catch (ArrayIndexOutOfBoundsException e) {
 
            System.out.println("Sorry technical issue...check after sometime" + e);
        }
 
    }

}
