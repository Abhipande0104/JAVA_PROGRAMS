/*
 * WAP to find Armstrong number from an array and return its index
 * Take size and elements from the user.
 * input:  10 25 252 36 153 55 89
 * output: Strong no 153 found at index: 4
 */

package day3_Array3;

import java.util.*;

public class Pr8_ArmstrongFind 
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
		
		//finding armstrong number
		for(int i=0; i<size; i++)
		{
			int temp1=arr[i];
			int temp2=arr[i];
			int sum=0;
			int count=0;
			
			while(temp1!=0)
			{
				temp1=temp1/10;
				count++;
			}
			while(temp2!=0)
			{
				int rem=temp2%10;
				int mul=1;
				for(int j=0; j<count; j++)
				{
					mul=mul*rem;
				}
				sum=sum+mul;
				temp2=temp2/10;
			}
			if(arr[i]==sum)
			{
				System.out.println("Armstrong no "+arr[i]+" found at index "+i);
			}
		}
	}
}
