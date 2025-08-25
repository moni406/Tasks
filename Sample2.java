package javawrapperclass;
import java.util.ArrayList;
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(56.9);
		a1.add(7.98);
		a1.add(78.99);
		double sum=0;
		for(double d: a1) {
			sum+=d;
		}
		double avg=sum/a1.size();
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);
		
	}

}
