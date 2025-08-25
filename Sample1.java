package javawrapperclass;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Integer iobj=Integer.valueOf(i);
		double d=12.45;
		Double dobj=Double.valueOf(d);
		char ch='q';
		Character cobj=Character.valueOf(ch);
		System.out.println("Printing objects:");
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		Integer obj=20;
		int i1=obj.intValue();
		Double dobj1=23.87;
		double d1=dobj1.doubleValue();
		Character c='e';
		char c1=c.charValue();
		System.out.println("Printing data types:");
		System.out.println(i1);
		System.out.println(d1);
		System.out.println(c1);
	}

}
