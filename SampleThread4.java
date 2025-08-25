package javaThreads;

public class SampleThread4 extends Thread{
	
	public void run() {
		try {
			Thread.sleep(300);
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		//System.out.println("Thread Execution done: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread4 tobj1=new SampleThread4();
		//SampleThread4 tobj2=new SampleThread4();
		System.out.println("Before start: "+tobj1.isAlive());
		tobj1.start();
		System.out.println("After Start: "+tobj1.isAlive());
		try {
			tobj1.join();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("After join: "+tobj1.isAlive());
	}

}

	
