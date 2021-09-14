package LinkedListPrograms;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateInReverseOrder {
	public static void main(String args[]) {
		LinkedList<String> linkedlist=new LinkedList<String>();

        // adding elements of to the linkedlist
		linkedlist.add("Raman");
		linkedlist.add("Vivek");
		linkedlist.add("Abhinav");
		linkedlist.add("Sahil");
		ListIterator<String> listIterator=linkedlist.listIterator(linkedlist.size());
		 // Traversing the linked list
        // hasPrevious() function to check if previous
        // element is present or not previous() function to
        // get the previous element and after getting
        // previous elements it move the cursor to the next
        // previous element
		  while (listIterator.hasPrevious())
	        {
	            System.out.println(listIterator.previous());
	        }
	    }
		
	}


