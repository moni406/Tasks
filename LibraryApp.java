package java8.interfaces;
//abstract class
abstract class Book{
	String title, author;
	Book(String t, String a) {
		 title = t;
		 author = a;
		 }
	abstract void displayInfo();
}
//Interface
interface Borrowable{
	default void returnPolicy() {
		System.out.println("Return within 14 days.");
	}
}
final class LibraryConfig{
	static final String LIBRARY_NAME="Central Library";
	static final String ADDRESS="Main Road";
}
class Novel extends Book implements Borrowable{
	Novel(String t, String a){
		super(t,a);
	}
	void displayInfo() {
		System.out.println("Title: "+title+",Author: "+author);
	}
}
public class LibraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Welcome");
		System.out.println("Welcome to " + LibraryConfig.LIBRARY_NAME);
		 Novel n = new Novel("The Alchemist", "Paulo Coelho");
		 n.displayInfo();
		 n.returnPolicy();
	}

}
