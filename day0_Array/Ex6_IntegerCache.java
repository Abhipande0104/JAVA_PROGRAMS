package day0_Array;

public class Ex6_IntegerCache
{
	public static void main(String[] args)
	{
		int x=10;
		int y=10;
		Integer z=10;
		
		System.out.println(System.identityHashCode(x));		//1365202186
		System.out.println(System.identityHashCode(y));		//same
		System.out.println(System.identityHashCode(z));		//same
	}
}

//the numbers between -128 to 127 are stored in IntegerCache inside the heap section
//these numbers have same identityHashCode.