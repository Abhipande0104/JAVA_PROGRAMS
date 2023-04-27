package day7_ArrayQuiz4;

public class Quiz6 
{
	public static void main(String[] args)
	{
		int arr[] = {1, 3, 6, 2, 8};
		System.out.println(arr[0]);
		System.out.println(arr[-1]);
	}
}

//o/p =1
//ArrayIndexOutOfBoundException
//the index is checked ata the run time, so no compile time error
