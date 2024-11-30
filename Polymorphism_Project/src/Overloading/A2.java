package Overloading;

public class A2 {

	 public void m1(Object o)
	 {
		 
	 }
	 public void m1(String s)
	 {
		 	 
	 }
	 public void m1(A a)
	 {
		 
	 }
	 public static void main(String args[])
	 {
		 A2 a = new A2();
		 //a.m1(null);
		 a.m1((String)null);
		 a.m1((Object)null);
		 a.m1((A)null);
	 }
}
