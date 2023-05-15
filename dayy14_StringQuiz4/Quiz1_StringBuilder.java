package dayy14_StringQuiz4;

public class Quiz1_StringBuilder 
{
	public static void main(String[] args)
	{
		StringBuilder sbvar1 = new StringBuilder("Hey");
		StringBuilder sbvar2 = new StringBuilder("Hey");
		
		if(sbvar1.equals(sbvar2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}

//o/p= not equal
//2 new objects are created hence its address will be different
//hence not same
