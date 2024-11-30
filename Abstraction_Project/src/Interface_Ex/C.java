package Interface_Ex;

public class C implements I,I1,I2,I3
{
	public void m1()
	{
		System.out.println("M1-I");
	}
	public void m2()
	{
		System.out.println("M2-I");
	}
	public int m3()
	{
		System.out.println("M3-I2");
		return 101;
	}
	public float m4()
	{
		System.out.println("M4-I2");
		return 44.5f;
	}
	public boolean m5()
	{
		System.out.println("M5-I3");
		return true;
	}
	public void m6()
	{
		System.out.println("M6-I3");
	}
}
