package com.iostream;

class Test2
{
	Test2()
	{
		System.out.println("Parent Class Test2 constructor");
	}
}

public class SuperClass_Constructor extends Test2
{
	SuperClass_Constructor()
	{
		super();
	}
	

	public static void main(String[] args) 
	{
		SuperClass_Constructor s2=new SuperClass_Constructor();

	}

}
