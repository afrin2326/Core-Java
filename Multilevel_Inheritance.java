package com.iostream;

class A2
{
	void mA()
	{
		System.out.println("mA class in A2");
		System.out.println("----------------");
	}
}

class B2 extends A2
{
	void mB()
	{
		System.out.println("mB class in A2");
		
	}
	
}


class C2 extends B2
{
	void mC()
	{
		System.out.println("mB class in A2");
		
	}
	
}

public class Multilevel_Inheritance 
{

	public static void main(String[] args)
	{
		A2 a=new A2();
		a.mA();
		
		
		B2 b=new B2();
		b.mA();
		b.mB();
		
		
		C2 c=new C2();
		c.mA();
		c.mB();
		c.mC();

	}

}
