import java.util.*;
class LinkedHashSetDemo
{
	public static void main(String[] args) 
	{   LinkedHashSet b=new LinkedHashSet();
	              b.add("java");   
				  b.add('c');
				  b.add(100);
				  b.add(null);
				  b.add("java");
		System.out.println(b);
		ArrayList a=new ArrayList();
		      a.add("apple");
			  a.add("orange");
			  b.addAll(a);
			  System.out.println(b);
	}
}
