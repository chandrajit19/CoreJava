interface Drawable
{
	void draw();
}

class Rectangle implements Drawable 
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}

}
class Demo
{
	public static void main(String args[])
	{
		Drawable ref=new Rectangle();  // we can only when classes are imlemented interface like Rectangle and circle
		         ref.draw();
				 ref=new Circle();
				 ref.draw();
	}

}