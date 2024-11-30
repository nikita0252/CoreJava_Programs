package ComparableTask3;

public class Patient implements Comparable<Patient>
{
	int id;
	String name;
	String disease;
	
	public Patient(int id,String name,String disease)
	{
		this.id=id;
		this.name=name;
		this.disease=disease;
	}
	
	public int compareTo(Patient pp)
	{
	  return this.id-pp.id;
	}
}
