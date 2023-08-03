class Parent 
{
	Parent(int a)
	{
		System.out.println(" 1 parameter contructor ");
	}
}

class Child extends Parent
{
	Child()
	{  
		super(10);
		System.out.println(" 0 parameter contructor ");
	
	}
}

class Demo
{
	public static void main(String args[])
	{
		Child c=new Child();
	}
}