package HashMap;
import java.util.*;

public class RemoveMapping {
	public static void main(String args[]) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		  hash_map.put(1, "Bolero");
		  hash_map.put(2, "Safari");
		  hash_map.put(3, "Hexa");
		  hash_map.put(4, "Nexon");
		  hash_map.put(5, "Gravitas");
		  // print the map
		  System.out.println("The Original linked map: " + hash_map);
		  // Removing all the elements from the linked map
		  hash_map.clear();
		  System.out.println("The new map:"+hash_map);

}
}
