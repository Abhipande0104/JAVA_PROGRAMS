package dayy14_StringQuiz4;

public class Quizz10 
{
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("Builder");
		str.insert(5, new String("0"));
		str.reverse();
		System.out.println(str.reverse());
	}
}

//o/p= Build0r
//reversing two times result is same string.