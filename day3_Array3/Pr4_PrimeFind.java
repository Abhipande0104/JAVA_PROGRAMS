/*
 * WAP to find prime number from an array and return its index
 * input:  10 25 36 566 34 53 50 100
 * output: prime no 53 found at index: 5
 */

package day3_Array3;

import java.util.*;

public class Pr4_PrimeFind
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size ");
		int size= sc.nextInt();
		
		//inserting elements in the array
		int arr[] = new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//finding of prime number
		for(int i=0; i<size; i++)
		{
			int count=0;
			for(int j=1; j<=arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("The prime number "+arr[i]+" found at index "+i);
			}
		}
	}
}
