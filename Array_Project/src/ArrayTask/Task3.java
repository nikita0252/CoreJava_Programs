package ArrayTask;

import java.util.Scanner;

public class Task3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of character into array");
		int c= sc.nextInt();
		
		char ch[]= new char[c];
		
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
		
	}

}
