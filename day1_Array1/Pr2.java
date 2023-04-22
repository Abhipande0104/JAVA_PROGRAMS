/*
 * WAP to take size of array from user and also take integer elements from user.
 * Print product of even elements only.
 */

package day1_Array1;

import java.util.*;

public class Pr2
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int product=1;
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				product=product*arr[i];
			}
		}
		
		System.out.println("The product of even numbers in the list is "+product);
	}
}

