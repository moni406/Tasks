package Day2Lab;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, n=2;
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		while(count<10) {
			boolean p=true;
		
		for(int i=2;i<=n/2;i++)
			if(n%i==0) {
				p= false;
				break;
			}
			if(p) {
				System.out.println(n);
				count++;
			}
			n++;	
		}
	}
	}


