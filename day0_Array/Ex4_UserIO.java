package day0_Array;

import java.util.*;

public class Ex4_UserIO 
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		
		//inserting
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		
		//displaying
		System.out.println("Displayong the array");
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
