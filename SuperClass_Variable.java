package com.iostream;

class Test
{
	int no=10;
	
}

public class SuperClass_Variable extends Test
{
	int no=89;
	
	void m1(int no)
	{
		System.out.println("No :"+no);
		System.out.println("No :"+this.no);
		System.out.println("No :"+super.no);
	}

	public static void main(String[] args) 
	{
		SuperClass_Variable s1=new SuperClass_Variable();
		s1.m1(100);

	}

}
