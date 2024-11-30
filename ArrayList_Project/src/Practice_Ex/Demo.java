package Practice_Ex;
import java.util.*;

public class Demo 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<5;i++)
		{
			System.out.println("Enter element");
			int element = sc.nextInt();
			l.add(element);
		}
		
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			int a = itr.next();
			System.out.println(a);
		} 
		
		System.out.println("Enter element to check :");
		int c = sc.nextInt();
		boolean b = l.contains(c);
		System.out.println(b);
	}

}
