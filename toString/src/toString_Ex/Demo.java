package toString_Ex;

public class Demo {
	private int rollno;
	private String name;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Rollno is :"+rollno+" name is : "+name;
	}
	
}
