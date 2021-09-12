package Strings;

public class ValueOf {
public static void main(String args[]) {
		
		char char1='C';
		char char2='0';
		char char3='R';
		char char4='E';
		
		String s=String.valueOf(char1);
		s=s+String.valueOf(char2);
		s=s+String.valueOf(char3);
		s=s+String.valueOf(char4);
		System.out.println("The string is : "+s);
	}

}


