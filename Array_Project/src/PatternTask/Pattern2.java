package PatternTask;
import java.util.*;

public class Pattern2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x,y;
		
		System.out.println("Enter the rows number");
		x=sc.nextInt();
		System.out.println("Enter the column number");
		y=sc.nextInt();
		
		for(int i=1; i<=x; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
