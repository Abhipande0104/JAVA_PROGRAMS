//hashCode demo

package dayy10_String;

public class Ex8 
{
	public static void main(String [] args)
	{
		String str1= "Abhishek";
		String str2= new String ("Abhishek");
		String str3= "Abhishek";
		String str4= new String ("Abhishek");
		
		System.out.println(str1.hashCode());		//same  
		System.out.println(str2.hashCode());		//same
		System.out.println(str3.hashCode());		//same
		System.out.println(str4.hashCode());		//same
	}
}
