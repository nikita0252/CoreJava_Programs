package com.cjc.demo;

import java.sql.Connection;

import java.sql.DriverManager;

public class Demo {
	public static void main(String[] args) {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		 String sql="create table stud(int id, name varchar(10), addr varchar(10))";
		
		Statement smt =con.createStatement();
		smt.execute();
		smt.close();
		con.close();
		 

}