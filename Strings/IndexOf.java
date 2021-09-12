package Strings;

public class IndexOf {
		
		public static void main(String args[]) {
			
			String s="Start Working For Urself";
			//int indexOf(int ch) demo
			int index=s.indexOf('o');// It returns the first occurrence of the specified character index
			System.out.println("Index of character 'o' is : "+index);
			
			int index1=s.indexOf("o");// It returns the index position for the given substring
			System.out.println("Index of substring 'o' is : "+index1);
			
			int index2=s.indexOf("o",5);// It returns the index position for the given substring and from index
			System.out.println("Index of substring 'o' is : "+index2);
			
			int index3=s.indexOf('o',5);// It returns the index position for the given char and from index
			System.out.println("Index of substring 'o' is : "+index3);
				
			
		}

	}


