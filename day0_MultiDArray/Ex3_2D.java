package day0_MultiDArray;

public class Ex3_2D
{
	public static void main(String[] args)
	{
		int arr[][] = new int[2][2];
		arr[0][0] = 10;
		arr[0][1] = 10;
		arr[1][0] = 10;
		arr[1][1] = 10;
		
		System.out.println(arr[1][1]);			//element 10
		System.out.println(arr[0]);				//address  [I@379619aa
		System.out.println(arr[1]);				//address
		System.out.println(arr);				//address  [[I@5e265ba4
	}
}
