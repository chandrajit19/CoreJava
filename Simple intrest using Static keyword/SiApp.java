// using static variable finding simple intrest for more than one person
import java.util.*;
class SimpleIntrest
{       Scanner s=new Scanner(System.in);
     // static variable
	     static  float r;   // I am goin to fixed the rate for every one & taking care of memory managment
         
	                   
	  
	 void input()    // method                    
     {
        System.out.println("Please enetr the primary income = ");
        double p=s.nextDouble();
        System.out.println("Please enetr the time = ");
        double t=s.nextDouble();

        double si=(r*p*t)/100;
        System.out.println("Simple intrest is  = "+si);
    } 

}
class SiApp
{
	public static void main(String args[])
	{      Scanner t=new Scanner(System.in);
		   System.out.println("Enetr the rate = ");
	       SimpleIntrest.r=t.nextFloat();         // we can not write s.nextFloat
         
		 SimpleIntrest f1=new SimpleIntrest();
	     f1.input();
	     SimpleIntrest f2=new SimpleIntrest();
	     f2.input();
	}
}
