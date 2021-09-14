package TreeMap;
import java.util.*;

public class SpecifiedValue {
	 public static void main(String args[]){  
		   // Create a tree map
		   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		   tree_map.put(1, "a");
		   tree_map.put(2, "e");
		   tree_map.put(3, "i");
		   tree_map.put(4, "o");
		   tree_map.put(5, "u");
		   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
		 }  
		}


