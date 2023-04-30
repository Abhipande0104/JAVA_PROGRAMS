/*
 * Take start num and end num fro user and print the reverse of all the number coming 
 * in that range.
 */

package dayy17_IO;

import java.io.*;

public class Pr7_NumberReverse 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter start number");
		int startInt = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end number");
		int endInt = Integer.parseInt(br.readLine());
		
		//reversing the number
		for(int i=startInt; i<=endInt; i++)
		{
			int num=i;
			int rev=0;
			while(num!=0)
			{
				int rem;
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println(rev);
		}
	}
}
