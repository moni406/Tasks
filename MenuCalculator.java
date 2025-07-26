package Day2Lab;
import java.util.Scanner;
public class MenuCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menu driven calculator
		 Scanner sc = new Scanner(System.in);
		 int a=10, b=2;
	        System.out.println("1.Add\n 2.Sub\n 3.Mul\n 4.Div ");
	        int choice=sc.nextInt();
	        switch (choice) {
	        case 1: 
	        	System.out.println(a + b);
	        	break;
	        case 2:
	        	System.out.println(a - b);
	        	break;
	        case 3: 
	        	System.out.println(a * b);
	        	break;
	        case 4:
	        	System.out.println(a / b);
	        	break;
	        default:
	        	System.out.println("Invalid choice");
	        }
	}
		

}
