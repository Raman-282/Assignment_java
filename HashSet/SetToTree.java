package HashSet;
import java.util.*;

public class SetToTree {
	public static void main(String args[]) {
		//create a hash set
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Raman");
		h_set.add("Vivek");
		h_set.add("Abhinav");
		h_set.add("Sahil");
		// Creat a TreeSet of HashSet elements
	     Set<String> tree_set = new TreeSet<String>(h_set);
	 
	     // Display TreeSet elements
	     System.out.println("TreeSet elements: ");
	     for(String element : tree_set){
	        System.out.println(element);
	     }
	  }
	}

