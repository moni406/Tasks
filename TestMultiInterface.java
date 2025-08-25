package java8.interfaces;
interface Printable{
	void print();
}
interface Scannable{
	void scan();
}
class MultiFunctionPrinter implements Printable, Scannable{
	public void print() {
		System.out.println("Printing document...");
	}
	public void scan() {
		System.out.println("Scanning document....");
	}
}
public class TestMultiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiFunctionPrinter mfp = new MultiFunctionPrinter();
		 mfp.print();
		 mfp.scan();
	}

}
