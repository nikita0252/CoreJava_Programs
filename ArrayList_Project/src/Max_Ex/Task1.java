package Max_Ex;
import java.util.ArrayList;
import java.util.List;

public class Task1 
{
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<>();
		
		l.add(40);
		l.add(10);
		l.add(34);
		l.add(2);
		l.add(22);
		
		int max=l.get(0);
		
		for(int i=0; i<l.size(); i++ )
		{
			if(max<l.get(i))
			{
				max=l.get(i);
			}
			
		}
		System.out.println(max);
		
	}
}