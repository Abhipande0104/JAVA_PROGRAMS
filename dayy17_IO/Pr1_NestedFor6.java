/*
 * WAP to print number divisible by 5 from 1 to 50 and no is even.
 * Print the count of even numbers.
 */

package dayy17_IO;

import java.io.*;

public class Pr1_NestedFor6 
{
	public static void main(String[] arrs) throws IOException
	{
		//taking start and end from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter end ");
		int end = Integer.parseInt(br.readLine());
		
		//finding number divisible by 5 and even
		System.out.println("The number which are even and divisible by 5 are");
		int count=0;
		for(int i=start; i<=end; i++)
		{
			if(i%5==0 && i%2==0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println(" ");
		System.out.println("The number of count is "+count);
	}
}
