package dayy13_StringQuiz3;

public class Quiz5 
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer(new String(new char[] {'D', 'B'}));
		
		str.append("MySql");
		System.out.println(str);
	}
}

//o/p = DBMySql
// StringBuffer object can also be made by using temporary object of character array.
//(new char[]{}),
//In above StringBuffer will contain DB and it will be appended with MySql
