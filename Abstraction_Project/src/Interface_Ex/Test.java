package Interface_Ex;

public class Test 
{
	public static void main(String args[])
	{
		I1 i1 = new A();
		i1.m1();
		i1.m2();
		System.out.println(i1.i);
		
		I2 i2 = new B();
		i2.m1();
		i2.m2();
		int p=i2.m3();
		float q=i2.m4();
		System.out.println(i2.i);
		System.out.println(i2.x);
		System.out.println(i2.y);
		
		
		I3 i3 = new C();
		i3.m1();
		i3.m2();
		int p1=i3.m3();
		float q1=i3.m4();
		boolean r=i3.m5();
		i3.m6();
		System.out.println(i3.z);
		System.out.println(i3.i);
		System.out.println(i3.x);
		System.out.println(i3.y);
		
		
	}

}
