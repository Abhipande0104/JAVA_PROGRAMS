package dayy13_StringQuiz3;

public class Quiz3 
{
	public static void main(String[] args)
	{
		String str = new StringBuffer("JamesGosling");
		
		System.out.println(str.replace('J', 'G'));
	}
}

//o/p = compile time error
//String and StringBuffer are incompatible
