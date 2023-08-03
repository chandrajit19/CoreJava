// Multiple inheritance is not possible
class A
{
	void display()
	{
		System.out.println("A's display");
	}
}

class B
{
	void print()  // it can be same name like display()
	{
      System.out.println("B's print ");
	}
}

class C extend A,B // error
{
}
class Main
{ 
	public static void main(String args[])
	{
		C ob=new C();
		ob.print();
		ob.display();
	}
}