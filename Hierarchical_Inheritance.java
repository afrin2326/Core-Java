package com.iostream;

class A3
{
	void mA3()
	{
		System.out.println("A3 class in mA3 method");
		
	}
}

class B3 extends A3
{
	void mB3()
	{
		System.out.println("B3 class in mB3 method");
		
	}
}

class C3 extends A3
{
	void mC3()
	{
		System.out.println("C3 class in mC3 method");
		
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args)
	{
		A3 a=new A3();
		a.mA3();
		
		
	    B3 b=new B3();
	    b.mA3();
	    b.mB3();
	    
	    
		C3 c=new C3();
		c.mA3();
		c.mC3();
		

	}

}
