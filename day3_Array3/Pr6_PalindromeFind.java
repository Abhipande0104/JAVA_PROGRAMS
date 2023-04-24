/*
 * WAP to find palindrome number from an array and return its index
 * Take size and elements from user
 * input:  10 25 252 36 564
 * output: Palindrome no 252 found at index: 2
 */

package day3_Array3;

import java.util.*;

public class Pr6_PalindromeFind
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		int size= sc.nextInt();
		
		//insert elements in the array
		int arr[] = new int[size];
		System.out.println("Enter elements in the array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("End of insertion");
		
		//finding palindrome number from the array
		for(int i=0; i<size; i++)
		{
			int rem;
			int temp=arr[i];
			int rev=0;
			while(arr[i]!=0)
			{
				rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]=arr[i]/10;
			}
			if(rev==temp)
			{
				System.out.println("Palindrome number "+temp+" found at index "+i);
			}	
		}
	}
}

/*
 * palindrome
 * strong
 * armstong
 * 2nd max
 * 2nd min
 */
