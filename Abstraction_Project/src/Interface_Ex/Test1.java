package Interface_Ex;

public class Test1 {
	public static void main(String args[])
	{
		Connection con = new Oracle();
		con.commit();
		con.rollback();
		Connection con1 = new MySql();
		con1.commit();
		con1.rollback();
	}

}
