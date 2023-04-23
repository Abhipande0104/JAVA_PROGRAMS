/*
 * WAP to take size of an array from user also take integers element from the user.
 * Find the minimum element from the array.
 */

package day2_Array2;

import java.util.*;

public class Pr5_MinElement 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		for(int i=0; i<size; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println("Min element is "+min);
	}
}
