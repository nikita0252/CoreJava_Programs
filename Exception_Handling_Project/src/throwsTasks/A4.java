package throwsTasks;

public class A4 extends B4
{
	public void m1()throws NullPointerException
	{
	System.out.println("m1_A4_Start");
	B4 b = new B4();
	b.m2();
	System.out.println("m1_A4_End");
	}
	public static void main(String args[])
	{
		System.out.println("main_start");
		A4 a = new A4();
		a.m1();
		System.out.println("main end");
	}

}
