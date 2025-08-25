package javacollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6_2 {
	public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Use Stream API to square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number) // Square each number
                .collect(Collectors.toList());   // Collect the results into a new list
        // Print the squared numbers
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
