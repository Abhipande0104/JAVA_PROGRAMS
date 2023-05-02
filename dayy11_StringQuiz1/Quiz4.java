package dayy11_StringQuiz1;

public class Quiz4 
{
	public static void main(String[] args)
	{
		String svar1= "This is string";
		String svar2= "This is string";
		if(System.identityHashCode(svar1)==System.identityHashCode(svar2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}

//o/p= equal
//both strings have same identity hashcode since marked to same object on SCP