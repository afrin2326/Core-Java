package com.iostream;

//sequence maintain
public class MethodOverloading_2 
{
	void show(int no1,String name)
	{
		
		System.out.println("Show method one");
	}
	
	void show(String name,int no1)
	{
		
		System.out.println("show methos two");
	}

	public static void main(String[] args) 
	
	{
		MethodOverloading_2  n=new MethodOverloading_2();
		n.show(0, null);
		
	}

}
