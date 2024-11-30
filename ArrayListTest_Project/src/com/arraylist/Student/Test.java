package com.arraylist.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		List<Student> list = new ArrayList<Student>();
		
		Student stu = new Student();
		stu.setRoll(101);
		stu.setName("nikita");
		stu.setMarks(90);
		
		Student stu1 = new Student();
		stu1.setRoll(102);
		stu1.setName("sanskruti");
		stu1.setMarks(95);
		
		Student stu2 = new Student();
		stu2.setRoll(103);
		stu2.setName("gita");
		stu2.setMarks(85);
		
		list.add(stu);
		list.add(stu1);
		list.add(stu2);
		
	
		
		for(Student st : list)
		{
			System.out.println(" ");
			System.out.println(st.getRoll());
			System.out.println(st.getName());
			System.out.println(st.getMarks());
			System.out.println(" ");
		}
		
		System.out.println("-----Select ---------\n"+ "1.Roll \n" + "2.Name \n" +
				   "3.Marks \n");
				   
			System.out.println("Enter a choice");
				   int ch = sc.nextInt();
				    
				   if(ch==1)
				   {
					   Collections.sort(list,(x,y)-> x.getRoll() - y.getRoll());
				   }
				   
				   if(ch==2)
				   {
					   Collections.sort(list,(x,y)-> x.getName().compareTo( y.getName()));
				   }
				   
				   if(ch==3)
				   {
					   Collections.sort(list,(a,b)->a.getMarks() - b.getMarks());
				   }
		
		
		
	}	
		

}
