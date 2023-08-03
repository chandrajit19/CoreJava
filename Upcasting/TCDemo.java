// upcasting in runtime polymorphism
class Employee  // parent class
{
     void salary()
	{ 
		 System.out.println("Salary for employee");
	}
}

class Manager extends Employee       // child class
{  
	void salary()
	{
    System.out.println("Salary for manager");
    }

	void bonus()
	{
		 System.out.println("Bonus for manager");
	}
}

class TCDemo
{
	  public static void main(String args[])
	{
		  Manager m=new Manager();    // object of child class
		  m.salary();
		  m.bonus();

		  Employee e=new Manager();
		  e.salary();    // upcasting, parent ref pointing to child // salary for manager
		  //e.bonus();  // error , specialized method can not be access
		  
		  Manager ma=new Employee(); // downcasting is not posiible

	}
}
