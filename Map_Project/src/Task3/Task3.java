package Task3;
import java.util.*;


public class Task3 
{
	public static void main(String args[])
	{
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "abc");
		m.put(2, "pqr");
		m.put(3, "xyz");
		
		Set<Integer> s = m.keySet();
		Iterator<Integer> itr = s.iterator();
		
			while(itr.hasNext())
			{
				int i = itr.next();
				String st = m.get(i);
				System.out.println(i+" "+st);
			}
		
	}

}
