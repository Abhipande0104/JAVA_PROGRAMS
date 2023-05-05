package dayy10_String;

public class Ex4 
{
	public static void main(String[] args)
	{
		String str1= "Kanha";								//SCP
		String str2= str1;									//SCP
		String str3= new String(str2);						//Heap
		
		System.out.println(System.identityHashCode(str1));		//same
		System.out.println(System.identityHashCode(str2));		//same
		System.out.println(System.identityHashCode(str3));		//different
	}
}
