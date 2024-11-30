package Sum_Ex;

import java.util.*;

public class Task3 
{
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<>();
		
		l.add(40);
		l.add(10);
		l.add(34);
		l.add(2);
		l.add(22);
		
		int sum=l.get(0);
		
		for(int i=0; i<l.size(); i++ )
		{
			sum=sum+l.get(i);
			
		}
		System.out.println(sum);
		
		
	}

}
