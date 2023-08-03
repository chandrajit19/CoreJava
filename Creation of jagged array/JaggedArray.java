// creation of jagged array
class JaggedArray
{
	public static void main(String args[])
	{ 
		int a[][]= new int[3][];    // jagged array is always 2D array
		a[0]=new int[4];
		a[1]=new int[2];
		a[2]=new int[5];
		a[2][3]=90;
		System.out.println(a[2][3]);
	}
}