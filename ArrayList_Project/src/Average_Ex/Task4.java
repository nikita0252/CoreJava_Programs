package Average_Ex;
import java.util.*;

public class Task4 {
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<>();
		
		l.add(23);
		l.add(10);
		l.add(4);
		l.add(5);
		
		int sum = 0;
		
		for(int i=0;i<l.size();i++)
		{
			sum=sum+l.get(i);
		}
		int avg=sum/l.size();
		System.out.println(avg);
	}

}
