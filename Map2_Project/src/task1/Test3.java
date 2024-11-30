package task1;

import java.util.*;
public class Test3 
{
 static void main(String args[])
	{
		Map<Integer,String> m = new HashMap<>();
			m.put(1, "abc");
			m.put(2, "abv");
			m.put(3, "aa");
			
			System.out.println(m);
			
			Set<Integer> s = m.keySet();
			System.out.println(s);
			
			m.forEach((k,v)-> System.out.println(k+" "+v));
		
	}

}
