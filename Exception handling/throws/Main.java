class Demo 
{
	void fun1() 
	{  System.out.println("fun1 is entering");
	  
		try
		{
		fun2();	
		}
		catch (ArithmeticException e)
		{
          System.out.println(e.getMessage());
		}
		
	}

	void fun2() throws ArithmeticException
	{    System.out.println("fun2 is entering");
		int c=12/0;
	}
}
class Main
{
	public static void main(String a[])
	{
		Demo d=new Demo();
		     d.fun1();
			 System.out.println("main is terminated normally");
	}

}
