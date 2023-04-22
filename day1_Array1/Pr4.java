/*
 * WAP take 7 characters as input 
 * Print only vowels from the array
 */

package day1_Array1;

import java.util.*;

public class Pr4
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char arr[] = new char[7];
		System.out.println("Enter characters");
		for(int i=0; i<7; i++)
		{
			arr[i]=(char) sc.next().charAt(0);
		}
		
   		System.out.println("The vowels from elements are ");
		for(int i=0; i<7; i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
			{
				System.out.println(arr[i]);
			}
		}
	}
}

