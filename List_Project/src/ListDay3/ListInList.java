package ListDay3;

import java.util.*;

public class ListInList 
{
	public static void main(String[] args)
	{
		List<String> mh = new ArrayList<>();
		mh.add("Pune");
		mh.add("Nagpur");
		mh.add("Mumbai");
		
		List<String> jh = new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		
		List<List<String>> india = new ArrayList<>();
		india.add(mh);
		india.add(jh);
		
		Iterator<List<List<String>>> itr = india.iterator();
		
		
	}

}
