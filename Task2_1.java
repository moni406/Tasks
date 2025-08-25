package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Radha");
		hs.add("Radha");
		hs.add("Raman");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
