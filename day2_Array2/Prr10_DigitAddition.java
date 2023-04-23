/*
 * WAP to print the elements whose addition of digits is even. 
 */

package day2_Array2;

public class Prr10_DigitAddition 
{
	public static void main(String[] args)
	{
		int arr[]= new int[] {1,2,3,5,15,14,16,28,17,29,123};
		
		System.out.println("The elements whose addition of digit is even is ");
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			int temp=arr[i];
			while(arr[i]!=0)
			{
				int rem;
				rem=arr[i]%10;
				sum=sum+rem;
				arr[i]=arr[i]/10;
			}
			if(sum%2==0)
			{
				System.out.println(temp+" ");
			}
		}
	}
}
