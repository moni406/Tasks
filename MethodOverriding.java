package JavaOopsTask;
class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat meows");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Dog();
a.sound();
Animal a1=new Cat();
a1.sound();

	}

}
