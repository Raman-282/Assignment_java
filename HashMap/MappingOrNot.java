package HashMap;
import java.util.*;

public class MappingOrNot {
	public static void main(String args[]) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		  hash_map.put(1, "Bolero");
		  hash_map.put(2, "Safari");
		  hash_map.put(3, "Hexa");
		  hash_map.put(4, "Nexon");
		  hash_map.put(5, "Gravitas");
		  // check if map is empty
		  boolean result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  // Removing all the elements from the linked map
		  hash_map.clear();
		  // check if map is empty
		  result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		 }
		}


