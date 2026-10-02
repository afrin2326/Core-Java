package com.iostream;

public class MissingValue {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,5,6,7};
		
		int sum=0;
		
		//actual sum of given array
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		//expected  sum
		
		int n=arr.length+1;
		int expected_sum=n*(n+1)/2;
		
		System.out.println("Missing Number is :"+(expected_sum-sum));
		
		

	}

}
