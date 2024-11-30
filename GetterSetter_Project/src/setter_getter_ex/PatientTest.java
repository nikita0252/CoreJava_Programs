package setter_getter_ex;

public class PatientTest {
   public static void main(String args[])
   {
   Patient p = new Patient();
   p.setName("ABC");
   p.setId(101);
   p.setAddress("Pune");
   p.setMob_no(98886733l);
   
   System.out.println(p.getName()+" "+p.getId()+" "+p.getAddress()+" "+p.getMob_no());

}
  
}
