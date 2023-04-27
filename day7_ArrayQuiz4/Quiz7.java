package day7_ArrayQuiz4;

public class Quiz7 
{
	public static void main(String[] args)
	{
		int arr = new int[5];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i*i;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}

//compile time error
//for declaring array '[]' has to be given on both sides of =
