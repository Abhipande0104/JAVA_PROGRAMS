/*
 * WAP to find the number of even and odd integers in a given array of integers. 
 */

package day2_Array2;

public class Pr2_EvenOdd 
{
	public static void main(String[] args)
	{
		int arr[]= new int[] {1,2,5,4,6,7,8};
		int evenCount=0;
		int oddCount=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Number of Even Elements: "+evenCount);
		System.out.println("Number of Odd Elements: "+oddCount);
	}
}
