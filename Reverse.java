package javaFundamentals;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=args[0];
		String reverse = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string is :"+ reverse);
	}

}
