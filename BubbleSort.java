package com.iostream;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int[] arr= {4,7,0,2,5,1,8,10};
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			boolean status=true;
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					status=false;
				}
				
			}
			if(status==true)
			{
				break;
			}
		}
		
		for(int no:arr)
		{
			System.out.print(no+",");
		}

	}

}
