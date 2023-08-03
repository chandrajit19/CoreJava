class Parent
{
private	void display()
	{
		System.out.println("display parent");
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("display child");
	}
} 

class Main
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
	}
}