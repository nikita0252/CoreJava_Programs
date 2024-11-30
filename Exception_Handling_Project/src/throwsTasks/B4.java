package throwsTasks;

public class B4
{
	public void m2() 
	{
		try 
		{
		
		System.out.println("B4_m2_Start");
	    String s = null;
	    System.out.println(s.length());
	    System.out.println("B4_m2_end");
	    
		}
		catch(NullPointerException e)
		{
		System.out.println("Null Exception");	
		}
	}
	

}
