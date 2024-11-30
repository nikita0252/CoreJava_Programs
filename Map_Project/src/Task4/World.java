package Task4;
import java.util.*;

public class World 
{
	public static void main(String args[])
	{
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> mp = new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");
		
			Map<String,List<String>> m = new HashMap<>();
			m.put("List1",mh);
			m.put("List2",mp);
		
		List<String> State1 = new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		
		List<String> State2 = new ArrayList<>();
		mp.add("Bhopal");
		mp.add("Indore");
		
			Map<String,List<String>> m1 = new HashMap<>();
			m.put("List3",State1);
			m.put("List4",State2);
		
		
	}

}
