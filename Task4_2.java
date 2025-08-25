package javacollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        // Create a ListIterator
        ListIterator<String> listIterator = list.listIterator();
        // Traverse the list forward
        System.out.println("Traversing forward:");
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }
        // Traverse the list backward
        System.out.println("\nTraversing backward:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }
	}

}
