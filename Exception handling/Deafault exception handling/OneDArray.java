// Default exception handling
class OneDArray 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[26]=620;     // here i followed the rule of jaca so it compiled successfully but it will run time error
		System.out.println(a[26]);
		System.out.println("Main terminated normally");

	}
}
