/*
 * charAt()
 * 		it returns the character located at specified index within the given string
 * 
 * parameter= integer(index)
 * return type= character
 */

package dayy10_StringMethods;

public class Ex3_CharAt 
{
	public static void main(String[] args)
	{
		String str= "Core2Web";
		
		System.out.println(str.charAt(4));		//2
		System.out.println(str.charAt(0));		//C
		System.out.println(str.charAt(8));		//run time exception String index out of bound
	}
}
