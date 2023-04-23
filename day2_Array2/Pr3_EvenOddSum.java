/*
 * WAP to find the sum of seperate sum of even and odd numbers in an array
 */

package day2_Array2;

public class Pr3_EvenOddSum 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {11,12,13,14,15};
		
		int evenSum=0;
		int oddSum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenSum=evenSum+arr[i];
			}
			else
			{
				oddSum=oddSum+arr[i];
			}
		}
		
		System.out.println("Odd number sum: "+oddSum);
		System.out.println("Even number sum: "+evenSum);
	}
}
