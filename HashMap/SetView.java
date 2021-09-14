package HashMap;
import java.util.*;

public class SetView {
	public static void main(String args[]) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		  hash_map.put(1, "Bolero");
		  hash_map.put(2, "Safari");
		  hash_map.put(3, "Hexa");
		  hash_map.put(4, "Nexon");
		  hash_map.put(5, "Gravitas");
		// create set view for the map
		  Set set = hash_map.entrySet();
		  // check set values
		  System.out.println("Set values: " + set);
		 }
		}


