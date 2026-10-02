package com.iostream;

public class ThisClass_Argument 
{
	void m1()
	{
		System.out.println("m1 method:");
		
		//m2(new ThisClass_Argument() );
		m2(this);
	}
	
	void m2(ThisClass_Argument t1)
	{
		System.out.println("m2 method :  "+t1);
	}

	public static void main(String[] args) 
	{
		ThisClass_Argument t1=new ThisClass_Argument();
		t1.m1();

	}

}
