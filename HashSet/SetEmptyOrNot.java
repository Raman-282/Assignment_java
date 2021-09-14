package HashSet;
import java.util.*;

public class SetEmptyOrNot {
	public static void main(String args[]) {
	//create a hash set
			HashSet<String> h_set = new HashSet<String>();
			h_set.add("Raman");
			h_set.add("Vivek");
			h_set.add("Abhinav");
			h_set.add("Sahil");
			   System.out.println("Original Hash Set: " + h_set);
			    System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
			    System.out.println("Remove all the elements from a Hash Set: ");
			    h_set.removeAll(h_set);
			    System.out.println("Hash Set after removing all the elements "+h_set);   
			   }
			}


