// Ststic method
class Demo
{  static int x=5;
	Demo()
	{
		System.out.println("Constructor is called");
	}
	void display()
	{
		System.out.println("non static method is called "+x);
	}
	static void print()
	{   
		System.out.println("static print is called "+x);
	}
}
class DemoApp
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.display(); // loads from code segment
		d1.print();   // loads from stack segment
		Demo.print(); 
	}
}