package synchronizedtest;

public class Test 
{
	public static void main(String args)
	{
		Hello h = new Hello();
		MyThread t1 = new MyThread(h,"Java");
		MyThread t2 = new MyThread(h,"classes");
		
		t1.start();
		t2.start();
	}

}
