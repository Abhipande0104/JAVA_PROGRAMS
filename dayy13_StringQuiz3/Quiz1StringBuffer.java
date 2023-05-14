package dayy13_StringQuiz3;

public class Quiz1StringBuffer 
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer();
		str.ensureCapacity(10);
		
		System.out.println(str.capacity());
	}
}

// o/p= 16
//ensureCapacity method checks the capacity is less than the given integer parameter
//If yes then change the capacity otherwise same.
