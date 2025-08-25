package javacollections;

import java.util.ArrayList;

public class Task1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("Java");
		s.add("C");
		s.add("c++");
		s.add("Ruby");
		s.add("Python");
		for(String i : s) {
			System.out.println(i);
		}
		s.remove(1);
		System.out.println(s);
	}

}
