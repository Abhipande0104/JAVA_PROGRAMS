/*
 * WAP to create an array of n integer elements.
 * where n value should be taken from user.Insert the values from users
 * Find the sum of all elements in the array
 */

package day2_Array2;

import java.util.*;

public class Pr1_Sum 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements");
		for(int i=0; i<n; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<n; i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("The sum of all elements in the array is "+sum);
	}
}
