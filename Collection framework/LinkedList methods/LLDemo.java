import java.util.*;
class LLDemo
{
	public static void main(String[] args) 
	{   ArrayList b=new ArrayList();
	              b.add("java");
				  b.add('c');
				  b.add(100);
				  b.add(null);
				  b.add("java");
				  
		System.out.println(b);
		System.out.println(b.remove(null));  // removing " null"
		System.out.println(b);
		System.out.println(b.contains('c')); // true, cheaking objects are in the collection or not 
		System.out.println(b.contains("ram")); // false , ram is not in the collection

		LinkedList l=new LinkedList();
		          l.add(200);
				  l.add("yeshu");

				  l.addAll(b);
                  System.out.println(l);
				  l.addFirst("Link");   // method of linklist
				  l.addLast("List");   // method of linklist
	              System.out.println(l);
                  System.out.println("first value = " + l.getFirst()); //  method of linklist
				  System.out.println("last value = " +l.getLast());    // method of linklist
                  l.removeFirst();  //  method of linklist
				  l.removeLast();    //  method of linklist
				  System.out.println(l);
		          l.removeAll(b);
				  System.out.println(l);
				  
                  Object a[]=l.toArray();
				  for(Object temp : a)
		           {
					  System.out.println(temp);
				   }
				   
	              
	}
}
