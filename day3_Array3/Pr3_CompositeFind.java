/*
 * WAP to find composite number from an array and return its index
 * input:  1 2 3 5 6 7 
 * output: composite 6 found at index: 4
 */

package day3_Array3;

import java.util.*;

public class Pr3_CompositeFind
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
		
		//displyaing of array
		System.out.println("The array is");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		//finding of composite number
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
			if(count>2)
			{
				System.out.println("The composite number "+arr[i]+" found at index "+i);
			}
		}
	}
}
