package dayy13_StringQuiz3;

public class Quiz7 
{
	public static void main(String[] args)
	{
		StringBuffer sbvar1 = "Core2Web";
		System.out.println(sbvar1.intern());
	}
}

//o/p = compile time error (incompatible types)
//StringBuffer can not be directly initialized by passing String value.

