package dayy14_StringQuiz4;

public class Quiz4 
{
	public static void main(String[] args)
	{
		StringBuilder str1 = new StringBuilder("StringBuilder");
		StringBuffer str2 = new StringBuffer(str1.substring(6));
		System.out.println(str2);
	}
}

//o/p = Builder
//substring() method returns from start of parameter to the end of string.
