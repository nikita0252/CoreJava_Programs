package ConstructorUsingTasks;

public class PatientTest {
	public static void main(String args[])
	{
		Patient p = new Patient(101,"abc","Pune","Cold",989878789l);
		System.out.println("Id :"+p.id);
		System.out.println("Name :"+p.name);
		System.out.println("Address:"+p.address);
		System.out.println("Disease :"+p.disease);
		System.out.println("Mobile No :"+p.mobno);
	}
	

}
