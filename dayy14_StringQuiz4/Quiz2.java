package dayy14_StringQuiz4;

public class Quiz2 
{
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder();
		str.append("Java_Virtual_Machine");
		str.setCharAt(str.charAt(14), 'z');
		System.out.println(str);
	}
}

//o/p = run time error
// setCharAt()method has parameters as int, char
//hence error


