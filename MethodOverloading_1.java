package com.iostream;

//no of parameter maintain
public class MethodOverloading_1 
{
	void add(int no1,int no2)
	{
		int result=no1+no2;
		System.out.println("Result :"+result);
	}
	
	void add(int no1,int no2,int no3)
	{
		int result=no1+no2+no3;
		System.out.println("Result :"+result);
	}

	public static void main(String[] args) 
	
	{
		MethodOverloading_1  n=new MethodOverloading_1();
		n.add(9,7,4);
	}

}
