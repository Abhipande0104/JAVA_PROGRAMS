/*
 * indexOf(int ch, int fromIndex)
 * description- finds the first instance of the character
 * in the give string
 * parameters- character(to find)
 * 				integer (start search)
 * return type-Integer
 */

package dayy10_StringMethods;

public class Exx10_IndexOf 
{
	public static void main(String[] args)
	{
		String str1= "Shashi";
		System.out.println(str1.indexOf('h',0));		//1
		System.out.println(str1.indexOf('h',1));		//1
		System.out.println(str1.indexOf('h',2));		//4
	}
}

//op =1 1 4