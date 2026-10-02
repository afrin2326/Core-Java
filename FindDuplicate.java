package com.iostream;

public class FindDuplicate
{
	//remove duplicate elements from a sorted array

	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,5,5,5,6,7,7};
		
		for(int i=0;i<arr.length;i++)
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				if(i==1||arr[i]!= arr[i-2])
				{
					System.out.println(arr[i]+" ");
				}
						
			}
			
		}

	}

}
