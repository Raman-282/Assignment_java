package Strings;

public class ToCharArray {
	public static void main(String args[]) {
		
		String s="Java Code";
		char charArray[]=s.toCharArray();
		
		//Printing the char array element
		for(int i=0;i<charArray.length;i++) {
			
			System.out.println("The character is : "+charArray[i]);
		}
	}

}
