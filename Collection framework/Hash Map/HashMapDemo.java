import java.util.*;
class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h=new HashMap();
		        h.put(101 , "orange");
				h.put(102 , "apple");
				h.put(106 , null);
				h.put(103 , "mango");
				h.put(104 , "banana");
				h.put(105 , null);
				h.put(107 , "banana");
				System.out.println(h);

				HashMap t=new HashMap();
				t.put(110, "Java");
				t.put(111, "C#");
				t.putAll(h);
				System.out.println(t);
				System.out.println(t.get(101)); // orange
                System.out.println(t.remove(102)); // apple removed
                System.out.println(t);
				System.out.println(t.containsKey(102));// false beacuse 102 is deleted
                System.out.println(t.containsValue("Java"));// true
				System.out.println(t.isEmpty());// false bcz it is not empty
				//Set s=t.keySet();     
				System.out.println(t.keySet());
				System.out.println(t.values());
	}
}
