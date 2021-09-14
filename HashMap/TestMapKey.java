package HashMap;
import java.util.*;

public class TestMapKey {
	public static void main(String args[]) {
		HashMap<String,Integer> hash_map=new HashMap<String,Integer>();
		  hash_map.put("Bolero", 1);
		  hash_map.put("Safari", 2);
		  hash_map.put("Hexa", 3);
		  hash_map.put("Nexon", 4);
		  hash_map.put("Gravitas", 5);
		// print the map
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is key \'Safari\' exists?");
		  if (hash_map.containsKey("Safari")) {
		   //key exists
		   System.out.println("Yes! ");
		  } else {
		   //key does not exists
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is key \'Scorpio\' exists?");
		  if (hash_map.containsKey("Scorpio")) {
		   System.out.println("yes! - " );
		  } else {
		   System.out.println("No!");
		  }
		 }
		
	
		}


