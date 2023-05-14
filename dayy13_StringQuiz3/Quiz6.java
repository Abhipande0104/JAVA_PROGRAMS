package dayy13_StringQuiz3;

public class Quiz6 
{
	public static void main(String [] args)
	{
		StringBuffer sbvar1= new StringBuffer ("core2web");
		long lvar1 = System.identityHashCode(sbvar1);
		sbvar1.append( "technologies");
		long lvar2 = System.identityHashCode(sbvar1);
		if(lvar1==lvar2)
			System.out.println("True");
		else
			System.out.println("False");
	}
}

//o/p = true
// StringBuffer is murtable that is we do thne chang in the string in the same object
// itself. Hence if the same object is changed the identityHashCode will remain same.