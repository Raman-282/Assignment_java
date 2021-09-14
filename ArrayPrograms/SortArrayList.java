package ArrayPrograms;
import java.util.*;

public class SortArrayList {
	public static void main(String args[]) {
		//Create a list and add some names
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Raman");
		list_Strings.add("Vivek");
		list_Strings.add("Sahil");
		list_Strings.add("Abhinav");
		System.out.println("List before sort:"+list_Strings);
		Collections.sort(list_Strings);
		System.out.println("List after sort:"+list_Strings);

}
}