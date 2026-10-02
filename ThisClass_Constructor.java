package com.iostream;

public class ThisClass_Constructor
{
	ThisClass_Constructor()
	{
		//new ThisClass_Constructor(50);
		this(50);
		//this(90); this keyword should be the first statement of constructor call
		
		System.out.println("no argument constructor");
	}
	
	ThisClass_Constructor(int no)
	{
		System.out.println("parameterized constructor");
		
		//this();  this keyword should be the first statement of constructor call
	}
	
	public static void main(String[] args) 
	{
		new ThisClass_Constructor();
	}

}
