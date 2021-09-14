package TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class KeyValueMapping {
	  public static void main(String args[]) {
		  // Create a tree map
		   TreeMap<Integer,String> tree_map1=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		   tree_map1.put(1, "a");
		   tree_map1.put(2, "e");
		   tree_map1.put(3, "i");
		   tree_map1.put(4, "o");
		   tree_map1.put(5, "u");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Checking the entry for 10: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Value is: " + tree_map1.floorEntry(70));
		 }
		}


