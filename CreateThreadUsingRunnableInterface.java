package com.iostream;

class MyThread implements Runnable
{

	@Override
	public void run() 
	{
		
		System.out.println("thread class executed");
	}
	
}
public class CreateThreadUsingRunnableInterface
{
	public static void main(String[] args)
	{
		MyThread mt=new MyThread();
		Thread th=new Thread(mt);
		th.start();
	}

}
