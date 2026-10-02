package com.iostream;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) 
	{
		Random rand=new Random();
		
		int randomNumber=rand.nextInt(90)+10;//10 to 100
		System.out.println("RandomNumber :"+randomNumber);
	}

}
