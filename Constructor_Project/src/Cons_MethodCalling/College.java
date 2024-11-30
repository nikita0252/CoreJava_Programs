package Cons_MethodCalling;

public class College {
	
        public void StudentDetails(int srno,String sname,String sadd,long smobno)
        {
        	Student s = new Student(100);
        	s.roll_no=srno;
        	s.name=sname;
        	s.address=sadd;
        	s.mob_no=smobno;
        	
        	System.out.println("Sr No :"+s.roll_no);
        	System.out.println("Name :"+s.name);
        	System.out.println("Address :"+s.address);
        	System.out.println("Mob_no :"+s.mob_no);
        }
        public void collegeDetails(int clg_id,String clg_name) {
        	System.out.println("Collge Id :"+clg_id);
        	System.out.println("College Name :"+clg_name);
        	
        }
}
