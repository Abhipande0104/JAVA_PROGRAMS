/*
 * WAP to find common elements between two arrays
 */

package day2_Array2;

import java.util.*;

public class Pr7_CommonElements
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array ");
		int size1=sc.nextInt();
		System.out.println("Enter size of 2nd array ");
		int size2=sc.nextInt();
		
		//Inserting elements in the array
		int arr1[] = new int[size1]; 
		System.out.println("Enter elements in 1st array");
		for(int i=0; i<size1; i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int arr2[] = new int[size2];
		System.out.println("Enter elements in 2nd array");
		for(int i=0; i<size2; i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		//Displaying elements of the array
		System.out.println("Elements in 1st array is ");
		for(int i=0; i<size1; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Elements in 2nd array is ");
		for(int i=0; i<size2; i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println(" ");
		
		//Finding common elements
		System.out.println("Common elements are ");
		for(int i=0; i<size1; i++)
		{
			for(int j=0; j<size2; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" ");
				}
			}
		}
	}
}

