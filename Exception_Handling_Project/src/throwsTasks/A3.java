package throwsTasks;
import java.io.*;

public class A3 extends B3{
	 public void m1()
	 {
		 try 
		 {
		 System.out.println("M1_A3_Start");
		 B3 b = new B3();
		 b.m2();
		 System.out.println("M1_A3_End");
		 }
		 catch(ClassNotFoundException e)
		 {
			 System.out.println("It gives Exception");
		 }
	 }
	 
	 public static void main(String [] args)
	 {
		 System.out.println("Main_Start");
		 A3 a = new A3();
		 a.m1();
		 System.out.println("Main_Ends");
	 }

}
