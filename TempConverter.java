package javawrapperclass;
import java.util.ArrayList;
public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] celsiusStrings= {"36","38","40"};
		ArrayList<Double> fahrenheitList=new ArrayList<Double>();
		
		//Integer i=Integer.parseInt();
		for(String celsius : celsiusStrings) {
			int celsiusString=Integer.parseInt(celsius);
			double fahrenheit=(celsiusString *9.0/5.0)+32;
			fahrenheitList.add(fahrenheit);
			System.out.println("celcius: "+celsiusString+" "+"fahrenheit: "+fahrenheit);
			
		}
	}

}
