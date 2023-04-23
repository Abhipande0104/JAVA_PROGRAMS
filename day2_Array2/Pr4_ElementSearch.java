/*
 * WAP to search specific element from an array and return its index.
 */

package day2_Array2;

import java.util.*;

public class Pr4_ElementSearch
{
	public static void main(String[] args)
	{	
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size ");
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter element to be searched");
		int num=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			if(arr[i]==num)
			{
				System.out.println("element found at index "+i);
			}
		}
	}
}
