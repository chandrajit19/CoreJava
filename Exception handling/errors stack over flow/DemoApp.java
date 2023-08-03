class Demo 
{
        void fun1()
		{
		   System.out.println("inside fun1");
           fun2();
		}

		void fun2()
		{
		   System.out.println("inside fun2");
           fun2();
		}
	
}

class DemoApp
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		     d.fun1();
	}
}