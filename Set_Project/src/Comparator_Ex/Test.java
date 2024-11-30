package Comparator_Ex;
import java.util.*;

public class Test 
{
 public static void main(String[] args)
 {
	 Set<Student> S = null;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("----Select---\n"
	 		+ "1. RollNo Sort \n"
			+ "2.Name Sort \n" );
	 int ch = sc.nextInt();
	 	if(ch==1)
	 	{
	 		Comparator <Student> cr1 = (o1,o2)-> o1.getRollno()- o2.getRollno();
	 		S = new TreeSet<Student> (cr1);
	 		
	 	}
	 	else if(ch==2)
	 	{
	 		Comparator <Student> cr2 = (o1,o2)->o1.getName().compareTo(o2.getName());
	 		S = new TreeSet<Student> (cr2);
	 	}
	 	
	 	Student s1 = new Student();
	 	s1.setRollno(101);
	 	s1.setName("aaa");
	 	
	 	Student s2 = new Student();
	 	s2.setRollno(102);
	 	s2.setName("ddd");
	 	
	 	Student s3 = new Student();
	 	s3.setRollno(105);
	 	s3.setName("bbb");
	 	
	 	S.add(s1);
	 	S.add(s2);
	 	S.add(s3);
 
	 	for(Student stu : S)
	 	{
	 		System.out.println(stu.getRollno());
	 		System.out.println(stu.getName());
	 	}
	
}	

}
