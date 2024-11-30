package finally_ex;

public class Test {
 public static void main(String args[])
 {
	 try {
		 System.out.println("try-block-starts");
		 int x = 10/2;
		 System.out.println("try-block-ends");
	 }
	 finally {
		 System.out.println("finally block");
	         }
	 System.out.println("main end");
 }
}
