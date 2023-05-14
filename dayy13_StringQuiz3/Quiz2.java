package dayy13_StringQuiz3;

public class Quiz2 
{
	public static void main(String[] args)
	{
		StringBuffer str1 = new StringBuffer("DEMO");
		
		StringBuffer str2 = new StringBuffer();
		str2 = str2.append("DEMO");
		
		System.out.println(str1.capacity()==str2.capacity());
	}
}


//o/p =false
//str1 is initialised at start hence its capacity will be (16+4=20) at start
// str2 is initilised and at next step it is appended hence its capacity will be 16 by 
//default
//hence false.