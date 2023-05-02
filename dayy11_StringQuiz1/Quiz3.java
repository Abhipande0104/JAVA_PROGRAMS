package dayy11_StringQuiz1;

public class Quiz3 
{
	public static void main(String[] args)
	{
		String str1 = new String("java");
		String str2 = "java";
		System.out.println(str1==str2);
	}
}

//o/p= false
//string literal goes to SCP(String constant pool)
//and string created by new creates new object on heap.
//Hence both will have DIFFERENT ADDRESSES
