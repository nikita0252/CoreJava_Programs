package try_catch_ex;


public class Test{
	

	public static void main(String[] args) 
	{
	try {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		String s = args[0];
		int x = Integer.parseInt(s);
		int a = 10/x;
		System.out.println(a);
	}
	catch(NumberFormatException e)
	{
		System.out.println("Enter number");
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Enter input value");
	}
	catch(Exception e)
	{
      System.out.println("Enter non zero value");
	}
}
}
