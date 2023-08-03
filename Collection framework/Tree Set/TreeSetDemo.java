import java.util.*;
class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		      /*  t.add("banana");
				t.add("mango");
				t.add("guava");
				t.add("papaya");
				t.add("apple");
				t.add("papaya");

				System.out.println(t); */
				t.add(10);
				t.add(20);
				t.add(30);
				t.add(4);
				t.add(8);
				t.add(12);
				System.out.println(t);
				// methods from SortedSet
				 System.out.println(" methos of SortedSet = ");
				System.out.println(t.first());
				System.out.println(t.last());
				System.out.println(t.headSet(12)); // less then 12
				System.out.println(t.tailSet(12));   // greater than or equal to 12
				System.out.println(t.subSet(4,30));  // between 4 and 30 but 4 is included and 30 is excluded

               // methos of NavigableSet
			   System.out.println(" methos of NavigableSet = ");

			   System.out.println(t.lower(12));
			   System.out.println(t.higher(10));
			   System.out.println(t.floor(12));   // only single value
			   System.out.println(t.ceiling(20));  // only single value
			   System.out.println("a".compareTo("A"));


	}  
}
