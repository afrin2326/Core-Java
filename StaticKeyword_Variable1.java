package com.iostream;

public class StaticKeyword_Variable1
{
	int no1=10;
	static int no2=20;

	public static void main(String[] args)
	{
		StaticKeyword_Variable1 obj=new StaticKeyword_Variable1();
		
		System.out.println(obj.no1);
		//System.out.println(obj.no2);
		System.out.println(StaticKeyword_Variable1.no2);


	}

}
