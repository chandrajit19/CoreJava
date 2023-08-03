// Ststic method
class Nemo
{  static int x=12;

	Nemo()
	{
		System.out.println("Constructor is called");
	}
	static void display()
	{
		System.out.println(" static method is called ");
	}
	static void print()
	{    display();
		System.out.println("static print is called  and also this method is calling static display method"+ "static variable is calling "+x);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Nemo d1=new Nemo();
		d1.display(); // loads from code segment
		d1.print();   // loads from stack segment
		Nemo.print(); 
	}
}