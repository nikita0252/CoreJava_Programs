package ArrayTask;

import java.util.Scanner;

public class Task6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array:");
		int a = sc.nextInt();
		
		int arr[]=new int[a];
		for(int i =0; i<arr.length; i++ )
		{
			arr[i]=sc.nextInt();
		}
		for(int i =0; i<arr.length; i++ )
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse array:");
		for(int i=arr.length-1; i>=0; i--)
		{
			
			System.out.println(arr[i]);
		}
		
	}

}