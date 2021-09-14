package HashMap;
import java.util.*;

public class SpecifiedMap {
	public static void main(String args[]) {
		HashMap<Integer,String> hash_map1=new HashMap<Integer,String>();
		HashMap<Integer,String> hash_map2=new HashMap<Integer,String>();
		  hash_map1.put(1, "Bolero");
		  hash_map1.put(2, "Safari");
		  hash_map1.put(3, "Hexa");
		  System.out.println("\nValues in first map: " + hash_map1);
		  hash_map2.put(4, "Nexon");
		  hash_map2.put(5, "Gravitas");
		  System.out.println("\nValues in second map: " + hash_map2);
		// put all values in secondmap
		  hash_map2.putAll(hash_map1);
		  System.out.println("\nNow values in second map: " + hash_map2);
		 }
		}


