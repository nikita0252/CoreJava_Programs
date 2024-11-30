package Demo_Project;

public class PatientTest {

	public static void main(String args[])
	 {
		 Patient p = new Patient();
		 p.id=101;
		 p.name="nikita";
		 p.address="Pune";
		 p.mob_no=9934422233l;
		 p.disease="fever";
		 
		 System.out.println(p.id);
		 System.out.println(p.name);
		 System.out.println(p.mob_no);
		 System.out.println(p.address);
		 System.out.println(p.disease);
	  
	 }
}
