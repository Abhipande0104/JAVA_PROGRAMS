package day5_ArrayQuiz2;

public class Quiz5_ForEachLoop 
{
	public static void main(String[] args)
	{
		int arrInt[];				//declaration
		
		arrInt = new int[4];        //definition
		
		arrInt[2]=420;				//initialization
		
		for(int itr: arrInt)
		{
			System.out.println(itr);
		}
	}
}

//0 0 420 0
// when the array is declared all the elements are initialized to 0
