/*
 * startsWith()
 * method- public boolean startsWith(String prefix, int toffset)
 * description-predicate which determines if the given string 
 * contains the given prefix. case sensitive
 * parameters- prefix String toCompare
 * 			   offset for string where comparision starts
 * reurn type- boolean 
 */

package dayy10_StringMethods;

public class Ex8_StartsWith 
{
	public static void main(String[] args)
	{
		String str="Core2Web";
		System.out.println(str.startsWith("or",1));
	}
}

//op= true
