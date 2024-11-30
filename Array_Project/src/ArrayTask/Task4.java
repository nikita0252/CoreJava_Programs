package ArrayTask;

import java.util.Scanner;

public class Task4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s[] = new String[5];
		
		System.out.println("Enter elements");
		for(int i =0; i<s.length; i++)
		{
			s[i] = sc.next();
		}
		
		for(int i=0; i<s.length; i++)
		{
			System.out.print(s[i]+ " ");
		}
		
		
	}

}
