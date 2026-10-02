package com.iostream;

public class GetThreadName {

	public static void main(String[] args)
	{
		System.out.println("thread name 1 :"+Thread.currentThread().getName());
		
		Thread.currentThread().setName("hello");
		
		System.out.println("thread name 2 :"+Thread.currentThread().getName());

	}

}
