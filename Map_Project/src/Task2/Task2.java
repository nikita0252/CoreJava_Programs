package Task2;
import java.util.*;

public class Task2 
{
	public static void main(String args[])
	{
		Map<Character,String> m = new HashMap<>();
		m.put('a', "abc");
		m.put('b', "pqr");
		m.put('c', "xyz");
		
			Set<Character> st = m.keySet();
				System.out.println(st);
		 
			Iterator<Character> itr = st.iterator();
				while(itr.hasNext())
				{
					char c = itr.next()	;
					String s = m.get(c);
					System.out.println(c+" "+s);
				}
		
	}

}
