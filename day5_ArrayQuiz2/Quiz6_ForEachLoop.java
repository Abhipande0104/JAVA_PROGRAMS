package day5_ArrayQuiz2;

public class Quiz6_ForEachLoop
{
	public static void main(String[] args)
	{
		int arr[5] = {1,2,3,4,5};
		
		for(int var: arr)
		{
			System.out.println(var);
		}
	}
}

//compilation error
//while instantiating arrays in java the size should not be mentioned
