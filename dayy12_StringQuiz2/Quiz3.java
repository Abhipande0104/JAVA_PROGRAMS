package dayy12_StringQuiz2;

public class Quiz3 
{
	public static void main(String[] args)
	{
		String s1 = new String("core2web");
		String s2 = new String("core2web");
		
		if(System.identityHashCode(s1).equals(System.identityHashCode(s2)))
			System.out.println("true");
		else
			System.out.println("false");
	}
}

// o/p= compile time error
// int can not be dereferenced
