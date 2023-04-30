/*
 * WAP to take input from user and Print perfect square between that range
 */

package dayy17_IO;

import java.io.*;

public class Pr3_PerfectSquare 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter start ");
		int start= Integer.parseInt(br.readLine());
		System.out.println("Enter end ");
		int end = Integer.parseInt(br.readLine());
		
		//finding perfect square
		System.out.println("The perfect squares are");
		for(int i=start; i<=end; i++)
		{
			if(start<= (i*i) && (i*i)<= end)
			{
				System.out.println(i*i+ " ");
			}
		}
	}
}
