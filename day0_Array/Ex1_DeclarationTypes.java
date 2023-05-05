//Ways of declaring an Array

package day0_Array;

public class Ex1_DeclarationTypes 
{
	public static void main(String[] args)
	{
		int arr1[] = new int[4];
		arr1[0] = 10;
		arr1[1] = 10;
		arr1[2] = 10;
		arr1[3] = 10;
		
		int arr2[] = new int[] {20,20,20,20};
		
		int arr3[] = {30,30,30,30};
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
	}
}
