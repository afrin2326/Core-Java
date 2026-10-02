package com.iostream;

public class StaticKeyword_Method 
{
	int no1=10;
	static int no2=20;
	
	void m1()
	{
		System.out.println("m1 method call");
		System.out.println("No 1 : "+no1);
		System.out.println("No 2 : "+no2);
	}
	
	static void m2()
	{
		System.out.println("m2 method call");
		//System.out.println("No 1 : "+no1); // we cannot use instance variable inside static method
		System.out.println("No 2 : "+no2);
	}

	public static void main(String[] args) 
	{
		StaticKeyword_Method s=new StaticKeyword_Method();
		s.m1();
		//s.m2();
		StaticKeyword_Method.m2();
				

	}

}
