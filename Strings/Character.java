package Strings;

public class Character {
public static void main(String args[]) {
		
		String string1="Life teach us everday a new chapter";
		//Loop
		int startIndex=0;
		int count=0;
		for(int i=0;i<string1.length();i++) {
			
			int index=string1.indexOf("e",startIndex);
			
			if(index>=0) {
				count=count+1;
				startIndex=index+1;
			}
		}
		System.out.println("Occurrence of 'e' in given is : "+count);		
	}

}


