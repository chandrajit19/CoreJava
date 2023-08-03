import java.util.*;
class LinkedHashMapDemo 
{
	public static void main(String[] args) 
	{
		LinkedHashMap h=new LinkedHashMap();
		        h.put(101 , "orange");
				h.put(102 , "apple");
				h.put(106 , null);
				h.put(103 , "mango");
				h.put(104 , "banana");
				h.put(105 , null);
				h.put(107 , "banana");
				System.out.println(h);
	}
}