package SetGetUsingArray;

import java.util.Scanner;

public class StudentTest 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Student stu[]=new Student[3];
		for(int i=0;i<stu.length;i++)
		{
			Student s = new Student();
			System.out.println("ID:");
			s.setId(sc.nextInt());
			System.out.println("Name");
			s.setName(sc.next());
			stu[i]=s;
			System.out.println(stu[i].getId());
			System.out.println(stu[i].getName());
		}
	}

}
