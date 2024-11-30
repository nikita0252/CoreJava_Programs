package jdbcPrac;

import java.sql.Connection;
import java.sql.DriverManager;


public class Demo 
{
	public static void main(String[] args) {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	
	String sql = "create table student(id int primary key, name varchar(10), addr varchar(10))";
	
	Statement smt =con.createStatement();
	smt.execute();
	smt.close();
	con.close();
	 

}
}