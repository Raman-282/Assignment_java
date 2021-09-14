package HashSet;
import java.util.*;

public class SetToArrayList {
	public static void main(String args[]) {
		//create a hash set
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("Raman");
		h_set.add("Vivek");
		h_set.add("Abhinav");
		h_set.add("Sahil");
		// Create a List from HashSet elements
	     List<String> list = new ArrayList<String>(h_set);
	 
	     // Display ArrayList elements
	     System.out.println("ArrayList contains: "+ list);
	  }
	}


