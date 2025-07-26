package JavaOopsTask;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	String add(String a, String b) {
		return a+b;
	}
}
public class MethodOverloading_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator O=new Calculator();
		System.out.println("addition is: "+O.add(2, 6));
		System.out.println("addition is: "+O.add(2.6, 6));
		System.out.println("addition is: "+O.add("hello", "rita"));
	}

}
