class Addition
{
	void add()
	{
		System.out.println(" addition is done ");
	}
}

interface Substraction
{
	void sub();
}

class Compute extends Addition implements Substraction
{
	public void sub()
	{
      System.out.println(" Substraction is done ");
	}
}

class App
{
	public static void main(String args[])
	{
		Compute c=new Compute();
		        c.sub();
				c.add();
	}
}