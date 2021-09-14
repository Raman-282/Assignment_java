package LinkedListPrograms;
import java.util.*;

public class EnterElementAtSpecificPosition {
	public static void main(String args[]) {
		LinkedList<String> l_List=new LinkedList<String>();
		l_List.add("Raman");
		l_List.add("Vivek");
		l_List.add("Abhinav");
		l_List.add("Sahil");
		System.out.println("Print original list:"+l_List);
		l_List.add(2,"Samar");
		System.out.println("The linked list:"+l_List);
	}

}
