/*
 * Take range from user and print Strong number in that range
 * strong number example =145
 * 145 = 1!+ 4!+ 5!
 */

package dayy17_IO;

import java.io.*;

public class Pr9_StrongNumber 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start number");
		int start=Integer.parseInt(br.readLine());
		
		System.out.println("Enter end number");
		int end=Integer.parseInt(br.readLine());
		
		//printing strong number
		System.out.println("The strong numbers are ");
		for(int i=start; i<=end; i++)
		{
			int num=i;
			int sum=0;
			while(num!=0)
			{
				int rem;
				rem=num%10;
				int mul=1;
				for(int j=1; j<=rem; j++)
				{
					mul=mul*j;
				}
				sum=sum+mul;
				num=num/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
