package ArrayTask;

import java.util.Scanner;

public class Task5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size :");
		int a = sc.nextInt();
		int sum =0;
		int avg=0;
		
		int arr[]= new int[a];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
			avg= sum/a;
			
		}
		System.out.println(sum + " "+ avg);
	}

}
                       