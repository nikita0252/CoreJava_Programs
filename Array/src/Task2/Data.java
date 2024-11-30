package Task2;
import java.util.Scanner;

public class Data
{
	  Scanner sc = new Scanner(System.in);
	  
  public void instituteData()
  {
	  Institute[] is = new Institute[2];
	
	  
	  for(int i=0; i<is.length; i++)
	  {
		  Institute in = new Institute();
		  
		  System.out.println("Enter Name:");
		  in.setName(sc.next());
		  System.out.println("Enter Location:");
		  in.setLocation(sc.next());
		  System.out.println("Enter MobileNo :");
		  in.setMobno(sc.nextLong());
		  System.out.println("Enter Branches:");
		  in.setBranches(sc.next());
		  
		  System.out.println(in.getName()+" "+in.getLocation()+" "+in.getMobno()+" "+in.getBranches());
		  
	  }  
  }
  public void ownerData()
  {
	  Owner[] o = new Owner[2];
	 
	  
	  for(int i=0; i<o.length; i++)
	  {
		  Owner oo= new Owner();
		  
		  System.out.println("Enter Name:");
		  String name = sc.next();
		  oo.setName(name);
		  System.out.println("Enter MobileNo:");
		  long mobno = sc.nextLong();
		  oo.setMobno(mobno);
		  System.out.println("Enter Mailid:");
		  String mailid = sc.next();
		  oo.setMailid(mailid);
		  
		  System.out.println(oo.getName()+" "+oo.getMobno()+" "+oo.getMailid());
		  
	  }
	  
  }
  
  public void addressData()
  {
	  Address[] adr = new Address[2];
	  
	  for(int i=0; i<adr.length; i++)
	  {
	  Address ad = new Address();
	  System.out.println("Cityname: ");
	  String cityname = sc.next();
	  ad.setCityname(cityname);
	  System.out.println("Areaname :");
	  String areaname = sc.next();
	  ad.setAreaname(areaname);
	  System.out.println("Pincode: ");
	  int pincode = sc.nextInt();
	  ad.setPincode(pincode);
	  
	  System.out.println(ad.getCityname()+" "+ad.getAreaname()+" "+ad.getPincode());
	  
	  }
	  
  }
  
  
}
