package com.iostream;

public class TwoSumPair {

	public static void main(String[] args) 
	{
		int[] arr= {1,3,5,7,9,10,12};
		int target=12;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("2 sum pair found at "+ i+" and "+j+" index position");
				}
			}
		}
		

	}

}
