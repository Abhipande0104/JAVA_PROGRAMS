package dayy10_String;

public class Ex5 
{
	public static void main(String[] args)
	{
		String str1= "Abhishek";
		String str2= "Pande";
		
		System.out.println(str1+str2);
		
		String str3= "AbhishekPande";
		String str4= str1+str2;
		
		System.out.println(System.identityHashCode(str3));		//diff
		System.out.println(System.identityHashCode(str4));		//diff
	}
}

//when 2 strings are concatenated new object is called and created in the heap
