package Task1;

import java.util.Scanner;

public class ManagerInfo 
{
	Scanner sc = new Scanner(System.in);
	Manager mm[] = new Manager[3];
	public int length;
	public Manager[] setData()
	
	{
	for(int i=0;i<mm.length;i++)
	{
	Manager m = new Manager();
	System.out.println("Id:");
    m.setId(sc.nextInt());
    System.out.println("Name:");
    m.setName(sc.next());
    System.out.println("MobileNo:");
    m.setMobno(sc.nextLong());
    System.out.println("Department:");
    m.setDepartment(sc.next());
    System.out.println("Salary:");
    m.setSalary(sc.nextDouble());
    
    mm[i]=m;
	}
	
    return mm;
  
    
	}
	

}
