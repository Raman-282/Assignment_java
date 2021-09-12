package Strings;

public class ReplaceAndReplaceAll {
public static void main(String args[]) {
		
		//Use of replace() method
		String s1="Amazon is a userfriendly shopping app";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of a to e  
		
		//before replacement
		System.out.println(s1);
		
		//After replacement
		System.out.println(replaceString);
		
		//Use of replaceAll() method
		String s2="Amazon is a userfriendly shopping app";  
		String replaceAllString=s2.replace("\s","");//replaces all occurrences of a to e  
		
		//before replacement
		System.out.println(s2);
		
		//After replacement
		System.out.println(replaceAllString);
		
		
	}

}
