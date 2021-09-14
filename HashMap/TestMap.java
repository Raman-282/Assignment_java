package HashMap;
import java.util.*;

public class TestMap {
	public static void main(String args[]) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		  hash_map.put(1, "Bolero");
		  hash_map.put(2, "Safari");
		  hash_map.put(3, "Hexa");
		  hash_map.put(4, "Nexon");
		  hash_map.put(5, "Gravitas");
		// print the map
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is value \'Safari\' exists?");
		  if (hash_map.containsValue("Safari")) {
		   //value exists
		   System.out.println("Yes! ");
		  } else {
		   //value does not exists
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is value \'Scorpio\' exists?");
		  if (hash_map.containsValue("Scorpio")) {
		   System.out.println("yes! - " );
		  } else {
		   System.out.println("No!");
		  }
		 }
		
	
		}
	


