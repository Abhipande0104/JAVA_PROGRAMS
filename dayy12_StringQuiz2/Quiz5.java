package dayy12_StringQuiz2;

public class Quiz5 
{
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
	{
		StringBuffer var1 = new StringBuffer("Shashi");
		String var2 = new String("Shashi");
		
		if(var2.equals(var1))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
	}
}

//o/p = both are not equal
// the objects are of different classes hence they are not equal
