package day0_MultiDArray;

public class Ex9_3DArray 
{
	public static void main(String[] args)
	{
		int arr[][][] = new int[][][] {{{1},{2}},{{3},{4}}};
		
		//printing
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				for(int k=0; k<arr[i][j].length; k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
