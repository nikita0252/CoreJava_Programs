package Overloading;

public class A1 {
	static public void m1(int i)
	{
	 	System.out.println("m1");
	}
	public final void m1(int i,int j)
	{
		System.out.println("m1");	
	}
	public static final void m1(String s)
	{
		System.out.println("m1");
	}

}
