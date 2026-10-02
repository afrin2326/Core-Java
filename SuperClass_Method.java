package com.iostream;

class Test1
{
	int no=10;
	
	void m2()
	{
		System.out.println("Test class m2 method");
	}
	
}


public class SuperClass_Method extends Test1
{
	void m1()
	{
		super.m2();
	}
	
	
	

	public static void main(String[] args)
	{
		SuperClass_Method s2=new SuperClass_Method();
		s2.m1();

	}

}
