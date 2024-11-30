package Task1;

public class ManagerTest 
{
	public static void main(String[] args)
	{
		ManagerInfo mn = new ManagerInfo();
		 Manager[] m2 = mn.setData();
		 for(int i=0;i<mn.length;i++)
		 {
		
		System.out.println(m2[i].getId());
		System.out.println(m2[i].getName());
		System.out.println(m2[i].getMobno());
		System.out.println(m2[i].getDepartment());
		System.out.println(m2[i].getSalary());
		 }
		
	}

} 
