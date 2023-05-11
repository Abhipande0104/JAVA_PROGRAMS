package dayy12_StringQuiz2;

public class Quiz2 
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}

//o/p = 16 0
//capacity of empty StringBuffer is 16 
// as there are no characters inside the StruingBuffer its length will be 0.
