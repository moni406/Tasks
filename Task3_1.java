package javacollections;

import java.util.HashMap;
import java.util.Map;

public class Task3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(12,"radha");
		hm.put(108,"lalitha");
		hm.put(129,"vishaka");
		for(Map.Entry<Integer, String> e: hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
