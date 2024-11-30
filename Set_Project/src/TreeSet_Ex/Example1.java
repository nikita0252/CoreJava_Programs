package TreeSet_Ex;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example1 
{
	public static void main(String args[])
	{
		Set<String> s = new TreeSet<>();
		
			s.add("CJC");
			s.add("cjc");
			s.add("Cjc");
			s.add("CJc");
			s.add("cJC");
			s.add("cJc");
			
			Iterator<String> itr = s.iterator();
			while(itr.hasNext())
			{
				String str = itr.next();
				System.out.println(str);
						
			}
	}
	

}
