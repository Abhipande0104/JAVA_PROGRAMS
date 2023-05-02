package dayy10_String;

public class Ex2 
{
	public static void main(String args[])
	{
		String str1 = "Core2Web";								//SCP
		String str2 = new String("Core2Web");					//Heap
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		String str3 = "Core2Web";								//SCP
		String str4 = new String("Core2Web");					//Heap
		
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}


//1365202186    same
//212628335
//1365202186	same
//1579572132
