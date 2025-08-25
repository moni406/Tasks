package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<Integer>();
		l.add(3);
		l.add(56);
		l.add(45);
		l.add(23);
		
			System.out.println(l);
		Collections.sort(l);
		System.out.println("Ascending Order: "+l);
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Descending order: "+l);
	}

}
