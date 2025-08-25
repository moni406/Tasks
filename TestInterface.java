package java.oopsabstraction;

interface RemoteControl {
	 void turnOn();
	 default void batteryStatus() {
	 System.out.println("Battery is 80%");
	 }
	}
	class TV implements RemoteControl {
	 public void turnOn() {
	 System.out.println("TV is turned on.");
	 }
	}

public class TestInterface {
	public static void main(String[] args) {
		 TV tv = new TV();
		 tv.turnOn();
		 tv.batteryStatus();
		 }
}
