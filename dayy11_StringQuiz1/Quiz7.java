package dayy11_StringQuiz1;

public class Quiz7 
{
	public static void main(String[] args)
	{
		String str1 = "c2w";
		String str2 = "c2w";
		System.out.println(str1==str2);
	}
}

//o/p= true
//being same string literal, same address will be assigned 
//when string is declared without new, it gets stored in SCP, hence they have same addresses
