package dayy11_StringQuiz1;

public class Quiz5 
{
	public static void main(String[] args) 
	{
		String s1 = new String("core2web");
		String s2 = new String("core2web");
		
		if(s1==s2)
		{
			System.out.print("True1 ");
		}
		if(s1.equals(s2))
		{
			System.out.print("True2 ");
		}
		if(s1.hashCode()==s2.hashCode())
		{
			System.out.print("True3 ");
		}
	}
}

//o/p= True2 True3
//true2= content equal
//true3= identical hashcode being same content

