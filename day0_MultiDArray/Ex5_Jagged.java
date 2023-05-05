package day0_MultiDArray;

public class Ex5_Jagged 
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3}, {4,5}, {6}};
		
		//printing the array
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*
 * o/p= 1 2 3
 *      4 5 exception ArrayIndexOutOfBoundsException
 *      
 *  we are trying to extract 3rd element fro the 2nd row whose length is 2
 *  hence out of bound
 */
