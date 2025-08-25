package javaThreads;

public class SampleThread2 implements Runnable{
		public void run() {
			//System.out.println("Thread: "+Thread.currentThread().getName()+", "+" State: Running");
			for(int i=1;i<=10;i++) {
				System.out.println("Thread: "+ i);
			}
			//System.out.println("Thread: "+Thread.currentThread().getName()+","+"State: Dead");
		}
	

		public static void main(String[] args) throws InterruptedException{
			// TODO Auto-generated method stub
			
			SampleThread2 counter=new SampleThread2();
			Thread thread=new Thread(counter);
			thread.start();
			
		}

	}