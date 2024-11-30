package ComparableTask2;
import java.util.*;

public class Test 
{
	
	public void getDetails(Set<Bank> s)
	{
		Iterator<Bank> itr = s.iterator();
		while(itr.hasNext())
		{
			Bank bb = itr.next();
			
			System.out.println(bb.getBname());
			System.out.println(bb.getBranch());
			System.out.println(bb.getAddr());
			System.out.println(bb.getAcc().getAccno());
			System.out.println(bb.getAcc().getAcctype());
			System.out.println(bb.getAcc().getP().getPname());
			System.out.println(bb.getAcc().getP().getPmob());
			System.out.println(bb.getAcc().getP().getPaddr());
		}
		
		
		
	}
	
	public Set<Bank> setDetails()
	{
		Set<Bank> s = new TreeSet<>();
		
		Bank b = new Bank();
		Account ac = new Account();
		Person p = new Person();
		
		b.setBname("Nagar");
		b.setBranch("Chitale road");
		b.setAddr("Pune");
		b.setAcc(ac);
		ac.setAccno(123467655);
		ac.setAcctype("Saving Account");
		ac.setP(p);
		p.setPname("niki");
		p.setPmob(9988773434l);
		p.setPaddr("Pune");
		
		Bank b1 = new Bank();
		Account ac1 = new Account();
		Person p1 = new Person();
		
		b1.setBname("Karvenagar");
		b1.setBranch("MG road");
		b1.setAddr("Deccan");
		b1.setAcc(ac1);
		ac1.setAccno(988988999);
		ac1.setAcctype("Saving Account");
		ac1.setP(p1);
		p1.setPname("bbb");
		p1.setPmob(9979878787l);
		p1.setPaddr("Nashik");
		
		Bank b2 = new Bank();
		Account ac2 = new Account();
		Person p2 = new Person();
		
		b2.setBname("Nashik");
		b2.setBranch("Burudgaon Road");
		b2.setAddr("Mumbai");
		b2.setAcc(ac2);
		ac2.setAccno(991212345);
		ac2.setAcctype("Current Account");
		ac2.setP(p2);
		p2.setPname("Sumi");
		p2.setPmob(9988656512l);
		p2.setPaddr("Kothrud");
		
		s.add(b);
		s.add(b1);
		s.add(b2);

		return s;
		
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		Set<Bank> sb = t.setDetails();
		t.getDetails(sb);
	}

}
