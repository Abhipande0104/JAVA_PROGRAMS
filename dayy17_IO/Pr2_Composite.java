/*
 * WAP to take input from user take start and end limit. Print composite numbers.
 */

package dayy17_IO;

import java.io.*;

public class Pr2_Composite 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start");
		int start= Integer.parseInt(br.readLine());
		System.out.println("Enter end");
		int end= Integer.parseInt(br.readLine());
		
		//checking composite number
		System.out.println("The composite numbers are ");
		for(int i=start; i<=end; i++)
		{
			int count=0;
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count>=2)
			{
				System.out.print(i+" ");
			}
		}
	}
}
