package javaThreads;

public class ThreadPriorityDemo extends Thread {
public void run(){
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
	
	}
public static void main(String[] args) {
	ThreadPriorityDemo thread1=new ThreadPriorityDemo();
	ThreadPriorityDemo thread2=new ThreadPriorityDemo();
	ThreadPriorityDemo thread3=new ThreadPriorityDemo();
	thread1.setPriority(Thread.MIN_PRIORITY);
	thread2.setPriority(Thread.NORM_PRIORITY);
	thread3.setPriority(Thread.MAX_PRIORITY);
	System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
    System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
    System.out.println(thread3.getName() + " priority: " + thread3.getPriority());
    // Start the threads
    thread1.start();
    thread2.start();
    thread3.start();
}
}
