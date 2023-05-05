package day0_Array;

public class Exx10_ArrayArgument 
{
	static void fun(int x, double y)
	{
		System.out.println(x);			//97
		System.out.println(y);			//20.0
	}
	public static void main(String[] args)
	{
		fun('a',20.0);
	}
}

//character goes internally as an integer itself
//hence ascii value of char a is given