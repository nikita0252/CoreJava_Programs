package task1;
import java.util.*;

public class Test2 
{
	public static void main(String args[])
	{
		Map<Integer,String> m = new HashMap<>();
		m.put(1, "aa");
		m.put(2, "bb");
		m.put(3, "cc");
		m.put(3, "dd");
		
		Set<Integer> key = m.keySet();
		System.out.println(key);
		
		for(int i : key)
		{
			System.out.println(i);
			String s = m.get(i);

			System.out.println(s);
		}
		
	}

}
