package Day2Lab;

import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Preincrement of a"+ ++a);
		System.out.println("Postincrement of a"+ a++);
		int leftshift=a<<2;
		System.out.println("leftshift"+ leftshift);
		int rightshift=a>>2;
		System.out.println("Rightshift"+ rightshift);
		boolean x=true;
		boolean y=false;
		if(x&&y)
		{
			System.out.println("logical and is true");
		}
		System.out.println("logical and is false");
		int Bitwise_And=a&b;
		System.out.println("Bitwise_and"+ Bitwise_And);
	}

}
