class A 
{
	A()
	{    super();  // here A does not have parent class so there is no need to use "super" keyword
		System.out.println(" A, constructor is executed ");
	}
}
class B  extends A
{
	B()
	{  
		System.out.println(" B, constructor is executed ");
	}

}
class C extends B
{
	C()
	{   super();   // we can mention it otherwise no need
		System.out.println(" C, constructor is executed ");
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		C s=new C();
	}
}