package javaThreads;

	class Task extends Thread{
		private Thread t;
		private String tName;
		Task(String name)
	{
			tName=name;
			System.out.println("Creating "+ tName);
	}
		public void run() {
			System.out.println("Running "+tName);
			
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("Thread:" +tName +i);
				Thread.sleep(1000);
			}}
			catch(InterruptedException ex) {
				System.out.println("Thread" +tName +"Interrupted.");
			}
			System.out.println("Thread "+tName+ "exiting.");
		}}
	public class ThreadSample {


		public static void main(String[] args) {
			Task t1=new Task("Hello from Thread!");
			t1.start();
		
	}

}
