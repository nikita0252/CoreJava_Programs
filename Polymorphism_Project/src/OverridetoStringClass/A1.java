package OverridetoStringClass;

public class A1 {
	
	int i = 100;
	
	@Override
	public String toString()
	{
		return "i"+" "+i;
	}
	
	public static void main(String args[])
	{
		A1 a = new A1();
		System.out.println(a);
		System.out.println(a.toString());
		
	}
}
