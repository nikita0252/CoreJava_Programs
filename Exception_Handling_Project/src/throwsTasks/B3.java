package throwsTasks;

public class B3  {
	public void m2()throws ClassNotFoundException
	{
		System.out.println("B3_ M2 Start");
		Class.forName("Demo.java");
		System.out.println("B3_m2 End");
		
	}
}
