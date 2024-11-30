package Task3;

import java.util.Scanner;

public class Test 
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		Manager m = new Manager();
		Employee e = new Employee();
		System.out.println("Name :");
		c.setName(sc.next());
		System.out.println("Location :");
		c.setLocation(sc.next());
		System.out.println("MobileNo :");
		c.setMobno(sc.nextLong());
		c.setMan(m);
		
		System.out.println("Name :");
		m.setName(sc.next());
		System.out.println("MobileNo :");
		m.setMobno(sc.nextLong());
		System.out.println("Department :");
		m.setDepartment(sc.next());
		System.out.println("Salary :");
		m.setSalary(sc.nextDouble());
		m.setEmp(e);
		
		System.out.println("Name :");
		e.setName(sc.next());
		System.out.println("Address :");
		e.setAddress(sc.next());
		System.out.println("Mobile NO :");
		e.setMobno(sc.nextLong());
		System.out.println("Designation :");
		                        
		
		e.setDesignation(sc.next());
		System.out.println("Salary :");
		e.setSalary(sc.nextDouble());
		 
		System.out.println(c.getName()+" "+c.getLocation()+" "+c.getMobno()+" "+c.getMan().getName()+" "+c.getMan().getMobno()+" "+c.getMan().getDepartment()
				+" "+c.getMan().getSalary()+" "+c.getMan().getEmp().getName()+" "+c.getMan().getEmp().getAddress()+c.getMan().getEmp().getMobno()+" "+
				c.getMan().getEmp().getDesignation()+" "+c.getMan().getEmp().getSalary());
	}
}
