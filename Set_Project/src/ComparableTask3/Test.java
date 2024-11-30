package ComparableTask3;
import java.util.*;

public class Test 
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
	 
	 Set<Patient> s = new TreeSet<>();
	  
	 for(int i=0; i<2; i++)
	 {
		 System.out.println("Id :");
		 int x = sc.nextInt();
		 System.out.println("Name :");
		 String y = sc.next();
		 System.out.println("Disease :");
		 String z = sc.next();
		 Patient p = new Patient(x,y,z);
		 s.add(p);
		 
		 
		 
		 Iterator<Patient> itr = s.iterator();
		 while(itr.hasNext())
		 {
			 Patient pr = itr.next();
			 System.out.println(pr);
		 }
		 
		
		 
		 
		 
	 }
	 
	}

}
