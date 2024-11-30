package Practice_Ex;
import java.util.*;


public class Prime 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num;
	
		 
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<3;i++)
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
		
			int count=0;
		for(int j =1; j<=a; j++)
		{
			
			if(a%j==0)
			{
				count++;
			
			}
		
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime");
		}
		}
	}
		
	}


