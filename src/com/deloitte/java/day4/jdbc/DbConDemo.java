package com.deloitte.java.day4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/shreyas";
		String user = "shreyas";
		String password = "shreyas@mysql";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("Connected to the database successfully!");
		stmt = conn.createStatement();
		String sql = "SELECT * FROM shreyas.student";
		rs = stmt.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getString("name")+" "+rs.getString("id")+"\t"+rs.getString("grade"));
		}

		rs.close();
		stmt.close();
		conn.close();
	}
}
