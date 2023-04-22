/*
 * WAP to take 10 input from the user.
 * Print only elements that are divisible by 5.
 */

package day1_Array1;

import java.util.*;

public class Pr5 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Th numbers divisible by 5 are ");
		for(int i=0; i<size; i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
}

