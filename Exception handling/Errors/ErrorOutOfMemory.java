class ErrorOutOfMemory 
{
	public static void main(String[] args) 
	{
		System.out.println("Entering memory");
		try
		{
			int a[]=new int[999999999];
			System.out.println();
		}
		catch (Exception e)
		{
			System.out.println(" array not created ");
		}
		System.out.println(" main terminated normally" );
	}
}
