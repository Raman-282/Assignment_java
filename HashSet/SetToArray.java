package HashSet;
import java.util.*;
public class SetToArray {
	public static void main(String args[]) {
		//create a hash set
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Raman");
		h_set.add("Vivek");
		h_set.add("Abhinav");
		h_set.add("Sahil");
		//creating an array
		 String[] new_array = new String[h_set.size()];
	      h_set.toArray(new_array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	      for(String element : new_array){
	        System.out.println(element);
	     }
	   }
	

}
