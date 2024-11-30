package ConstructorUsingTasks;

public class Bank {

	int id;
	String name,noofBranch;
	long mobno;
	String emailId;

	public Bank(int id, String name, String noofBranch, long mobno, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.noofBranch = noofBranch;
		this.mobno = mobno;
		this.emailId = emailId;
	}
}