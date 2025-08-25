package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task7_2 {
	public static void main(String[] args) {
        // Create a list of strings
        List<String> languages = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Java", "C++", "Java", "JavaScript", "Python"
        ));
        // Count how many times "Java" appears in the list
        int frequency = Collections.frequency(languages, "Java");
        // Print the frequency
        System.out.println("\"Java\" appears " + frequency + " times in the list.");
    }
}
