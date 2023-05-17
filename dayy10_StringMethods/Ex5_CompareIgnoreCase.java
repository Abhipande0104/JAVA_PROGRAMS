/*
 * compareToIgnoreCase()
 * method- public int compareToIgnoreCase(String str)
 * description- it compares str1 and str2(case insensitive)
 * parameter- String
 * return type- Integer
 */

package dayy10_StringMethods;

public class Ex5_CompareIgnoreCase 
{
	public static void main(String[] args)
	{
		String str1 = "SHASHI";
		String str2 = "Shashi";
		System.out.println(str1.compareToIgnoreCase(str2));	
	}
}

//o/p = 0
//it returns the difference between the characters of string 
