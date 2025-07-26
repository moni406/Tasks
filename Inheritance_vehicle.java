package JavaOopsTask;
class Vehicle{
	String brand;
	int speed;
	void showDetails() {
		System.out.println("Brand: "+brand+"speed: "+speed);
	}}
	class car extends Vehicle{
		int wheels=4;
	}
	class bike extends Vehicle{
		int wheels=2;
	}
	

public class Inheritance_vehicle {
public static void main(String[] args) {
	car c=new car();
	c.brand="toyota";
	c.speed=170;
	c.showDetails();
	bike b=new bike();
	b.brand="Honda";
	b.speed=120;
	b.showDetails();
}
}
