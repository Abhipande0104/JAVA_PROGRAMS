package dayy14_StringQuiz4;

public class Quiz5 
{
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder(200);
		str.append("Bytecode is platform independent");
		str.setLength(20);
		System.out.println(str);
	}
}

//o/p = Bytecode is platform
//strlength sets the content length in the object upto integer index
//given as parameter
