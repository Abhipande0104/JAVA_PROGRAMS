package day0_Array;

import java.util.*;

public class Ex5_ArraySum 
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		
		//inserting
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//adding
		int sum=0;
		for(int i=0; i<5; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of the elements in the array is "+sum);
	}
}
