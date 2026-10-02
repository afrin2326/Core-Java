package com.iostream;

class MyThread3 extends Thread
{

	@Override
	public void run() 
	{
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println("thread class executed");
	}
	
}
public class ThreadPriority
{
	public static void main(String[] args)
	{
		System.out.println("main thread executed");
		System.out.println(Thread.currentThread().getPriority());
		
		MyThread3 mt=new MyThread3();	
		mt.start();
		
		
	}

}
