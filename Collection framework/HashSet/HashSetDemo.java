import java.util.*;
class HashSetDemo
{
	public static void main(String[] args) 
	{   LinkedHashSet b=new LinkedHashSet();
	              b.add("java");    // in HashSet duplicates are not allowed 
				  b.add('c');
				  b.add(100);
				  b.add(null);
				  b.add("java");
		System.out.println(b);
	}
}

// in HashSet duplicates are not allowed
// insertion oerder is not preserved
// heteroginious and null insertion possible