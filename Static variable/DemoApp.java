// Ststic variable 
class Demo
{
	int a,b;
	static int x, y;
}
class DemoApp
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.a=10;
	    d1.b=20;
		d1.x=80;
		d1.y=90;
		System.out.println(d1.a +" " +d1.b+ " " +d1.x + " " +d1.y);
		Demo d2=new Demo();
		d2.a=10;
	    d2.b=20;
		d2.x=30;
		d2.y=40;
		System.out.println(d2.a +" " +d2.b+ " " +d2.x + " " +d2.y);
		Demo.x=90;
		Demo.y=70;
		System.out.println(Demo.x +" " +Demo.y);
	}
}