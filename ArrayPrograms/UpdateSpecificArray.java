package ArrayPrograms;
import java.util.*;

public class UpdateSpecificArray {
	public static void main(String args[]) {
		//Create a list and add some names
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Raman");
		list_Strings.add("Vivek");
		list_Strings.add("Sahil");
		list_Strings.add("Abhinav");
		//Print the list
		System.out.println(list_Strings);
		//Update the third element with "Samar"
		list_Strings.set(2, "Samar");
		System.out.println(list_Strings);
		
	}

}
