class Parent
{
	int i;
}
 class Child //extends Parent
 {
	 int i;
	 void setData(int a, int b)
	 {
		 super.i=a;  // both parent class & child class varivles have same name so we can not invoked parent class variable
		 i=b;          // we can only invoked if we declare it with "super" keyword.
		 System.out.println("Value of i of parent class = " +super.i);
		 System.out.println("Value of i of child class = " +i);
     }
 }
 class Test
 {
 	public static void main(String[] args) 
	{
		Child s=new Child();
		s.setData(10, 20);
	}
}
