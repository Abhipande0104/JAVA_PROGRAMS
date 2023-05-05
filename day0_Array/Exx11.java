package day0_Array;

public class Exx11 
{
	static void fun(int x, int y)
	{
		System.out.println(x);
		System.out.println(y);
		x=x+10;
		y=y+10;		
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		System.out.println(x);
		System.out.println(y);
		fun(x,y);
		System.out.println(x);
		System.out.println(y);
	}
}

//o/p=
//10
//20
//10
//20
//20
//30
//10
//20
