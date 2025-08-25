package javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Aryan");
		a.add("Radha");
		a.add("Krishna");
		a.add("Arjun");
		System.out.println("original array" +a);
		Iterator<String> itr=a.iterator();
		while(itr.hasNext()) {
			String ele=itr.next();
			if(ele.startsWith("A"))
				itr.remove();
		}
		
		System.out.println("List after removal"+ a);
	}

}
