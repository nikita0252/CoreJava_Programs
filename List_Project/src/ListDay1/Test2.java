package ListDay1;

import java.util.*;

public class Test2 
{
	public static void main(String[] args) 
	{
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(30);
		al.add(60);
		al.add(20);
		
		System.out.println(al);
//		Iterator<Integer> itr = al.iterator();
//		
//			while(itr.hasNext())
//			{
//				int x = itr.next();
//				System.out.println(x);
//			}
//		
		
//		for(int i : al)
//		{
//			System.out.println(i);
//		}
		
		al.forEach(a-> System.out.println(a));
	}

}
