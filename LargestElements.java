package com.iostream;

public class LargestElements {

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,90,50};
		int largest=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			
		}
		System.out.println(largest);

	}

}
