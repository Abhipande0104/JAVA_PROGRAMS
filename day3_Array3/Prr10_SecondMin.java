/*
 * WAP to print second minimun number fro the array
 */

package day3_Array3;

import java.util.*;

public class Prr10_SecondMin 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		//inserting elements in the array
		System.out.println("Enter elements in the array");
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//finding first minimum element
		int min=arr[0];
		for(int i=0; i<size; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		//finding second minimum element
		int min2=arr[size-1]; //condition check
		for(int i=0; i<size; i++)
		{
			if(arr[i]>min && arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		System.out.println("The second minimum element in the array is "+min2);
	}
}
