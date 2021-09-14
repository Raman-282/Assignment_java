package TreeMap;
import java.util.*;

public class CopyContent {
	public static void main(String args[]){  
		   // Create a tree map
		   TreeMap<String,String> tree_map=new TreeMap<String,String>();      
		  // Put elements to the map 
		   tree_map.put("c1", "a");
		   tree_map.put("c2", "e");
		   tree_map.put("c3", "i");
		   tree_map.put("c4", "o");
		   tree_map.put("c5", "u");
		   System.out.println("Tree Map : "+tree_map);
		   TreeMap<String,String> tree_map1 = new TreeMap<String,String>();
		   tree_map1.put("A1", "Orange");
		   tree_map1.put("A2", "Pink");
		   System.out.println("Tree Map 1: "+tree_map1);
		   tree_map.putAll(tree_map1);
		   System.out.println("After coping map1 to map: "+tree_map);   
		 }  
		}


