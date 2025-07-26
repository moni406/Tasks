package javaarrays;

import java.util.Scanner;

public class ArrayStats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter integer :"+ (i+1));
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int min=arr[0];
		int max=arr[0];
		for(int i : arr)
		{
			sum+=i;
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		double avg=sum/10.0;
		System.out.println("average is: "+avg);
		System.out.println("min is: "+min);
		System.out.println("max: "+max);
		//Scanner.close();
	}

}
