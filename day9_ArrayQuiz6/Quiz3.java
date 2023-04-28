package day9_ArrayQuiz6;

public class Quiz3 
{
	public static void main(String[] args)
	{
		long arr1[] = {1,2,3};
		long arr2[] = {4,5};
		
		long[][] arrLong = new long[2][];
		
		arrLong[0] = arr1;
		arrLong[1] = arr2;
		
		System.out.println(arrLong[0][1]);
	}
}

//o/p= 2
//arrLong[0] has reference of arr[1] and the element present at[0][1] in arr1 is 2.
