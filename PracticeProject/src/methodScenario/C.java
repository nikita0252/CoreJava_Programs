package methodScenario;

public class C extends B {
	public void m1()
	{
		System.out.println("m1-c");
		
	}
	 
	public static void main(String args[])
	{
		A a = new B();
		a.m2();
	}
}
