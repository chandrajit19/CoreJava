// has parameter has  return type

class Addition
{
	int add(int a, int b)
	{
		int x=a;
		int y=b;
		int c=(x+y);

		return c;
	}

}
class Demo
{
	public static void main(String argd[])
	{
		Addition a=new Addition();
			int r=a.add(22, 33);
			System.out.println(r);
            System.out.println(a.add(22, 33));
		

	}
}