package Comparable_Ex;



import java.util.*;
public class TestCustomer
{
 public static void main(String args[])
{
 
  Set<Customer> cs = new TreeSet<>();
  
  Customer c1 = new Customer(101,"aaa",9988788788l);
  Customer c2 = new Customer(105,"ccc",8838389393l);
  Customer c3 = new Customer(102,"yyy",9932222334l);

 cs.add(c1);
 cs.add(c2);
 cs.add(c3);
 
 for(Customer ct : cs)
{
 System.out.println(ct.cid);
System.out.println(ct.cname);
System.out.println(ct.cmobno);

}
}
}


