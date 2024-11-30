package com.cjc.karvenagar;

public class A {
	public void m1()
	
	{
		System.out.println("public m1-A");
	}
	 void m2()
	{
		System.out.println("default m2-A");
	}
	private void m3()
	{
		System.out.println("Private m3-A");
	}
	protected void m4()
	{
		System.out.println("protected m3-A");
	}
	public void aa()
	{
		m1();
		m2();
		m3();
		m4();
		
	}
	

}
