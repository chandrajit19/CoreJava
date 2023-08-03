class Cal
{
	void add()
	{
		System.out.println("we are adding ");
	}
	
}

class App extends Cal
{

	void add()
	{   super.add();
		System.out.println("Applicatin is creating");
	}

	void run(String a)
	{
      System.out.println(a);
	}

}
class Main
{ 
	public static void main(String args[])
	{
		Cal c=new App();  // upcasting
		  c.add();
		  c.run(); // error
	}




}