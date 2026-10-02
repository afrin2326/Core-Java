package com.iostream;

class A1
{
	void m1()
	{
		System.out.println("m1 method in class A");
	}
}

class B1 extends A1
{
	void m2()
	{
		System.out.println("m2 method in class B");
	}
	
}
public class Single_Inheritance 
{
	

	public static void main(String[] args)
	{
		A1 a=new A1();
		a.m1();
		
		B1 b=new B1();
		b.m2();
		b.m1();

	}

}

