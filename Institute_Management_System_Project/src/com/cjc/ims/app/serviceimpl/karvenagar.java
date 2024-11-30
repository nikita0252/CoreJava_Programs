package com.cjc.ims.app.serviceimpl;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.Cjc;
import java.util.*;

public class karvenagar implements Cjc
{
	Scanner sc = new Scanner(System.in);
	
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	
	@Override
	public void addCourse() 
	{
		Course c = new Course();
		System.out.println("Enter Id:");
		c.setCid(sc.nextInt());
		System.out.println("Enter Name:");
		c.setCname(sc.next());
		
		clist.add(c);
		
	}
	
	@Override
	public void viewCourse()
	{
	    Iterator<Course> cl = clist.iterator();
	    	while(cl.hasNext())
	    	{
	    		Course cs = cl.next();
	    		System.out.println(cs.getCid());
	    		System.out.println(cs.getCname());
	    	}  
	}
	@Override
	public void addFaculty()
	{
		Course cc = clist.get(0);
		Faculty f = new Faculty();
		f.setFname(sc.next());
		f.setFid(sc.nextInt());
		f.setCourse(cc);
		flist.add(f);
			
	}
	
	@Override
	public void viewFaculty()
	{
		Iterator<Faculty> fl = flist.iterator();
    	while(fl.hasNext())
    	{
    		Faculty fc = fl.next();
    		System.out.println(fc.getFid());
    		System.out.println(fc.getFname());
    		System.out.println(fc.getCourse().getCid());
    		System.out.println(fc.getCourse().getCname())
    		;
    	}
    
	}
	
	@Override
	public void addBatch()
	{
		Faculty ff = flist.get(0);
		Batch b = new Batch();
		b.setBname(sc.next());
		b.setBid(sc.nextInt());
		b.setFaculty(ff);
		blist.add(b);
		
	}
	@Override
	public void viewBatch() 
	{
		Iterator<Batch> bl = blist.iterator();
    	while(bl.hasNext())
    	{
    		Batch bc = bl.next();
    		System.out.println(bc.getBid());
    		System.out.println(bc.getBname());
    		System.out.println(bc.getFaculty().getFid());
    		System.out.println(bc.getFaculty().getFname());
    		System.out.println(bc.getFaculty().getCourse().getCid());
    		System.out.println(bc.getFaculty().getCourse().getCname());
    		
    		
    	}
		
	}	
	
	@Override
	public void addStudent() 
	{
		Batch bb = blist.get(0);
		Student s = new Student();
		System.out.println("Enter Id:");
		s.setSid(sc.nextInt());
		System.out.println("Enter Name:");
		s.setSname(sc.next());
		
		s.setBatch(bb);
		slist.add(s);
		
		
	}
	@Override
	public void viewStudent()
	{
		Iterator<Student> sl = slist.iterator();
    	while(sl.hasNext())
    	{
    		Student sc = sl.next();
    		System.out.println(sc.getSid());
    		System.out.println(sc.getSname());
    		System.out.println(sc.getBatch().getBid());
    		System.out.println(sc.getBatch().getBname());
    		System.out.println(sc.getBatch().getFaculty().getFid());
    		System.out.println(sc.getBatch().getFaculty().getFname());
    		System.out.println(sc.getBatch().getFaculty().getCourse().getCid());
    		System.out.println(sc.getBatch().getFaculty().getCourse().getCname());
    		
    	}
		
		
	}

}
