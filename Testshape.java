package java.oopsabstraction;
//import java.util.*;
//Abstract class Shape
abstract class Shape {
 // Abstract method area
 abstract double area();
}
//Subclass Circle
class Circle extends Shape {
 private double radius;
 // Constructor to initialize radius
 public Circle(double radius) {
     this.radius = radius;
 }
 // Implementing the area method
 @Override
 double area() {
     return Math.PI * radius * radius; 
 }
}
//Subclass Rectangle
class Rectangle extends Shape {
private double width;
private double height;
// Constructor to initialize width and height
public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
}
// Implementing the area method
@Override
double area() {
    return width * height; // Area of rectangle = width * height
}
}
//Main class to test the implementation
public class Testshape {
public static void main(String[] args) {
    Shape circle = new Circle(5.0);
    Shape rectangle = new Rectangle(4.0, 6.0);
    System.out.println("Area of Circle: " + circle.area());
    System.out.println("Area of Rectangle: " + rectangle.area());
}
}