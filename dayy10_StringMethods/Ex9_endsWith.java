/*
 * endsWith()
 * method- public boolean endsWith(String suffix)
 * description-predicate which defines if the string 
 * ends with given suffix.
 * if empty returns true
 * if null throws NullPointerException
 * parameters- prefix String to compare
 * return type- boolean
 */

package dayy10_StringMethods;

public class Ex9_endsWith 
{
	public static void main(String[] args)
	{
		String str1="Know the code till the core";
		System.out.println(str1.endsWith("core"));
	}
}

//op= true
