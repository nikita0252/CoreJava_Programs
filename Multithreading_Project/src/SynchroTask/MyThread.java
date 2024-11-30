package SynchroTask;

public class MyThread extends Thread
{
	String msg;
	Task1 h;
	
	public MyThread(String msg,Task1 h)
	{
		this.msg = msg;
		this.h = h;
	}
	 
	public void run()
	{
		h.display(msg);
	}
	
	

}
