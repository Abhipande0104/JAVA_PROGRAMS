package dayy12_StringQuiz2;

public class Quiz4 
{
	public static void main(String[] args)
	{
		StringBuffer var1 = new StringBuffer("Shashi");
		StringBuffer var2 = new StringBuffer("Shashi");
		
		System.out.println(var1.equals(var2));
		var1.setLength(3);
		System.out.println(var1);
	}
}

//o/p = false Sha
//InStringBuffer class equals compares actual objects and var1 and var2 are 2 different
//objects, hence though they are same content but they have different address hence false
