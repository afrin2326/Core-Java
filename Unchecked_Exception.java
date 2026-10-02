package com.iostream;

import java.util.Scanner;

public class Unchecked_Exception 
{
	void m1() 
	{
		this.m2();
	}

	void m2()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no 1 :");
		int no1 = sc.nextInt();

		System.out.println("Enter no 2 :");
		int no2 = sc.nextInt();

		int result = no1 / no2;

		System.out.println("Result :" + result);
	}

	public static void main(String[] args) 
	{
		System.out.println("Application started");
		
		new Unchecked_Exception().m1();
		
		System.out.println("Application end");

	}

}
