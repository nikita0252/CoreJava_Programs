package Overloading;

public class A {
	public A(int i)
	{
		System.out.println(i);
	}
	
	public A(String s)
	{
		System.out.println(s);
	}
	
	public void m1(String s)
	{
		System.out.println(s);
	}
	
	public void m1(int i,String s)
	{
		System.out.println(i+" "+s);
	}


}
