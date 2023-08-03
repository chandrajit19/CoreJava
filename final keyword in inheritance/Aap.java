  class Animal
{  
        float pi=3.14f;
	final void eat()
	{
		System.out.println("Animal is eating");
	}

}

class Tiger extends Animal
{
	void eat()
	{
      System.out.println("Tiger would hunt and eat");
	}
}
class Aap
{
	public static void main(String args[])
	{
		Tiger t=new Tiger();
		t.eat();
		System.out.println(t.pi);
	}

}
