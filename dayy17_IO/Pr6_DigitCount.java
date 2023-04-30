/*
 * Take 5 input from users and print the digit count of that numbers
 */

package dayy17_IO;

import java.io.*;

public class Pr6_DigitCount 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i=1; i<6; i++)
		{
			System.out.println("Enter "+i+" number");
			int num=Integer.parseInt(br.readLine());
			
			int count=0;
			//int temp=num;
			while(num!=0)
			{
				num=num/10;
				count++;
			}
			System.out.println("The digit count of number is "+count);
			System.out.println(" ");
		}
	}
}
