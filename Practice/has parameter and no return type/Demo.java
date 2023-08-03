// has parameter and no return type

class Addition
{
	void add(int a, int b)
	{
     	int x=a;
		int y=b;
		int r=(x+y); // r=(a+b)
		System.out.println(r);  //(a+b) , we can put at the place of r
	}

}
class Demo
{
	public static void main(String args[])
	{
		Addition a=new Addition();
		a.add(12, 13);
	}
}