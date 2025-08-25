package javaThreads;

class PrintDemo{
	public void printCount() {
		try {
		for(int i=0;i<1000;i++) {
			System.out.println("Counter: "+i);
		}}
		catch(Exception ex) {
			System.out.println("Thread Interrupted...");
		}
	}
}
class Task3 extends Thread{
	private Thread t;
	private String name;
	PrintDemo PD;
	Task3(String name,PrintDemo PD){
		this.name=name;
		this.PD=PD;
		
	}
	public void run() {
		PD.printCount();
		System.out.println("Thread:"+name+"Ending");
	}
	public void start() {
		System.out.println("starting:"+name);
		if(t==null) {
			t=new Thread(this,name);
			t.start();
		}
	}
	
}
public class Synchronization   {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDemo PD=new PrintDemo();
		Task3 t1= new Task3("Thread-1",PD);
		Task3 t2= new Task3("Thread-2",PD);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(Exception ex) {
			System.out.println("Interrupted...");
		}
	}
	}

