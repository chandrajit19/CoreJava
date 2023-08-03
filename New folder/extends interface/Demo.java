interface Show
{
	void print();
}

interface Printable
{
	void print();
}
 interface AddPrint extends Show, Printable
 {
	 void display();
 }

 class Test implements AddPrint
 {
	 public void display()
	 {
		 System.out.println("Diaplay information");
	 }
	 public void print()
	 {
         System.out.println("Print information");
	 }
 }

 class Demo
 {
	 public static void main(String args[])
	 {
		 Test t=new Test();
		      t.print();
			  t.display();
	 }
 }