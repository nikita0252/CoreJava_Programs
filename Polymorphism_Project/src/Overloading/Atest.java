package Overloading;

public class Atest {
 
	public static void main(String args[])
	{
		A a = new A(10);
		a.m1("abc");
		
		A a2 = new A("pqr");
		a.m1(10,"nikita");
	} 
}
