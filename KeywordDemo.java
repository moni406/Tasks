package javaFundamentals;

public class KeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x=10;
		int y=8;
		boolean isJava= true;
		char grade='A';
		double score= 67.9;
		float value= 34;
		for(int i=0;i<3;i++)
		{
			if(x>y) {
				System.out.println("x is large");
			}
			
		}
		String msg="Learning Java";
		switch(msg) {
			case "Learning Java":
				System.out.println("keep going");
				break;
				default:
					System.out.println("Enter Valid input");
					break;
	}
}
}
