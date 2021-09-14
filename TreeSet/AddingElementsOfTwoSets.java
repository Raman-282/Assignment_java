package TreeSet;
import java.util.TreeSet;

public class AddingElementsOfTwoSets {
	public static void main(String args[]) {
	TreeSet<String> tree_set1=new TreeSet<String>();
	tree_set1.add("Red");
	tree_set1.add("Blue");
	tree_set1.add("Green");
	System.out.println("Tree_set1:"+tree_set1);
	TreeSet<String> tree_set2=new TreeSet<String>();
	
	tree_set2.add("Pink");
	tree_set2.add("White");
	tree_set2.add("Black");
	System.out.println("Tree_set2:"+tree_set2);
	//Adding both the tress
	tree_set1.addAll(tree_set2);
	System.out.println("Tree_set1:"+tree_set1);

}
}
