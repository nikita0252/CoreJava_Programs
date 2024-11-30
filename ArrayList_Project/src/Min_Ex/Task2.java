package Min_Ex;

import java.util.*;

public class Task2 
{
	public static void main(String args[])
	{
		
		List<Integer> l = new ArrayList<>();
		
		l.add(40);
		l.add(10);
		l.add(34);
		l.add(2);
		l.add(82);
		
		int min = l.get(0);
		 
		for(int i=0; i<l.size(); i++)
		{
			if(min>l.get(i))
			{
				min=l.get(i);
				
			}
			
		}
		System.out.println(min);
		
	}

}
