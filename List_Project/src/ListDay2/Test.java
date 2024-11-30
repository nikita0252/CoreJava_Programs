package ListDay2;

import java.util.*;
public class Test 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setSrollno(1);
		s.setSname("nikita");
		s.setSaddr("Pune");
		
		Student s1 = new Student();
		s1.setSrollno(2);
		s1.setSname("sejal");
		s1.setSaddr("Nagar");
		
		List<Student> al = new ArrayList<>();
		al.add(s);
		al.add(s1);
		
		Iterator<Student> itr = al.iterator();
			while(itr.hasNext())
			{
				Student st = itr.next();
				System.out.println(st.getSrollno());
				System.out.println(st.getSname());
				System.out.println(st.getSaddr());
			}
		
		
		
		
		
	}

}
