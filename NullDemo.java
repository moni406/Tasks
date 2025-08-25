package javawrapperclass;

public class NullDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double salary=null;
		try {
			double net=salary+1000;
			System.out.println("net salary: "+net);
		}catch(NullPointerException e) {
			System.out.println("salary is null");
			salary=0.0;
			double net=salary+1000;
			System.out.println("Net salary :"+net);
		}
	}

}
