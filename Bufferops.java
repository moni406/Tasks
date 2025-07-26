package javaFundamentals;

public class Bufferops {
	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("Learning Java");
		 sb.append(" is fun");
		 sb.insert(8, "Core ");
		 sb.delete(0, 8);
		 System.out.println(sb);
		 }
}
