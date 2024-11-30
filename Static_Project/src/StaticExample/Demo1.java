package StaticExample;

public class Demo1 
{
	static int a = 10;
	
	static 
	{
		System.out.println("Static block");
		
	}
	public void m1()
	{
		System.out.println("Static method");
	}
	public static void main(String args[])
	{
		System.out.println("Static variables :"+a);
	    Demo1 d = new Demo1();
		d.m1();
	}
	

}
