class Superclass // base class
{
    int x=10;
    void eat()
    {
        System.out.println("ram");
    }
    
}

class subclass extends Superclass // sub class extending Superclass
{
    int  x =20;
    void eat()
    {   
        System.out.println("super variable x value :" + super.x); // print instance variable of parent class
        System.out.println("subclass variable x value :" +x);     
   super.eat();
   }
}
public class Cheak
{
    public static void main(String args[])
    {
        subclass obj=new subclass();
        obj.eat();
        
    }
}