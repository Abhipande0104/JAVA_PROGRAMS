/*
 * WAP to reverse each element in an array
 * input:  10 25 252 36 564
 * output: 01 52 252 36 465 
 */

package day3_Array3;

import java.util.*;

public class Pr2_ReverseElements
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int size= sc.nextInt();
		
		//inserting elements in the array
		int arr[]= new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//displaying original array
		System.out.println("The original array is ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		//reversing elements in the array
		System.out.println("The reverse array is ");
		for(int i=0; i<size; i++)
		{
			while(arr[i]!=0)
			{
				int rem;
				rem=arr[i]%10;
				System.out.print(rem);
				arr[i]=arr[i]/10;
			}
			System.out.print(" ");
		}
	}
}
