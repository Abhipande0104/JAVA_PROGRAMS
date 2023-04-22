/*
 * WAP to take size of array from user and also take integer elements from user.
 * Print product of odd index only. 
 */

package day1_Array1;

import java.util.*;

public class Pr3 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int product=1;
		for(int i=0; i<size; i++)
		{
			if(i%2==1)
			{
				product=product*arr[i];
			}
		}
		
		System.out.println("The product is "+ product);
	}
}
