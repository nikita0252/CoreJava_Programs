package finally_ex;

public class Test1 {
	public static void main(String args[])
	{
		try {
			System.out.println("try block");
			int x = 10/0;
			System.out.println("try ends");
		}
		catch(ArithmeticException e) {
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("Main ends");
	}

}
