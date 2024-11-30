package StaticExample;

public class Demo2 
{
	int a = 0;
	
	public Demo2()
	{
	  a++;
	 System.out.println(a);
	  ++a;
	  
	  System.out.println(a);
	} 
	
	public static void main(String args[])
	{
		Demo2 a1 = new Demo2();
		Demo2 a2 = new Demo2();
		Demo2 a3 = new Demo2();
		
	}
}
