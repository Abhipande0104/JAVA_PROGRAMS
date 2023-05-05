package day0_MultiDArray;

public class Ex4_JaggedArray 
{
	public static void main(String[] args)
	{
		int arr[][] = {{10,20,30},{40,50},{60}};
		
		//printing the elements
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
