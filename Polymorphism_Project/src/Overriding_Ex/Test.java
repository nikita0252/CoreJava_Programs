package Overriding_Ex;

public class Test {
	 public static void main(String args[])
	 {
		 Bullet b = new Bullet();
		 b.start();
		 Hunter h = new Hunter();
		 h.start();
		 Bullet a = new Hunter();
		 a.start();
		 }

}
