package javawrapperclass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentScoreBoardApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Integer>> students=new HashMap<>();
		students.put("krishna", Arrays.asList(99,90,95));
		students.put("Radha",Arrays.asList(97,98,99));
		students.put("Balram",Arrays.asList(98,92,97));
		String topStudent="";
		double highestAvg=0;
		for(String name : students.keySet()) {
			List<Integer> marks=students.get(name);
			int sum=0;
			for(int mark: marks) sum+=mark;
			double avg=sum/(double) marks.size();
			System.out.println(name+ "Average: "+avg);
			if(avg>highestAvg) {
				highestAvg=avg;
				topStudent=name;
			}
		}
		System.out.println("Top Scorer: "+topStudent+"with Avg: "+highestAvg);
	}

}
