// creating 3D array
class ThreeDArray
{ 
	public static void main(String args[]) 
	{
		int a[][][]=new int[3][2][5];  // here three blocks(0,1,2) , two rows(0,1) and five colums(0,1,2,3,4)
		a[1][1][4]=25;
		System.out.println(a[1][1][4]);   
	}
}
