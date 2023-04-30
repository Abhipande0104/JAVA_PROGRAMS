/*
 * WAP to take input from user and print perfect cube.
 */

package dayy17_IO;

import java.io.*;

public class Pr4_PerfectCube 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Start");
		int start= Integer.parseInt(br.readLine());
		System.out.println("Enter end");
		int end= Integer.parseInt(br.readLine());
		
		//finding perfect cube
		for(int i=start; i<end; i++)
		{
			for(int j=1; j*j*j<=i; j++)
			{
				if(j*j*j==i)
				{
					System.out.println(i+" ");
				}
			}
		}
	}
}
