package javacollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class Task3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 20);
        hashMap.put("Charlie", 35);
        System.out.println("Unsorted HashMap: " + hashMap);
        // Convert HashMap to TreeMap (sorts by natural key order)
        TreeMap<String, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.putAll(hashMap);
        System.out.println("Sorted TreeMap (by key in descending order): " + treeMap);
    
	}

}
