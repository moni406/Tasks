package javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class Task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(34);
		ts.add(23);
		ts.add(21);
		ts.add(12);
		ts.add(78);
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
