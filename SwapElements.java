package com.iostream;
import java.util.Scanner;

public class SwapElements 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++)
		{
			arr[i] = scanner.nextInt();
		}

		System.out.print("Enter the first position to swap (0-based index): ");
		int pos1 = scanner.nextInt();

		System.out.print("Enter the second position to swap (0-based index): ");
		int pos2 = scanner.nextInt();

		if (pos1 < 0 || pos1 >= size || pos2 < 0 || pos2 >= size)
		{
			System.out.println("Invalid positions! Please enter indices within the array range.");
		} 
		else
		{

			int temp = arr[pos1];
			arr[pos1] = arr[pos2];
			arr[pos2] = temp;

			System.out.println("Array after swapping:");
			for (int num : arr) {
				System.out.print(num + " ");
			}
		}

		scanner.close();
	}
}
