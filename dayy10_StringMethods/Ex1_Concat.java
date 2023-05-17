/*
 * concat()
 * public String concat(String str)
 * 		concatinate String to this String i.e. another string is concatenated
 * 		with the first string.
 * 		implements new array of character whose length is sum of str1.length+str2.length
 * 
 * parameters= String
 * return type= String
 */

package dayy10_StringMethods;

public class Ex1_Concat 
{
	public static void main(String[] args)
	{
		String str1= "Core2";
		String str2= "Web";
		
		String str3= str1.concat(str2);
		System.out.println(str3);			//Core2Web
	}
}
