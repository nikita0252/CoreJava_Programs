package Cons_MethodCalling;

public class Admin {
	public static void main(String args[])
	{
		Student s = new Student(100);
		Teacher t = new Teacher(101,"abc");
		College c = new College();
		c.StudentDetails(101, "nikita", "Pune", 9988345345l);
		c.collegeDetails(11, "Vedu");
	}

}
