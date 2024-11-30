package PatternTask;
import java.util.*;

public class Pattern1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter rows:");
		n=sc.nextInt();
		System.out.println("Enter columns");
		m=sc.nextInt();
			
//		int arry[][] = new int[n][m];
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<m; j++ )
//			{
//			    arry[i][j]= sc.nextInt();
//			}
//			
//		}
//		for(int i=0; i<n; i++)
//		{
//			for(int j=0; j<m; j++ )
//			{
//			    System.out.print(arry[i][j] +" ");
//			}
//			System.out.println();
			
		//}
		
		for(int i=1; i<=n; i++)
			{
				for(int j=n-i; j<=m; j++ )
				{
					
						System.out.print(" ");
						for(int k = 5; k<i; k++)
						{
							System.out.println("* ");
						}
				}
				
				    System.out.print(" ");
				}
				
			
			
		
	}

}
