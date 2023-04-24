/*
 * WAP to find strong number from an array and return its index
 * Take size and elements from the user.
 * input:  10 25 252 36 564 145
 * output: Strong no 145 found at index: 5
 */

package day3_Array3;

import java.util.*;

public class Pr7_StrongFind 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		//inserting elements in the array
		int arr[] = new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//finding strong number
		for(int i=0; i<size; i++)
		{
			int sum=0;
			int temp= arr[i];
			int rem;
			while(arr[i]!=0)
			{
				rem=arr[i]%10;
				int fact=1;
				for(int j=1; j<=rem; j++)
				{
					fact=fact*j;
				}
				arr[i]=arr[i]/10;
				sum=sum+fact;
			}
			if(sum==temp)
			{
				System.out.println("Perfect number "+temp+ " found at index "+i );
			}
		}
	}
}
