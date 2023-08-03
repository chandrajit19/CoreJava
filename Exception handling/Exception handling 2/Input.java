import java.util.*;
class Input
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter first number = ");
		int a=s.nextInt();
        System.out.println("Enter fsecond number = ");
		int b=s.nextInt();

		try
		{
			int c=a/b;
			System.out.println("output is = " +c);
		}
		catch (Exception e)
		{
			System.out.println("Exeption is caught ");
		}
		
		System.out.println("main is terminated normally");
	}
}
