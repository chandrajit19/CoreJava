import java.util.*;
class CEDemo 
{
	public static void main(String[] args) 
	{   Scanner s=new Scanner(System.in);
		System.out.println("Enter a = ");
		int a=s.nextInt();
		System.out.println("Enter b = ");
        int b=s.nextInt();
	
		try
		{
		
		if(a>b)
		{
			int c=a-b;
			System.out.println("Result is = " +c);
		}


		else
		{
			AlessthanB x=new AlessthanB();
			throw x;
	    }
        }

		catch(AlessthanB e)
		{
			System.out.println("Exception is caught");
		}

       System.out.println("main is terminated normally");

	}
}

class AlessthanB extends Exception
{
	AlessthanB()
	{
		System.out.println(" a is less than b");
	}
}