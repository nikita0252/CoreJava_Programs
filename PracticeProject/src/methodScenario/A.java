package methodScenario;

public class A {
	public void m1()
	{
		System.out.println("M1-A");
	}
	public void m2()
	{
		System.out.println("M2-A");
		this.m1();
	}

}
