package com.iostream;
public class ThisClass_Variable 
{
	
	int no1=10;
	int no2 =20;
	
	void m1(int no)
	{
		System.out.println("No Two = "+this.no2);
		System.out.println("No One = "+no);
	}

	public static void main(String[] args) 
	{
		
		ThisClass_Variable t1=new ThisClass_Variable();
		//System.out.println("No = "+t1.no);
	
		
		t1.m1(70);
		

	}

}
