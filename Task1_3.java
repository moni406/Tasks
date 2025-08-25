package javacollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> hs=new ArrayList<>();
		hs.add("Java");
		hs.add("C");
		hs.add("Java");
		hs.add("Python");
		Set<String> unique=new HashSet<>(hs);
		List<String> uhs=new ArrayList<>(unique);
		System.out.println(uhs);
	}

}
