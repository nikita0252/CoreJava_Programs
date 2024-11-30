package bankmanagementsystem;

public class Customer {
	private String name;
	private String mobno;
	private String adharno;
	private String gender;
	private int age;
    private Account ac;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Account getAc() {
		return ac;
	}
	public void setAc(Account ac) {
		this.ac = ac;
	}
    
    
}
