package ArrayPrograms;
import java.util.ArrayList;
import java.util.List;

public class RetrieveAnElement {
public static void main(String args[])throws Exception {
	//Create a list and add some names
	List<String> aList=new ArrayList<String>();
	aList.add("Raman");
	aList.add("Vivek");
	aList.add("Sahil");
	aList.add("Abhinav");
	//Retrieve the element at index 2
	System.out.println("The element at index 2 in the ArrayList is:"+ aList.get(2));
}
}
