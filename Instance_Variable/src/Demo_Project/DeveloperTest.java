package Demo_Project;



public class DeveloperTest {
	
	public static void main(String args[])
	{
		Developer d = new Developer();
		d.id=101;
		d.name="nikita";
		d.projectname="Smart Trolley";
		d.salary=4500.76f;
		d.grade='A';
		
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.projectname);
		System.out.println(d.salary);
		System.out.println(d.grade);
	}
}

