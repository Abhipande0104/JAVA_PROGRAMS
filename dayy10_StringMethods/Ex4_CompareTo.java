/*
 * compareTo()
 * 	public int compareTo(String str2)
 * 		it compares string 1 and string2(case sensitive) if boy=th are equal it returns 0
 * 		otherwise returns comparision
 * 
 * parameter= String(second str)
 * return type= integer
 */

package dayy10_StringMethods;

public class Ex4_CompareTo 
{
	public static void main(String[] args)
	{
		String str1= "Abhishek";
		String str2= "Abhishek";
		System.out.println(str1.compareTo(str2));		//0
		
		String str3= "Abhishek";
		String str4= "AbhishekP";
		System.out.println(str3.compareTo(str4));		//-1
		
		String str5= "AbhishekP";
		String str6= "Abhishek";
		System.out.println(str5.compareTo(str6));		//1
	}
}
