interface Show
{
	void print();
}

interface Printable
{
	void print();
} 

class Test implements Show, Printable
{  
	public void print()
	{
		System.out.println("Printing information");
	}
}

class Demo
{
	public static void main(String args[])
	{
		Test t=new Test();
		     t.print();

			Show s=new Test();   // Printable or Show we can use both of
			      s.print();
	}
}