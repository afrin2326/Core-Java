package com.iostream;

class MyThread1 extends Thread
{

	@Override
	public void run() 
	{
		
		System.out.println("thread class executed");
	}
	
}
public class CreateThreadUsingThreadClass
{
	public static void main(String[] args)
	{
		MyThread1 mt=new MyThread1();		
		mt.start();
	}

}
