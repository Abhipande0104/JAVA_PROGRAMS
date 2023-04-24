/*
 * WAP to print count of digits in elements
 * input: enter array: 2 255 2 1554
 * output: 1 3 1 4  
 */

package day3_Array3;

import java.util.*;

public class Pr1_DigitCount
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		//insertion of elements in array
		int arr[] = new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//counting digits of elements in the array.
		System.out.println("The digits in elements are ");
		for(int i=0; i<size; i++)
		{
			int digit=0;
			while(arr[i]!=0)
			{
				arr[i]=arr[i]/10;
				digit++;
			}
			System.out.print(digit+" ");
		}
	}
}
