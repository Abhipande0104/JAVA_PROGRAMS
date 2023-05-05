package dayy10_String;

public class Ex7 
{
	public static void main(String[] args)
	{
		String str1= "Shashi";					//SCP
		String str2= "Bagal";					//SCP
		
		String str3= str1+ str2;					//Heap
		String str4= str1.concat(str2);				//Heap
		
		System.out.println(str3);
		System.out.println(str4);
	}
}

//in str3 while adding 2 strings, it calls append() method of StringBuffer class 
//while in str4 concat method is called of String class.

//while a method is called a new object is amde and it is stored in Heap.