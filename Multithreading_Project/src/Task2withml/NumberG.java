package Task2withml;

public class NumberG extends Thread
{
	int st;
	int end;
	
	public NumberG(int st, int end)
	{
		super();
		this.st = st;
		this.end = end;
	}
	
	public void run()
	{
		for(int i = st; i<end; i++)
		{
			System.out.println(i);
			i++;
		}
	}
	

}
