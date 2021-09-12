package Strings;

public class ConcatMethod {
public static void main(String args[]) {
		
		String string1="Class";
		
		//Here it is not getting changed means it is returning the value
		string1.concat("Room");
		
		string1=string1.concat(" Room");
		
		System.out.println(string1);
		
		//Second method
		// Also, observe that a string literal can also invoke the concat() method  
        String string2="Student";
		string2="Teacher ".concat(string2);
		
		System.out.println(string2);
	}

}

