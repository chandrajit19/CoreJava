// read element into 1D arrray
import java.util.Scanner;
class OneDArray
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter the element = ");
			a[i]=s.nextInt();
		}
          System.out.println("array is =" );
		for(int i=0; i<a.length; i++)
		{
          System.out.println(a[i]);
		}

}}