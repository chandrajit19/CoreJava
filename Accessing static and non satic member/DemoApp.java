// Accessing static and non satic member
class Demo
{
	int a,b;
	static int x,y;
	Demo()
	{
		System.out.println("inside the constroctor ");
		a=10;
		b=20;
		x=30;
		y=40;
	}
	static {
		System.out.println("inside the static block");
		x=50;
		y=60;
		/*
		a=10;
		b=20 */
	   System.out.println(x+" "+y);
	}
	{
       System.out.println("inside the non static block");
	   x=70;
	   y=80;
	   a=90;
	   b=100;
       System.out.println(x+" "+y+" "+a+" " +b);
	}

		
	void display()
	{
       System.out.println("inside the Display");
	   x=11;
	   y=12;
	   a=13;
	   b=14;
	   System.out.println(x+" "+y+" "+a+" " +b);
	}
	static void print()
	{
        System.out.println("inside theprint");
		{
			x=15;
			y=16;
			/* a=17;
			b=18; */
			System.out.println(x+" "+y);
		}
	}

}
class DemoApp
{
  public static void main(String args[])
	{
	  Demo d1=new Demo();
	  d1.display();
	  Demo.print();
  }

}