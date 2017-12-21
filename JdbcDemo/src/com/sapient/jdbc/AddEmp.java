package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the id");
		int eid = scan.nextInt();
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("enter the salary");
		double sal = scan.nextDouble();
		System.out.println("enter the dept_id");
		int did = scan.nextInt();
		System.out.println("enter the date of joining(dd-MON-yyyy)");
		String dt = scan.next();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient123");
		String sql = "insert into sap_emp values(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, eid);
		st.setString(2, name);
		st.setDouble(3, sal);
		st.setInt(4, did);
		st.setString(5, dt);
		int rows = st.executeUpdate();
		System.out.println(rows + "rows affected");

		conn.close();
		scan.close();

	}

}
