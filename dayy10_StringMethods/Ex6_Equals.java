/*
 * equals()
 * method- public boolean equals(Object anObject)
 * description- predicate which compares an object to this.
 * This is true only for string wu=ith the same char sequence
 * parameters- Object
 * return type- boolean
 */

package dayy10_StringMethods;

public class Ex6_Equals 
{
	public static void main(String[] args)
	{
		String str1 = "Shashi";
		String str2 = new String("Shashi");
		System.out.println(str1.equals(str2));
	}
}

//o/p = true