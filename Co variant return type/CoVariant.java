class Employee
{
}

class Manager extends Employee
{
}

class Parent
{
 Employee display()
	{
		Employee e=new Employee();
		System.out.println("Child Hello");
		return e;
	}
}
class Child extends Parent
{
  Manager display()
	{
	   Manager m=new Manager();
	   System.out.println("Child Hello");
	   return m;
	}
}

class CoVariant
{
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
	}
}