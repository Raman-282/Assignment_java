package PriorityQueue;
import java.util.PriorityQueue;
public class Queue {
	public static void main(String args[]) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Violet");
		queue.add("Yellow");
		queue.add("Green");
		System.out.println("Elements of PriorityQueue:"+queue);
		
	}

}
