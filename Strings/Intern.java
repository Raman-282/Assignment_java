package Strings;

public class Intern {
public static void main(String args[]) {
		
		String s=new String("Hello World");
		String s1=new String("Hello World");
		String s2="Hello World";
		String s3=s.intern();
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		
		
	}

}


