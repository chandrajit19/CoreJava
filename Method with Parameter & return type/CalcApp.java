class Calculator
{
	int add(int a, int b)
	{
		int x=a;
		int y=b;
		int c=x+y;
		
		return c;
	}
}
class CalcApp
{
	public static void main(String args[])
	{
		Calculator ob=new Calculator();
		int r=ob.add(10,5);
		System.out.println("sum is = " +r);
}
}