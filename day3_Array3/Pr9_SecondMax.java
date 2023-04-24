/*
 * WAP to find the second maximum number from the array
 */

package day3_Array3;

import java.util.*;

public class Pr9_SecondMax 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		//inserting elements in the array
		System.out.println("Insert elements in the array");
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//finding first maximum number
		int max=arr[0];
		for(int i=0; i<size; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		//finding second maximum number
		int max2=arr[0];
		for(int i=0; i<size; i++)
		{
			if(arr[i]<max && arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		System.out.println("The second max element is "+max2);
	}
}
