package JavaOopsTask;
import java.util.*;
abstract class shape{
	abstract double area();
}
class Circle extends shape{
	double radius;
	Circle(double r){
		radius=r;
	}
	double area() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends shape{
	double length, width;
	Rectangle(double l,double w){
		length=l;
		width=w;
	}
		double area()
		{
			return length*width;
		}
}
public class Abstract_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new Circle(5);
		shape s2=new Rectangle(4,6);
		System.out.println("Area of circle is : "+s1.area());
		System.out.println("area of rectangle: "+s2.area());
	}

}
