package javawrapperclass;
import java.util.ArrayList;
import java.util.Collections;
public class GradesTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(23);
		obj.add(56);
		obj.add(89);
		obj.add(54);
		obj.add(78);
		System.out.println(Collections.min(obj));
		System.out.println(Collections.max(obj));
		int sum=0;
		int avg=0;
		for(int i : obj) {
			sum+=i;
		}
		
		avg=sum/5;
		System.out.println(avg);
		
	}

}
