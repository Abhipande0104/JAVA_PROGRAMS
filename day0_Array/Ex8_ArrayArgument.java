//passing array as an argument

package day0_Array;

public class Ex8_ArrayArgument 
{
	public static void main(String[] args) 
	{
		Ex8_ArrayArgument obj = new Ex8_ArrayArgument();
		int ret = obj.fun(10);
		System.out.println(ret);
	}
	
	int fun(int x)
	{
		int val=x+50;
		return val;
	}
}
