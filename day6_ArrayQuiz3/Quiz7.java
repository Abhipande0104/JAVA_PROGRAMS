package day6_ArrayQuiz3;

public class Quiz7 
{
	public static void main(String [] args)
	{
		String var1=null;
		var1= args[0]+args[1]+args[2];
		System.out.println(var1);
	}
}

// run as java Quiz7 10 20 30
// o/p=102030
// arguments stored in array is in string format
// hence by using + sign concatenation is done 
