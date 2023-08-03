class Heart 
{
	Heart()
	{
		System.out.println("Heart created");
		System.out.println("pumping blood");
	}
	void cheakHeart()
	{
		System.out.println("Heart is working");
	}
}

class Car
{
	Car()
	{
		System.out.println("Car is created");
	}
	void cheakCar()
	{
		System.out.println("Car can be used for driving");
	}
    
}
class Person
{      Heart h=new Heart();
	Person()
	{   
		System.out.println("Person is created");
		System.out.println("with heart");
	}
	void hasa(Car c)
	{
		System.out.println("Car can be used");
	}
}
class PersonApp
{
	public static void main(String args[])
	{
		Person p=new Person();
		Car c=new Car();
		p.hasa(c);
		c.cheakCar();
		p.h.cheakHeart();
		System.out.println("Person is destroyed");
		p=null;
		p.h.cheakHeart(); // error at run time, because heart is composed object, after destroying person we can not use heart of person
		c.cheakCar();
	}
}
