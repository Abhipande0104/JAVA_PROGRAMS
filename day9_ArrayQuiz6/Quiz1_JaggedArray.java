package day9_ArrayQuiz6;

public class Quiz1_JaggedArray
{
	public static void main(String[] args)
	{
		int[][][][] arr = new int [][][][] { { {{14,21},{16,98}} , {{11,12} , {34,21}} },
											 { {{36,69},{31,22}} , {{11,22} , {33,44}}}};
											 
		System.out.println(arr[0][1][0][1]);
	}
}

//o/p= 12
// arr is 4d array and the element present at [0][1][0][1]