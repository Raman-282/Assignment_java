package Strings;

public class Equal {
	public static void main(String args[]) {
		
		//equals() method example
		String s1="Raman";
		String s2="Raman";
		String s3="raman";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//equalsIgnoreCase() method demo it will return true in both cases because it does not check case sensitivity.
				System.out.println(s1.equalsIgnoreCase(s2)); 
				System.out.println(s1.equalsIgnoreCase(s3));
				
			}


}


