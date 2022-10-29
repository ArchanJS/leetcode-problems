import java.util.*;  
public class Main{  
 public static void main(String args[]){  
    //create a LinkedList object
    LinkedList&lt;String&gt; l_list=new LinkedList&lt;String&gt;();  
    l_list.add("Pune");  
    l_list.add("Mumbai");  
    l_list.add("Nagpur");  
    System.out.println("Linked List : " + l_list);
    System.out.println("Linked List in reverse order:");
    //use descendingIterator method to get a reverse iterator
    Iterator iter=l_list.descendingIterator();  
    //traverse the list using iterator and print the elements.
    while(iter.hasNext())  
    {  
        System.out.print(iter.next() + " ");  
    }  
 }  
}  
