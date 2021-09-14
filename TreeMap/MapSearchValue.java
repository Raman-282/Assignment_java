package TreeMap;
import java.util.*;

public class MapSearchValue {
	  public static void main(String a[]){
	        TreeMap<String, String> tree_map= new TreeMap<String, String>();
	         
	        //add value pair to TreeMap
	        tree_map.put("c1", "a");
			   tree_map.put("c2", "e");
			   tree_map.put("c3", "i");
			   tree_map.put("c4", "o");
			   tree_map.put("c5", "u");
	        if(tree_map.containsKey("c1")){
	            System.out.println("The TreeMap contains value a");
	        } else {
	            System.out.println("The TreeMap does not contains value a");
	        }
	        if(tree_map.containsValue("f")){
	            System.out.println("The TreeMap contains value f");
	        } else {
	            System.out.println("The TreeMap does not contains value f");
	        }
	    }
	}



