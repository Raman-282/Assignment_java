package HashSet;
import java.util.*;

public class HashSetClone {
	public static void main(String[] args) {  
        //Creating HashSet   
            HashSet<String> set = new HashSet<String>();  
            //Add elements into the Set  
            set.add("raman");  
            set.add("vivek");  
            set.add("Hindi100");  
            set.add("101");  
            set.add("Facebook");   
            //Print the elements  
            System.out.println("HashSet elements: " + set);  
            //Creating a new cloned set  
            HashSet<String> clonedSet = new HashSet<String>();  
            //Clone the HashSet  
            clonedSet = (HashSet)set.clone();  
            //Displaying the new Set after Cloning;  
            System.out.println("The new clone set elements: " + clonedSet);  
          }  
}  


