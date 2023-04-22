/*
 * WAP to take size of array from user and also take integer elements from user
 * Print sum of all odd elements only.
 */

package day1_Array1;

import java.util.*;

public class Pr1 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==1)
			{
				sum=sum+arr[i];
			}
		}
		
		System.out.println("The sum of odd numbers in the list is "+sum);
	}
}
