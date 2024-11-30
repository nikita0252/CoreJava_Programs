package Demo_Project;

public class TestBank {

	public static void main(String args[])
	{
		Bank b = new Bank();
		b.id=11;
		b.name="krish";
		b.noofbranch="six";
		b.mobno=988834433l;
		b.EmailId="krish@gmail.com";
		
		System.out.println(b.id);
		System.out.println(b.name);
		System.out.println(b.noofbranch);
		System.out.println(b.mobno);
		System.out.println(b.EmailId);
	}
}
