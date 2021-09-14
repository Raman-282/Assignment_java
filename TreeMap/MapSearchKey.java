package TreeMap;
import java.util.*;

public class MapSearchKey {
	   public static void main(String a[]){
	        TreeMap<String, String> tree_map= new TreeMap<String, String>();
	         
	        //add key-value pair to TreeMap
	        tree_map.put("c1", "a");
			   tree_map.put("c2", "e");
			   tree_map.put("c3", "i");
			   tree_map.put("c4", "o");
			   tree_map.put("c5", "u");
	        if(tree_map.containsKey("c1")){
	            System.out.println("The TreeMap contains key c1");
	        } else {
	            System.out.println("The TreeMap does not contains key c1");
	        }
	        if(tree_map.containsKey("c6")){
	            System.out.println("The TreeMap contains key c6");
	        } else {
	            System.out.println("The TreeMap does not contains key c6");
	        }
	    }
	}


