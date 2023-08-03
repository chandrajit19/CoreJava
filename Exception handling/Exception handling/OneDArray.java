// Exception handling
class OneDArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		try
		{
		a[26]=620;	
         System.out.println(a[26]);
		}
		catch(Exception e )
		{
			System.out.println("Exception is caught");
		}
	
		System.out.println("Main is terminated normally");

	}
}
