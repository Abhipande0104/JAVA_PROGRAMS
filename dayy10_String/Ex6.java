package dayy10_String;

public class Ex6 
{
	public static void main(String[] args)
	{
		String str1= "Shashi";		//SCP
		String str2= "Bagal";		//SCP
		
		System.out.println(str1);		//shashi
		System.out.println(str2);		//bagal
		
		str1.concat(str2);			//Heap
		
		System.out.println(str1);		//shashi
		System.out.println(str2);		//bagal
	}
}

//here we are only concating 2 strings but we are not storing it in some variable
//hence value of str1 will not change
