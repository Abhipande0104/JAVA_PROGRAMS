package day5_ArrayQuiz2;

public class Quiz4_ForEachLoop 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		double arr[]= {12d, 13d, 14d, 15d};
		for(double var: arr)
		{
			System.out.print(arr.length);
		}
	}
}

//4 4 4 4 
//the for each loop is iterated 4 times and each time 'arr.length' is displayed