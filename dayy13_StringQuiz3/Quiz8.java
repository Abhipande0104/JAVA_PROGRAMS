package dayy13_StringQuiz3;

public class Quiz8 
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("AndroidOne");
		str.delete(7, 10);
		str.insert(str.length(), true);
		System.out.println(str);
	}
}

//op= Androidtrue
//delete() deletes the content within that range now inserting will result in addition 
//of true at the end.
