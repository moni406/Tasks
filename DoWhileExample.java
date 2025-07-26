package Day2Lab;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;//sc.nextInt();
		do {
			System.out.println("Enter positive number ");
		   n=sc.nextInt();
		}
		while(n!=-1);
	}

}
