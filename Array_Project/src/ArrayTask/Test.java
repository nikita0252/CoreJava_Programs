package ArrayTask;

import java.util.Scanner;

public class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
		
		System.out.println(a[4]);
		
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		
		char ch[] = new char[5];
		System.out.println("Enter array element :");
		for(int i = 0; i<ch.length; i++)
		{
			ch[i] = sc.next().charAt(i);
		}
		
		for(int j =0; j<ch.length ; j++)
		{
			System.out.println(ch[j]);
		}
		
	}
}
