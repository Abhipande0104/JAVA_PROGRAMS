package dayy14_StringQuiz4;

public class Quiz7 
{
	public static void main(String[] args)
	{
		StringBuilder strBuilder = new StringBuilder("String");
		StringBuffer strBuffer = new StringBuffer(strBuilder);
		
		String str = new String(strBuffer);
		System.out.println(str.replace('t', 'p'));
		System.out.println(str);
	}
}

//o/p = spring
//		string
