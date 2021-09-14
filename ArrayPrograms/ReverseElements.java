package ArrayPrograms;
import java.util.*;

public class ReverseElements {
	public static void main(String args[]) {
		List<String> list_Strings=new ArrayList<String>();
		list_Strings.add("Raman");
		list_Strings.add("Vivek");
		list_Strings.add("Abhinav");	
	    list_Strings.add("Sahil");
	    System.out.println("list before reversing:"+list_Strings);
	    Collections.reverse(list_Strings);
	    System.out.println("list after reversing:"+list_Strings);
	}

}
