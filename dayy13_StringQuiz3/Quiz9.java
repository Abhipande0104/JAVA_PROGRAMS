package dayy13_StringQuiz3;

public class Quiz9 
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer(400);
		str.append("Java_Developement_Kit");
		
		str.trimToSize();
		str.setLength(10);
		
		System.out.println(str.capacity());
		System.out.println(str.length());
	}
}

//op= 21 10
//trimToSize method trims the capacity of the StringBuffer upto the length of the String
//stored in it.
//change in length gives no change in capacity
