package Synchronizedtest1;

public class Hello
{
	synchronized public void display(String msg)
	{
		System.out.println("[");
		try {
			Thread.sleep(300);
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(msg);
		System.out.println("]");
	}
}
