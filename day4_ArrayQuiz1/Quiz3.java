package day4_ArrayQuiz1;

public class Quiz3 
{
	public static void main(String[] args)
	{
		int[] var1 = new int[];
		var1[0] = 0;
		var1[1] = 1;
		
		System.out.println(var1[0]+" "+var1[1]+" "+var1.length);
	}
}

//compile time error
//array dimension missing
//during creation array needs dimension or initialization, both are missing
