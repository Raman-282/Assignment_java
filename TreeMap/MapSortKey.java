package TreeMap;
import java.util.*;
import java.util.Map.Entry;

public class MapSortKey {
	public static void main(String args[]){  
		 TreeMap<String, String> tree_map= new TreeMap<String, String>();
         
	        //add value pair to TreeMap
	        tree_map.put("c1", "a");
			   tree_map.put("c2", "e");
			   tree_map.put("c3", "i");
			   tree_map.put("c4", "o");
			   tree_map.put("c5", "u");
		  
		   System.out.println(tree_map); 
    }
}
 class sort_key implements Comparator<String>{
     @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     
}


