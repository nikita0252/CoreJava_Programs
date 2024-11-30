package SynchroTask;

public class Test 
{
	public static void main(String[] args) {
		
		Task1 t = new Task1();
		
		MyThread m = new MyThread("nikita", t);
		MyThread m1 = new MyThread("Sanskruti", t);
		
		m.start();
		m1.start();
	}

}
