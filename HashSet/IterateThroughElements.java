package HashSet;
import java.util.Hashtable;
import java.util.Set;

public class IterateThroughElements {
	public static void main(String args[]) {
		// Creating Hashtable object in where key is of
        // Integer type
        // and value is of String type
        Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
     // Putting key-value pairs to HashTable object
        // custom entries
        ht.put(1, "Java");
        ht.put(2, "Scala");
        ht.put(3, "Python");
        ht.put(4, "Pearl");
        ht.put(5, "R");
 
        // Getting keySets of Hashtable and
        // storing it into Set
        Set<Integer> setOfKeys = ht.keySet();
 
        // Iterating through the Hahstable
        // object using for-Each loop
        for (Integer key : setOfKeys) {
            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                               + "\t\t Name : "
                               + ht.get(key));
        }
    }
}
	
