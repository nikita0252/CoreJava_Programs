package Comparable_Ex;
import java.util.*;

public class CustomerTest 
{
	public static void main(String args[])
	{
		Set<CustomerTask1> s = new TreeSet<>();
		CustomerTask1 c1 = new CustomerTask1();
		c1.setCid(101);
		c1.setCname("aaa");
		c1.setMobno(9911223321l);
		
		CustomerTask1 c2 = new CustomerTask1();
		c2.setCid(100);
		c2.setCname("bbb");
		c2.setMobno(8899767676l);
		
		s.add(c1);
		s.add(c2);
		
		for(CustomerTask1 cst : s)
		{
		System.out.println(cst.getCid());
		System.out.println(cst.getCname());
		System.out.println(cst.getMobno());
		}
		
		
	}

}
