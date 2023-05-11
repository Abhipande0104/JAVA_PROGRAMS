package dayy12_StringQuiz2;

public class Quiz6 
{
	public static void main(String[] args)
	{
		String svar1 = "Core2Web";
		String svar2 = " technologies";
		
		if(svar1 == svar1.concat(svar2))
			System.out.println("Hey");
		else if(svar2 == svar1.concat(svar2))
			System.out.println("Hi");
		else
			System.out.println("Bye");
	}
}

//o/p = Bye
