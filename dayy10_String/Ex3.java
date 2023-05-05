package dayy10_String;

public class Ex3 
{
	public static void main(String[] args)
	{
		String str1= "Kanha";										//SCP
		String str2= "Kanha";										//SCP
		String str3= new String("Kanha");							//Heap
		String str4= new String("Kanha");							//Heap
		String str5= new String("Rahul");							//Heap
		String str6= "Rahul";										//SCP
		
		System.out.println(System.identityHashCode(str1));			//same
		System.out.println(System.identityHashCode(str2));			//same
		System.out.println(System.identityHashCode(str3));			//different
		System.out.println(System.identityHashCode(str4));			//different
		System.out.println(System.identityHashCode(str5));			//different
		System.out.println(System.identityHashCode(str6));			//different
	}
}
