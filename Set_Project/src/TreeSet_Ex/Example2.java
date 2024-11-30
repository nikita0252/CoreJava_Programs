package TreeSet_Ex;
import java.util.*;

public class Example2 

{
	public static void main(String[] args)
	{
		Set<String> s = new TreeSet<>();
		s.add("CJC");
		s.add("cjc");
		s.add("Cjc");
		s.add("CJc");
		s.add("cJC");
		s.add("cjc");
		
		for(String str : s)
		{
			System.out.println(str);
		}
		
	}

}
