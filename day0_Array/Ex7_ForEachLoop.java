package day0_Array;

public class Ex7_ForEachLoop 
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40};
		
		//normal loop
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		//ForEach loop
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}
