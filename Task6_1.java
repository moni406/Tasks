package javacollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6_1 {
	    public static void main(String[] args) {
	        // Create a list of strings
	        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "Jill", "Charlie");
	        // Use Stream API to filter names starting with "J"
	        List<String> filteredNames = names.stream()
	                .filter(name -> name.startsWith("J"))
	                .collect(Collectors.toList());
	        // Print the filtered names
	        System.out.println("Names starting with 'J': " + filteredNames);
	    }
}
