package MapSet;
import java.util.*;

public class Task1 
{
	public static void main(String[] args) 
	{
		Set<String> mh = new HashSet<>();
			mh.add("Pune");
			mh.add("Mumbai");
			
		Set<String> mp = new HashSet<>();
			mp.add("Indore");
			mp.add("Bhopal");
			
		Map<String,Set<String>> m = new HashMap<>();
			m.put("mp", mp);
			m.put("mh", mh);
			System.out.println(m); 
			
	    Set<String> s = m.keySet();
	    System.out.println(s);
	    
//	    Iterator<String> itr = s.iterator();
//	    while(itr.hasNext())
//	    {
//	    	String st = itr.next();
//	    	Set<String> key = m.get(st);
//	    	System.out.println(key);
//	    	
//	    	 Iterator<String> itr1 = key.iterator();
//	    			 while(itr1.hasNext())
//	    			 {
//	    				 String key1 = itr1.next();
//	    				 System.out.println(key1);
//	    			 }


	    
//	    }
		
	    for(String k : s )
	    {
	    	System.out.println(k);
	    	Set<String> p = m.get(k);
	    	System.out.println(p);
	    	
	    	for(String n : p)
	    	{
	    		//System.out.println(n);
	    		String ss = n;
	    		System.out.println(ss);
	    	}
	    	
	    }
	}

}
