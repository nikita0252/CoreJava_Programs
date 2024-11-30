package Practice_Ex;
import java.util.*;

public class Developer 
{
	int id;
	String name;
	double salary;
	long mobno;
	String comp_name;
	
	public static void main(String args[])
	{
	   Developer d = new Developer();
	   Developer d1 = new Developer();
	   Scanner sc = new Scanner(System.in);
	   
	   List<Developer> l = new ArrayList<>();
	   
	   System.out.println("-----Select \n---------"+ "1.Id \n" + "2.Name \n" +
	   "3.Salary \n" + "4.Mobno \n" +"5.CompanyName\n");
	   
	   int ch = sc.nextInt();
	    
	   if(ch==1)
	   {
		   Collections.sort(l,(x,y)-> x.id - y.id);
	   }
	   
	   if(ch==2)
	   {
		   Collections.sort(l,(x,y)-> x.name.compareTo( y.name));
	   }
	   
	   if(ch==3)
	   {
		   Collections.sort(l,((a,b)->((int)(a.salary-b.salary))));
	   }
	   
	   if(ch==4)
	   {
		   Collections.sort(l,((a,b)->((int)(a.mobno-b.mobno))));
	   }
	   
	   if(ch==5)
	   {
		   Collections.sort(l,(x,y)-> x.comp_name.compareTo(y.comp_name));
	   }
	   
	   
	   d.id=101;
	   
	   
	   
	}

}
