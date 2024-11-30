package com.cjc.ims.app.client;

import java.util.*;

import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.serviceimpl.karvenagar;

public class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		karvenagar k = new karvenagar();
		while(true)
		{
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1 :
			if(ch==1)
			{
			
				k.addCourse();
				k.viewCourse();
				break;
				
			}
		case 2 :
			if(ch==2)
			{
				k.addFaculty();
				k.viewFaculty();
				break;
			}
		case 3 :
			if(ch==3)
			{
				k.addBatch();
				k.viewBatch();
				break;
			}
		case 4 :
			if(ch==4)
			{
				k.addStudent();
				k.viewStudent();
			}
			
		}
		}
	}

}
