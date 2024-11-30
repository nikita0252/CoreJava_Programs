package example;
 
import java.util.*;

public class Ex_1 
{
	public static void main(String args[])
	{
		List <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		Iterator <Integer> itr = al.iterator();
		
		while(itr.hasNext())
		{
			int x = itr.next();
			System.out.println(x);
		}
	}

}
