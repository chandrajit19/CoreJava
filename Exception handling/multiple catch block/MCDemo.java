class MCDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[5];
			a[1]=26;
			//float c=50f/0f ;
            //double c=50/0.0;
			int c=50/0;

			String s="arun";
			//s=null;
			System.out.println(s.length());
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
           System.out.println(" arithmetic exception is caught ");
		} 
		catch(NullPointerException e)
		{
         System.out.println("Null pointer is called ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOOBE IS CALLED ");
		}

		catch(Exception e)
		{ 
			System.out.println("Exception is called ");
		}

		finally
		{
			System.out.println("finally block executed");
		}

		System.out.println("main is terminated normally");
	}
}
