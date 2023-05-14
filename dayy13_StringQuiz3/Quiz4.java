package dayy13_StringQuiz3;

public class Quiz4 
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer(400);
		str.append(400);
		
		str.setLength(str.length());
		System.out.println(str.capacity());
	}
}

//o/p = 400
//StringBuffer object can be initialized using integer parameter which defines capacity
//append() method StringBuffer is used for length
//Hence change in length will not affect the capacity and it will remain same 
