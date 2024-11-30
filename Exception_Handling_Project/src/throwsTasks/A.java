package throwsTasks;

import java.io.*;

public class A {
	public void m1()
	{
		m2();
	}
	
	public void m2()
	{
		try 
		{ 
		    m3();
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Exception Occurs");
		}
	}
	
	public void m3() throws FileNotFoundException
	{
		FileReader f = new FileReader("abc.txt");
	}

	public static void main(String args[])
	{
		A a = new A();
		a.m1();

	}
}
