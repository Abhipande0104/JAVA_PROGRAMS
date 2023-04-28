package day8_ArrayQuiz5;

public class Quiz9 
{
	public static void main(String[] args)
	{
		int arrInt[][];
		arrInt = new int[2][2];
		arrInt[0] = {0,0};
		arrInt[1] = {1,1};
		
		System.out.println(arrInt[1][1]);
	}
}

//compile time error
//invalid way to initialize the array