package finally_ex;

public class Test2 {
	
	public int m1()
	{
		int x = 10;
		System.out.println("m1-a");
	
	
	try {
		System.out.println("try block");
		return x;
	}
	finally
	{
		System.out.println("Finally");
	}
	}
	public static void main(String args[])
	{
		System.out.println("main");
		Test2 t = new Test2();
		int y=t.m1();
		System.out.println(y);
	}
}

