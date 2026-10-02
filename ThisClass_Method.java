package com.iostream;

public class ThisClass_Method 
{
	void m1()
	{
		System.out.println("m1 method is calling ");
		 m2();// compiler internally converted it into this.m2()
	}
	
	void m2()
	{
		System.out.println("m2 method is calling ");
	}

	public static void main(String[] args) 
	{
		ThisClass_Method t2=new ThisClass_Method ();
		t2.m1();

	}

}
