package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7_1 {
	public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        // Print the original list
        System.out.println("Original list: " + list);
        // Reverse the ArrayList
        Collections.reverse(list);
        // Print the reversed list
        System.out.println("Reversed list: " + list);
    }
}
