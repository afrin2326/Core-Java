package com.iostream;

public class EvenAndOdd 
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 20, 33, 40, 55 };

		int evenCount=0;
		int oddCount=0;
		

		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}

		}

		System.out.println(evenCount);
		System.out.println(oddCount);
		
	}


}
