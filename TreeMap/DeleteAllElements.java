package TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class DeleteAllElements {
	public static void main(String args[]){  
		   // Create a tree map
		   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		   tree_map.put(1, "a");
		   tree_map.put(2, "e");
		   tree_map.put(3, "i");
		   tree_map.put(4, "o");
		   tree_map.put(5, "u");
		   System.out.println("Orginal TreeMap content: "+tree_map);
		   tree_map.clear();
		   System.out.println("The New map: "+tree_map);
		  }
		 }


