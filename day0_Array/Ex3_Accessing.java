//accessing elements from the array

package day0_Array;

public class Ex3_Accessing 
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		
		//1st method
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//2nd method
		System.out.println("Using for loop");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
