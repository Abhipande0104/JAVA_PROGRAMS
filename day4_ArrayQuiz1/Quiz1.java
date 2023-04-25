package day4_ArrayQuiz1;

public class Quiz1 
{
	public static void main(String[] args)
	{
		int[] var1 = new int[3];
		var1[1] = 1;
		var1[2] = 2; 
		var1[3] = 3;
		
		System.out.println(var1[1]+" "+var1[2]+" "+var1[3]);
	}
}

//compile time error

//ArrayIndexOutOfBoundException
//there are only 3 indices 0,1,2 not 3
