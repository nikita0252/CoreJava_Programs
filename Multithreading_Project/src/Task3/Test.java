package Task3;

public class Test 
{
	public static void main(String[] args) 
	{
		
		NumberG even = new NumberG(2,100);
		NumberG odd = new NumberG(1,100);
		
		odd.setName("Odd");
		even.setName("Even");
		
		odd.start();
		even.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
