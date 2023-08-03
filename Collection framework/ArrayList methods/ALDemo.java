import java.util.*;
class ALDemo
{
	public static void main(String[] args) 
	{   ArrayList b=new ArrayList();
	              b.add("java");
				  b.add('c');
				  b.add(200);
				  b.add(null);
				  b.add("java");
		System.out.println(b.add("thor")); // true
		//System.out.println(b.removeAll(b)); // I removed what I stored in b
		 b.add(6, "ninja");// how to add element in collection
		 b.add(1, 'r');
		System.out.println(b);
		System.out.println(b.get(1)); // getting element with the help of index
		System.out.println(b.set(0, "riya"));
		System.out.println(b.remove(null));  // removing " null"
		System.out.println(b);
		System.out.println(b.contains('c')); // true, cheaking objects are in the collection or not 
		System.out.println(b.contains("ram")); // false , ram is not in the collection

		ArrayList d=new ArrayList();
		          d.add(200);
				  d.add("thor");

				  //d.addAll(b);
				  System.out.println(d.retainAll(b));
	    System.out.println(d);
		        //  d.removeAll(b);
				  //System.out.println(d);

				 
	}
}
