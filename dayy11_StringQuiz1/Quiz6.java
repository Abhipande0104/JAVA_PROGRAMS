package dayy11_StringQuiz1;

public class Quiz6 
{
	public static void main(String[] args)
	{
		String svar1 = "This is a string";
		String svar2 = "a string";
		String svar3 = "This is " + svar2;
		if(System.identityHashCode(svar1)==System.identityHashCode(svar3))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not equal");
		}
	}
}

//o/p= not equal
//operations on string creates new object
