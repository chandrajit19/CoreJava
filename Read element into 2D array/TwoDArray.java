// read element in 2D array
import java.util.Scanner;
class TwoDArray
{
	public static void main(String args[])
	{
		int a[][]=new int[3][2];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element");
		for(int i=0; i<a.length; i++)
		{   
			for(int j=0; j<a[j].length; j++)
			{   
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Output is = ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[j].length; j++)
			{
				System.out.println(a[i][j]);
			} 
			
		}
	}
}