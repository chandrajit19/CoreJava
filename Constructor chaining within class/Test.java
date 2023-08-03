class Demo 
{
	Demo()
	{
		this(19,32);
		System.out.println(" 0 parameter constructor ");   //3
	}

	Demo(int a)
	{
		System.out.println(" 1 parameter constructor ");    // 1
	}

	Demo(int a, int b)
	{  
		this(22);
		System.out.println(" 2 parameter constructor ");  // 2
	}

}

class Test
{
	public static void main(String args[])
	{
		Demo d=new Demo();
	}
}
