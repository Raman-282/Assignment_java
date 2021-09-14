package HashMap;
import java.util.*;

public class ShallowCopy {
	public static void main(String args[]) {
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		  hash_map.put(1, "Bolero");
		  hash_map.put(2, "Safari");
		  hash_map.put(3, "Hexa");
		  hash_map.put(4, "Nexon");
		  hash_map.put(5, "Gravitas");
		   // print the map
		   System.out.println("The Original map: " + hash_map);
		   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		   new_hash_map = (HashMap)hash_map.clone();     
		   System.out.println("Cloned map: " + new_hash_map);        
		     }
		}
	

