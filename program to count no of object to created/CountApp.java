// program to count no of object to created
class Demo
{
	static int count=0;
	{
		//count++ ; 
		count=count+1 ;
	}
}
class CountApp
{
	public static void main(String args[])
	{
          Demo d1=new Demo();
		  Demo d2=new Demo();
		  Demo d3=new Demo();
		  System.out.println(d1.count);
	}
}