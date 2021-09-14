package LinkedListPrograms;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateThroughElements {
	public static void main(String args[]) {
		LinkedList<String> l_List=new LinkedList<String>();
		l_List.add("Raman");
		l_List.add("Vivek");
		l_List.add("Abhinav");
		l_List.add("Sahil");
		//set Iterator at specified index
		Iterator<String> p=l_List.listIterator(1);
		while (p.hasNext()) {
			System.out.println(p.next());
		}
			
		}

}
