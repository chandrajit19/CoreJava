import java.util.*;
class TreeMapDemo2
{
	public static void main(String[] args) 
	{
		TreeMap t=new TreeMap(new MyComparator());
		t.put("ram ",105);
		t.put( "seeta ", 104);
		t.put("ajay ",106);
		
		System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1=(String)o1;
		String s2=(String)o2;
		return -s1.compareTo(s2);
	}

}
 // here output will be in descending oreder