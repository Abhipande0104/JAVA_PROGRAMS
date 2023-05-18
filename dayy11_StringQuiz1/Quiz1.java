package dayy11_StringQuiz1;

public class Quiz1 
{
	public static void main(String[] args)
	{
		int[] arr = {97, 98, 99, 100};
		String str = new String(arr);
		System.out.println(str);
	}
}

//compile toime error as undefined
//The constructor String(int[]) is undefined
//String does not have a constructor having integer array as parameter.
