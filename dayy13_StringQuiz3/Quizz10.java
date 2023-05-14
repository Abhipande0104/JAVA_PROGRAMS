package dayy13_StringQuiz3;

public class Quizz10 
{
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
	{
		String svar = "Core2Web";
		StringBuffer sbvar = new StringBuffer("Core2Web");
		
		if(svar.equals(sbvar))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
	}
}

//op = not equal
//both are of different classes, hebce both are different objects
//hence hashcode will be different and hence they are not same.
