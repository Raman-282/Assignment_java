package Strings;

public class EndsWith {
public static void main(String args[]) {
		
		String s1="Keep learning new Things";
		System.out.println(s1.endsWith("Things"));
		
		System.out.println(s1.endsWith("new"));
		
		boolean isEndWith=s1.endsWith("learning new Things");
		System.out.println(isEndWith);
		
		//It will give error 
		try {
			
			System.out.println(s1.endsWith(null));
		}
		catch(NullPointerException e) {
			System.out.println("Some Error Ocuured "+e);
			
		}
		
		
	}

}


