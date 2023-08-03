// custom exception
import java.util.*;
class RTO
{
	int age;
     void input()
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter your age = ");
		 age=s.nextInt();
	}

	void dispatchDL()
	{
		try
		{
			if(age<18)
			{
				 UnderAgeException x =new UnderAgeException();
				 throw x;
			}
		}
		catch (UnderAgeException e)
		{ 
			System.out.println(e.getMessage());
		}

        try
		{
			  if (age>60)
			{
				//OverAgeException x =;
               throw new OverAgeException();  // we can also wright like this 
			}
		}
		catch (OverAgeException e)
		{ 
			System.out.println(e.getMessage());
		}

          if (age>=18 && age<=68)
		{
			   System.out.println("DL issued");
		}

}
}

class RTDApp
{
	public static void main(String args[])
	{
		RTO r=new RTO();
		    r.input();
			r.dispatchDL();
	}

}

class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return " age <18 " ;
	}
}

class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "age > 60 " ;
	}
}