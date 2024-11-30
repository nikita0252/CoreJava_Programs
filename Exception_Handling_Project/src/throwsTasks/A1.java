package throwsTasks;

public class A1 extends B1
{
	public void m1()
	{
		System.out.println("m1_A1");
		B1 b = new B1();
		b.m2();
		System.out.println("m1_a1_End");
	}
	
	public static void main(String args[])
	{
		System.out.println("main start");
		A1 a = new A1();
		a.m1();
		System.out.println("main end");
	}

}
