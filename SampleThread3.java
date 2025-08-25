package javaThreads;
public class SampleThread3 implements Runnable {
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	}
	try {
		Thread.sleep(1000);
	}
	catch(InterruptedException ex) {
		System.out.println(ex.getMessage());
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread3 obj=new SampleThread3();
		Thread thread=new Thread(obj);
		thread.start();
		try {
			thread.join();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
