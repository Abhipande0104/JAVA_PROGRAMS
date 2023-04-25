package day5_ArrayQuiz2;

public class Quiz8 
{
	public static void main(String[] args)
	{
		float[] arrFloat = new float[5];
		for(int i=0; i<10; i++)
			arrFloat[i]= i+i;
		System.out.println(arrFloat[3]);
	}
}

//run time error
//ArrayIndexOutOfBound

//size is 5 loop is inserting elements