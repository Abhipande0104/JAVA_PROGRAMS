/*
 * Take range from user and print all the palindrome number between that range
 */

package dayy17_IO;

import java.io.*;

public class Pr8_PalindromeNumber 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start number");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter end number");
		int end = Integer.parseInt(br.readLine());
		
		//printing palindrome number
		System.out.println("The palindrome numbers are ");
		for(int i=start; i<=end; i++)
		{
			int num=i;
			int temp=num;
			int rev=0;
			while(temp!=0)
			{
				int rem;
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(rev==num)
			{
				System.out.println(rev+" ");
			}
		}
	}
}
