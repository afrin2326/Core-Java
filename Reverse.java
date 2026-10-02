package com.iostream;

public class Reverse {

	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		
		int start=0,end=arr.length-1;
		
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		for(int no:arr)
		{
			System.out.print(no+" ");
		}

	}

}
