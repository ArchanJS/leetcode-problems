
import java.util.Iterator;
import java.util.LinkedList;

public class ItrTraversal {

	public static void main(String[] args) {
		//create Linked List
		LinkedList<String> tihList = new LinkedList<String>();
		//Add elements to LinkedList
		tihList.add("Java");
		tihList.add("Jquery");
		tihList.add("Spring");
		tihList.add("Hibernate");
		tihList.add("EJB");

		//creating iterator to traverse over javaRadarList
		Iterator<String> listIterator = tihList.iterator();

		System.out.println("Traversal in forward direction");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
	}

}
