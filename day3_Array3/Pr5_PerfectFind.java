/*
 * WAP to find a perfect number from the array and return its index
 * input: 10 25 252 496 564
 * output: Perfect number 496 found at index: 3 
 */

package day3_Array3;

import java.util.*;

public class Pr5_PerfectFind
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		
		//inserting elements in the array
		int arr[]= new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//find perfect number in the array
		for(int i=0; i<size; i++)
		{
			int sum=0;
			for(int j=1; j<arr[i]; j++)
			{
				if(arr[i]%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==arr[i])
			{
				System.out.println("Perfect number "+arr[i]+" found at index "+i);
			}
		}
	}
}


