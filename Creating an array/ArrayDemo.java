// Creating an 1D array
class ArrayDemo
{
	public static void main(String args[])
	{
		int a[];
		a=new int[6];
		a[0]=12;
		a[2]=44;

		int b[]=new int[5];
		b[4]=34;
		b[2]=23;

		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(b[4]);
		System.out.println(b[2]);
	}
}