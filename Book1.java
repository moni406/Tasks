package JavaOopsTask;
class Book{
	String title;
	String author;
	int price;
	Book(String title, String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails() {
		System.out.println(title+ " "+author+" "+price);
	}
}
public class Book1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj=new Book("Pride and prejudice","Jane Austen", 1500);
		obj.displayDetails();
	}

}
