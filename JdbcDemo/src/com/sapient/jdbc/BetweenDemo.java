package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BetweenDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the lowest range");
		double minsal = scan.nextDouble();
		System.out.println("enter the highest range");
		double maxsal = scan.nextDouble();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient123");
		String sql = "select * from sap_emp where sal between ? and ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setDouble(1, minsal);
		st.setDouble(2, maxsal);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getInt("dept_id"));
			System.out.println(rs.getDate("DOJ"));
			System.out.println("-----------------");

		}
		conn.close();

	}

}
