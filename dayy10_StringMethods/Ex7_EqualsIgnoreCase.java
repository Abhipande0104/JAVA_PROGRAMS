/*
 * equalsIgnoreCase()
 * method- public boolean equalsIgnoreCase(String anotherString)
 * description- compares a string to this string ignoring case
 * parameters- Strings(str2)
 * return type- boolean
 */

package dayy10_StringMethods;

public class Ex7_EqualsIgnoreCase 
{
	public static void main(String[] args)
	{
		String str1= "Core2web";
		String str2= "core2web";
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}


//o/p = true