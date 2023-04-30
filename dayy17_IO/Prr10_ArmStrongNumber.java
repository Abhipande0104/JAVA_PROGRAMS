/*
 * Take range from user and print Armstrong numbers between that range
 * armstrong numbr example=153
 * 153= 1^3+ 5^3+ 3^3
 */

package dayy17_IO;

import java.io.*;

public class Prr10_ArmStrongNumber 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter start number");
		int start= Integer.parseInt(br.readLine());
		System.out.println("Enter end number");
		int end= Integer.parseInt(br.readLine());
		
		for(int i=start; i<=end; i++)
		{
			int num=i;
			int temp1=num;
			int temp2=num;
			int count=0;
			int sum=0;
			while(temp1!=0)
			{
				count++;
				temp1=temp1/10;
			}
			
			while(temp2!=0)
			{
				int rem=temp2%10;
				int mul=1;
				for(int j=0; j<count; j++)
				{
					mul=mul*rem;
				}
				sum=sum+mul;
				temp2=temp2/10;
			}
			if(num==sum)
			{
				System.out.println(num);
			}
		}
	}
}
