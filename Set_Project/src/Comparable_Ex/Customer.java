package Comparable_Ex;


	public class Customer implements Comparable<Customer>
	{
	 int cid;
	 String cname;
	 long cmobno;
	 
	 public Customer(int cid,String cname,long cmobno)
	{
	 this.cid=cid;
	 this.cname=cname;
	 this.cmobno=cmobno;
	}
	 
	public int compareTo(Customer c)
	{
	  return this.cid-c.cid;
	}
	}


