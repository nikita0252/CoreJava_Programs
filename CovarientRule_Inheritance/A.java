package Task_ArrayList;
import java.util.*;

public class A
{
	public static void main(String args[])
	{
		List<String> l = new ArrayList<>();
        l.add("abc");
        l.add("sss");
        l.add("hhh");
        l.add("rrr");
        
        Iterator<String> itr = l.iterator();
        while(itr.hasNext())
        {
        	String s = itr.next();
        	System.out.println(s);
        	
     }
	}

}
