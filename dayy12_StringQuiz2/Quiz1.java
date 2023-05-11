package dayy12_StringQuiz2;

public class Quiz1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<18; i++)
		{
			sb.append(i);
		}
		System.out.println(sb.length());		//26
		System.out.println(sb.capacity());		//34
	}
}

//o/p = 26  34
//StringBuffer initial capacity is 16, when more than 16 characters are appended 
//theb formula for capacity becomes 
// capacity = (capacity+1)*2  == (16+1)*2 =34
