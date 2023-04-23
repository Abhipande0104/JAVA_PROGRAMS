/*
 * WAP to find Uncommon elements between two arrays
 */

// some changes need to be made

package day2_Array2;

import java.util.*;

public class Pr8_UncommonElements
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
		
		//Finding uncommon elements
		System.out.println("Uncommon elements are ");
		int flag=0;
		for(int i=0; i<size1; i++)
		{
			for(int j=0; j<size2; j++)
			{
				if(arr1[i]==arr2[j])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(arr1[i]+" ");
			}
			flag=0;
		}
		for(int i=0; i<size2; i++)
		{
			for(int j=0; j<size1; j++)
			{
				if(arr2[i]==arr1[j])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(arr2[i]+" ");
			}
			flag=0;
		}
	}
}

