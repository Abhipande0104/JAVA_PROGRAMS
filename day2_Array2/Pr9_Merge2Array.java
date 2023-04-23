/*
 * WAP to merge two given array.
 */

package day2_Array2;

public class Pr9_Merge2Array 
{
	public static void main(String[] args)
	{
		int array1[] = new int[] {10,20,30,40,50};
		int array2[] = new int[] {9,18,27,36,45};
		int array3[] = new int[10];
		
		//merging two arrays
		for(int i=0,j=0; i<5; i++,j++)
		{
			array3[i]=array1[j];
		}
		for(int i=5,j=0; i<10; i++,j++)
		{
			array3[i]=array2[j];
		}
	
		//displaying the mered array
		for(int i=0; i<10; i++)
		{
			System.out.println(array3[i]+" ");
		}
	
	}
}
