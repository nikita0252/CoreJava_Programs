package Practice_Ex;
import java.util.*;


public class StudentTest
{
	public static void main(String args[])
	{
		List<Student> l = new ArrayList<>();
		List<Student> l1= new ArrayList<>();
		
		l.add(new Student(1,"niki",90,101));
		l.add(new Student(2,"kruti",40,102));
		l.add(new Student(3,"ruti",30,103));
		
		Iterator<Student> itr = l.iterator();
		while(itr.hasNext())
		{
			Student stu = itr.next();
			System.out.println(stu.sroll+" "+stu.sname+" "+stu.smarks+" "+stu.sbatchno);
			if(stu.smarks<40)
			{
				l1.add(stu);
			}
		}
		
		Iterator<Student> it = l1.iterator();
		while(it.hasNext())
		{
			Student st = it.next();
			System.out.println(st.sroll+" "+st.sname+" "+st.smarks+" "+st.sbatchno);
			
		}
		
		
		
	}

}
