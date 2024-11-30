package Task4;
import java.util.*;

public class Info 
{
	Scanner sc = new Scanner(System.in);
	University uu[]= new University[3];
	
	public University[] setData()
	
	{
		for(int i = 0; i<uu.length; i++)
		{
			University u = new University();
			College c = new College();
			Principal p = new Principal();
			Student s = new Student();
			
			System.out.println("Enter Name:");
			u.setName(sc.next());
			System.out.println("Enter Location:");
			u.setLocation(sc.next());
			System.out.println("Enter MobileNo:");
			u.setMobno(sc.nextLong());
			
			u.setClg(c);
			System.out.println("Enter Name:");
			c.setName(sc.next());
			System.out.println("Enter Address:");
			c.setAddress(sc.next());
			System.out.println("Enter MobileNo:");
			c.setMobno(sc.nextLong());
			
			c.setPrinc(p);
			
			System.out.println("Enter Name:");
			p.setName(sc.next());
			System.out.println("Enter MobileNo:");
		    p.setMobno(sc.nextLong());
		    System.out.println("Enter Qualification");
		    p.setQualification(sc.next());
		    System.out.println("Enter Salary");
		    p.setSalary(sc.nextDouble());
		    
		    p.setStu(s);
		    
		    System.out.println("Enter Name:");
		    s.setName(sc.next());
			System.out.println("Enter Address:");
			s.setAddress(sc.next());
			System.out.println("Enter Branch:");
			s.setBranch(sc.next());
		    System.out.println("Enter Grade:");
		    s.setGrade(sc.next());
		    
		    uu[i]=u;
				
		}
		return uu;
	}
		
		public void getData(University[] u1)
		{
			for(int j =0; j<uu.length; j++)
			{
				System.out.println("University Name"+uu[j].getName()+"Location"+uu[j].getLocation()+"MobileNo:"+uu[j].getMobno()+
						"Name:"+uu[j].getClg().getName()+"Address:"+uu[j].getClg().getAddress()+"MobileNo:"+uu[j].getClg().getMobno()+
						"Name:"+uu[j].getClg().getPrinc().getName()+"MobileNo:"+uu[j].getClg().getPrinc().getMobno()+uu[i].getClg().getPrinc().getSalary());
			}
	
		}
	}

}
