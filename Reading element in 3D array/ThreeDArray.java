// Reading elements in 3D array
import java.util.Scanner;
class ThreeDArray
{
	public static void main(String args[])
	{   int a[][][]=new int[2][3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element= ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					a[i][j][k]=s.nextInt();
				}
			}
		}
	  System.out.println("Array is = ");
	  for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{ 
					System.out.print(a[i][j][k]+ " ");
				}
				System.out.println();
			
			}System.out.println();
		}
	}

}