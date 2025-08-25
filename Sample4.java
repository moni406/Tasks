package javawrapperclass;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=100;
		Integer i1=new Integer(100);//explicitly creating a new object
		boolean b=(i==i1);
		boolean b1=i.equals(i1);
		System.out.println(b);
		System.out.println(b1);
	}

}
