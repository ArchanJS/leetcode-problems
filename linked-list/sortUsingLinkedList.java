import java.util.*;
public class Main{
public static void main(String args[]) {
    // create and initialize the LinkedList object
    LinkedList&lt;String&gt; l_list = new LinkedList&lt;&gt;();
    l_list.add("Jan");
    l_list.add("Feb");
    l_list.add("Mar");
    l_list.add("Apr");
    l_list.add("May");
    l_list.add("Jun");
    //print original unsorted linkedlist
    System.out.println("Original LinkedList (unsorted): " + l_list);
    // sort LinkedList with Collecitons.sort() method in natural order
    Collections.sort(l_list);
    System.out.println("\nLinkedList (sorted in natural order): " + l_list);
    // sort LinkedList using Collection.sort() and Comparator in Java
    Collections.sort(l_list, new Comparator&lt;String&gt;() {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    } } );
 
    System.out.println("LinkedList (sorted using Comparator): " + l_list);
    }
}
