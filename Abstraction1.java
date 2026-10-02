package com.iostream;
abstract class One
{
	public void m1()
	{
		System.out.println();
	}
	
	abstract  void m2();
	
}

class OneImpl extends One
{
	void m2()
	{
		System.out.println("method in One Implemented");
	}
	
}
public class Abstraction1 
{

	public static void main(String[] args) 
	{
		OneImpl one=new OneImpl();
		one.m2();

	}

}
