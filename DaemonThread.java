package com.iostream;

class MyThread2 extends Thread
{

	@Override
	public void run() 
	{
		
		System.out.println("thread class executed");
	}
	
}
public class DaemonThread
{
	public static void main(String[] args)
	{
		MyThread2 mt=new MyThread2();	
		
		// Daemon thread is a process by which one thread is executed in the background of another thread
		mt.setDaemon(true);
		mt.start();
		
		System.out.println(mt.isDaemon());
	}

}
