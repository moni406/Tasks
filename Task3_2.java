package javacollections;

import java.util.HashMap;

public class Task3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);
	}

}
