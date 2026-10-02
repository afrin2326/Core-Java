package com.iostream;
import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		int first=sc.nextInt();
		
		System.out.print("Enter second number:");
		int second=sc.nextInt();
		
		System.out.print("Enter symbol (+,-,*,/:)");
		String symbol=sc.next();
		
		int result;
		
		switch(symbol)
		{
		case"+":result=first+second;
		System.out.println("Addition is :"+result);
		break;
		
		case"-":result=first-second;
		System.out.println("Subtraction is :"+result);
		break;
		
		case"*":result=first*second;
		System.out.println("Multiplication is :"+result);
		break;
		
		case"/":result=first/second;
		System.out.println("Division is :"+result);
		break;
		
		default:System.out.println("Invalid symbol");
		
		}
		
		
		

	}

}
