import java.util.*;
class Mycomparator implements Comparator
{  
	public int compare(Object o1, Object o2)
	{
		String a=(String) o1;
        String b=(String) o2;
		return -(a.compareTo(b)); // decscending order
		//return (a.compareTo(b));  // ascending order
		//return 1;   // insertion is preserved
	}
}
class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		       t.add("banana");
				t.add("mango");
				t.add("guava");
				t.add("papaya");
				t.add("apple");
				t.add("papaya");

				System.out.println(t);

	}
}