package dayy12_StringQuiz2;

public class Quiz7 
{
	public static void main(String[] args)
	{
		String var1 = new String("Shashi");
		String var2 = var1.reverse();
		
		System.out.println(var1);
		System.out.println(var2);
	}
}

//o/p = compile time error
// the method reverse() is undefined dfor the type String
// reverse() method is not present in String class
// It is present in StringBuffer class
