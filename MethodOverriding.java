package com.iostream;

class Some
{
	public void display()
	{
		System.out.println("show method in some class");
	}
}

class Other extends Some
{
	public void display()
	{
		System.out.println("show method in other class");
	}
	
}

public class MethodOverriding 
{

	public static void main(String[] args)
	{
		Some s=new Other();
		s.display();

	}

}
