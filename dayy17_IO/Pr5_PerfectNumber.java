/*
 * WAP to take input from user and print perfect numbers between that range.
 */

package dayy17_IO;

import java.io.*;

public class Pr5_PerfectNumber 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end");
		int end= Integer.parseInt(br.readLine());
		
		//finding perfect number
		System.out.println("Perfect numbers are ");
		for(int i=start; i<=end; i++)
		{
			int sum=0;
			int j=1;
			for(j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
		}
	}
}
