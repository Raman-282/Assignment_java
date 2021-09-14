package ArrayPrograms;
import java.util.*;

public class ElementAtFirstPostion {
	public static void main(String args[]) {
		//Create a list and add some names
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Raman");
		list_Strings.add("Vivek");
		list_Strings.add("Sahil");
		list_Strings.add("Abhinav");
		//Print the list
		System.out.println(list_Strings);
		//Now ADD a new name on first position
		list_Strings.add(0,"Samar");
		System.out.println(list_Strings);
		
	}

}
