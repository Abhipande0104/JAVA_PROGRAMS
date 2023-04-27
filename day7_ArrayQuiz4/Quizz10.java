package day7_ArrayQuiz4;

public class Quizz10
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		System.out.println(arr.length);
		arr.length = 40;
		System.out.println(arr.length);
	}
}

//error: can not assign a value to final variable length 
